package kr.ac.koreait.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.koreait.domain.Board;
import kr.ac.koreait.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository boardRepository;

	@Override
	public List<Board> getBoardList(Board board) {
		return (List<Board>) boardRepository.findAll();
	}

	@Override
	public void insertBoard(Board board) {
		boardRepository.save(board);
	}

	@Override
	public Board getBoard(Board board) {
		return boardRepository.findById(board.getBoardSeqno()).get();
	}

	@Override
	public void updateBoard(Board board) {
		Board findBoard = boardRepository.findById(board.getBoardSeqno()).get();

		findBoard.setBoardSubject(board.getBoardSubject());
		findBoard.setBoardContent(board.getBoardContent());
		boardRepository.save(findBoard);
	}

	@Override
	public void deleteBoard(Board board) {
		boardRepository.deleteById(board.getBoardSeqno());
	}
}
