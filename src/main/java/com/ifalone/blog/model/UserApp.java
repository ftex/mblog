package com.ifalone.blog.model;

import lombok.Data;

import java.util.Date;

/**
 * Author:shuichen
 * Date:15/2/27
 * Time:上午11:21
 * Desc:
 */
@Data
public class UserApp {
    private int id;
    private int userId;
    private int appType;
    private String appToken;
    private String appUserId;
    private Date created;
    private Date updated;
    private boolean active;
}
