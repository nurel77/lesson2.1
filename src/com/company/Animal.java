package com.company;

import java.util.Random;

public abstract class Animal {

        private String name;
        private int age = generateDefaultAge();
        private String color;
        private Zoopark zoopark;

    public String getName() {
            return name;
        }

        public Zoopark getZoopark(){
            return zoopark;
        }


        public void setZoopark(Zoopark zoopark){
            this.zoopark = zoopark;
        }

        public int getAge() {
            return age;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
            return color;
        }

        private int generateDefaultAge(){
            Random random = new Random();
            return random.nextInt(15)+1;
        }

        public String getInfo(){
            return "Age = "+age+", Color = "+color+", Zoopark = "+zoopark;
        }


}
