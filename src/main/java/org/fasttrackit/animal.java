package org.fasttrackit;

public class animal {
    String name;
    int age;
    boolean health;
    int legNumber;




    public animal(String name, int age, boolean health) {
        this.name = "arnold";
        this.age = 35;
        this.health = true;
    }

    public int getAge(){
        return this.age;

    }

    public void setAge(int newAge) {age=newAge;}
    public void sayHI(){
        if(age<2)
        {
            return;
        }else{
            System.out.println("Hi");
        }

        }
    }