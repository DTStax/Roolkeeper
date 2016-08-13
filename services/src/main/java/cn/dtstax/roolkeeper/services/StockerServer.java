package cn.dtstax.roolkeeper.services;

import rx.Observable;

import java.util.List;

/**
 * Description for Class StockerServer
 *
 * @author Lynch Lee<Lynch.lee9527@gmail.com>
 * @version 16/8/13.
 */
public class StockerServer {

    public static Observable<StockInfo> getFeed(List<String> symbols) {
        return Observable.create(subscriber -> {
            while (true) {
                for (String symbol : symbols) {
                    StockInfo info = StockInfo.fetch(symbol);
                    subscriber.onNext(info);
                }
                sleep(1000);
            }
        });
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception ex) {}
    }

}
