package com.mashen.organization.service;

import java.util.List;
import java.util.Map;

import com.mashen.common.domain.PageVO;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;
import com.mashen.organization.domain.OrganizationVO;

public interface OrganizationService {
	public Integer add(OrganizationVO organization) throws Throwable;
	
	public OrganizationVO get(String id);
	
	public List<OrganizationVO> getByPId(String pid);
	
	public void delete(String id) throws Throwable;
	
	public void update(OrganizationVO organization) throws Throwable;
	
	public OrganizationVO getOrganizationById(String id) throws Throwable;  
	
	public OrganizationVO getOrganizationByName(String name) throws Throwable;  
	
	/**
	 * 使用datatables的分页查询
	 * @param request
	 * @return
	 */
	public DataTablesResponse<OrganizationVO> list(DataTablesRequest request) throws Throwable;
	
	/**
	 * 普通分页查询
	 * @param request
	 * @return
	 */
	public PageVO<OrganizationVO> list(PageVO<OrganizationVO> pagevo,Map<String,Object> request) throws Throwable;
}
