package com.edu.boot0307.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edu.boot0307.domain.Board;
import com.edu.boot0307.model.board.BoardService;

// 스프링 부트는 기존의 레거시의 Api를 그래도 가져오되, 단지 설정에 대한 부담만 개발자에게 안 준 것 뿐이다.
@Controller
public class BoardController {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private BoardService boardService;

	@GetMapping("board/list")
	public ModelAndView getList() {

		
		// 뷰 리절버가 자동으로 작동함!
		ModelAndView mv=new ModelAndView("board/list");
		return mv;
	}
	
	@PostMapping("/board/regist")
	public ModelAndView regist(Board board) {
		logger.info("등록 메서드"+board);
		boardService.insert(board);
		
		ModelAndView mv=new ModelAndView("redirect:/board/list");
		return mv;
	}
	
	
	@GetMapping("/board/registform")
	public ModelAndView getRegistForm() {

		
		// 뷰 리절버가 자동으로 작동함!
		ModelAndView mv=new ModelAndView("board/write");
		return mv;
	}
	
	
}
