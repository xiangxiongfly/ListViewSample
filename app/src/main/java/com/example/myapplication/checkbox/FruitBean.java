package com.example.myapplication.checkbox;

public class FruitBean {
    private String name;
    private int img;
    private boolean checked;

    public FruitBean() {
    }

    public FruitBean(String name, int img, boolean checked) {
        this.name = name;
        this.img = img;
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
