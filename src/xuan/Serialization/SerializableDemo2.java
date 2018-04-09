package xuan.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by xuanwei on 2018/4/9.
 */
public class SerializableDemo2 {
    public static void main(String[] args) throws IOException {
        User2 user2 = new User2();
        user2.setName("weixuan");
        user2.setAge(23);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempFile2"));
            oos.writeObject(user2);//报错：java.io.NotSerializableException: xuan.Serialization.User2
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
