package demo;

public class myThread2 implements Runnable{ 
    public static int myCount = 0;
    public myThread2(){
         
    }
    public void run() {
        while(myThread2.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++myThread2.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        myThread2 mrt = new myThread2();
        Thread t = new Thread(mrt);
        t.start();
        while(myThread2.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++myThread2.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}