package kr.kwangan2.jpatest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Board {
	
	public Board() {
		
	}
	
	public Board(String title, String writer, String content, Date createDate, Long cnt) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.createDate = createDate;
		this.cnt = cnt;
	}
	
 	@Id
	@GeneratedValue
	private Long seq;
	private String title;
	private String writer;
	private String content;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;
	private Long cnt;

}
