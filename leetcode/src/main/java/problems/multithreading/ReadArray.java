package problems.multithreading;

import java.util.concurrent.Semaphore;

/**
 * @author amruta.kajrekar on 6/17/18.
 */
public class ReadArray {

    public static void main(String[] args){
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Thread o1 = new Thread(new Multithreading(0,s1,s2));
        Thread o2 = new Thread(new Multithreading(0,s2,s1));
        o1.start();
        o2.start();
//        Multithreading t1 = new Multithreading(0,s1,s2);
//        Multithreading t2 = new Multithreading(0,s2,s1);
//
//        t1.run();
//        t2.run();
    }
}

class Multithreading implements Runnable{
    char[] arr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int i;
    Semaphore s1, s2;

    Multithreading(int i, Semaphore s1, Semaphore s2){
        this.i = i;
        this.s1 =s1;
        this.s2 =s2;
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try{
            System.out.println("Running in thread "+ Thread.currentThread().getId());
            for(int i=0;i<arr.length;i++){
                s1.acquire();
                System.out.println(arr[i]);
                s2.release();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
