package com.kboard.controller;

import java.sql.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.sql.DriverManager;
import javax.inject.Inject;
import com.kboard.domain.BoardVO;
import com.kboard.service.BoardService;



/* 테스트하는 메서드가 많을 때 JUnit은 메서드를 실행할 마다 설정 파일을 가져와서 실행하는데, 
 * SpringJUnit4ClassRunner는 처음 실행할 때 설정 파일을 가져온 뒤 
 * 두번째 실행부터는 처음 가져온 설정 파일을가지고 계속 실행되기 때문에 테스트를 빨리 진행할 수 있게됩니다.
 */ 	

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DBConnection {
	
	final String DRIVER = "org.mariadb.jdbc.Driver";
	final String URL = "jdbc:mariadb://127.0.0.1:3307";
	final String USER = "gongdol";
	final String PASSWORD = "1028";
	
	@Test
	public void connectionTest() throws Exception
	{
		Class.forName(DRIVER);
		
		try
		{
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(con);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	} // connectionTest end
	
	@Inject
	private BoardService service;
	  
	@Test
	public void writeTest() throws Exception{
	 BoardVO vo = new BoardVO();
	 
	 vo.setTitle("제목 테스트");
	 vo.setContent("내용 테스트");
	 vo.setWriter("작성자 테스트");
	 
	 service.write(vo);
	}
}
