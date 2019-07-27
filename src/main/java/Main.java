import java.util.*;

public class Main {
    private static void usage() {
        String msg = "\n" +
                "[usage]\n" +
                "キーバリュー形式で文字列情報を管理するコマンドです。\n" +
                "以下のサブコマンドが利用可能です。\n" +
                "\n" +
                "list   ... 保存済みの内容を一覧表示します。\n" +
                "save   ... keyとvalueを渡して保存します。\n" +
                "get    ... keyを渡してvalueを表示します。\n" +
                "remove ... keyを渡してvalueを削除します。\n" +
                "help   ... ヘルプ情報（当内容と同じ）を表示します。\n" +
                "\n";
        System.out.println(msg);
    }

    // -------------------------------------------------------------------
    // ここからメイン処理
    // -------------------------------------------------------------------

    private static Map<String, String> cmdStore = new HashMap<String, String>();

    public static void main(String... args) {
        System.out.println("Start!");
        while (true) {
            Scanner s = new Scanner(System.in);
            String cmd = s.nextLine();

            // アプリ終了判定
            if (cmd.equals("end")) {
                System.out.println("End!");
                System.exit(-1);
            }

            // ヘルプ
            if (cmd.equals("help")) {
                usage();
                continue;
            }

            if (cmd.equals("")) {
                usage();
                continue;
            }

            // 以降は、引数ありコマンドの処理
            String[] cmds = cmd.split(" ");

            // 保存
            if (cmds[0].equals("save")) {
                if (cmds.length != 3) {
                    usage();
                    continue;
                }
                cmdStore.put(cmds[1], cmds[2]);
            }

            // 取得
            if (cmds[0].equals("get")) {
                if (cmds.length != 2) {
                    usage();
                    continue;
                }
                System.out.println(cmdStore.get(cmds[1]));
            }

            // 削除
            if (cmds[0].equals("remove")) {
                if (cmds.length != 2) {
                    usage();
                    continue;
                }
                cmdStore.remove(cmds[1]);
            }

            // 一覧
            if (cmds[0].equals("list")) {
                System.out.println("\"key\",\"value\"");
                cmdStore.entrySet().stream().map(e -> "\"" + e.getKey() + "\",\"" + e.getValue() + "\"").forEach(System.out::println);
            }
        }
    }
}