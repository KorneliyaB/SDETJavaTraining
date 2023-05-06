package ReviewClasses.Review7;

public class JavaMethods {
        /*
        method is a block of code to perform specific task

        Methods: return value
                 do not return anything (void)


        Methods: with parameters
                 without parameters
         */
    void hello(){ //do not return anything
        System.out.println("Hello");
    }
    void helloName(String name){
        System.out.println("Hello "+ name);
    }
    // I want method that accepts 3 Strings, concatenates them and return  a new
    //concatenated string
    String concatenate(String str1,String str2,String str3){
        return str1.concat(str2).concat(str3); //return
    }
    // I want to create a method that will return me the largest  numbers from given 2
    // numbers
    int largest(int num1, int num2){
        int large;
        if (num1>num2){
            large=num1;
        }else {
            large=num2;
        }
            return large;
    }
    //
    double convertTemp(int cel){
        double f=cel*9/5+32;
        return f;
        }
    //create a method that will return an Array of words from given sentence

    String []words(String sentence) {
        String[] output = sentence.split(" ");


        return output;
    }


}

