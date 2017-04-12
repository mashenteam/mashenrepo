package com.mashen.permission.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mashen.permission.domain.PermissionVO;
import com.mashen.permission.service.PermissionService;

@Controller
public class PermissionController {
	@Autowired
	private PermissionService service;
	
	/**
	 * 跳转到登录页
	 * @return
	 */
	@RequestMapping("/add")
	public String add(HttpSession session){
//		if(session.getAttribute("user")!=null){//已经登录
//			
//		}else{//未登录
//			return "login";
//		}
		return "permission/add";
	}
	
	
	
	@RequestMapping("/addFirst")
	public String addFirstPermission(PermissionVO permission,String icon,ModelMap map) throws Throwable{
		
//		permission.setName("测试菜单");
//		permission.setStatus(new Byte("1"));
//		permission.setIslist(1);
//		permission.setOrders(1L);
//		permission.setType(new Byte("1"));
		

		//permission.setIcon("icon-desktop");
		
		if(service.addFirstPermission(permission) > 0){
			//map.addAttribute("msg", "添加成功!");
			map.addAttribute("permission", permission);
			return "redirect:add.action";
		}
		
		return "redirect:add.action";
	}
	
	@RequestMapping("/addSecond")
	public String addSecondPermission(PermissionVO permission,String icon) throws Throwable{
		
//		permission.setName("测试菜单");
//		permission.setStatus(new Byte("1"));
//		permission.setIslist(1);
//		permission.setOrders(1L);
//		permission.setType(new Byte("1"));
		

		//permission.setIcon("icon-desktop");
		System.out.println(permission);
		if(service.addSecondPermission(permission) > 0){
			return "redirect:add.action";
		}
		
		return "redirect:add.action";
	}
	
	@RequestMapping("/pidlist")
	public @ResponseBody List<PermissionVO> getPidJson(String id) throws Throwable{
		if(id != null && !id.equals("")){
			return service.getPid(id);
		}else{
			return null;
		}
		
	}
}
