
@FunctionalInterface
interface MyInterface {
    // abstract method
    String reverse(String stringToReverse);
}

public class ReverseStringExample {

    public static void main(String[] args) {

        // declare a reference to the Interface
        MyInterface myInterface;

        // assign a lambda expression to the reference
        myInterface = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        // call the method of the interface
        System.out.println("The reverse of the string Lambda is -> " + myInterface.reverse("Lambda"));
    }
}
