import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] commands = { "echo", "exit", "type" };
        while (true) {
            System.out.print("$ ");
            String input = sc.nextLine();
            if (input.startsWith("type")) {
                for (int i = 0; i < commands.length; i++) {
                    if (input.substring(5).equals(commands[i])) {
                        System.out.println(commands[i] + " is a shell builtin");
                        continue;
                    }
                }
                System.out.println(input.substring(5) + " : command not found");
                continue;
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
