package com.souvik;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 18;
        name = "John Doe";
    }

    public MyMainEmployee(String name, int id){
        this.id = id;
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String n){this.name = n;}
    public void setId(int i){this.id = i;}
    public int getId() {return id;}
}

public class constructor {
    public static void main(String[] args){
        MyMainEmployee souvik = new MyMainEmployee();
        MyMainEmployee newEmp = new MyMainEmployee();

        souvik.setName("SouvikMukherjee");
        souvik.setId(20);
        System.out.println(souvik.getName());
        System.out.println(souvik.getId());

        System.out.println(newEmp.getName());
        System.out.println(newEmp.getId());

        MyMainEmployee nextEmp = new MyMainEmployee("SouvikMukherjee", 18);

        System.out.println(nextEmp.getName());
        System.out.println(nextEmp.getId());

    }
}
