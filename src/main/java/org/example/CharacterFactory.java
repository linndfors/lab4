package org.example;
import org.reflections.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.Random;
import org.apache.log4j.BasicConfigurator;

///class CharacterFactory
//   - methods: Character createCharacter() {
//                returns random instance of any existing character
//              }
//NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccess
public class CharacterFactory {
    public static Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("org.example");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        Class[] arr = new Class[subTypes.size()];
        int count = 0;
//        try {
        for (Class<? extends Character> elem : subTypes) {
            arr[count] = elem;
            count++;
        }
        //        Character[] arr = subTypes.toArray(new Character[subTypes.size()]);
        int randIdx = new Random().nextInt(arr.length);
        Class class_res = arr[randIdx];
        Constructor constructor = class_res.getConstructor();
        Character res = (Character) constructor.newInstance();
        return res;
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new Character();
    }

//    public static void main(String[] args) throws Exception {
//        BasicConfigurator.configure();
//        Character new_person = createCharacter();
//        System.out.println(new_person);
//    }
}

