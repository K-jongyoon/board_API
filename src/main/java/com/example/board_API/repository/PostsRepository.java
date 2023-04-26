package com.example.board_API.repository;

import com.example.board_API.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    public Optional<Posts> findById(Long id);
    @Query("select p from Posts p  order by p.id desc ")
    List<Posts> findAllDesc();
}
