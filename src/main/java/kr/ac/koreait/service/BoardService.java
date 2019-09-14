package kr.ac.koreait.service;

import java.util.List;

import kr.ac.koreait.domain.Board;
public interface BoardService {
	public List<Board> getBoardList(Board board);

	public void insertBoard(Board board);

	public Board getBoard(Board board);

	public void updateBoard(Board board);

	public void deleteBoard(Board board);

}
