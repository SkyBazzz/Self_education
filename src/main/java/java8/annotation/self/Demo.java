package java8.annotation.self;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {
        Cherry cherry = new Cherry();
        Class<?> aClass = cherry.getClass();
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass.getSimpleName());
        System.out.println(aClass.getModifiers());
        System.out.println(aClass.getMethods());

        for (int i = 0; i < aClass.getDeclaredFields().length; i++) {
            if(aClass.getDeclaredFields()[i].isAnnotationPresent(Height.class)) {
                Field field = aClass.getDeclaredFields()[i];
                field.set(cherry, field.getDeclaredAnnotation(Height.class).value() );
                System.out.println(cherry.height);
            }
        }
    }
}
