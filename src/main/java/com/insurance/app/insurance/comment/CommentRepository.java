package com.insurance.app.insurance.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query("SELECT c from  Comment c where c.author_id = :id")
    List<Comment> getCommentsByUser(@Param("id") long id);
}
