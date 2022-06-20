import io.reactivex.Observable;

public class MapFilter {
    
    public static void main(String[] args) {
         //  mapOperator();
        // mapOperatorReturnsDifferenceData();
        //filterOperator();
    combineMapAndFilter();
    }
    
    private static void mapOperator() {
        Observable<Integer> observable=Observable.just(1,2,3,4,5);
        observable.map(item->item* 6).subscribe(System.out::println);
    }
    
    private static void combineMapAndFilter() {
    Observable<Integer> observable=Observable.just(1,2,3,4,5);
    observable.
    filter(item->item%2!=0)
            .map(item->item)
            .subscribe(System.out::println);
    
    }
    
    private static void filterOperator() {
    Observable<Integer> observable=Observable.just(1,2,3,4,5);
    observable
            .filter(item->item%2!=0)
            .subscribe(System.out::println);
    
    }
    
    private static void mapOperatorReturnsDifferenceData() {
        Observable<Integer> observable=Observable.just(1,2,3,4,5);
        observable.map(item->"Hello World").subscribe(System.out::println);
  
    }
}
