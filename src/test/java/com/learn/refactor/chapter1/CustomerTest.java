package com.learn.refactor.chapter1;

import com.learn.refactor.chapter1.refactor.Customer;
import com.learn.refactor.chapter1.refactor.Movie;
import com.learn.refactor.chapter1.refactor.Rental;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author zhu
 * @description: 顾客对象测试
 * @date 2020-09-28 15:01
 */
public class CustomerTest {


    @Test
    public void should_return_expected_orderDetails() {
        String expectedOrderDetails = "Rental Record for 张不易\n\t哪咤之魔童降世\t1.5\n\t将爱情进行到底\t8.0\n\t沉默的真相\t27.0\nAmount owed is 36.5\nYou earned 4 frequent renter points";

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
        // 获取订单详情
        final String result = customer.statement();

        assertThat(result, is(expectedOrderDetails));
    }


}
