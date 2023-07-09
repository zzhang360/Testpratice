import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );

        Lock lock=new ReentrantLock();
        lock.lock();
    }
}
