package com.ezen.book.service;

import java.util.regex.Pattern;

import javax.inject.Inject;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ezen.book.domain.MemberVO;
import com.ezen.book.repository.MemberDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	private MemberDAO mdao;
	@Inject
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean join(MemberVO mvo) {
		log.info("member join check 2");
		//아이디가 중복되면 회원가입 실패
		//아이디와 일치하는 정보를 db에서 가져옴
		log.info("mvo.getMem_id : "+mvo.getMem_id());
		MemberVO tmpUser = mdao.getId(mvo.getMem_id());
		//tmpUser가 null이 아니라면(이미 가입된 회원) -> 아이디 중복 -> 회원가입 실패
		//null이면 회원가입시켜주기
		if(tmpUser != null) {
			return false;
		}
		//아이디가 중복되지 않았으면 회원가입
		//아이디 유효성 검사 -> 맞으면 체크, 아니면 실패
		//우선 아이디가 입력이 되었는지만 체크하기
		if(mvo.getMem_id()==null || mvo.getMem_id().length()==0) {
			return false;
		}
		//비밀번호 유효성 검사 : 비밀번호가 입력되었는지 체크
		if(mvo.getMem_pw()==null || mvo.getMem_pw().length()==0) {
			return false;
		}
		
		//회원가입
		//비밀번호를 암호화 과정
		String pw = mvo.getMem_pw();
		//encode라는 객체를 이용하면 암호화가 됨
		//matches 를 이용하여 (원래비번, 암호화된 비번) 일치하는지 체크
		String encodePw = passwordEncoder.encode(pw); //암호화된 패스워드
		//회원비밀번호를 암호화된 비밀번호로 수정
		mvo.setMem_pw(encodePw);
		//회원가입 -> insert
		int isOk = mdao.insertMember(mvo);
		log.info("join isOk : "+isOk);
		return isOk>0? true:false;

	}
	




	@Override
	public MemberVO login(String id, String pw) {
		MemberVO member = mdao.getId(id);
		if(member ==null) {return null;}
		
		if(passwordEncoder.matches(pw, member.getMem_pw())) {
			return member;
		}else {
			
			return null;
		}
	}
	@Override
	public int usermodify(MemberVO mvo) {
		log.info(">>> member modify check msvI");
		String pw=mvo.getMem_pw();
		String encodePw = passwordEncoder.encode(pw); //암호화된 패스워드
		//회원비밀번호를 암호화된 비밀번호로 수정
		mvo.setMem_pw(encodePw);
		return mdao.usermodify(mvo);
		
	}

	@Override
	public int deleteMember(int mem_num) {
		log.info(">>> member de;ete check msvI");
		return mdao.memberDelete(mem_num);
	}





	@Override
	   public String pwCheck(String mem_pw) {
	      // 비밀번호 유효성 검사 : 비밀번호가 입력되었는지 체크
	      // 정규식 (영문(대소문자 구분), 숫자, 특수문자 조합, 9~12자리)
	      String pwPattern = "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{9,12}$";
	      String pwCheck = mem_pw;
	      // null값일 경우
	      if (pwCheck == null || pwCheck.length() == 0) {
	         return "pw_null";
	      }
	      // 비밀번호와 정규표현식 비교
	      java.util.regex.Matcher matcher = Pattern.compile(pwPattern).matcher(pwCheck);
	      if (!matcher.matches()) { // 정규식에 어긋난다면 재작성 요청하기
	         return "pw_rewrite";
	      }
	      return "pw_ok";
	   }



	

}