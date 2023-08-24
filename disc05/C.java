public class C extends B {
    public int y = x + 1;
    public void m2() { System.out.println("Cm2-> " + super.x); }
//    @source https://stackoverflow.com/questions/586363/why-is-super-super-method-not-allowed-in-java
//    public void m4() { System.out.println("Cm4-> " + super.super.x); }
    public void m5() { System.out.println("Cm5-> " + y); }
}