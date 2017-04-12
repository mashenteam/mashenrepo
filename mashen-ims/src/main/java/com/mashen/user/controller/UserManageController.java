package com.mashen.user.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mashen.common.domain.JsonResult;
import com.mashen.datatables.domain.DataTablesRequest;
import com.mashen.datatables.domain.DataTablesResponse;
import com.mashen.organization.domain.OrganizationVO;
import com.mashen.organization.service.OrganizationService;
import com.mashen.privilege.aop.annotation.FunctionPrivilege;
import com.mashen.role.domain.RoleVO;
import com.mashen.role.service.RoleServiceImp;
import com.mashen.user.domain.UserVO;
import com.mashen.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserManageController {
	@Autowired
	private UserService service;
	@Autowired
	private OrganizationService orService;
	@Autowired
	private RoleServiceImp roleService;
	/**
	 * 跳转到列表页面
	 * @return
	 */
	@RequestMapping("/list")
	public String list(HttpSession session,HttpServletRequest request){
		System.out.println("uri:"+request.getRequestURI());
		return "user/list";
	}
	/**
	 * 分页查接口
	 * @param pageVo
	 * @param userVo
	 * @return
	 * @throws Throwable 
	 */
	@RequestMapping("/rest/doSearch")
	@FunctionPrivilege
	public @ResponseBody DataTablesResponse<UserVO> pageSearch(
			@RequestBody DataTablesRequest request) throws Throwable{
		return service.list(request);
	}
	
	/**
	 * 跳转到编辑页面
	 * @return
	 * @throws Throwable 
	 */
	@RequestMapping("/edit")
	public ModelAndView add(String id) throws Throwable{
		ModelAndView model=new ModelAndView("user/edit");
		if(id!=null){//修改
			model.addObject("user",service.getUserById(id));
		}
		return model;
	}
	
	/**
	 * 保存编辑
	 * @param user
	 * @return
	 * @throws Throwable 
	 */
	@RequestMapping("/doEdit")
	@FunctionPrivilege
	public ModelAndView doAdd(UserVO user) throws Throwable{
		ModelAndView model=new ModelAndView("user/list");
		
		if(user.getUserId()!=null&&service.getUserById(user.getUserId())!=null){//修改
			service.updateUser(user);
		}else{//新增
			service.addUser(user);
		}
		return model;
	}
	
	@RequestMapping("/doDel")
	public @ResponseBody JsonResult doDel(String id) throws Throwable{
		JsonResult rs=new JsonResult();
		service.deleteUser(id);
		rs.setStatus(1);
		rs.setMsg("删除成功！");
		return rs;
	}
	@RequestMapping("/getDept")
	public @ResponseBody List<OrganizationVO> getDeptJson(String pid){
		return orService.getByPId(pid);
	}
	
	@RequestMapping("/getRole")
	public @ResponseBody List<RoleVO> getRoleJson() throws Throwable{
		return roleService.listRole();
	}
	
}
