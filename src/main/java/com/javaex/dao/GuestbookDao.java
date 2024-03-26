package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//전체리스트
	public List<GuestbookVo> guestbookSelectList() {
		System.out.println("guestbookDao.guestbookSelectList()");
		
		List<GuestbookVo> guestbookList = sqlSession.selectList("guestbook.selectList");
		
		return guestbookList;
	}

}
