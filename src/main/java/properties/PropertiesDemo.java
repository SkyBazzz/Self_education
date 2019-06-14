package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        Set<Object> URL;
        String string;

        properties.put("ide", "ide.geeksforgeeks.org");
        properties.put("contribute", "contribute.geeksforgeeks.org");
        properties.put("quiz", "quiz.geeksforgeeks.org");

        URL = properties.keySet();
        Iterator iterator = URL.iterator();

        while (iterator.hasNext()) {
            string = (String) iterator.next();
            System.out.println("The URL for " + string + " is " + properties.getProperty(string));
        }
        System.out.println();

        // looking for URL that not in list
        string = properties.getProperty("articl", "not found");
        System.out.println("The URL for article is " + string);

        System.out.println();

        properties.list(System.out);

        System.out.println("==================================");

        Properties gfg = new Properties();

        PrintWriter writer = new PrintWriter(System.out);

        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        // printing list using PrintWriter object
        gfg.list(writer);

        // flushing the stream
        writer.flush();

        System.out.println("==================================");

        gfg = new Properties();

        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        Enumeration name = gfg.propertyNames();

        // print the enumaration elements
        System.out.println(name.nextElement());
        System.out.println(name.nextElement());
        System.out.println(name.nextElement());

        System.out.println("==================================");

        gfg = new Properties();
        String s = "ide = ide.geeksforgeeks.org";

        FileOutputStream out = new FileOutputStream("properties.txt");
        FileInputStream in = new FileInputStream("properties.txt");

        // write the property in the output stream file
        out.write(s.getBytes());

        // load from input stream
        gfg.load(in);

        gfg.list(System.out);
        System.out.println(gfg.getProperty("ide"));

        System.out.println("==================================");

        gfg = new Properties();
        s = "ide = ide.geeksforgeeks.org";

        // creating a new reader
        StringReader reader = new StringReader(s);

        // loading from input stream
        gfg.load(reader);

        gfg.list(System.out);

        System.out.println("==================================");

        gfg = new Properties();
        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        // store the properties in output stream
        gfg.store(System.out, "Demo of Properties class");

        System.out.println("==================================");

        gfg = new Properties();
        StringWriter wr = new StringWriter();
        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        gfg.store(wr, "Demo of Properties class");

        System.out.print(wr.toString());

        System.out.println("==================================");

        gfg = new Properties();

        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        // property name in the set
        Set set = gfg.stringPropertyNames();

        System.out.print(set);
        System.out.println();

        System.out.println("==================================");

        gfg = new Properties();

        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        out = new FileOutputStream("properties.xml");
        in = new FileInputStream("properties.xml");

        // store the properties into specified xml
        gfg.storeToXML(out, null);

        // load the properties from specified xml
        gfg.loadFromXML(in);

        gfg.list(System.out);

        System.out.println("==================================");

        gfg = new Properties();

        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        out = new FileOutputStream("properties.xml");
        in = new FileInputStream("properties.xml");

        // store the properties into specified xml
        gfg.storeToXML(out, "Demo of properties class", "ISO-8859-3");

        while(in.available()>0)
        {
            System.out.print((char)in.read());
        }

        System.out.println("==================================");

        gfg = new Properties();

        gfg.put("ide", "ide.geeksforgeeks.org");
        gfg.put("contribute", "contribute.geeksforgeeks.org");
        gfg.put("quiz", "quiz.geeksforgeeks.org");

        out = new FileOutputStream("properties.txt");
        in = new FileInputStream("properties.txt");

        // saving the properties in specified txt file
        gfg.save(out, null);

        gfg.load(in);

        gfg.list(System.out);

        System.out.println("==================================");

    }
}
