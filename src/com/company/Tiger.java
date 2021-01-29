package com.company;

    public class Tiger extends Animal {
    private String name;
    private String breed;
    private int age;
    private String[] commands;
    private Zoopark zoopark;
    private Color color;

        public String[] getCommands() {
            return commands;
        }

        public void setCommands(String[] commands) {
            this.commands = commands;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        @Override
        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }

        @Override
        public int getAge() {
            return age;
        }

        public void setZoopark(Zoopark zoopark) {
            this.zoopark = zoopark;
        }

        public Zoopark getZoopark() {
            return zoopark;
        }

        public void setColor(Color color) {
            this.color = color;
        }





        public Tiger(String name, String breed, int age, String[] commands, Zoopark zoopark){
          this.name = name;
          this.breed = breed;
          this.age =age;
          this.commands = commands;
          super.setZoopark(zoopark);
      }
        public  Tiger (int age,String breed, String name)  {
          this.age = age;
          this.breed = breed;
          this.name = name;

        }
          public  Tiger  (){


        }




       public void makeVoice(String voice, int num){
           for (int i = 0; i <num ; i++) {
               System.out.println(voice);
           }
       }

        public void makeVoice( int num,String voice){
            for (int i = 0; i <num ; i++) {
                System.out.println(voice);
            }
        }
        public final void makeVoice(String voice){
                System.out.println(voice);
            }

          public String getInfo() {
            return super.getInfo()+ "Name = " + name + ", Breed = " + breed +", commands = "+commands;
             
          }

    }