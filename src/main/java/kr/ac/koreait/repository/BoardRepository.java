package kr.ac.koreait.repository;

import org.springframework.data.repository.CrudRepository;

import kr.ac.koreait.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
