package com.example.k.finalproject.ListView;
import android.graphics.drawable.Drawable;

/**
 * Created by k on 2016-11-24.
 */

public class ListViewItem {
    public String titleStr;
    public Drawable iconDrawable;
    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }


    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }

}
