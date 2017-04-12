package com.mashen.organization.service;

import java.util.List;
import java.util.Map;

import com.mashen.common.domain.PageVO;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;
import com.mashen.organization.domain.OrganizationVO;
import com.mashen.user.domain.UserVO;

public interface OrganizationService {
	public Integer add(OrganizationVO organization) throws Throwable;
	
	public void delete(String id) throws Throwable;
	
	public void update(OrganizationVO organization) throws Throwable;
	
	public List<OrganizationVO> list(String id) throws Throwable;  
	
	/**
	 * 使用datatables的分页查询
	 * @param request
	 * @return
	 */
	public DataTablesResponse<UserVO> list(DataTablesRequest request) throws Throwable;
	
	/**
	 * 普通分页查询
	 * @param request
	 * @return
	 */
	public PageVO<UserVO> list(PageVO<UserVO> pagevo,Map<String,Object> request) throws Throwable;
}
