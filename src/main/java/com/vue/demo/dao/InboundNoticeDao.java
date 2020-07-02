package com.vue.demo.dao;

import com.vue.demo.entity.InboundNotice;

public interface InboundNoticeDao {
    int deleteByPrimaryKey(Long id);

    int insert(InboundNotice record);

    int insertSelective(InboundNotice record);

    InboundNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InboundNotice record);

    int updateByPrimaryKey(InboundNotice record);
}