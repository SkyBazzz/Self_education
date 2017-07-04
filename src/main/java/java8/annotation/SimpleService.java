package java8.annotation;

@Service(name = "simple annotation")
public class SimpleService {
    @Init
    public void initService() {
        System.out.println("Init service");
    }

    public void hohma(){
        System.out.println("Some serious method");
    }
}
