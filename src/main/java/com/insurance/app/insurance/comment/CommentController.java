package com.insurance.app.insurance.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping("/list")
    public List<Comment> getAll() {
        return commentService.getAll();
    }

    @PostMapping("/add")
    public void addComment(@RequestBody Comment comment){
        commentService.addComment(comment);
    }
}
