public class HelpCommand implements Command {
    @Override
    public void exec(String[] args) {
        String msg = "\n" +
                "[usage]\n" +
                "キーバリュー形式で文字列情報を管理するコマンドです。\n" +
                "以下のサブコマンドが利用可能です。\n" +
                "\n" +
                "save   ... keyとvalueを渡して保存します。\n" +
                "get    ... keyを渡してvalueを表示します。\n" +
                "remove ... keyを渡してvalueを削除します。\n" +
                "list   ... 保存済みの内容を一覧表示します。\n" +
                "clear  ... 保存済みの内容を初期化します。\n" +
                "help   ... ヘルプ情報（当内容と同じ）を表示します。\n" +
                "end    ... アプリを終了します。\n" +
                "\n";
        System.out.println(msg);
    }
}
