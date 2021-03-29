package com.example.myapplication.expandable;

public class Child {
    private String childText;
    private boolean select;

    public Child() {
    }

    public Child(String childText) {
        this.childText = childText;
    }

    public String getChildText() {
        return childText;
    }

    public void setChildText(String childText) {
        this.childText = childText;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }
}
