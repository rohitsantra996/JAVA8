package Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args){
        //➡️Stream Operations Important Stream methods

          // 📌filter() :- ek intermediate operation hai Stream API me, jo ek condition (predicate) apply karke sirf un elements ko select karta hai jo us condition ko satisfy karte hain, aur unka ek naya stream return karta hai.
          // fliter(predicate)
        List<String> names = List.of("Rohit", "Sagar","Payal","Ronit");
       List<String> newNames = names.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
               System.out.println("Filter done : "+newNames);

        System.out.println("-------------------------------------");

               //📌map() :- ek things -----trandforms----> karna called map
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