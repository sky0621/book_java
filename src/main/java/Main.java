import java.util.*;

public class Main {
    public static void main(String... args) {
        Commands commands = new Commands(new StoreInfo("store.json"));

        System.out.println("Start!");
        while (true) {
            Scanner s = new Scanner(System.in);
            String cmd = s.nextLine();
            commands.exec(cmd.split(" "));

//            // 保存
//            if (cmds[0].equals("save")) {
//                if (cmds.length != 3) {
//                    continue;
//                }
//                cmdStore.put(cmds[1], cmds[2]);
//            }
//
//            // 取得
//            if (cmds[0].equals("get")) {
//                if (cmds.length != 2) {
//                    continue;
//                }
//                System.out.println(cmdStore.get(cmds[1]));
//            }
//
//            // 削除
//            if (cmds[0].equals("remove")) {
//                if (cmds.length != 2) {
//                    continue;
//                }
//                cmdStore.remove(cmds[1]);
//            }
//
//            // 一覧
//            if (cmds[0].equals("list")) {
//                System.out.println("\"key\",\"value\"");
//                cmdStore.entrySet().stream().map(e -> "\"" + e.getKey() + "\",\"" + e.getValue() + "\"").forEach(System.out::println);
//            }
        }
    }
}