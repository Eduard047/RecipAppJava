package com.recipeapp.demo.service;

import com.recipeapp.demo.model.Comment;
import com.recipeapp.demo.model.Recipe;
import com.recipeapp.demo.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getCommentsByRecipe(Recipe recipe) {
        return commentRepository.findByRecipe(recipe);
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }
}
