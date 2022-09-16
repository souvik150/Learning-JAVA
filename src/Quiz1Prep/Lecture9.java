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

    public void velloreCity(){
        if(city.equals("Vellore")){
            System.out.println(name);
        }
    }


}

public class Lecture9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Student[] s = new Student[3];
        for(int i = 0; i<s.length; i++){
            s[i] = new Student();
        }

        for(int i = 0; i<s.length;i++){
            String a = input.next();
            String b = input.next();
            String c = input.next();
            s[i].setData(a, b, c);
        }

        for(int i = 0; i<s.length;i++){
            s[i].getData();
        }

        System.out.println("Hello World!");

//        for(int i = 0; i<s.length;i++){
//            s[i].velloreCity();
//        }

        sort(s);

    }
    public static void sort(Student[] k){
        Student temp = new Student();
        for(int i = 0; i<k.length-1; i++){
            for(int j =0; j<k.length-1-i; j++){
                if(k[j].name.compareTo(k[j+1].name)>0){
                    temp = k[j];
                    k[j] = k[j+1];
                    k[j+1] = temp;
                }
            }
        }

        for(Student m:k){
            m.getData();
        }
    }
}
