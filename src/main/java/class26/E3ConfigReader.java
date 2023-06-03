package class26;

import Utils.ConfigReader;
import Utils.Constants;

import java.io.IOException;

public class E3ConfigReader {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
    }
}
