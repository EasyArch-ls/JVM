package instantiation.two;

import instantiation.one.Stu;

import java.io.*;

/***
 * @Author: lisheng
 * @Date: 2020/8/6
 * @Time: 下午8:07
 * @Description:
 ***/
public class Four {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("aa.txt");
        Stu stu=new Stu();
        OutputStream outputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(stu);
        objectOutputStream.flush();
        outputStream.close();
        InputStream inputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        Stu stu1=(Stu) objectInputStream.readObject();
        inputStream.close();
        System.out.println(stu==stu1);
    }

}
