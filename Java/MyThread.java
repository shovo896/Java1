import java.io.*;
import java.*util.*;


class MyThread  implements Runnable {
    public void run(){
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
} 

    
}
class MyThread2 implements Runnable {
    public void run (){
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread2 implements Runnable {
    public void run (){
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

Class MyThread3 implements Runnable {
    public void run (){
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
