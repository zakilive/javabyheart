package com.zakilive;

public class Zoo {

    public static void main(String[] args) {

       Animal sparrow1=new Sparrow("Bird1",9,"Male");
       sparrow1.move();

//       Flyable flyingBird1=new Sparrow(1,"m",4);
//       Flyable flyingBird2=new Bird(1,"M",3);


       Animal fish1=new Fish("Hilsha",99,"Male");
       fish1.move();

        moveAnimals(fish1);
        moveAnimals(sparrow1);



//        Animal animal1 = new Animal("Parrot", 20, "Male");
//        animal1.Eat();
//
//        Bird bird1 = new Bird("Parrot", 20, "male");
//        //bird1.Fly();
//
//        Animal animal2 = new Animal("Salmon", 50, "Female");
//        animal2.Eat();
//
//        Fish fish= new Fish("Salmon", 50, "Female");
//        fish.Swim();
//
//
//
//        Chicken chick1=new Chicken("Murgi",50,"Female");
//        chick1.fly();


    }

    private static void moveAnimals(Animal animal) {
        animal.move();

    }
}
