import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Test {
    static int i = 0;

    public static void main(String[] args) {

//        Flowable.range(1, 10)
//                .observeOn(Schedulers.computation())
//                .map(v -> v * v)
//                .blockingSubscribe(System.out::println);

        Flowable.range(1, 10)
                .flatMap(new Function<Integer, Publisher<?>>() {
                    @Override
                    public Publisher<?> apply(Integer integer) throws Exception {

                        return Flowable.just(integer).map(w -> w * w);
                    }
                }).subscribe(System.out::println);
        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


