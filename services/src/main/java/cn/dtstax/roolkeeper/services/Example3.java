package cn.dtstax.roolkeeper.services;

import org.springframework.stereotype.Service;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Description for Class Example3
 *
 * @author Lynch Lee<Lynch.lee9527@gmail.com>
 * @version 16/8/13.
 */
@Service
public class Example3 {

    public static void run(String[] args) {
        List<String> symbols = Arrays.asList("AMZN", "GOOG", "ORCL");

        Observable<StockInfo> feed = StockerServer.getFeed(symbols);

        feed.subscribe(System.out::println);

        System.out.println("END");
    }

}
