package com.ifalone.blog.model;

import com.evernote.edam.type.Data;

/**
 * Author:shuichen
 * Date:15/2/27
 * Time:上午11:30
 * Desc:
 */
@lombok.Data
public class Resource {
    private int id;
    private int noteId;
    private String enGuid;
    private String enNoteGuid;
    private Data data;
    private String mime;
    private short width;
    private short height;
    private Data enRecognition;
    private int enUpdateSequenceNum;
}
