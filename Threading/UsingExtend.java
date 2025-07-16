package Oops.Threading;
//disadvantage: it already exted thread, now we cannot do anything
public class UsingExtend extends Thread{
    public void run(){
        int[] arr= {2,5,2,1,6};
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) { // we do have main thread by default, all te operations are done by this
        // Thread t1= new UsingExtend();
        UsingExtend obj1= new UsingExtend();
        Thread t1= new Thread(obj1);

        t1.run();

    }
}
