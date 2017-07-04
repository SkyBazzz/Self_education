package java8.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationDemo {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

        loadService("java8.annotation.SimpleService");
        loadService("java8.annotation.LazyService");

    }

    private static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());
        } else {
            System.out.println("not found " + service.getName());
        }
    }

    /***
     * Load service if it contains Service.class annotation
     * @param className class name
     */
    private static void loadService(String className) {
        /*
         * get class by Name and put into the map
         */
        Class<?> clazz = null;
        Object serviceObj = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        Map<String, Object> map = new HashMap<>();
        if (clazz != null && clazz.isAnnotationPresent(Service.class)) {
            try {
                serviceObj = clazz.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                System.out.println("Wrong access");
            }
            map.put(serviceObj.toString(), serviceObj);
        }
        printClassesService(map, 17);
        /*
         * call method of a class if it exist in the class
         */
        Method method = getMethod(clazz, "hohma");

        /*
         * how to get and use private method
         */
        method.setAccessible(true);

        try {
            method.invoke(serviceObj);
        } catch (InvocationTargetException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }
    private static Method getMethod(Class<?> clazz, String methodName) {
        Method method = null;
        try {
            method = clazz != null ? clazz.getDeclaredMethod(methodName, null) : null;
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage() + "ERROR");
        }
        return method;
    }

    /***
     * print all elements in the Map
     * @param map   map, which entities we want to print
     * @param length number of element in the string
     */
    private static void printClassesService(Map<String, Object> map, int length) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey().substring(length, entry.getKey().indexOf("@")));
        }
    }

}
