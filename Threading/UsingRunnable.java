package Oops.Threading;

//Runnable is a functional interface and has only one method that is run
class Hi implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1000); // it can throw exception
            }
            catch(Exception e){

            }
        }
    }
}

class Hello implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class UsingRunnable {
    public static void main(String[] args) {
        Hi obj1= new Hi();
        Hello obj2= new Hello();

        // obj1.start(); // we dont have start in runnable
        //threads do have start methods in it, but runnable do no have that
        /* 
         * we cannot do like this also
         * obj1.run(); // 
        
        */
      
        

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        try{ Thread.sleep(1000);} catch(Exception e){}
        t2.start();

    }
}
