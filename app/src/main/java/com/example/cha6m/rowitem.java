package com.example.cha6m.developers;

import android.widget.ImageButton;

public class rowitem {
    private String developer_name;
    private ImageButton call;

    public rowitem(String name, ImageButton call){
        developer_name=name;
        this.call=call;
    }

    public String getDeveloper_name() {
        return developer_name;
    }

    public void setDeveloper_name(String developer_name) {
        this.developer_name = developer_name;
    }


}
