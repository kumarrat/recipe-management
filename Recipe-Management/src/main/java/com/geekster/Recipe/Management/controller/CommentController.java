package com.geekster.Recipe.Management.controller;

import com.geekster.Recipe.Management.model.Comment;
import com.geekster.Recipe.Management.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("comment")
    public String addComment(@RequestBody @Valid Comment newComment)
    {
        return commentService.saveComment(newComment);
    }

    @GetMapping("comments")
    public List<Comment> getComment()
    {
        return commentService.getComment();
    }

    @DeleteMapping("comment/{id}")
    public String removeComment(@PathVariable Long id)
    {
        return commentService.removeComment(id);
    }
}
