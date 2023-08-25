public class testPeople {
    public static void main(String[] args) {
        Person n = new Person("Neil", 12);
        Person a = new Grandma("Ada", 60);
        Grandma v = new Grandma("Vidya", 80);
//        Grandma al = new Person("Alex", 70); // Compile time error
        n.greet(a); // "Hello Ada"
        n.greet(v); // "Hello Vidya"
        v.greet(a); // "Hello, young whippersnapper"
        v.greet((Grandma) a); // "How was bingo, Ada?"
        a.greet(n); // "Hello, young whippersnapper"
        a.greet(v); // "Hello, young whippersnapper"
        ((Grandma) a).greet(v); // "How was bingo, Vidya?"
//        ((Grandma) n).greet(v); // Runtime error
    }
}
