package com.example.pc.studentinfosql.model;

/**
 * Created by pc on 3/16/2017.
 */

public class ListItem {
    private  String head;
    private  String desc;

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
