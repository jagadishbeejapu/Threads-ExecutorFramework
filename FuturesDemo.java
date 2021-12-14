package com.cache.programmer;

import java.util.Random;
import java.util.concurrent.*;

public class FuturesDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Integer> future = service.submit(new Task());
        try{
            Integer result = future.get();
            System.out.println(result);
        }
        catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }

}




class Task implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 10;
    }
}


