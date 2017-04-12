package com.mashen.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mashen.organization.service.OrganizationService;

@Controller
@RequestMapping()
public class OrganizationManageController {
	@Autowired
	private OrganizationService service;
	
	
	   
	
	

}
