package com.mashen.organization.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashen.common.domain.PageVO;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;
import com.mashen.organization.dao.OrganizationVOMapper;
import com.mashen.organization.domain.OrganizationVO;
import com.mashen.organization.domain.OrganizationVOExample;
import com.mashen.user.domain.UserVO;

@Service
public class OrganizationServiceImp implements OrganizationService {
	@Autowired
	private OrganizationVOMapper mapper; 
	@Override
	public Integer add(OrganizationVO organization) throws Throwable {
		return mapper.insert(organization);
	}
	@Override
	public void delete(String id) throws Throwable {
		mapper.deleteByPrimaryKey(id);
	}
	@Override
	public void update(OrganizationVO organization) throws Throwable {
		mapper.updateByPrimaryKeySelective(organization);
		
	}
	@Override
	public List<OrganizationVO> list(String id) throws Throwable {
		OrganizationVOExample example = new OrganizationVOExample();
		example.createCriteria().andPidEqualTo(id+"%");
		List<OrganizationVO> list = mapper.selectByExample(example);		
		return list;
	}
	@Override
	public DataTablesResponse<UserVO> list(DataTablesRequest request) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PageVO<UserVO> list(PageVO<UserVO> pagevo, Map<String, Object> request) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
