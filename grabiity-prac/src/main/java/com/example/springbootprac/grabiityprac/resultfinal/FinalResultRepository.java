package com.example.springbootprac.grabiityprac.resultfinal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FinalResultRepository extends CrudRepository<FinalResult,Integer>{
	public List<FinalResult> findByResultId(int rid);
}
