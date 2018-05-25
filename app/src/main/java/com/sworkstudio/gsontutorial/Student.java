package com.sworkstudio.gsontutorial;

public class Student {

    private String Name;  // will give null   // ============== careful one thing   our  primitve data types name must match with  jsonname     see..here we have Name  = name (in json file)  doesnt match first letter (case senstive) so it will return null
    private int age;  // we got workaround  ...you have to put anotation serilazble to tell this belong to particular json name .. see student2
    private int rollno;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
