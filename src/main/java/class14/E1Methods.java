package class14;

public class E1Methods {

    void printWord(String word){ // void,String,int etc...
        System.out.println(word);
    }
    // void => return type of the method,void means this method does not return any data
    // other example for return types can be String, boolean, int,char, Dog,Cat etc.
    // printWord => it's the name of the method
    // (String word) => parameters/input
    // {System.out.println(word);} => body of the method you can write if else condition loop

    public static void main(String[] args) {
        // we are creating an object of the E1Method class
        // E1Method is a data type here
        // in Java all the classes can be treated as data types
        //new E1Methods() => creating the object of the E!Method class

        E1Methods obj=new E1Methods();
        // we aer calling the printWord() method on obj object and passing "java"as argument or input
        //so the input of parameter is called argument
        obj.printWord("Java");
    }
}
