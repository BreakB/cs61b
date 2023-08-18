public class Foo {
    public int x, y;

    public Foo (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void switcheroo (Foo a, Foo b) {
        Foo temp = a;
        a = b;
        b = temp;
    }
    public static void fliperoo (Foo a, Foo b) {
        Foo temp = new Foo(a.x, a.y);
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }
    public static void swaperoo (Foo a, Foo b) {
        Foo temp = a;
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }

    public static void main (String[] args) {
        Foo foobar = new Foo(10, 20);
        Foo baz = new Foo(30, 40);

        // method中的a和b指向传入的foobar和baz

        // 没有改变foobar和baz指向的对象中的值
        switcheroo(foobar, baz); //foobar.x: ___ foobar.y: ___ baz.x: ___ baz.y: ___
        System.out.println(foobar.x);
        System.out.println(foobar.y);
        System.out.println(baz.x);
        System.out.println(baz.y);
        // 改变了foobar和baz指向的对象中的值
        fliperoo(foobar, baz); //foobar.x: ___ foobar.y: ___ baz.x: ___ baz.y: ___
        System.out.println(foobar.x);
        System.out.println(foobar.y);
        System.out.println(baz.x);
        System.out.println(baz.y);
        // 最终全部指向a
        swaperoo(foobar, baz); //foobar.x: ___ foobar.y: ___ baz.x: ___ baz.y: ___
        System.out.println(foobar.x);
        System.out.println(foobar.y);
        System.out.println(baz.x);
        System.out.println(baz.y);
    }
}
