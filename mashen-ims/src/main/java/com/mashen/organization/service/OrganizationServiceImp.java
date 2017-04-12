package com.mashen.organization.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashen.common.domain.PageVO;
import com.mashen.common.util.SearchConditionUtils;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;
import com.mashen.organization.dao.OrganizationVOMapper;
import com.mashen.organization.domain.OrganizationVO;
import com.mashen.organization.domain.OrganizationVOExample;
import com.mashen.privilege.aop.annotation.DataPrivilege;
import com.mashen.privilege.aop.annotation.SearchCondition;
import com.mashen.privilege.aop.annotation.SearchConditionType;

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
	public OrganizationVO getOrganizationById(String id) throws Throwable {
		OrganizationVOExample example = new OrganizationVOExample();
		example.createCriteria().andPidEqualTo(id+"%");
		List<OrganizationVO> list = mapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	@Override
	public OrganizationVO getOrganizationByName(String name) throws Throwable {
		OrganizationVOExample example = new OrganizationVOExample();
		example.createCriteria().andNameEqualTo(name);
		List<OrganizationVO> list = mapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	@Override
	@DataPrivilege("organization")
	public DataTablesResponse<OrganizationVO> list(
				@SearchCondition(SearchConditionType.DATATABLES) DataTablesRequest request)
				throws Throwable {
			OrganizationVOExample example = new OrganizationVOExample();
			DataTablesResponse<OrganizationVO> response = new DataTablesResponse<OrganizationVO>();
			SearchConditionUtils.wrapperAndCondition(example, request);// 封装查询条件

			response.setDraw(request.getDraw());
			response.setRecordsTotal(mapper.countByExample(example));
			response.setData(mapper.selectByExample(example));
			return response;
	}
	@Override
	@DataPrivilege("organization")
	public PageVO<OrganizationVO> list(
			PageVO<OrganizationVO> pagevo,
			@SearchCondition(SearchConditionType.MAP) Map<String, Object> conditionMap)
			throws Throwable {
		OrganizationVOExample example = new OrganizationVOExample();
		SearchConditionUtils.wrapperAndCondition(example, pagevo, conditionMap);// 封装查询条件
		pagevo.setTotalRecord(mapper.countByExample(example));
		pagevo.setRecords(mapper.selectByExample(example));
		return pagevo;
	}
	
	@Override
	public OrganizationVO get(String id) {
		return this.mapper.selectByPrimaryKey(id);
	}
	@Override
	public List<OrganizationVO> getByPId(String pid) {
		OrganizationVOExample example = new OrganizationVOExample();
		example.createCriteria().andPidEqualTo(pid);
		return mapper.selectByExample(example);
				
	}
	
}
	

