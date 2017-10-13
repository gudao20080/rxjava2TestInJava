import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.*;
import io.reactivex.schedulers.Schedulers;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
//        Observable.never().subscribe(new Observer<Object>() {
//            @Override
//            public void onSubscribe(Disposable disposable) {
//                System.out.println("onSub");
//            }
//
//            @Override
//            public void onNext(Object o) {
//                System.out.println("onNext");
//
//            }
//
//            @Override
//            public void onError(Throwable throwable) {
//                System.out.println("onError");
//
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("onComplete");
//
//            }
//        });
//
//
//        Observable.error(new Throwable("错误"))
//                .subscribe(new Observer<Object>() {
//                    @Override
//                    public void onSubscribe(Disposable disposable) {
//                        System.out.println("onSub");
//                    }
//
//                    @Override
//                    public void onNext(Object o) {
//                        System.out.println("onNext");
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//                        System.out.println(throwable.getMessage());
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        System.out.println("onComplete");
//                    }
//                });

//            Observable.timer(1000, TimeUnit.MILLISECONDS)
//                    .subscribe(aLong -> System.out.println(aLong));
//
//        Observable.range(-1, 1).subscribe(it -> System.out.println(it));

//        Observable.interval(1000L, 300L, TimeUnit.MILLISECONDS, Schedulers.io())
//                .subscribe(it -> System.out.println(it));
//        Observable.intervalRange(1, 100, 0, 30L, TimeUnit.MILLISECONDS)
//                .subscribe(it -> System.out.println(it));
//
//        Observable.defer((Callable<ObservableSource<Integer>>) () -> Observable.just(10000)).subscribe(it -> System.out.println(it));
//
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        Observable.fromArray(list).subscribe(new Consumer<ArrayList<Integer>>() {
//            @Override
//            public void accept(ArrayList<Integer> integers) throws Exception {
//                System.out.println(integers);
//            }
//        });
//
//        Observable.fromCallable((Callable<Object>) () -> "ddd").subscribe(it -> System.out.println(it));
//
//        Observable.fromIterable(list).subscribe(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) throws Exception {
//                System.out.println(integer);
//            }
//        });
//
//        Observable.fromFuture(Observable.just(2).toFuture())
//                .doOnComplete(new Action() {
//                    @Override
//                    public void run() throws Exception {
//                        System.out.println("onComplete");
//                    }
//                })
//                .subscribe(it -> System.out.println(it));
//
//        Observable.range(100, 200)
//                .elementAt(300, 10)
//                .subscribe(it -> System.out.println(it));
//
//        Observable.range(1, 99)
//                .ignoreElements()
//                .subscribe(() -> System.out.println("complete"), throwable -> System.out.println("throwable"));
//
//        Observable.range(10, 10000)
//                .take(10)
//                .takeLast(3)
//                .skip(1)
//                .distinct()
//                .takeUntil(integer -> integer > 100)
//                .subscribe(it -> System.out.println(it));

//        Observable.just(1)
////                .ofType(Long.class)
////                .first(100L)
//                .repeat(3)
//                .repeat(2)
//                .subscribe(it -> System.out.println(it));

//        Observable.range(1, 100)
//                .delay(1000, TimeUnit.MILLISECONDS)
//                .take(1010, TimeUnit.MILLISECONDS)
//                .subscribe(it -> System.out.println(it));

//        Observable.range(1, 10)
//                .doOnNext(it -> System.out.println("doOnNext"))
//                .doAfterNext(it -> System.out.println("doAfterNext"))
//                .subscribe(it -> System.out.println(it));

//        Observable.range(1, 3)
//                .materialize()
//                .timestamp()
//                .subscribe(it -> System.out.println(it));

//        Observable.range(1, 30)
//                .flatMap(new Function<Integer, ObservableSource<?>>() {
//                    @Override
//                    public ObservableSource<?> apply(Integer integer) throws Exception {
//                        return Observable.just(integer * 10);
//                    }
//                }).
//                subscribeOn(Schedulers.io())
//                .subscribe(it -> System.out.println(it));


//        Observable.just("1", "1", "2", "3")
//                .distinct(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) throws Exception {
//                        return s;
//                    }
//                })
//                .distinctUntilChanged()
//                .subscribe(it -> System.out.println(it));

//        Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
//                observableEmitter.onNext(1);
//                Thread.sleep(300);
//                observableEmitter.onNext(2);
//                observableEmitter.onNext(3);
//                Thread.sleep(300);
//                observableEmitter.onNext(4);
//                Thread.sleep(300);
//            }
//        })
//                .throttleWithTimeout(200, TimeUnit.MILLISECONDS)
//                .subscribe(it -> System.out.println(it));


//        Observable
////                .fromArray(1, 3 ,5)
//                .subscribe(it -> System.out.println(it));

//        Observable.create(e -> {
//            e.onNext("onNext 0");
//            Thread.sleep(100);
//            e.onNext("onNext 1");
//            Thread.sleep(50);
//            e.onNext("onNext 2");
//            Thread.sleep(70);
//            e.onNext("onNext 3");
//            Thread.sleep(200);
//            e.onNext("onNext 4");
//            e.onNext("onNext 5");
//        })
//                .sample(200, TimeUnit.MILLISECONDS)
//                .subscribe(it -> System.out.println(it));


//        Observable.just(list)
//                .flatMap(new Function<ArrayList<Integer>, ObservableSource<?>>() {
//                    @Override
//                    public ObservableSource<?> apply(ArrayList<Integer> integers) throws Exception {
//                        return Observable.fromIterable(integers);
//                    }
//                })
//                .subscribe(it -> System.out.println(it));

//        Observable.just(1, "10")
//                .cast(Integer.class)
//                .subscribe(it -> System.out.println(it),
//                        throwable -> System.out.println(throwable.getMessage()));
//        Observable.just(1, 2, "1")
//                .cast(Integer.class)//订阅之后才能发横强转
//                .subscribe(integer -> System.out.println(integer)
//                        , throwable -> System.out.println(throwable.getMessage()));

//        Observable.just(2, 3, 5)
//                .scan(new BiFunction<Integer, Integer, Integer>() {
//                    @Override
//                    public Integer apply(Integer integer, Integer integer2) throws Exception {
//                        return integer + integer2;
//                    }
//                }).subscribe(it -> System.out.println(it));

//        Observable.intervalRange(1, 15, 300, 1000, TimeUnit.MILLISECONDS)
//                .buffer(3, 2)
//                .subscribe(it -> System.out.println(it));

//        Observable.zip(Observable.range(1, 10), Observable.range(11, 6), (integer, integer2) -> integer + " " + integer2)
//                .subscribe(it -> System.out.println(it));

//        Observable.range(10, 10)
//                .zipWith(Observable.just(1), (a, b) -> a +", " + b)
//                .subscribe(it -> System.out.println(it));

        Observable<Long> o1 = Observable.intervalRange(1, 10, 0, 1000, TimeUnit.MILLISECONDS);
        Observable<Long> o2 = Observable.intervalRange(11, 10, 0, 1000, TimeUnit.MILLISECONDS);

        Observable.combineLatest(o1, o2, new BiFunction<Long, Long, String>() {
            @Override
            public String apply(Long aLong, Long aLong2) throws Exception {
                return aLong + "......" + aLong2;
            }
        }).subscribe(it -> System.out.println(it));

        try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
