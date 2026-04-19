package Method_And_Constructor_References;

public class RefDemo {
    public static void main(String[] args){
        System.out.println("Learning......");

        //Provide the implementation of WorkInter interface


         // :: --> method reference operator
         //ClassName::methodName
        //📌static method ko refer kiya hain
                               // refer by using class name
        WorkInter workInter = Stuff::dostuff; // when write this "workInter.dotask" -----> then Internally run this "Stuff.dotsuff"
        workInter.dotask();

        System.out.println("--------------------------------");
                               // refer by using class name
        Runnable runnable = Stuff::ThreadTask;// Multithreading ka concept using
        Thread d = new Thread(runnable);
        d.start();

        System.out.println("--------------------------------");


        //📌Non-static method ko refer kiya h
                          // refer by using class obj
        Stuff obj = new Stuff();
        Runnable runnable1 =  obj::printNumber;

                }

    }

