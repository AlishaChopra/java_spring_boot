package com.example.springbootprac.grabiityprac.resultfinal;

import java.time.Year;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.springbootprac.grabiityprac.result.Result;

@Entity
@Table(name="finalresult")
public class FinalResult {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fid;
	private String img;
	private String year;
	@ManyToOne
	private Result result;
	public FinalResult()
	{
		
	}
	public FinalResult(int fid, String img, String year, int rid) {
		super();
		this.fid = fid;
		this.img = img;
		this.year = year;
		this.result = new Result(rid,"","");
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
