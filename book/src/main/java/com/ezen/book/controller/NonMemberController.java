package com.ezen.book.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.book.service.NonMemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/nonMem/*")
@Controller
public class NonMemberController {

	@Inject
	private NonMemberService N;
	
	@GetMapping("orderNumsearch")
	public String orderNumsearch() {
		return "/member/orderNumsearch";
	}
	@GetMapping("orderPWsearch")
	public String orderPWsearch() {
		return "/member/orderPWsearch";
	}
}
