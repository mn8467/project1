package com.example.demo12.model;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private int post_no;
    private String user_id;
    private String title;
    private Date CREATED_AT;
    private int view_cnt;
    private String content;
}
