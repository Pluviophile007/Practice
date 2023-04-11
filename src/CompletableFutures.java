import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.CompletableFuture;

public class CompletableFutures {

    public static void main(String[] args) {

        CompletableFuture.runAsync(()->{
            System.out.println("First "+Thread.currentThread().getName());
        }).thenRun(()-> System.out.println("Second")).thenRun(()->{
            System.out.println("FINISHED");
        }).join();


    }
}
