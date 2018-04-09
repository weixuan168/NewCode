package xuan.Serialization;

import java.io.*;
import java.lang.reflect.Type;

/**
 * Created by xuanwei on 2018/4/9.
 */
public class SerializableDemo1 {
    public static void main(String[] args) throws IOException {
//        User1 user1 = new User1();
//        user1.setName("weixuan");
//        user1.setAge(23);
//        System.out.println(user1);

        Type type = (Type) User1.class;

        System.out.println(type.getTypeName());

//        ObjectOutputStream oos = null;
//        try {
//            oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
//            oos.writeObject(user1);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            oos.close();
//        }
//
//        File file = new File("tempFile");
//        ObjectInputStream ois = null;
//        try {
//            ois = new ObjectInputStream(new FileInputStream(file));
//            User1.className = "fanqinghua";
//            //序列化后的静态变量的值为当前JVM中设定的值，而不是序列化时的值
//            User1 newUser = (User1) ois.readObject();
//            System.out.println(newUser);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            ois.close();
//        }
    }
}
