package com.vue;

import com.Application;
import com.vue.demo.dao.ReconciliationOutInNumResultDao;
import com.vue.demo.entity.ReconciliationOutInNumResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})// 指定启动类
@Slf4j
public class DaoTest {
    @Autowired
    private ReconciliationOutInNumResultDao reconciliationOutInNumResultDao;

    @Test
    public void testTwo() {
        LocalDate now = LocalDate.of(2020,6,4);
        List<ReconciliationOutInNumResult> abnormalDataByDateAfter = reconciliationOutInNumResultDao.findAbnormalDataByDateAfter(now);

        int size = abnormalDataByDateAfter.size();

        if (size > 0) {
            log.info("查询出信息！");
        } else {
            log.info("未查询出信息。");
        }
        log.info("测试");

//        List<LinkedHashMap<String, Object>> dataRows = abnormalDataByDateAfter.stream().map((ReconciliationOutInNumResult item) -> {
//            LinkedHashMap<String, Object> dataMap = new LinkedHashMap<>();
//            dataMap.put("对账类型", item.getResultType());
//            dataMap.put("索引值", item.getTypeId());
//
//            return dataMap;
//        }).collect(Collectors.toList());
//
//
//        // 组装文件
//        // 通过工具类创建writer
//        ExcelWriter writer = ExcelUtil.getWriter("/Users/lijianfeng/Downloads/test.xlsx");
//        // 合并单元格后的标题行，使用默认标题样式
//        writer.merge(1, "对账结果");
//        // 一次性写出内容，使用默认样式，强制输出标题
//        writer.write(dataRows, true);
//        // 关闭writer，释放内存
//        writer.close();
    }

    @Before
    public void testBefore() {
        log.info("before");
    }

    @After
    public void testAfter() {
        log.info("after");
    }
}
