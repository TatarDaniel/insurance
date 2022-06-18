package com.insurance.app.insurance.comment;

import com.insurance.app.insurance.claim.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAll(){
        return commentRepository.findAll();
    }

    public void addComment(Comment comment){
        commentRepository.save(comment);
    }

    public List<Comment> getCommentsByUser(long user) {
        return commentRepository.getCommentsByUser(user);
    }
}
