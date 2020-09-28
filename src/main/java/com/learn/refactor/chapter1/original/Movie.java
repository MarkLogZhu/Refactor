package com.learn.refactor.chapter1.original;

/**
 * @author zhu
 * @description: 影片
 * @date 2020-09-28 13:47
 */
public class Movie {
    /**
     * 儿童片
     **/
    public static final int CHILDRENS = 2;
    /**
     * 普通片
     **/
    public static final int REGULAR = 0;
    /**
     * 新片
     **/
    public static final int NET_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
