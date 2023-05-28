package class19.HomeWork;

import ReviewClasses.Review3.While;

public class Programming {
    //Create a class named 'Programming'.While creating an object of the class,
    // if nothing is passed to it, then the message "I love programming languages"
    // should be printed. If some String is passed to it, then in place of "programming languages"
    // the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
    void empty() {
        System.out.println("I love programming language");
    }

    void notEmpty(String language) {
        System.out.println(language + " programming language");
    }


    public static void main(String[] args) {
        Programming empty = new Programming();
        empty.empty();
        Programming notEmpty = new Programming();
        notEmpty.notEmpty("Java");
    }
}