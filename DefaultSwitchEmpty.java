import io.reactivex.Observable;

public class DefaultSwitchEmpty {
    public static void main(String[] args) {
    //useDefaultIfEmpty();
    useSwitchIfEmpty();
    }
    
    private static void useSwitchIfEmpty() {
        Observable.just(1,2,3,4,5).filter(item->item > 10)
                .switchIfEmpty(Observable.just(6,7,8,9,10))
                .subscribe(System.out::println);
    
    }
    
    private static void useDefaultIfEmpty() {
        Observable.just(1,2,3,4,5).filter(item->item > 10)
                .defaultIfEmpty(100)
                .subscribe(System.out::println);
    }
    
    
}
