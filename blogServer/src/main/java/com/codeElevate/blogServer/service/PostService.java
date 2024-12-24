package com.codeElevate.blogServer.service;

import com.codeElevate.blogServer.entity.Post;

import java.util.List;

public interface PostService {

    Post savePost(Post post);

    List<Post> getAllPosts();

    Post getPostById(Long postId);

    void likePost(Long postId);

    List<Post> searchByName(String name);
}
