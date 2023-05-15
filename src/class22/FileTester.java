package class22;

public class FileTester {
    public static void main(String[] args) {
        File[]files={new JavaFile("Animal",5),new WordFile("Tom",8),
                new PdfFile("Word",7)};
        for (File f:files){
            f.printInfo();
            f.close();
            f.open();
            f.edit();
        }
    }
}
