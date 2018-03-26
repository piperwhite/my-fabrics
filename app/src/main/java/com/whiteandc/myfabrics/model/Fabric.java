package com.whiteandc.myfabrics.model;

/**
 * Fabric model
 */
public class Fabric {
    private String nickName;
    private String imgPath;
    private String length;
    private String material;
    private boolean prewash;
    private String color;

    /**
     * @param nickName User created nick name for the fabric
     * @param imgPath Path to the fabric image file
     * @param length Length of the fabris
     * @param material Material of the fabric
     * @param prewash Is fabric prewashed
     * @param color Predominant color of the fabric
     */
    public Fabric(final String nickName, final String imgPath, final String length, final String material, final boolean prewash, final String color) {
        this.nickName = nickName;
        this.imgPath = imgPath;
        this.length = length;
        this.material = material;
        this.prewash = prewash;
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

    public boolean isPrewash() {
        return prewash;
    }

    public void setPrewash(boolean prewash) {
        this.prewash = prewash;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
