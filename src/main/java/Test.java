import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.*;
import kotlin.text.StringsKt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

       Observable.create(new ObservableOnSubscribe<Integer>() {
           @Override
           public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
               emitter.onNext(1);
               emitter.onError(new Error("sksk"));
               emitter.onNext(2);
               emitter.onComplete();
           }
       })
               .retryWhen(new Function<Observable<Throwable>, ObservableSource<?>>() {
                   @Override
                   public ObservableSource<?> apply(Observable<Throwable> throwableObservable) throws Exception {
                       return throwableObservable.;
                   }
               })
//               .onExceptionResumeNext(new Observable<Integer>() {
//                   @Override
//                   protected void subscribeActual(Observer<? super Integer> observer) {
//                       observer.onNext(11);
//                       observer.onComplete();
//                   }
//               })
//               .onErrorResumeNext(new Observable<Integer>() {
//                   @Override
//                   protected void subscribeActual(Observer<? super Integer> observer) {
//                       observer.onNext(21);
//                       observer.onComplete();
//                   }
//               })
               .subscribe(new Observer<Integer>() {
                   @Override
                   public void onSubscribe(Disposable d) {

                   }

                   @Override
                   public void onNext(Integer integer) {
                       System.out.println(integer);
                   }

                   @Override
                   public void onError(Throwable e) {
                       System.out.println(e.getMessage());
                   }

                   @Override
                   public void onComplete() {
                       System.out.println("onComplete");
                   }
               });


        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
