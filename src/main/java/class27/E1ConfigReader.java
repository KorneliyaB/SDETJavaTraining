package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //String path="C:\\Users\\korne\\IdeaProjects\\SDETBatch16 training\\Files\\Config.properties";
        // System.out.println(path1);
        //System.getProperty("user.dir"));=>it gives you the path till your project
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";// => bring the
        //data from of key value pairs
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fileInputStream);
        System.out.println(prop.get("userName"));
        //System.out.println(prop.containsKey("userName"));



    }
    }
