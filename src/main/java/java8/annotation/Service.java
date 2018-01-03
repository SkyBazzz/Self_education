package java8.annotation;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Service {
    String name();

    boolean lazyLoad() default false;
}
