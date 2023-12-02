package com.example.demo12.mapper;

import com.example.demo12.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ListMapper {
    public List<Post> getPosts();
}
