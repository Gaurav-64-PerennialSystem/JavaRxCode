import io.reactivex.Observable;

public class ObservableRange {
    
    public static void main(String[] args) {
    
        /*Observable<Integer> observable=Observable.range(2,10);
        observable.subscribe(System.out::println);*/
        
        int start=2,count=10;
        Observable<Integer> observable1=Observable.range(start,count);
        observable1.subscribe(System.out::println);
    }
}
