import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExamples {
    public static void main(String[] args) {
        //Task1  //Task2 //Task3
        // TakingOrderFromCustomer
        // Supplying the order
        // Billing the customer
        CompletableFuture.
                runAsync(()->{
                    takeOrder();

                }).thenRun(()->{fulfillOrder();}).thenRun(()->billingOrder()).join();

        ExecutorService es = Executors.newFixedThreadPool(5);
        es.submit(()->billingOrder());

    }

    private static void billingOrder() {
        System.out.println("Please pay the bill");
    }

    private static void fulfillOrder() {
        System.out.println("Fulfilling Order, please enjoy the order");
    }

    private static void takeOrder() {
        System.out.println("Taking Order");
    }


}
