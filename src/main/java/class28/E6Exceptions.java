package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream=new
                    FileInputStream("C:\\Users\\korne\\IdeaProjects\\SDETBatch16 training\\Files\\TestExcelFile.xlsx");
        }catch (FileNotFoundException foundException){
            System.out.println("..........");
        }
    }
}
