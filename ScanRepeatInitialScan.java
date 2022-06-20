import io.reactivex.Observable;

public class ScanRepeatInitialScan {
    
    
    public static void main(String[] args) {
    
       useRepeat();
       //useScan();
       useScanWithInitialValue();
    }
    
    private static void useScanWithInitialValue() {
    }
    
    private static void useScan() {
        Observable.just(1,2,3,4,5)
                .scan((accumulator,next) -> accumulator+next)
                .subscribe(System.out::println);
    
    }
    
    private static void useRepeat() {
    Observable.just(1,2,3,4,5).repeat().subscribe(System.out::println);
    
    }
}
