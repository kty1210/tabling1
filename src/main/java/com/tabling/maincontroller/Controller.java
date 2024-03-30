package com.tabling.maincontroller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
    public String home() {
        return "home"; // 뷰 이름을 반환하여 해당 뷰를 표시합니다.
    }
	
	//로그인 페이지 - Get방식으로 작동해야함
	@GetMapping("/login")
	public void login(String error, String logout, Model model) {
	
		
		//로그인 에러시 메세지 출력
		if(error!=null) {
			model.addAttribute("error","Login Error");
		}
		
		//로그아웃시 메세지 출력
		if(logout!=null) {
			model.addAttribute("logout","Logout!");
		}
		
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	//회원 전용 페이지 이동
	@GetMapping("/member/test")
	public String test() {
		return "member/test";
	}
	
	//관리자 전용 페이지 이동
	@GetMapping("/admin/testa")
	public void testa() {
	}
	
	
	@GetMapping("/permitAlert")
	public String permitAlert() {
		return "permitAlert";
	}
	
	
	
}
