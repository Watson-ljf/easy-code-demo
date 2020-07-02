package com.vue.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * inbound_notice
 * @author 
 */
public class InboundNotice implements Serializable {
    /**
     * 入库通知单ID-次分片键
     */
    private Long id;

    /**
     * 入库通知单号-次分片键
     */
    private String inboundNoticeNo;

    /**
     * 履约单ID（分别对应销退履约单、采购履约单、调拨履约单等的ID）
     */
    private Byte fulfilId;

    /**
     * 用户UUID-主分片键
     */
    private Long uuid;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 原始单据号（比如交易订单号、采购单号、调拨单号）
     */
    private String originBillNo;

    /**
     * 原始单据类型（2：销退单、3：采购单、5：调拨单）
     */
    private Byte originBillType;

    /**
     * 原始单据渠道（销售链路对应销售端的三级渠道，外采对应采购单类型，调拨链路对应调拨单类型）
     */
    private Integer originBillChannel;

    /**
     * 仓库id
     */
    private Long warehouseId;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 原始出库仓库ID（只在调拨入库的时候有值）
     */
    private Long outboundWarehouseId;

    /**
     * 原始出库编码（只在调拨入库的时候有值）
     */
    private String outboundWarehouseCode;

    /**
     * 原始出库仓库名称（只在调拨入库的时候有值）
     */
    private String outboundWarehouseName;

    /**
     * 状态（1：待通知入库、2：已通知入库、3：部分入库、4：全部入库、5：关闭）
     */
    private Byte status;

    /**
     * 创建流程实例状态（1：未创建，2：创建失败，3：创建成功）
     */
    private Byte createFlowStatus;

    /**
     * 流程模板ID
     */
    private String flowTemplateId;

    /**
     * 流程模板名称
     */
    private String flowTemplateName;

    /**
     * 流程实例ID
     */
    private String flowInstanceId;

    /**
     * 需入库总数量
     */
    private Integer needInboundNum;

    /**
     * 已入库总数量（分批入库场景已入库数量会短暂和需入库数量不一致，缺货入的场景当入库任务完结时已入库数量会不等于需入库数量）
     */
    private Integer alreadyInboundNum;

    /**
     * 确认入库数量（WMS发送的入库完成消息中的最终入库数量）
     */
    private Integer confirmInboundNum;

    /**
     * 紧急程度（1：一般；2：紧急）
     */
    private Byte urgentLevel;

    /**
     * 通知入库时间
     */
    private Date noticeTime;

    /**
     * 最后一次入库库时间
     */
    private Date lastInboundTime;

    /**
     * 原始单据创建时间（比如销售链路的下单时间，采购链路的创建采购单时间）
     */
    private Date originBillTime;

    /**
     * 开始履约时间（单据落到供应链履约的时间）
     */
    private Date fulfilTime;

    /**
     * 幂等字段，md5（fulfil_id,uuid,origin_bill_no,warehouse_id,extend.source_type，extend.req_id）
     */
    private String idempotentNo;

    /**
     * 逻辑版本号
     */
    private Integer logicVersion;

    /**
     * 0：正常；1：删除
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updatePerson;

    /**
     * 仓库类型 1:不使用wms；2:360wms；3:好快全wms；4:erp
     */
    private Byte wmsType;

    /**
     * 原始单据id,比如交易订单号
     */
    private Long originBillId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInboundNoticeNo() {
        return inboundNoticeNo;
    }

    public void setInboundNoticeNo(String inboundNoticeNo) {
        this.inboundNoticeNo = inboundNoticeNo;
    }

    public Byte getFulfilId() {
        return fulfilId;
    }

    public void setFulfilId(Byte fulfilId) {
        this.fulfilId = fulfilId;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOriginBillNo() {
        return originBillNo;
    }

    public void setOriginBillNo(String originBillNo) {
        this.originBillNo = originBillNo;
    }

    public Byte getOriginBillType() {
        return originBillType;
    }

    public void setOriginBillType(Byte originBillType) {
        this.originBillType = originBillType;
    }

    public Integer getOriginBillChannel() {
        return originBillChannel;
    }

    public void setOriginBillChannel(Integer originBillChannel) {
        this.originBillChannel = originBillChannel;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Long getOutboundWarehouseId() {
        return outboundWarehouseId;
    }

    public void setOutboundWarehouseId(Long outboundWarehouseId) {
        this.outboundWarehouseId = outboundWarehouseId;
    }

    public String getOutboundWarehouseCode() {
        return outboundWarehouseCode;
    }

    public void setOutboundWarehouseCode(String outboundWarehouseCode) {
        this.outboundWarehouseCode = outboundWarehouseCode;
    }

    public String getOutboundWarehouseName() {
        return outboundWarehouseName;
    }

    public void setOutboundWarehouseName(String outboundWarehouseName) {
        this.outboundWarehouseName = outboundWarehouseName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getCreateFlowStatus() {
        return createFlowStatus;
    }

    public void setCreateFlowStatus(Byte createFlowStatus) {
        this.createFlowStatus = createFlowStatus;
    }

    public String getFlowTemplateId() {
        return flowTemplateId;
    }

    public void setFlowTemplateId(String flowTemplateId) {
        this.flowTemplateId = flowTemplateId;
    }

    public String getFlowTemplateName() {
        return flowTemplateName;
    }

    public void setFlowTemplateName(String flowTemplateName) {
        this.flowTemplateName = flowTemplateName;
    }

    public String getFlowInstanceId() {
        return flowInstanceId;
    }

    public void setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
    }

    public Integer getNeedInboundNum() {
        return needInboundNum;
    }

    public void setNeedInboundNum(Integer needInboundNum) {
        this.needInboundNum = needInboundNum;
    }

    public Integer getAlreadyInboundNum() {
        return alreadyInboundNum;
    }

    public void setAlreadyInboundNum(Integer alreadyInboundNum) {
        this.alreadyInboundNum = alreadyInboundNum;
    }

    public Integer getConfirmInboundNum() {
        return confirmInboundNum;
    }

    public void setConfirmInboundNum(Integer confirmInboundNum) {
        this.confirmInboundNum = confirmInboundNum;
    }

    public Byte getUrgentLevel() {
        return urgentLevel;
    }

    public void setUrgentLevel(Byte urgentLevel) {
        this.urgentLevel = urgentLevel;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Date getLastInboundTime() {
        return lastInboundTime;
    }

    public void setLastInboundTime(Date lastInboundTime) {
        this.lastInboundTime = lastInboundTime;
    }

    public Date getOriginBillTime() {
        return originBillTime;
    }

    public void setOriginBillTime(Date originBillTime) {
        this.originBillTime = originBillTime;
    }

    public Date getFulfilTime() {
        return fulfilTime;
    }

    public void setFulfilTime(Date fulfilTime) {
        this.fulfilTime = fulfilTime;
    }

    public String getIdempotentNo() {
        return idempotentNo;
    }

    public void setIdempotentNo(String idempotentNo) {
        this.idempotentNo = idempotentNo;
    }

    public Integer getLogicVersion() {
        return logicVersion;
    }

    public void setLogicVersion(Integer logicVersion) {
        this.logicVersion = logicVersion;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Byte getWmsType() {
        return wmsType;
    }

    public void setWmsType(Byte wmsType) {
        this.wmsType = wmsType;
    }

    public Long getOriginBillId() {
        return originBillId;
    }

    public void setOriginBillId(Long originBillId) {
        this.originBillId = originBillId;
    }
}