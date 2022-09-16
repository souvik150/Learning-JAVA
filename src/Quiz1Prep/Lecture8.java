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

        String name3="souvik";
        String name4="Souvik";
        System.out.println(name3.compareTo(name4));


        String name5="Souvik";
        System.out.println(name5.substring(1,4));

        String name6="  Souvik  ";
        System.out.println(name6.trim());

        String name7="Souvik";
        System.out.println(name7.replace('S', 'Z'));

        String sentence="Souvik likes coding He is good in coding ";
        String search="coding";

        String[] a = sentence.split(" ");

        int count = 0;
        for (String s : a) {
            if (search.equals(s))
                count++;
        }
        System.out.println(count);

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



    }
}
