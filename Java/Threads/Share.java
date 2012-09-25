import java.util.*;

public class Share implements Runnable{
    private Thread t1;
    private Thread t2;
    private  int i;

    public  Share(){
        t1 = new Thread(this);
        t2 = new Thread(this);
        t1.start();
        t2.start();
    }

    @Override
        public void run(){
            try{
            for(int j = 0 ; j< 100; ++j){
                System.out.println("Thread shared value :"+i+" from thread "+Thread.currentThread());
                i++;
                int p =(int)( Math.random()*100);
                Thread.sleep(p);
            }
        }catch(Exception ex){
            System.out.println("Thead exception has occurred");
        }
        }
}
