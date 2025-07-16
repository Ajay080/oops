package Oops.Threading;

// when there is no dependecy between two function or classes we can execute then parallely

class Hi extends Thread{
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

class Hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class UsingExtendyt {
    public static void main(String[] args) {

        // Only main thread will excecute all of them
        // Hi obj1= new Hi();
        // Hello obj2= new Hello();
        // obj1.show();
        // obj2.show();

        Thread t1=new Hi(); // when we want to put alternate parallel of both
        Thread t2= new Hello();

        //or

        // Hi t1= new Hi();
        // Hello t2= new Hello();

        t1.start(); //internally when we call the start, it automally start executing run method
        
        try{ Thread.sleep(10);} catch(Exception e){} // then it will not overlap

        t2.start(); // so we have override the run method there
        //instead to naming show, name it run

    }
}
