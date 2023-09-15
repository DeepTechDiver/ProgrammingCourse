import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input you name :");
        String name = scanner.nextLine();
        System.out.println("input you age :");
        int age = scanner.nextInt();
        System.out.printf("Hi, %s, you are %d\n", name, age);
    }
}
