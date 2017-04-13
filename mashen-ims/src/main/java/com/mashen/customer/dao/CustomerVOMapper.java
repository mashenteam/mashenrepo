package com.mashen.customer.dao;

import com.mashen.customer.domain.CustomerVO;
import com.mashen.customer.domain.CustomerVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerVOMapper {
    int countByExample(CustomerVOExample example);

    int deleteByExample(CustomerVOExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerVO record);

    int insertSelective(CustomerVO record);

    List<CustomerVO> selectByExample(CustomerVOExample example);

    CustomerVO selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") CustomerVO record, @Param("example") CustomerVOExample example);

    int updateByExample(@Param("record") CustomerVO record, @Param("example") CustomerVOExample example);

    int updateByPrimaryKeySelective(CustomerVO record);

    int updateByPrimaryKey(CustomerVO record);
}