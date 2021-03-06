package com.kboard.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.kboard.domain.BoardVO;

@Repository // 이 클래스가 DAO라는것을 스프링에게 알려주는 역할을 하는 어노테이션
public class BoardDAOImpl implements BoardDAO {

	@Inject // bean 객체 자동 주입
	private SqlSession sql; // 로 DB에 접속할수 있게 되었고
	
	private static String namespace = "com.kboard.mappers.boardMapper";
	//매퍼를 매번 입력하기엔 번거로우니 변수로 등록
	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
		// com.kboard.mappers.boardMapper.write를 vo형으로
	}
	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update(namespace + ".update", vo);
	}
	@Override
	public void delete(int bno) throws Exception {
		sql.delete(namespace + ".delete", bno);
	}
	@Override
	public BoardVO view(int bno) throws Exception {
		return sql.selectOne(namespace + ".view", bno);
	}
	@Override
	public List<BoardVO> list() throws Exception {
		return sql.selectList(namespace + ".list");
	}
	@Override
	public int count() throws Exception {
		return sql.selectOne(namespace + ".count");
	}
	
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception{
		/*
		 * 해쉬맵(HashMap)을 이용하여 VO를 대용했습니다. 
		 * 해쉬맵의 첫번째 문자열 요소는 키가 되고 두번째 정수형(Integer)는 데이터가 됩니다.
		 */
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("displayPost", displayPost);
		myMap.put("postNum", postNum);
		
		return sql.selectList(namespace + ".listPage", myMap);	
				
	}

}
