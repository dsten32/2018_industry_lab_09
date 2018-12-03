package ictgradschool.industry.collections.bonus;

import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TesterClass {
    String[] array = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN"};

    public void start(){
        System.out.println("initial string array: "+ Arrays.toString(array));

        //regular for loop
        List<String> arrayList = new ArrayList<>();
//        List<String> arrayList = Arrays.asList(array);

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        System.out.println("the new arraylist: "+arrayList);

        for (int i=0; i < arrayList.size();i++) {
            arrayList.add(i , arrayList.get(i).toLowerCase());
            arrayList.remove(i+1);
        }

        System.out.println("for looped the lowercase arraylist: "+arrayList);
        System.out.println();


        //enhanced for loop
        String[] array2 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN","EIGHT"};

        System.out.println("initial string array2: "+ Arrays.toString(array2));

        List<String> arrayList2 = new ArrayList<>();
        for (int i = 0; i < array2.length; i++) {
            arrayList2.add(array2[i]);
        }

        System.out.println("the new arraylist2: "+arrayList2);
//todo fix enhanced loop
//        for (String a : arrayList2) {
//            String b = a.toLowerCase();
//            arrayList2.remove(a);
//            arrayList2.add(b);
//        }

        System.out.println("enhanced for looped the lowercase arraylist2: "+arrayList2);
        System.out.println();

        // iterator way
        String[] array3 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN","EIGHT","NINE"};

        System.out.println("initial string array2: "+ Arrays.toString(array3));

        List<String> arrayList3 = new ArrayList<>();
        for (int i = 0; i < array3.length; i++) {
            arrayList3.add(array3[i]);
        }

        System.out.println("the new arraylist3: "+arrayList3);

//        Iterator<String> theIterator = arrayList.iterator();
//
//        while (theIterator.hasNext()) {
//            String a = theIterator.next();
//            arrayList.add(a.toLowerCase());
//        }


        System.out.println("iterator looped the lowercase arraylist3: "+arrayList3);


    }


    public static void main(String[] args){
        TesterClass t = new TesterClass();
        t.start();
    }
}
