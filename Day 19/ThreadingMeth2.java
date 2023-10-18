 class MyThreadRunnable implements Runnable {
    public void run() {
        int i = 0;
        while(i<4000){
        System.out.println("I am Thread Zero Not Threat");i++;}
    }
} class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while(i<400099){
        System.out.println("I am Thread one Not Threat");i++;}
    }
}


public class ThreadingMeth2 {
    public static void main(String[] args) {
        MyThreadRunnable t = new MyThreadRunnable();
        Thread n = new Thread(t);
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread n1 = new Thread(t1);  
        n.start();
        n1.start();       
    }
}