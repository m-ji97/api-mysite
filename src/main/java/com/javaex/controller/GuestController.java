package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestbookVo;

@RestController
public class GuestController {

	@Autowired
	private GuestbookService guestbookService;

	//등록폼+리스트
	@GetMapping(value="/api/addlist")
	public String addList(Model model) {
		System.out.println("GuestController.addList()");

		List<GuestbookVo> guestbookList = guestbookService.exeAddList();
		model.addAttribute("guestbookList", guestbookList);

		return "guestbook/AddList";
	}
}
