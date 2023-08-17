import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            int operation;
            System.out.println("Это калькулятор чисел выбери то, что ты хочешь найти\n" +
                    "1) сумму всех целых чисел от 100 до 500;\n" +
                    "2) сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры" +
                    " a 500)\n" +
                    "3) сумму всех целых чисел от –10 до b (значение b вводится с клавиатуры" +
                    " b –10)\n" +
                    "4) сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры " +
                    "b a).\n");
            operation = scanner.nextInt();
            if (operation == 1) {
                int number = 100;
                int count = 100;
                int sum = 0;
                while (count <= 500) {
                    number = number + 1;
                    if (number % 2 == 0) {
                        sum += number;
                        System.out.println("Результат сложения целых чисел:" + sum);
                    }
                    count++;
                }
            } else if (operation == 2) {
                System.out.println("Введи число а");
                int number;
                int count;
                number = scanner.nextInt();
                count = number;
                int sum = 0;
                while (count <= 500) {
                    number = number + 1;
                    count++;
                    if (number % 2 == 0) {
                        sum += number;
                        System.out.println("Результат сложения целых чисел:" + sum);
                    }
                }
            } else if (operation == 3) {
                int number;
                int b;
                int count = -10;
                System.out.println("Введи число b");
                number = scanner.nextInt();
                b = number;
                int sum = 0;
                while (count <= b) {
                    count++;
                    if (count % 2 == 0) {
                        sum += count;
                        System.out.println("Сумма целых чисел: " + sum);
                    }
                }
            } else if (operation == 4) {
                System.out.println("Введи число а и b");
                int a;
                int b;
                int count;
                int sum = 0;
                a = scanner.nextInt();
                System.out.println("Ты ввёл а, теперь введи b");
                b = scanner.nextInt();
                while (a <= b) {
                    a++;
                    if (a % 2 == 0) {
                        sum += a;
                        System.out.println("Сумма целых чисел " + sum);
                    }
                }
            } else {
                System.out.println("Нужно ввести цифры от 1 до 4");
            }
        }catch (Exception ex) {
            System.out.println("Ты ввёл что то не так");
        }
        }
        }

