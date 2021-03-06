package com.team404.freeboard.mapper;

import java.util.ArrayList;

import com.team404.command.FreeBoardVO;
import com.team404.util.Criteria;

public interface FreeBoardMapper {
	
	public void regist(FreeBoardVO vo);
	public ArrayList<FreeBoardVO> getList(Criteria cri); //글 aaaaaaaaa
	public int getTotal();//총 게시글 수
	public FreeBoardVO getContent(int bno); //상세보기
	public int update(FreeBoardVO vo); //변경
	public int delete(FreeBoardVO vo);//삭제
	
	
	
}
