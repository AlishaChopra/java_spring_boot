package com.example.springbootprac.grabiityprac.result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
		@Autowired
		private ResultService resultService;
		@RequestMapping("/resulttype")
		public List<Result> getAllResultType()
		{
			return resultService.getResult();
		}
		@RequestMapping(method= RequestMethod.POST, value="/resulttype")
		public void addResult(@RequestBody Result result)
		{
			resultService.addResult(result);
		}
		
		@RequestMapping(method=RequestMethod.DELETE,value="/resulttype/{id}")
		public void deleteResultById(@PathVariable int id)
		{
			resultService.deleteResultById(id);
		}
		
		@RequestMapping(method=RequestMethod.PUT,value="/resulttype/{id}")
		public void updateResultById(@RequestBody Result result,@PathVariable int id)
		{
			resultService.updateResultById(result, id);
		}
		
		@RequestMapping("/resulttype/{id}")
		public Result getResultById(@PathVariable int id)
		{
			return resultService.getResultById(id);
		}
}


