package com.catmap.spring_app_blog.post;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Service
public class PostService {

    public List<Post> getPosts() {
        return List.of(
                new Post(
                        "Blog Post 1",
                        "This is a post about the blog",
                        List.of("tag1", "tag2"),
                        LocalDateTime.of(2024, Month.NOVEMBER, 11, 10, 0),  // Provide complete time
                        LocalDateTime.of(2024, Month.NOVEMBER, 11, 10, 30),  // Provide update time
                        null
                ),
                new Post(
                        "Blog Post 2",
                        "Another blog post",
                        List.of("tag3", "tag4"),
                        LocalDateTime.of(2024, Month.NOVEMBER, 12, 10, 0),
                        LocalDateTime.of(2024, Month.NOVEMBER, 12, 10, 30),
                        null
                )
        );
    }
}
