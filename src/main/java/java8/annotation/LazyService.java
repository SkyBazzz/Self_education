package java8.annotation;


@Service(name = "lazy lazy service")
public class LazyService {
    @Init
    public void lazyInit() throws Exception{
        System.out.println("lazy service");
    }

    public void hohma() throws Exception{
        System.out.println("Hohma is also presenting here in the Lazy Service");
    }
}
