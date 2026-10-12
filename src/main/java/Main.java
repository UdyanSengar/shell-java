import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");
            String input = sc.nextLine();
            if (input.startsWith("type")) {
                if (input.substring(5).equals("echo"))
                    System.out.println(input.substring(5) + " is a shell builtin");
                if (input.substring(5).equals("exit"))
                    System.out.println(input.substring(5) + " is a shell builtin");
            }
            if (input.equals("exit"))
                break;
            if (input.startsWith("echo"))
                System.out.println(input.substring(5));
            else
                System.out.println(input + ": command not found");
        }
    }
}
