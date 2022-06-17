import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class ObserverTester {
    
    
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
        
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
            
            }
            
            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println(integer);
            }
            
            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println(e.getLocalizedMessage());
            }
            
            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
            
        };
        observable.subscribe(observer);
        
    }
}
