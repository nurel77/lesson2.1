package com.company;

   final public class Cat extends Tiger {
    private String name;
    private int age;
    private String breed;



       public void setAge(int age) {
           this.age = age;
       }

       @Override
       public String getName() {
           return name;
       }

       @Override
       public int getAge() {
           return age;
       }

       @Override
       public String getBreed() {
           return breed;
       }
   }
