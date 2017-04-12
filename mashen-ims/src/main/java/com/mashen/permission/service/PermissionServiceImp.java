package com.mashen.permission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashen.common.dao.CommonMapper;
import com.mashen.common.domain.Sequence;
import com.mashen.common.util.SpringUtil;
import com.mashen.permission.dao.PermissionVOMapper;
import com.mashen.permission.domain.PermissionVO;
import com.mashen.permission.domain.PermissionVOExample;
import com.mashen.permission.domain.PermissionVOExample.Criteria;

@Service
public class PermissionServiceImp implements PermissionService {
	@Autowired
	private PermissionVOMapper mapper;
	@Autowired
	private CommonMapper cmpper;
	@Override
	public Integer addFirstPermission(PermissionVO permission) throws Throwable {
		Sequence seq = new Sequence();
		seq.setId(1L);
		getIncrement(seq);
		permission.setPermissionId("0" + seq.getId());
		//定级菜单默认开头为0
		permission.setPid("0");
		return mapper.insert(permission);

	}

	@Override
	public Integer deletePermission(String permissionId) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updatePermission(PermissionVO permission) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PermissionVO> selectAll() throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws Throwable {
		
		
		
	}

	@Override
	public void getIncrement(Sequence seq) throws Throwable {
		cmpper.getSequence(seq);
	}

	@Override
	public Integer addSecondPermission(PermissionVO permission) throws Throwable {
		
		Sequence seq = new Sequence();
		seq.setId(1L);
		getIncrement(seq);
		permission.setPid(permission.getPermissionId());
		permission.setPermissionId("0" + seq.getId());
		System.out.println("PermissionId :" + permission.getPermissionId());
		
		return mapper.insert(permission);
	}

	@Override
	public Integer addThreeButtonPermission(PermissionVO permission) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PermissionVO> getPid(String id) throws Throwable {
		PermissionVOExample example = new PermissionVOExample();
		Criteria c = example.createCriteria();
		c.andPidEqualTo(id);
		return mapper.selectByExample(example);
	}
}
