package com.hemanth.backend_system.repository;

import com.hemanth.backend_system.entity.Comment;
import com.hemanth.backend_system.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {}

