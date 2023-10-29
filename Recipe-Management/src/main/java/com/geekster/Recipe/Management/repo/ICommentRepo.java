package com.geekster.Recipe.Management.repo;

import com.geekster.Recipe.Management.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment,Long> {
}
