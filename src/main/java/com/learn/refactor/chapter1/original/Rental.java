package com.learn.refactor.chapter1.original;

/**
 * @author zhu
 * @description:租赁合同
 * @date 2020-09-28 13:44
 */
public class Rental {

    /**
     * 影片对象
     */
    private Movie movie;
    /**
     * 出租天数
     **/
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
