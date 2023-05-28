package class22;

public abstract class File {
    //Create a class File that will have the following behaviors: open, edit, close and fields name and size
    // Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile,
    // WordFile, PdfFile that will provide specific implementation of open behaviour: Example: to open .java
    // file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    abstract void open();
     void edit() {
        System.out.println("Editing file...");
    }

     void close() {
        System.out.println("Closing file...");

}
void printInfo(){
    System.out.println(name+" "+size);
}}
class JavaFile extends File{
    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open (){
        System.out.println("we need intellij");}

}
class WordFile extends File{
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening Word file using Microsoft Word...");
    }
}
class PdfFile extends File {
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF file using Adobe Acrobat Reader...");
    }
}
