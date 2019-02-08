package com.itbank.mvcSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.mvcSpring.*;

@Controller
public class MusicController {
	
	@Autowired
	MusicDAO dao;
	
	@RequestMapping("insert.do")
	public String insert(MusicDTO dto) throws Exception {
		
		dao.insert(dto);
		System.out.println("삽입완료");
		
		return "inputView";
	}
	
	@RequestMapping("delete.do")
	public String delete(MusicDTO dto) throws Exception {
		dao.delete(dto.getId());
		System.out.println("삭제완료");
		
		return "deleteView";
	}
}