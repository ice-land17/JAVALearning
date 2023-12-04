/**
 *
 */
public class HomeWork05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String name = "hello";

    public void f1() {
        class B {
            private final String NAME = "education";

            public void show() {
                System.out.println("NAME=" + NAME + "外部类name=" + name);
            }
        }
        B b = new B();
        b.show();
    }
}
