package by.pvt.annot;

/**
 *
 */
@FirstAnnotation(getInfo = "My class", getVersion = 2)
public class MyClass {

    @FirstAnnotation(getVersion = 2, getInfo = "Constructor")
    public MyClass() {
    }

    @FirstAnnotation(getInfo = "info", getVersion = FirstAnnotation.version)
    public void doSomething(@NotNull String s) {
        System.out.println("Do something " + s.length());
    }

    public void doSomething2(@Nullable(description = "Could be null") String s) {
        if (s == null) return;
        System.out.println("Do something 2 " + s.length());
    }
}