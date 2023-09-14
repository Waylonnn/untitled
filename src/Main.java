public class Main {
    public static void main(String[] args) {
        int intOperandA = 5;
        int intOperandB = 3;
        int intSum = (intOperandA + intOperandB);
        int intDifference = (intOperandA - intOperandB);
        int intProduct = (intOperandA * intOperandB);
        int intQuotient = (intOperandA / intOperandB);
        int intModulo = (intOperandA % intOperandB);

        double doubleOperandA = 1;
        double doubleOperandB = 2;
        double doubleSum = (doubleOperandA % doubleOperandB);
        double doubleProduct = (doubleOperandA % doubleOperandB);
        double doubleDifference = (doubleOperandA % doubleOperandB);
        double doubleQuotient = (doubleOperandA % doubleOperandB);
        double doubleModulo = (doubleOperandA % doubleOperandB);

        System.out.println("int sum = " + intSum);
        System.out.println("int difference = " + intDifference);
        System.out.println("int product = " + intProduct);
        System.out.println("int quotient = " + intQuotient);
        System.out.println("int modulo = " + intModulo);

        System.out.println("double sum = " + doubleSum);
        System.out.println("double difference = " + doubleDifference);
        System.out.println("double product = " + doubleProduct);
        System.out.println("double quotient = " + doubleQuotient);
        System.out.println("double modulo = " + doubleModulo);
    }
}