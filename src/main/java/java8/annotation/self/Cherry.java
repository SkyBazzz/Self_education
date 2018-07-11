package java8.annotation.self;

public class Cherry extends Tree {
    @Height(value = 7)
    Integer height;

    @Override
    public String toString() {
        return "Cherry{" +
                "height=" + height +
                '}';
    }
}
