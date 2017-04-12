package com.mashen.datarule.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mashen.datarule.dao.DataruleVOMapper;
import com.mashen.datarule.domain.DataruleVO;
import com.mashen.datarule.domain.DataruleVOExample;

@Service
public class DataruleServiceImp implements DataruleService {
	@Autowired
	private DataruleVOMapper mapper;
	@Override
	/**
	 * 返回业务编码和规则
	 */
	public Map<String, String> listDataRule(List<String> roles) {
		Map<String, String>  ruleMap=new HashMap<String,String>();
		
		if(roles!=null&&roles.size()>0){
			DataruleVOExample example = new DataruleVOExample();
			example.createCriteria().andRoleIdIn(roles);
			List<DataruleVO> dataruleList = mapper.selectByExample(example);

			for (DataruleVO rule : dataruleList) {
				ruleMap.put(rule.getBusinessCode(), rule.getRule());
			}
		}
		return ruleMap;
		
	}

}
