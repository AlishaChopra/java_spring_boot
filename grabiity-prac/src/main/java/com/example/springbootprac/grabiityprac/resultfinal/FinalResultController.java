package com.example.springbootprac.grabiityprac.resultfinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootprac.grabiityprac.result.Result;

@RestController
public class FinalResultController {
		@Autowired
		private FinalResultService finalResultService;
		@RequestMapping("/resulttype/{rid}/finalresult")
		public List<FinalResult> getAllFinalResult(@PathVariable int rid)
		{
			return finalResultService.getFinalResult(rid);
		}
		@RequestMapping(method= RequestMethod.POST, value="/resulttype/{rid}/finalresult")
		public void addFinalResult(@RequestBody FinalResult finalResult,@PathVariable int rid )
		{
			finalResult.setResult(new Result(rid,"",""));
			finalResultService.addFinalResult(finalResult);
		}
		
		@RequestMapping(method=RequestMethod.DELETE,value="/resulttype/{rid}/finalresult/{id}")
		public void deleteFinalResultById(@PathVariable int id)
		{
			finalResultService.deleteFinalResultById(id);
		}
		
		@RequestMapping(method=RequestMethod.PUT,value="/resulttype/{rid}/finalresult/{id}")
		public void updateFinalResultById(@RequestBody FinalResult finalResult,@PathVariable int rid, @PathVariable int id )
		{
			finalResult.setResult(new Result(rid,"",""));
			finalResultService.updateFinalResultById(finalResult);
		}
		
		@RequestMapping("/resulttype/{rid}/finalresult/{id}")
		public FinalResult getFinalResultById(@PathVariable int id)
		{
			return finalResultService.getFinalResultById(id);
		}
}


