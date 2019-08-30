package com.kboard.controller;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.inject.Inject;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kboard.domain.BoardVO;
import com.kboard.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {

	 @Inject
	 BoardService service;
	 
	 //날짜 타입 데이터 변환
	 @InitBinder
	 protected void initBinder(WebDataBinder wdb) {
		 /*컨트롤러가 뷰에게 데이터를 받았을때 날짜 타입으로 데이터를 변환시키는 메서드
		  * CustomDateEditor의 첫번째 매개변수인 dateFormat,
		  * 즉 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 의 형태로
		  * 들어오는 데이터를 변환합니다.
		  */
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 wdb.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	 }
			
	 
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void list(Model model) throws Exception {
	  
	  List<BoardVO> list = null;
	  list = service.list();
	  
	  model.addAttribute("list", list);
	  /* 모델에 추가
	   * 모델은 컨트롤러에서 뷰로 넘어갈때 데이터를 전달 할 수 있게 해주는 객체
	   * DB와 컨트롤러 사이의 DAO와 같은듯?
	   * 모델을 이용하면 컨트롤러에서 사용하던 데이터들을 뷰, 즉 jsp에서도 사용할 수 있음
	   */
	  	
	 }
	//게시물 작성
	 @RequestMapping(value = "/write", method = RequestMethod.GET)
	 public void getWrite() throws Exception{
		 
	 }
	 //게시물 작성의 post용 메소드
	 @RequestMapping(value = "/write", method = RequestMethod.POST)
	 public String postWrite(BoardVO vo) throws Exception{
		 
		 service.write(vo); // vo는 Service-DAO-Mapper를 통해 데이터 베이스에 접속하여 우리들이 작성한 게시물을 저장하게 됩니다.
		 
		 return "redirect:/board/list"; // 게시물 작성후 board/list로 이동하겠다는 의미
	 }
	 
	 //게시물 조회
	 @RequestMapping(value = "/view", method = RequestMethod.GET)
	 public void getView(@RequestParam("bno") int bno, Model model) throws Exception{
		 /*
		  * /board/view 주소에 저장된 매개변수(DB에 저장된 데이터)중 정수형(int) 변수를 받아 bno에 저장한 뒤,
		  * 이를 이용하여 Service의 view 메서드를 호출하여 최종적으로 데이터 베이스에서 데이터를 가져옵니다.
		  * 그 후 모델(model)을 이용하여 화면(view)쪽으로 데이터를 전송합니다
		  * 
		  * @RequestParam 어노테이션을 사용하면 매개변수로 넘어오는 데이터를 매칭시킬 수 있습니다. 
		  * 이 코드에선 URL에 있는 bno의 값을 가져온다는 의미입니다.
		  */
		 BoardVO view = null; // 보드VO 객체를 만들고
		 view = service.view(bno); // 서비스를 통해 게시물을 보여준다
		 
		 model.addAttribute("view", view);
	 }
	 
	 // 게시물 수정
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	 public void getUpdate(@RequestParam("bno") int bno, Model model) throws Exception {
		 BoardVO view = null;
		 view =  service.view(bno);

		 model.addAttribute("view", view);
	 }

	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String postUpdate(BoardVO vo) throws Exception {
		 /*
		  * BoardVO형태의 데이터를 받아서 vo 변수에 저장한 뒤,
		  * 이를 이용해 Service의 update 메서드를 통해 데이터 베이스에 접속하여 데이터를 수정합니다.
		  * 그 후 return "redirect:/board/list";로 인해 목록 화면으로 이동하게 됩니다.
		  */
		 
		 service.update(vo); // vo는 Service-DAO-Mapper를 통해 데이터 베이스에 접속하여 우리들이 작성한 게시물을 저장하게 됩니다.
		 
		 return "redirect:/board/list"; // 게시물 작성후 board/list로 이동하겠다는 의미
	 }
	 
	 // 게시물 삭제
	 @RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public void getDelete(@RequestParam("bno") int bno, Model model) throws Exception {
		 BoardVO view = null;
		 view =  service.view(bno);

		 model.addAttribute("view", view);
	 }
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String postDelete(BoardVO vo) throws Exception {
		 service.delete(vo.getBno());
		 
		 return "redirect:/board/list";
	 }
	 
	 // 게시물 목록 - 페이징 구현
	 @RequestMapping(value = "/listPage", method = RequestMethod.GET)
	 /*
	  * 이때, 페이지 번호인 num은 listPage로 넘어오는 유일한 매개변수이므로 별다른 설정을 하지 않더라도 
	  * 컨트롤러가 알아서 인식하여 사용할 수 있습니다. 하지만 매겨변수가 2개 이상이 되면 컨트롤러가 제대로 
	  * 인식하지 못할 수 있으므로 어노테이션을 사용해줘야합니다.
	  */
	 public void listPage(@RequestParam("num") int num, Model model) throws Exception {
		 
		 // 게시물 총 갯수
		 int count = service.count();
		 
		 // 한 페이지에 출력할 게시물 갯수
		 int postNum = 5;
		 
		 // 게시물 총 갯수 / 한 페이지에 출력할 게시물 갯수 = 하단 페이징
		 int pageNum = (int)Math.ceil((double)count/(double)5);
		 
		 // 선택한 페이지 번호 (임시)
		 //int selectNum = 1;
		 
		 //출력학 게시물
		 int displayPost = (num - 1) * 5;
		 
		 List<BoardVO> list = null;
		 list = service.listPage(displayPost, postNum);
		 model.addAttribute("list", list);
		 model.addAttribute("pageNum", pageNum);
	 }

}
