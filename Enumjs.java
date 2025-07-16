package Oops;

public class Enumjs {
    // all enum internally extends the java.lang.enum, so we cannot extend anything
    enum Week{
        Monday, Tuesday, Wednesday;

        //these are enum constants
        //public, static and final
        //since its final you can create child enums
        //type is Week

    //constructor

    Week(){
        System.out.println("Constructor call for"+this);
    }

    //this is not public or protected, only private or default
    /// why? we dont want to create new objects
    //this is not the enum concept, thats why

    //interally: public static final Week Monday=new Week();

    public void hello(){
        System.out.println("hello");
    }


    //abstract is not allowed we need to provide the body


    }



    public static void main(String[] args) {
        Week week;
        week= Week.Monday;

        System.out.println(week);

        System.out.println(week.ordinal());// it shows position of the week in the enums

        System.out.println("eneum constant " +Week.valueOf("Monday")); // return enum constant

        for(Week day: Week.values()){
            System.out.println(day);
        }

        week.hello();
    }
    
}
