package com.ezen.book.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ezen.book.repository.NonMemberDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NonMemberServiceImpl implements NonMemberService {

	@Inject
	private NonMemberDAO nmDAO;
}
