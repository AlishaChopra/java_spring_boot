package com.example.springbootprac.grabiityprac.result;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ResultService {
	@Autowired
	private ResultRepository resultrepo;
	
	public List<Result> getResult()
	{
		List<Result> results =new ArrayList<>();
		resultrepo.findAll().forEach(results::add);
		return results;
	}
	
	public void addResult(Result result)
	{
		resultrepo.save(result);
	}
	
	public Result getResultById(int id)
	{
		return resultrepo.findById(id).get();
	}
	
	public void deleteResultById(int id)
	{
		resultrepo.deleteById(id);
	}
	
	public void updateResultById(Result result, int id)
	{
		resultrepo.save(result);
	}

}
