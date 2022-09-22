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
        Student temp = new Student();
        for(int i = 0; i<k.length-1; i++){
            for(int j =1; j<k.length-1-i; j++){
                if(k[j].name.compareTo(k[j+1].name)>0){
                    temp = k[j];
                    k[j] = k[j+1];
                    k[j+1] = temp;
                }
            }
        }
    }
}
