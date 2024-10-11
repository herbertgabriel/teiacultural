package com.proarecife.teiacultural.repository;

import com.proarecife.teiacultural.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
