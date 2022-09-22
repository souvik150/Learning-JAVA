package Quiz1Prep;
import java.util.*;

class Student{
    String roll;
    String name;
    String city;

    public void setData(String a, String b, String c){
        roll = a;
        name = b;
        city = c;
    }

    public void getData(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(city);
    }
}

public class Lecture9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Student[] s = new Student[3];
        for(int i = 0; i<s.length; i++){
            s[i] = new Student();
        }

        for (Student student : s) {
            String a = input.next();
            String b = input.next();
            String c = input.next();
            student.setData(a, b, c);
        }

        for (Student student : s) {
            student.getData();
        }

        System.out.println("Hello World!");

//        for(int i = 0; i<s.length;i++){
//            s[i].velloreCity();
//        }

        velloreCity(s);
        sort(s);

    }

    public static void velloreCity(Student[] k){
        Student temp = new Student();
        for (Student student : k) {
            if (student.city.equals("Vellore")) {
                System.out.println(student.name + " is from Vellore");
            }
        }
    }

    public static void sort(Student[] k){
        ArrayList<String> t = new ArrayList<String>();

        for (Student student : k) {
            t.add(student.name);
        }

        Collections.sort(t);
        System.out.println(t);

        String[] array = t.toArray(new String[0]);

        for(String i:array){
           System.out.print(i+" ");
        }
    }
}

/*
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        int size = countries.length;
        for(int i = 0; i<size-1; i++)
        {
            for (int j = i+1; j<countries.length; j++)
            {
                if(countries[i].compareTo(countries[j])>0)
                {
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(countries));
    }
}

 */

//21
//Souvik
//Vellore
//24
//Jane
//Hyderabad
//26
//John
//Vellore