package com.example.springbootprac.grabiityprac.result;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class Result {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String resType;
	private String resImg;
	public Result() {
		
	}
	public Result(int id, String resType, String resImg) {
		super();
		this.id = id;
		this.resType = resType;
		this.resImg = resImg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResType() {
		return resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
	public String getResImg() {
		return resImg;
	}
	public void setResImg(String resImg) {
		this.resImg = resImg;
	}
}
