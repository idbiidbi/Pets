import myPets.Pet;

public class Main {

    public static void main(String[] args) {

        Pet kolt = new Pet();

        kolt.name = "Kolt";
        kolt.breed = "Labrador";
        kolt.kindOfAnimal = "dog";
        kolt.color = "black";
        kolt.age = 9;
        kolt.setHeight(0.9f);



        Pet girl = new Pet();
        girl.kindOfAnimal = "parrot";
        girl.breed = "Cockatiel";
        girl.name = "Girl";
        girl.color = "yellow";
        girl.age = 2;

        System.out.println(kolt.introducePet());
        System.out.println(girl.introducePet());
    }

}

