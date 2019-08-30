package com.kboard.service;

import java.util.List;

import com.kboard.domain.BoardVO;

public interface BoardService {
	public void write(BoardVO vo) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public BoardVO view(int bno) throws Exception;
	
	public List<BoardVO> list() throws Exception;
	
	public int count() throws Exception;
	
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception;
}
