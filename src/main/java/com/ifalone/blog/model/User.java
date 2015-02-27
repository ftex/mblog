package com.ifalone.blog.model;

import lombok.Data;

import java.util.Date;

/**
 * Author:shuichen
 * Date:15/2/27
 * Time:上午11:20
 * Desc:
 */
@Data
public class User {
    private int id;
    private String username;
    private String email;
    private String pwd;
    private Date created;
    private Date updated;
    private boolean active;
}
