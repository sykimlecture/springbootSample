/**
 *
 */
package kr.ac.koreait.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author user
 *
 */
@Getter
@Setter
@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOARD_SEQNO")
	private long boardSeqno; // 게시판 일련번호

	@Column(name = "BOARD_SUBJECT")
	private String boardSubject; // 게시판 제목

	@Column(name = "BOARD_CONTENT")
	private String boardContent; // 게시판 내용

	@Column(name = "BOARD_CNT")
	private long boardCnt; // 조회수

	@Column(name = "BOARD_WRITER")
	private String boardWriter; // 게시판 작성자

	@Column(name = "REGIST_DATE")
	private String registDate; // 게시판 작성일자
}
