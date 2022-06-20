import io.reactivex.Observable;

public class DistinctOperator {
    
    public static void main(String[] args) {
    //distinctOperator();
    //distinctWithKeySelector();
   //distinctUntilChangedOperator();
    distinctUntilChangedWithKeySelector();
    }
    
    private static void distinctUntilChangedWithKeySelector() {
    
        Observable.just("foo","fool","super","foss","foil")
                .distinctUntilChanged(String::length).subscribe(System.out::println);
   
    }
    
    private static void distinctUntilChangedOperator() {
    Observable.just(1,2,1,2,3,4,3,4,5).distinctUntilChanged().subscribe(System.out::println);
    }
    
    private static void distinctWithKeySelector() {
    Observable.just("foo","fool","super","foss","foil")
            .distinct(String::length).subscribe(System.out::println);
    }
    
    private static void distinctOperator() {
        Observable.just(1,2,3,4,5,6,7,1,2,3).distinct()
                .subscribe(System.out::println);
    
    }
}
