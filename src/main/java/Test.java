import com.sun.jndi.toolkit.url.Uri;
import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

import java.net.URI;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        Observable observableA = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                throw new Exception("出错了");
            }
        });

        Observable observableB = Observable.just(2);
        Observable observableC = Observable.just(3);
        Observable.mergeDelayError(observableA, observableB, observableC).subscribe(new Observer() {
            @Override
            public void onSubscribe(Disposable d) { }

            @Override
            public void onNext(Object o) {
                System.out.println(o);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println(e.getMessage());
            }

            @Override
            public void onComplete() { }
        });

        String url = "BYGuessDev://m.8win.com/cms/focus";

        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
