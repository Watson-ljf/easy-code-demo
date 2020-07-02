package com.vue.demo.rest;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.vue.demo.dao.ReconciliationOutInNumResultDao;
import com.vue.demo.entity.ReconciliationOutInNumResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lijianfeng
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private ReconciliationOutInNumResultDao reconciliationOutInNumResultDao;

    @PostMapping(path = "/download/")
    public void download(HttpServletResponse response) throws IOException {
        LocalDate now = LocalDate.now();
        List<ReconciliationOutInNumResult> abnormalDataByDateAfter = reconciliationOutInNumResultDao.findAbnormalDataByDateAfter(now);

        int size = abnormalDataByDateAfter.size();

        if (size > 0) {
            log.info("查询出信息！");
        } else {
            log.info("未查询出信息。");
        }
        log.info("测试");

        List<LinkedHashMap<String, Object>> dataRows = abnormalDataByDateAfter.stream().map((ReconciliationOutInNumResult item) -> {
            LinkedHashMap<String, Object> dataMap = new LinkedHashMap<>();
            dataMap.put("对账类型", item.getResultType());
            dataMap.put("索引值", item.getTypeId());

            return dataMap;
        }).collect(Collectors.toList());


//        // 组装文件
//        // 通过工具类创建writer
//        ExcelWriter writer = ExcelUtil.getWriter("/Users/lijianfeng/Downloads/test.xlsx");
//        // 合并单元格后的标题行，使用默认标题样式
//        writer.merge(1, "对账结果");
//        // 一次性写出内容，使用默认样式，强制输出标题
//        writer.write(dataRows, true);
//        // 关闭writer，释放内存
//        writer.close();


        ExcelWriter writer = ExcelUtil.getWriter(true);
        // 合并单元格后的标题行，使用默认标题样式
        writer.merge(1, "对账结果");
        writer.write(dataRows, true);

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=reconciliationResult.xlsx");

        ServletOutputStream outputStream = response.getOutputStream();
        writer.flush(outputStream, true);
        writer.close();
        IoUtil.close(outputStream);
    }
}
