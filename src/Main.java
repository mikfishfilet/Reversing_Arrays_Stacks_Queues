import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        int size;

        do {
            System.out.print("Enter any set amount of integers: ");
            size = input.nextInt();

            if (size <= 0) {
                System.out.println("Please enter a number greater than 0.");
            }
        } while (size <= 0);

        //Array
        int[] numbers = new int[size];

        //Stack
        Stack<Integer> stack = new Stack<>();

        //Queue
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter an integer " + (i + 1) + ": ");
            int value = input.nextInt();

            numbers[i] = value;
            stack.push(value);
            queue.offer(value);
        }
        System.out.print("\nOriginal array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("The values in the Stack collection are now: ");

        for (int value : stack) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("The values in the Queue collection are now: ");

        for (int value : queue) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }


        System.out.print("\nReversed array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i <numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        Stack<Integer> temporaryStack = new Stack<>();

        while (!stack.isEmpty()) {
            temporaryStack.push(stack.pop());
        }

        stack = temporaryStack;

        System.out.print("\nThe reversed values in the Stack collection are now:");

        for (int value : stack) {
            System.out.print(value + " ");
        }
        System.out.println();

        Stack<Integer> queueStack = new Stack<>();

        while (!queue.isEmpty()) {
            queueStack.push(queue.poll());
        }

        while (!queueStack.isEmpty()) {
            queue.offer(queueStack.pop());
        }

        System.out.print(
                "\nThe reversed values in the Queue collection are now: ");

        for (int value : queue) {
            System.out.print(value + " ");
        }

        System.out.println();

        input.close();
    }
}
