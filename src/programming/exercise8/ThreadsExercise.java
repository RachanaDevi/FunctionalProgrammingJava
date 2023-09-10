package programming.exercise8;

import java.util.stream.IntStream;

public class ThreadsExercise {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().threadId()
                            + " : " + i);
                }
            }
        };

        Runnable runnableFunctional = () -> IntStream.range(0, 1000)
                .forEach(index -> System.out.println(
                        Thread.currentThread().threadId() + " " + index));


        Thread thread = new Thread(runnableFunctional);
        Thread thread1 = new Thread(runnableFunctional);
        Thread thread2 = new Thread(runnableFunctional);
        Thread thread3 = new Thread(runnableFunctional);
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
