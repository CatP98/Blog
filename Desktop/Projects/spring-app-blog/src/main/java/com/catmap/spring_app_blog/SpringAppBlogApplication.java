package com.catmap.spring_app_blog;

import com.catmap.spring_app_blog.post.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringAppBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppBlogApplication.class, args);
	}


}
