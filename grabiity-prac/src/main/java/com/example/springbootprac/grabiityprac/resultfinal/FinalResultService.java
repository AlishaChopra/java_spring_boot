package com.example.springbootprac.grabiityprac.resultfinal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FinalResultService {
	@Autowired
	private FinalResultRepository finalresultrepo;
	
	public List<FinalResult> getFinalResult(int rid)
	{
		List<FinalResult> finalResults =new ArrayList<>();
		finalresultrepo.findByResultId(rid).forEach(finalResults::add);
		return finalResults;
	}
	
	public void addFinalResult(FinalResult finalResult)
	{
		finalresultrepo.save(finalResult);
	}
	
	public FinalResult getFinalResultById(int id)
	{
		return finalresultrepo.findById(id).get();
	}
	
	public void deleteFinalResultById(int id)
	{
		finalresultrepo.deleteById(id);
	}
	
	public void updateFinalResultById(FinalResult finalResult)
	{
		finalresultrepo.save(finalResult);
	}

}
