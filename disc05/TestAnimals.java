public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield", 6);
        Dog d = new Dog("Fido", 4);
        a.greet(); // "Animal Pluto says huh?"
        c.greet(); // "Cat Garfield says Meow!"
        d.greet(); // "Dog Fido says Woof!"
        c.play(); // "Woo it is so much fun being an animal!"
        c.play(":)"); // "Woo it is so much fun being a cat! :)"
        a = c;
        // a's static type is Animal, a's dynamic type is Cat
        ((Cat) a).greet(); // "Cat Garfield says Meow!"
        ((Cat) a).play(":D"); // "Woo it is so much fun being a cat! :D"
//        a.play(14); // Compile time error.
//        ((Dog) a).play(12); // Runtime error.
        a.greet(); // "Cat Garfield says Meow!"
        // before
//        c = a; // Compile time error.
        // after
        c = (Cat) a;
    }
}