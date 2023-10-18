class MyThread1 extends Thread{
    
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("Thread1 Is Running Class 1");
            System.out.println("NextOutput Line Class 1");i++;
        }

    }
}class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("Thread2 Is Running Class 2");
            System.out.println("NextOutput Line Class 2");i++;
        }

    }}


public class Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }    
}
