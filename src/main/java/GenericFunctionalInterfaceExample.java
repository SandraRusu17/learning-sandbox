// the functional generic interface
@FunctionalInterface
interface MyGenericInterface<T> {
    // the abstract generic method
    T func(T t);
}

public class GenericFunctionalInterfaceExample {

    public static void main(String[] args) {

        // declare a reference to the generic functional interface
        // the MyGenericInterface operates on String
        MyGenericInterface<String> reverse;

        // assign a lambda to the reference
        reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i > 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        // call the generic abstract method
        System.out.println("The reverse of the Lambda string is->" + reverse.func("Lambda"));

        // declare a reference to the generic functional interface
        // the MyGenericInterface operates on String
        MyGenericInterface<Integer> factorial;

        // assign a lambda to the reference
        factorial = (number) -> {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = i * number;
            }
            return result;
        };

        // call the generic abstract method
        System.out.println("The factorial of 5 is->" + factorial.func(5));

    }
}
