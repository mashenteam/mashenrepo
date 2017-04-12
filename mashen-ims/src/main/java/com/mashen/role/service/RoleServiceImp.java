package com.mashen.role.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashen.common.domain.PageVO;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;
import com.mashen.role.dao.RoleVOMapper;
import com.mashen.role.domain.RoleVO;
import com.mashen.role.domain.RoleVOExample;

@Service
public class RoleServiceImp implements RoleService{
	@Autowired
	private RoleVOMapper mapper;
	

	@Override
	public void addRole(RoleVO role) throws Throwable {
		mapper.insertSelective(role);
	}

	@Override
	public void deleteRole(String id) throws Throwable {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteByExa(Map<String,Object> request) throws Throwable {
		RoleVOExample example=new RoleVOExample();
	}

	@Override
	public void updateRole(RoleVO role) throws Throwable {
		// TODO Auto-generated method stub
		
	}


	@Override
	public RoleVO getRoleById(String role_id) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public DataTablesResponse<RoleVO> list(DataTablesRequest request) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageVO<RoleVO> list(PageVO<RoleVO> pagevo, Map<String, Object> request) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateByExa(Map<String, Object> request) throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleVO> getRoleByExa(Map<String, Object> request) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
