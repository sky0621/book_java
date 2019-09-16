public class EndCommand implements Command {
    @Override
    public void exec(String[] args) {
        System.out.println("End!");
        System.exit(-1);
    }
}
