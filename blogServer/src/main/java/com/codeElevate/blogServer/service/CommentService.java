package com.codeElevate.blogServer.service;

import com.codeElevate.blogServer.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long postId, String postedBy, String content);

    List<Comment> getCommentByPostId(Long postId);
}
