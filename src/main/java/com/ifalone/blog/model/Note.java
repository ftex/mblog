package com.ifalone.blog.model;

import lombok.Data;

import java.util.Date;

/**
 * Author:shuichen
 * Date:15/2/27
 * Time:上午11:22
 * Desc:
 */
@Data
public class Note {
    private int id;
    private String title;
    private String content;
    private int type;
    private Date created;
    private Date updated;
    private boolean active;
    private int notebookId;
    private String enGuid;
    private String enNotebookGuid;
    private int enUpdateSequenceNum;
}
