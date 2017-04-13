package com.mashen.customer.service;

import java.util.List;
import java.util.Map;

import com.mashen.common.domain.PageVO;
import com.mashen.customer.domain.CustomerVO;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;

public interface CustomerService {
/**
 * 添加客户
 * @param cust
 */
	public void addCust(CustomerVO cust) throws Throwable;
	/**
	 * 根据id删除客户
	 * @param id
	 */
	public void deleteCust(int id);
	
	public void updateCust(CustomerVO cust) throws Throwable;
	/**
	 * 根据客户id查询
	 * @param cname
	 */
	public CustomerVO getCustById(int custId) throws Throwable;
	/**
	 * 根据客户姓名查询
	 * @param cname
	 * @return
	 */
	public List<CustomerVO> getCustsByName(String cname) throws Throwable;
	
	/**
	 * 使用datatables的分页查询
	 * @param request
	 * @return
	 */
	public DataTablesResponse<CustomerVO> list(DataTablesRequest request) throws Throwable;
	
	/**
	 * 普通分页查询
	 * @param request
	 * @return
	 */
	public PageVO<CustomerVO> list(PageVO<CustomerVO> pagevo,Map<String,Object> request) throws Throwable;
}
