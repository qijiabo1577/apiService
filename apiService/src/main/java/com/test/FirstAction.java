package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class FirstAction {

	@RequestMapping(value = "/hello", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String sayHello(HttpServletRequest request,
			HttpServletResponse response) throws InterruptedException {
		System.out.print("a");
		return "";
	}

}
