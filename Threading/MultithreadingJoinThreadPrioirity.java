package Oops.Threading;

// when thread 1 and thread 2 get wait, at that main is not
// doing anything, that time it will run what is present

//to stop the main thread from doing that, we have to use joint,
// join will let the main thread wait until t1 is not joined to the main thread.

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
public class MultithreadingJoinThreadPrioirity {
    public static void main(String[] args) throws Exception{
        Hi obj1= new Hi();
        Hello obj2= new Hello();

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        /*
        t1.setPriority(1);// lowest priority
        t2.setPriority(10);//highest priority
        or
        */
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority((Thread.MAX_PRIORITY));

        System.out.println(t1.getPriority());//by deault 5
        System.out.println(t2.getPriority());

        t1.start();
        try{ Thread.sleep(1000);} catch(Exception e){}
        t2.start();
        /*
        System.out.println("BYE");
            output: 
            Hi
            Hi
            BYE
            Hello
            Hello
            Hi
            Hi
            Hello
            Hi
            Hello
            Hello
         */
        //to check whether a thread is alive of not

        System.out.println(t1.isAlive());

         t1.join(); // it can throw exception, so we have to write that
         t2.join();
         System.out.println("Bye");

         /*

         now output

            Hi
            Hi
            Hello
            Hi
            Hello
            Hi
            Hello
            Hi
            Hello
            Hello
            Bye
          */ 

    }
}
