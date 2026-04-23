package com.hemanth.backend_system.controller;

import com.hemanth.backend_system.entity.Comment;
import com.hemanth.backend_system.entity.Post;
import com.hemanth.backend_system.repository.CommentRepository;
import com.hemanth.backend_system.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
    @Autowired
    private CommentRepository commentRepository;
    @PostMapping("/{postId}/comments")
    public Comment addComment(@PathVariable Long postId, @RequestBody Comment comment) {
        comment.setPostId(postId);
        comment.setCreatedAt(LocalDateTime.now());
        return commentRepository.save(comment);
    }
}
