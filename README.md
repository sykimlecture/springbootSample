# springbootSample

## spring boot project 생성
Spring Starter Project 선택한다.

Project명 작성(생성)
 - Service URL : https://start.spring.io
 - Name : 개인이름이 들어가는 이니셜(예:midterm_sykim)
 - Group : kr.ac.koreait
 - Artifact : 개인이름이 들어가는 이니셜(예:midterm_sykim)
 - Version : 0.0.1-SNAPSHOT
 - Description : Koreait project for Spring Boot
 - Package : kr.ac.koreait

Dependencies 선택
 - Spring Web
 - Spring Boot DevTools
 - Thymeleaf
 - Lombok

## board table 생성
```sql
CREATE TABLE `board` (
	`BOARD_SEQNO` INT(11) NOT NULL AUTO_INCREMENT COMMENT '게시판일련번호',
	`BOARD_SUBJECT` VARCHAR(100) NULL DEFAULT NULL COMMENT '게시판제목',
	`BOARD_CONTENT` LONGTEXT NULL COMMENT '게시판내용',
	`BOARD_CNT` INT(11) NULL DEFAULT NULL COMMENT '조회수',
	`BOARD_WRITER` VARCHAR(20) NULL DEFAULT NULL COMMENT '작성자명',
	`REGIST_DATE` VARCHAR(14) NULL DEFAULT NULL COMMENT '게시판작성일',
	PRIMARY KEY (`BOARD_SEQNO`)
)
COMMENT='게시판'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1;
```
