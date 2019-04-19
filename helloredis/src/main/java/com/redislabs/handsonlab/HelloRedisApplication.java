package com.redislabs.handsonlab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class HelloRedisApplication implements ApplicationRunner {

	@Autowired
	StringRedisTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(HelloRedisApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// Step 1: Set the hello message in Redis
		// TODO Add code here to set the hello message

		// Step 2: Retrieve the hello message from Redis
		// TODO Change the code below to get the hello message from Redis
		String message = "Add code to get the message from Redis";
		log.info(message);

		// Step 3: Increment our run counter
		// TODO Change the code below to track the number of times the app has been run
		long count = 0;
		log.info("Hello Redis has been run {} times", count);
	}

}
