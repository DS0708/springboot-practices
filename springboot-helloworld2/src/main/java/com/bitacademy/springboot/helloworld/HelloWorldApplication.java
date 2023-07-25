package com.bitacademy.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloWorldApplication {
	/**
	 * SpringApplication.run(...) 안에서 일어나는 일(BootStrap)
	 * 
	 * 1. ApplicationContext, Spring Container 생성
	 * 2. 만약, 웹 어플리케이션이라면 웹 어플리케이션의 타입(Spring MVC, Reactive)
	 * 3. 어노테이션 스캐닝(Auto) + Configuration Class를 통한
	 * Bean 생성/등록/와이어링 작업 
	 * 4. 만약, Spring MVC 라면 
	 * 		1. Auto Configuration
	 * 		2. 내장(embed) 서버 (TomcatEmbededServiceServletContainer) 인스턴스 생성 
	 * 		3. 서버 인스턴스에 웹 어플리케이션 배포 
	 * 		4. 서버 인스턴스 실행
	 * 5. ApplicationRunner 인터페이스를 구현한 Bean을 ApplicationContext에서
	 * 찾아 실행 
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
