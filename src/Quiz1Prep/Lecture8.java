package Quiz1Prep;
import java.util.*;

public class Lecture8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nam = "Souvik";
        System.out.println(nam);

        String name = new String("Hello");
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(nam+" Mukherjee");

        String name1="Souvik";
        String name2="souvik";
        if(name1.equals(name2))
        {
            System.out.println("Strings are equal");
            System.out.println(name1.equals(name2));
        }
        else
        {
            System.out.println("Strings are not equal");
            System.out.println(name1.equals(name2));
        }

        String name3="Zouvik";
        String name4="zouvik";
        System.out.println("compareTo");
        System.out.println(name3.compareTo(name4));


        String name5="Souvik";
        System.out.println(name5.substring(1,4));

        String name6="  Souvik  ";
        System.out.println(name6.trim());

        String name7="Souvik";
        System.out.println(name7.replace('S', 'Z'));

        String name8="Souvik";
        System.out.println(name8.toLowerCase());
        System.out.println(name8.toUpperCase());

        String name9="Souvik";
        if(name9.isEmpty())
        {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        String test = "We are learning Java";
        System.out.println(test.contains("learning"));
        System.out.println(test.contains("LEARNING"));

        String test2 = "Prog";
        char c[]=test2.toCharArray();
        for(char k:c)
        {
            System.out.print(k+" ");
        }
        System.out.println();

//        ----------Sort an Array of strings-----------

        int counter = input.nextInt();
        String[] sor = new String[counter];
        
        for(int i =0; i<counter; i++){
            sor[i]=input.next();
        }

        for(int i =0; i<counter-1; i++){
            for(int j =i+1; j<counter; j++){
                if(sor[i].compareTo(sor[j])>0){
                    String temp = sor[j];
                    sor[j]=sor[i];
                    sor[i]=temp;
                }
            }
        }

        for(int i =0; i<counter; i++){
            System.out.println(sor[i]);
        }

//        Reverse every word in string
        String str= "Hello There";
        String[] words = str.split(" ");
        String reversedString = "";

        for (String word : words) {
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);

//      Count the number of occurrence of a string

        String sentence="Souvik likes coding He is good in coding ";
        String search="coding";

        String[] a = sentence.split(" ");

        int count = 0;
        for (String s : a) {
            if (search.equals(s))
                count++;
        }
        System.out.println(count);


    }
}
