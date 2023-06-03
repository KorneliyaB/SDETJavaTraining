package class26;

import Utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.SortedMap;

public class E2ConfigFiles {
    public static void main(String[] args) throws IOException {
        //System.getProperty("user.dir") -> gives the path of the project
        System.out.println(System.getProperty("user.dir"));
        String path=System.getProperty("user.dir")+"\\"+"Files\\Config.properties";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);//navigate to the file

        Properties properties=new Properties();//that special class which knows how this file works
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));
    }
}
