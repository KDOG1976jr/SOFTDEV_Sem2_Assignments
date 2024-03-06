import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        Optional<Integer> myIntOptional = Optional.of(3);

        Optional<String> myStringOptional = Optional.of("Hi");
        Optional<String> myEmptyStringOptional = Optional.empty();

        System.out.println(myIntOptional);
        System.out.println(myStringOptional);
        System.out.println(myEmptyStringOptional);

        Optional<String> myStringOptionalLowerCasedEmptyPrinted;

        if (myEmptyStringOptional.isPresent()) {
            myStringOptionalLowerCasedEmptyPrinted = myEmptyStringOptional.map(str -> str.toLowerCase());
        } else {
            myStringOptionalLowerCasedEmptyPrinted = Optional.of("I am NULL");
        }
        System.out.println(myStringOptionalLowerCasedEmptyPrinted);



    }
}