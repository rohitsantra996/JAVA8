package Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args){
        //➡️Stream Operations Important Stream methods

          // 📌filter() :- `filter()` Stream API mein ek **Predicate** leta hai, jo `true/false` return karta hai. Jo element condition satisfy karta hai (`true`), woh **rakha jaata hai**, aur jo satisfy nahi karta (`false`), woh **discard** kar diya jaata hai. Bache hue elements ko `collect()` se collect kiya ja sakta hai.

        List<String> names = List.of("Rohit", "Sagar","Payal","Ronit");
       List<String> newNames = names.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
               System.out.println("Filter done : "+newNames);

        System.out.println("-------------------------------------");

               //📌map() :- trasform  and then  return value. 
               List<Integer> Numbers = List.of(7,6,5,4,39,22,9);
               List<Integer> newNumber = Numbers.stream().map(i->i*i).collect(Collectors.toList());
               System.out.println("map done : "+newNumber);

               System.out.println("-------------------------------------");


                   names.stream().forEach(e->{
                       System.out.println(e);
                   });
            // System.out::println :- Method Reference (::) Java ka ek feature hai jo existing method ko directly refer karne ka tarika deta hai, bina lambda expression likhe.
            // directly Output print kar deta hain with lambda .
                   newNumber.stream().forEach(System.out::println);

        System.out.println("-------------------------------------");


          //sorted() method

        Numbers.stream().sorted().forEach(System.out::println);



        System.out.println("-------------------------------------");

        //min() method & max()
        int minNum= Numbers.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println("Min number : "+minNum);

        int maxNum= Numbers.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println("Max number : "+maxNum);
    }}
