package com.mashen.permission.service;

import java.util.List;

import com.mashen.common.domain.Sequence;
import com.mashen.permission.domain.PermissionVO;

/**
 * 功能权限
 * @author Administrator
 *
 */
public interface PermissionService {
	/**
	 * 添加一级菜单
	 * @param permission
	 * @return
	 * @throws Throwable
	 */
	public Integer addFirstPermission(PermissionVO permission) throws Throwable;
	
	/**
	 * 添加二级菜单
	 * @param permission
	 * @return
	 * @throws Throwable
	 */
	public Integer addSecondPermission(PermissionVO permission) throws Throwable;
	
	/**
	 * 添加三级按钮
	 * @param permission
	 * @return
	 * @throws Throwable
	 */
	public Integer addThreeButtonPermission(PermissionVO permission) throws Throwable;
	
	/**
	 * 删除菜单
	 * @param permissionId 
	 * @return
	 * @throws Throwable
	 */
	public Integer deletePermission(String permissionId) throws Throwable;
	/**
	 * 更新菜单
	 * @param permission
	 * @return
	 * @throws Throwable
	 */
	public Integer updatePermission(PermissionVO permission) throws Throwable;
	/**
	 * 查询所有
	 * @return
	 * @throws Throwable
	 */
	public List<PermissionVO> selectAll() throws Throwable;
	
	public void getIncrement(Sequence seq) throws Throwable;
}
