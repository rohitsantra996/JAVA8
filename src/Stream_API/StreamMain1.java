package Stream_API;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args){
 //➡️ Java code without stream vs with stream api


//👉Definition :- A Stream is a pipeline through which data flows, where you can apply operations like filtering, mapping, and sorting in a declarative way, with lazy execution and internal iteration handled by Java.


        //Q)Create a List and Filter all even numbers from list

    List<Integer> list1 =List.of(1,2,3,4,5,6,7,8);   //📝NOTE:-List.of ----> unmodified mehtod


    List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(4);
        list2.add(7);
        list2.add(3);
        list2.add(2);


        List<Integer> list3 = Arrays.asList(23,44,5,6,7,8);


        //List1
        //📌Without Stream
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list1) {
            if(i%2==0){
                listEven.add(i);
            }

        }
        System.out.println(list1);
        System.out.println(listEven);

        //📌With Stream
      /*
      //Way 1:   ye hum 2 lines mein write kiye(Reduced code lines  by stream)

       Stream<Integer> stream = list1.stream();
       List<Integer> newList =  stream.filter(i->i%2 == 0).collect(Collectors.toList());
       System.out.println("Way 1 --->Found Even Num By using Stream :"+newList);

      */

        // Way 2:      ye hum 1 lines mein write kiye(Reduced code lines by stream)
         List<Integer> newList2 =  list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("Way 2 --->Found Even Num By using Stream :"+newList2);


        List<Integer>newList3 = list1.stream().filter(i->i>5).collect(Collectors.toList());
        System.out.println("Print nums ,greater than 5 :" +newList3);


    }
}
