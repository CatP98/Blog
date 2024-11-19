package com.catmap.spring_app_blog.comment;

import com.catmap.spring_app_blog.post.Post;

import java.time.LocalDateTime;

public class Comment {
    private long id;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Post post;
}
