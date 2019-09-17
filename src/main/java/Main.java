import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Commands commands = new Commands(new StoreInfo("store.json"));

        System.out.println("Start!");
        while (true) {
            Scanner s = new Scanner(System.in);
            String cmd = s.nextLine();
            commands.exec(cmd.split(" "));
        }
    }
}