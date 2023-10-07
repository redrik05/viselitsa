import java.util.Scanner;

public class EndGame {
    public void endGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 0 для выхода");
        System.out.println("Введите что угодно кроме 0 для новой игры");
        int command = sc.nextInt();
        if (command == 0) {
            System.exit(0);
        }
    }
}
