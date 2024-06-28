package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Анонімний клас для MathOperation, що виконує додавання
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition result: " + addition.operate(5, 3));

        // Лямбда-вираз для StringManipulator, що перетворює рядок в верхній регістр
        StringManipulator toUpperCase = s -> s.toUpperCase();
        System.out.println("Uppercase string: " + toUpperCase.manipulate("hello world"));

        // Використання посилання на метод для передачі методу countUppercase як аргументу
        Function<String, Integer> countUppercaseFunction = StringListProcessor::countUppercase;
        String testString = "Hello World!";
        System.out.println(testString);
        System.out.println("Number of uppercase letters: " + countUppercaseFunction.apply(testString));

        // Використання інтерфейсу Supplier для створення постачальника випадкових чисел від 1 до 100
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number: " + randomSupplier.get());
    }
}
