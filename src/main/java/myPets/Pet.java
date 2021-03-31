package myPets;

public class Pet {

    public String kindOfAnimal;
    public String breed;
    public String name;
    public String color;
    public int age;
    private float height;

    public String introducePet(){

        return "Hello, I have a " + kindOfAnimal + " - " + breed + ", its name is " + name + ", its " + color + " and " + age + " years old.";

    }

    public void setHeight(float a) {

        height = a;
    }
}


