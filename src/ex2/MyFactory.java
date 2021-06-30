package ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance(String name) {
        Object obj;
        try (InputStream input = new FileInputStream("MyFactory.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            obj = Class.forName(prop.getProperty(name)).getDeclaredConstructor().newInstance();
            return obj;
        } catch (IOException | ClassNotFoundException | NoSuchMethodException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
