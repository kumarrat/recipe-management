package com.geekster.Recipe.Management.service;

import com.geekster.Recipe.Management.model.Comment;
import com.geekster.Recipe.Management.repo.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    ICommentRepo commentRepo;

    public String saveComment(Comment newComment) {
        commentRepo.save(newComment);
        return "comment added";
    }

    public List<Comment> getComment() {

        return commentRepo.findAll();
    }

    public String removeComment(Long id) {
        commentRepo.deleteById(id);
        return "comment removed";
    }
}
