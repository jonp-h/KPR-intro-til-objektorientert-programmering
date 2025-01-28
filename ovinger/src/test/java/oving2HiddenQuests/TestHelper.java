package oving2HiddenQuests;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Assertions;

public class TestHelper {

    public static void checkIfFieldsPrivate(Class<?> class1) {
        for (Field field : class1.getDeclaredFields()) {
            Assertions.assertTrue(Modifier.isPrivate(field.getModifiers()),
                    "Expected field " + field.getName() + " to be private!");
        }
    }
}
