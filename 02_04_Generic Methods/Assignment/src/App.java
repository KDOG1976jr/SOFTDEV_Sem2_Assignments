public class App {
    public static void main(String[] args) throws Exception {
        Property<Double> number1 = new Property<Double>(3.0);
        Property<Double> number2 = new Property<Double>(2.0);

        System.out.println("number1 > number2" + number1.isGreaterThan(number2));
        System.out.println("number1 > number2" + number1.isLessThan(number2));
        System.out.println("number1 > number2" + number1.isEqual(number2));
        System.out.println("number1 > number2" + number1.isNotEqual(number2));
        System.out.println("number1 > number2" + number1.isGreaterThanOrEqual(number2));
        System.out.println("number1 > number2" + number1.isLessThanOrEqual(number2));

        //TODO:  repeat for equals, notequals, greaterThanorequals, less than or equals

    }
}
