package Oops.exceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a=4;
        int b=0;

        try{
            // int c=a/b;
            // divide(a,b);

            //custom exception
            String name="ajay";
            if(name.equals("ajay")){
                throw new Customexception("this is custom exception");
            }
        
        }catch(ArithmeticException e){  //catch(Exception e){
            System.out.println(e.getMessage());
        }//strict exception should always comes first
        catch(Exception u){
            System.out.println(u.getMessage());
        }finally{
            System.out.println("this will always execute");
        }
    }
    //thow baiscally mean fo rdecalaration, that it may throw an exception

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
                //thow baiscally mean we are thrrowing an exception
            throw new ArithmeticException("please do not divide it by zeros");
        }
        return a/b;
    }   
    
}
