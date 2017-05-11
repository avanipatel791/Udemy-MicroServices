package com.lab6.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lab6.domain.Word;

@FeignClient("NOUN")
public interface NounClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public Word getWord();
	
}
