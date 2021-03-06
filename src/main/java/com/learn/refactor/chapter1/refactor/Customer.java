package com.learn.refactor.chapter1.refactor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author zhu
 * @description: 顾客
 * @date 2020-09-28 13:51
 */
public class Customer {

    private String name;
    private Vector rentals = new Vector();


    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        final Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            thisAmount = each.getCharge();
            // 增加积分
            frequentRenterPoints++;
            // 新片额外增加积分
            if ((each.getMovie().getPriceCode() == Movie.NET_RELEASE)
                    && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            // 显示租金
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        // 添加页脚线
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

}
