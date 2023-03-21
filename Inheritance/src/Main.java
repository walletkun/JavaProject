public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge" , 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog husky = new Dog("husky" , 15);
        doAnimalStuff(husky, "fast");

        Dog yorkie = new Dog("Yorkie" , 15, "curly" , "heart");
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labor Retriever" , 65, "Floppy" , "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

//        Bird robin = new Bird();
//        doAnimalStuff(robin, "slow");
//
//        Bird pigeon = new Bird("Pigeon" ,4);
//        doAnimalStuff(pigeon, "fast");
//
//        Bird baldEagle = new Bird("Bald Eagle" , 13, "White and Black", "hooked yellow beak");
//        doAnimalStuff(baldEagle, "fast");

        Fish goldie = new Fish("Gold Fish" , .25 , 2 , 3);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal , String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");

    }


}
