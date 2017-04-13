package com.mashen.customer.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashen.common.domain.PageVO;
import com.mashen.common.util.SearchConditionUtils;
import com.mashen.customer.dao.CustomerVOMapper;
import com.mashen.customer.domain.CustomerVO;
import com.mashen.customer.domain.CustomerVOExample;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;
import com.mashen.privilege.aop.annotation.DataPrivilege;
import com.mashen.privilege.aop.annotation.SearchCondition;
import com.mashen.privilege.aop.annotation.SearchConditionType;
import com.mashen.user.domain.UserVO;
import com.mashen.user.domain.UserVOExample;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerVOMapper custMapper;
	@Override
	public void addCust(CustomerVO cust) throws Throwable {
		custMapper.insertSelective(cust);
	}

	@Override
	public void deleteCust(int id) {
		custMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateCust(CustomerVO cust) throws Throwable {
		custMapper.updateByPrimaryKeySelective(cust);
	}

	@Override
	public CustomerVO getCustById(int custId) throws Throwable {
		return custMapper.selectByPrimaryKey(custId);
	}

	@Override
	public List<CustomerVO> getCustsByName(String cname) throws Throwable {
		CustomerVOExample example = new CustomerVOExample();
		example.createCriteria().andNameEqualTo(cname);
		return custMapper.selectByExample(example);
	}

	@Override
	@DataPrivilege("customer")
	public DataTablesResponse<CustomerVO> list(@SearchCondition(SearchConditionType.DATATABLES) DataTablesRequest request) throws Throwable {
		UserVOExample example = new UserVOExample();
		DataTablesResponse<UserVO> response = new DataTablesResponse<UserVO>();
		SearchConditionUtils.wrapperAndCondition(example, request);// 封装查询条件

		/*response.setDraw(request.getDraw());
		response.setRecordsTotal(mapper.countByExample(example));
		response.setData(mapper.selectByExample(example));*/
		return null;
	}

	@Override
	public PageVO<CustomerVO> list(PageVO<CustomerVO> pagevo, Map<String, Object> request) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
