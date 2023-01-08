package com.ezen.book.service;

import com.ezen.book.domain.MemberVO;

public interface MemberService {

	boolean join(MemberVO mvo);

	MemberVO login(String id, String pw);

	int usermodify(MemberVO mvo);


	int deleteMember(int mem_num);

	String pwCheck(String mem_pw);

}
