package Lambda_Expression;

public class Main {
    public static void main(String[] args) {


        //📌 By Anonymous Class
        MyInter i = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is first anonymous class");
            }
        };
        i.sayHello();


        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is second anonymous class");
            }
        };
        i2.sayHello();






        /*
        📝NOTE:- *Interface can be implemented by "Sub-Class"
                 *Interface can be implemented by "Anonymous Class"
                 *Interface can be implemented by "Lambda Explession"

                   */

        /*📝NOTE -> 👉 Lambda ONLY tab use hota hai jab interface me 1 hi abstract method ho (Functional Interface)
       👉 अगर 2 methods हैं → Lambda ❌, Anonymous Class ✔️ aur sub-Class ke though */







        //📌by Lambda Expression

        //Way 1:
        MyInter m = ()->{
            System.out.println(" I am Lamda ");
        };
        m.sayHello();


       // Way:2
        sumInter s = (int a , int b)->{
            return a+b;
        };
        System.out.println(s.sum(2,6));
        System.out.println(s.sum(6,6));



        //Way:3
        Sum2Inter S2 = (A,B)-> A+B;    // u can write like this  to Lambda
        System.out.println("  Addition Perform : "+ S2.Add(2,3));

        //Way:4
        // reture length by Lambda
        LenghtInter lInter = str ->str.length();
        System.out.println("Lenght of Rohit return by lambda : "+lInter.getLength("Rohit"));

        /*📝NOTE - 👉 Lambda expression tabhi use ho sakta hai jab interface me sirf 1 abstract method ho
👉 Aise interface ko hi Functional Interface bolte hain*/
    }

}



