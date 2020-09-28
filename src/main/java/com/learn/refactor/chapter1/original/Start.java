package com.learn.refactor.chapter1.original;

/**
 * @author zhu
 * @description: 启动
 * @date 2020-09-28 14:23
 */
public class Start {


    public static void main(String[] args) {
        // 声明影片对象
        Movie childrens = new Movie("哪咤之魔童降世", Movie.CHILDRENS);
        Movie regular = new Movie("将爱情进行到底", Movie.REGULAR);
        Movie netRelease = new Movie("沉默的真相", Movie.NET_RELEASE);

        // 声明租赁对象
        Rental childrensRental = new Rental(childrens, 3);
        Rental regularRental = new Rental(regular, 6);
        Rental netReleaseRental = new Rental(netRelease, 9);

        // 声明顾客
        Customer customer = new Customer("张不易");

        // 绑定租赁行为
        customer.addRental(childrensRental);
        customer.addRental(regularRental);
        customer.addRental(netReleaseRental);

        // 打印订单详情
        final String result = customer.statement();
        System.out.println(result);
    }
}
