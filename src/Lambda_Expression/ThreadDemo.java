package Lambda_Expression;

public class ThreadDemo {
    public static void main(String[] args){


        // First thread : THread - JHOH

        Runnable thread1 = ()->{
            // this is the body of the Thread
            // stuff

            for(int i =1; i<= 10 ; i++){
            System.out.println("Value of i is "+ i);

                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                     e.printStackTrace();
                }
            }
        };
    }
}
