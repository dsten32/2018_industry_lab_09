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


//        for (String a : arrayList2) {
//            String b = a.toLowerCase();
//            arrayList2.set(arrayList2.indexOf(a),b);
//        }
//        System.out.println("enhanced for looped without i; counter arraylist2: "+arrayList2);
//        System.out.println();


        int j =0;
        for (String a : arrayList2) {
            String b = a.toLowerCase();
            arrayList2.set(j,b);
            j++;
        }
        System.out.println("enhanced for looped with i; counter arraylist2: "+arrayList2);
        System.out.println();



        // iterator way
        String[] array3 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN","EIGHT","NINE"};

        System.out.println("initial string array2: "+ Arrays.toString(array3));

        List<String> arrayList3 = new ArrayList<>();
        for (int i = 0; i < array3.length; i++) {
            arrayList3.add(array3[i]);
        }

        System.out.println("the new arraylist3: "+arrayList3);

        Iterator<String> theIterator = arrayList3.iterator();

//        while (theIterator.hasNext()) {
//            String a = theIterator.next();
//            arrayList3.set(arrayList3.indexOf(a),a.toLowerCase());
//        }
//        System.out.println("iterator looped the without i; arraylist3: "+arrayList3);

        int k=0;
        while (theIterator.hasNext()) {
            String a = theIterator.next();
            arrayList3.set(k,a.toLowerCase());
            k++;
        }
        System.out.println("iterator looped the with i; arraylist3: "+arrayList3);




    }


    public static void main(String[] args){
        TesterClass t = new TesterClass();
        t.start();
    }
}
