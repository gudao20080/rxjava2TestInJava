import beans.People
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import io.reactivex.ObservableSource
import io.reactivex.Observer
import io.reactivex.functions.BiPredicate
import io.reactivex.functions.Consumer
import io.reactivex.functions.Function
import io.reactivex.functions.Predicate
import io.reactivex.observables.GroupedObservable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {

    val observable = Observable.range(1, 5)
            .doOnNext { if (it == 3) throw IllegalArgumentException("kdkdkd") }
    observable.onErrorResumeNext { t: Throwable ->
        println(t.message)
        Observable.just(999)
                .subscribeOn(Schedulers.newThread())
                .delay(5, TimeUnit.SECONDS)
                .retry(1) {
                    //                        println("${t.message}")
                    true
                }
                .doOnNext { if(it == 999) throw  IllegalArgumentException("AAA")}
    }
            .subscribe{ println(it)}



    Thread.sleep(30 * 1000)
}

