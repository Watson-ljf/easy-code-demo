package com.vue.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * reconciliation_out_in_num_result
 * @author 
 */
@Data
public class ReconciliationOutInNumResult implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 业务类型ID
     */
    private Long typeId;

    /**
     * 业务类型（详情见枚举）
     */
    private Byte resultType;

    /**
     * 对账批次号
     */
    private String batchNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updatePerson;

    private static final long serialVersionUID = 1L;
}