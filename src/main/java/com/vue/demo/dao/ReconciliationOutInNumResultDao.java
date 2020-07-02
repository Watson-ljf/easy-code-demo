package com.vue.demo.dao;

import com.vue.demo.entity.ReconciliationOutInNumResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReconciliationOutInNumResultDao {
    int deleteByPrimaryKey(Long id);

    int insert(ReconciliationOutInNumResult record);

    int insertSelective(ReconciliationOutInNumResult record);

    ReconciliationOutInNumResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReconciliationOutInNumResult record);

    int updateByPrimaryKey(ReconciliationOutInNumResult record);

    List<ReconciliationOutInNumResult> findAbnormalDataByDateAfter(@Param("deadline") LocalDate deadline);
}