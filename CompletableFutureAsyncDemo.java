package com.cache.programmer;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureAsyncDemo {

    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            CompletableFuture.supplyAsync(()->getMe())
                    .thenAccept(o->callMe());
        }
    }

    public static int getMe(){
       return 1;
    }

    public static int callMe(){
        return 1;
    }


}



class NumtoAdd implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return 2;
    }
}

class NumToMultiply implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 10;
    }
}