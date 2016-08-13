package cn.dtstax.roolkeeper.services;

import org.springframework.stereotype.Service;
import rx.Observable;
import rx.Subscriber;

/**
 * Description for Class Example1
 *
 * @author Lynch Lee<Lynch.lee9527@gmail.com>
 * @version 16/8/13.
 */
@Service
public class Example1 {

    public static void run(String[] args) {
        Observable<String> myObservable = Observable.create(
                new Observable.OnSubscribe<String>() {

                    @Override
                    public void call(Subscriber<? super String> subscriber) {
                        subscriber.onNext("I'm prior to Java 8");
                        subscriber.onCompleted();
                    }
                }
        );

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() { }

            @Override
            public void onError(Throwable throwable) { }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        };

        myObservable.subscribe(mySubscriber);

        //In Java 8
        Observable.just("I'm in Java 8")
                .subscribe(s -> System.out.println(s));
    }

}
