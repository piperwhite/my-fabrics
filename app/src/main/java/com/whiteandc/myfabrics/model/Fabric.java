package com.whiteandc.myfabrics.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Fabric model
 */
@Entity
public class Fabric {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "nick_name")
    private String nickName;

    @ColumnInfo(name = "img_path")
    private String imgPath;

    @ColumnInfo(name = "length")
    private String length;

    @ColumnInfo(name = "material")
    private String material;

    @ColumnInfo(name = "prewashed")
    private boolean prewashed;

    @ColumnInfo(name = "color")
    private String color;

    /**
     * @param nickName User created nick name for the fabric
     * @param imgPath Path to the fabric image file
     * @param length Length of the fabris
     * @param material Material of the fabric
     * @param prewashed Is fabric prewashed
     * @param color Predominant color of the fabric
     */
    public Fabric(final String nickName, final String imgPath, final String length, final String material, final boolean prewashed, final String color) {
        this.nickName = nickName;
        this.imgPath = imgPath;
        this.length = length;
        this.material = material;
        this.prewashed = prewashed;
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isPrewashed() {
        return prewashed;
    }

    public void setPrewashed(boolean prewashed) {
        this.prewashed = prewashed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
