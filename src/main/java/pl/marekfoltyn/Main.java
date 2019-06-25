package pl.marekfoltyn;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        menu();

    }

    public static void menu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        FifoQueue fifoQueue = new FifoQueue();
        while (true) {
            System.out.println("==== Menu ====");
            System.out.println("1. Dodaj do kolejki");
            System.out.println("2. Zdejmij z kolejki");
            Integer option = scanner.nextInt();
            Random random = new Random();

            switch (option) {
                case 1:
                    Node node = new Node(random.nextInt());
                    fifoQueue.push(node);
                    System.out.println("Dodano do kolejki: " + node.getValue());
                    System.out.println("Obecny rozmiar kolejki to: " + fifoQueue.getSize());
                    System.out.println();
                    break;
                case 2:
                    Node out = fifoQueue.pop();
                    System.out.println("Sciągnięto z kolejki: " + out.getValue());
                    System.out.println("Obecny rozmiar kolejki to: " + fifoQueue.getSize());
                    break;
                default:
                    break;
            }
        }
    }
}
