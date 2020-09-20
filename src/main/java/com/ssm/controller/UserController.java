package com.ssm.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Address;
import com.ssm.entity.UserMap;
import com.ssm.entity.Usera;

/**
 * @author ZYB
 * @date 创建时间：2020年5月24日
 * @serial
 * 
 */

@Controller
@RequestMapping(value = "/User") // method 请求方式, method = RequestMethod.GET
//@SessionAttributes(value = { "Usera" }) // User类型模型存入HttpSession
public class UserController {

	@RequestMapping(value = "/test1") // method = RequestMethod.GET
	public ModelAndView test() {
		System.out.println("mvc注解，自动扫描");
		ModelAndView mv = new ModelAndView();

		mv.addObject("test1", "MVC");
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping(value = "/test2", method = RequestMethod.POST) // params = "param=test1" 请求头必须包含param=test1
	public ModelAndView test2() {
		System.out.println("test2,POST ");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test2");
		mv.addObject("test2", "POST");
		return mv;

	}

	@RequestMapping(value = "/*/test3")
	public ModelAndView test3() {
		System.out.println("test3");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test2");
		return mv;
	}

//GET
	@RequestMapping(value = "/rest/{id}", method = RequestMethod.GET)
	public String restGET(@PathVariable("id") Integer id) {
		System.out.println("REST GET" + id);
		return "test2";
	}

//RETS POST
	@RequestMapping(value = "/rest", method = RequestMethod.POST)
	public String restPOST() {
		System.out.println("rest POST");
		return "index";
	}

//REST DELETE
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String restDELTET(@PathVariable("id") Integer id) {
		System.out.println("DELETE: " + id);
		// 重定向 redirect+地址
		return "redirect:/User/doTransfer/delete";
	}

	@RequestMapping(value = "/doTransfer/{request}")
	public String doTransfer(@PathVariable("request") String request) {
		System.out.println("do  " + request);
		return "index";
	}

//REST PUT
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public String restPUT(@PathVariable("id") Integer id) {
		System.out.println("PUT: " + id);
		return "redirect:/User/doTransfer/put";
	}

//requestParam 绑定控制器类处理方法入参
	@RequestMapping("/requestParam")
	public String requestParam(@RequestParam(value = "loginName") String name,
			@RequestParam(value = "logpwd") String pwd) {
		System.out.println("logname= " + name + "   logpwd=" + pwd);
		return "index";
	}

//将请求绑定控制器方法的表单对象
	@RequestMapping("/saveUser")
	public String saveUser(Usera user) {
		System.out.println(user);
		return "index";

	}

//将请求绑定到控制器的Map对象
	@RequestMapping("/getUser")
	public String getUser(UserMap userMap) {

		Set set = userMap.getuMap().keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object keyName = iterator.next();
			Usera u = userMap.getuMap().get(keyName);
			System.out.println(u);
		}
		return "index";
	}

	// 控制器类处理方法的返回值类型
	@RequestMapping("/returnModelAndeView")
	public ModelAndView returnModelAndView() {
		String viewName = "index";
		ModelAndView mv = new ModelAndView(viewName);
		Usera usera = new Usera("123", "zyb", "zxwx", new Address("123", "yuyao"));
		mv.addObject("user", usera);
		return mv;
	}

	// session存入数据
	@RequestMapping("/sessionAttributes")
	public String sessionAttributes(ModelMap model) {
		Usera usera = new Usera("001", "test1", "zxwx", new Address("zhenjiang", "ningbo"));
		model.put("Usera", usera);
		return "index";
	}

	@ModelAttribute
	public Usera getUser(Model model) {
		Usera usera = new Usera("002", "test2", "zxwx", new Address("zhejiang", "yy"));
		model.addAttribute("usera1", usera);
		return usera;

	}

//处理方法执行前执行指定方法
	@RequestMapping("/modelAttribute")
	public String modelAttribute(Usera usera) {
		System.out.println(usera);

		return "index";
	}

//自定义视图
	@RequestMapping("/beanNameViewResolver")
	public String beanNameViewResolver() {
		return "myView";
	}

//页面重定向
	@RequestMapping("/redirect")
	public String redirect() {
		return "redirect:/ch07/index.jsp";

	}

	@ResponseBody
	@RequestMapping("/returnJson")
	public Collection<Usera> returnjson() {
		Map<Integer, Usera> user = new HashMap<Integer, Usera>();
		user.put(1, new Usera("001", "test1", "zxwx", new Address("zhejiang", "yy")));
		user.put(2, new Usera("002", "test2", "xxxx", new Address("js", "nt")));
		user.put(2, new Usera("003", "test3", "aaaa", new Address("hn", "xc")));
		return user.values();
	}
}
