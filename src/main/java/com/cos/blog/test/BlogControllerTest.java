package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// 스프링이 com.cos.blog 패키지 이하를 스캔해서 특정 annotation이 붙어있는 파일들을 메모리에 new(ioc)해서
// 스프링 컨테이너에서 관리해준다.


// 7000 port로 변경
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello springboot</h1>";
	}
}
