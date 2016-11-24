package com.example.k.finalproject.ListView;
import android.graphics.drawable.Drawable;

/**
 * Created by k on 2016-11-24.
 */

public class ListViewClass {
    public String titleStr;
   /* public String descStr;*/
    public Drawable iconDrawable;
    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    /*public void setDesc(String desc) {
        descStr = desc ;
    }*/

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    /*public String getDesc() {
        return this.descStr ;
    }*/
}
