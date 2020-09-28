package com.learn.refactor.chapter1.refactor;

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

    private double amountFor(Rental rental) {
        double result = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (rental.getDaysRented() > 2) {
                    result += (rental.getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NET_RELEASE:
                result += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (rental.getDaysRented() > 3) {
                    result += (rental.getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }

}
