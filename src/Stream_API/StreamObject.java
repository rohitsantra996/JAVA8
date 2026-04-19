package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args){
       // ➡️How to create Stream interface object

        //1: Blank
        Stream<Object> emptyStream = Stream.empty();
   emptyStream.forEach(e->{
       System.out.println(e);// blank print karega
   });


          //2: Arrays , object , Collection
        String names[] = {"rohit","sagar","lovely","Krunal"};


        Stream<String> stream1 =Stream.of(names);//.of() :- names Array ko convert kiya Stream  mein

        stream1.forEach(e->{
            System.out.println(e);
        });

         //3:
            Stream<Object> s_bulder= Stream.builder().build();


            //4:
       IntStream stream = Arrays.stream(new int[]{1,2,3,4,5});// Array convert to stream

        stream.forEach(e->{
            System.out.println("4 wala :"+e);
        });

        //5: list , set
        List<Integer> list1 = new ArrayList<>();
        list1.add(1000);
        list1.add(2000);
        list1.add(3000);
        list1.add(4000);

        Stream <Integer> stream2 =list1.stream();
        stream2.forEach(n->{
            System.out.println("5 wala :"+n);
        });

    }
}
