package com.catmap.spring_app_blog.post;

import com.catmap.spring_app_blog.comment.Comment;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private long id;

    private String title;

    private String content;

    private List<String> tags;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<Comment> comments;

    public Post(long id) {
    }

    // Constructor with all fields
    public Post(long id, String title, String content, List<String> tags, LocalDateTime createdAt, LocalDateTime updatedAt, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.comments = null;
    }

    // Constructor without the id
    public Post(String title, String content, List<String> tags, LocalDateTime createdAt, LocalDateTime updatedAt, List<Comment> comments) {
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.comments = null ;
    }

    // Constructor with basic fields
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", comments=" + comments +
                '}';
    }
}
