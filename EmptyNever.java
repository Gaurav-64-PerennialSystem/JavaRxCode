import io.reactivex.Observable;

public class EmptyNever {
    
    
    public static void main(String[] args) throws InterruptedException {
    
   // createObservableUsingEmpty();
    createObservableUsingNever();
    }
    
    private static void createObservableUsingNever() throws InterruptedException {
        Observable observable=Observable.never();
        observable.subscribe(System.out::println,System.out::println,() ->System.out.println("Completed"));
        Thread.sleep(3000);
    }
    
    private static void createObservableUsingEmpty() {
    
        Observable observable=Observable.empty();
        observable.subscribe(System.out::println,System.out::println,() ->System.out.println("Completed"));
        
    }
}
