package Oops.Threading;
// with the help of synchronization,
//we restrict the function to utilize by 1 thread at a time
class Hi implements Runnable{
    int count=0;
    public void run(){
        for(int i=0;i<=1000;i++){
            count++;
        }
    }
}
public class MultithreadingSynchronization {
    public static void main(String[] args) {
            Hi obj1= new Hi();
            Hi obj2= new Hi();

            Thread t1= new Thread(obj1);
            Thread t2= new Thread(obj2);

            t1.start();
            t2.start();

            System.out.println(obj2.count);

            
    }
    
}
