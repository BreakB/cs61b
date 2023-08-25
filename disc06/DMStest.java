import java.util.Comparator;
public class DMStest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal poodle = new Poodle();
        Comparator<Animal> animal_com = new DMSComparator();

        int a = animal_com.compare(animal, dog);// negative number
        int b = animal_com.compare(dog, dog);// zero
        int c = animal_com.compare(poodle, dog);// positive number

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
