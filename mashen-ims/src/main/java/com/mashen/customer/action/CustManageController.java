package com.mashen.customer.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustManageController {

	@RequestMapping("/add")
	public String add() {
		return "customer/add";
	}
	
	@RequestMapping("adoAdd")
	public String doAdd(){
		
		return "";
	}
	
}
