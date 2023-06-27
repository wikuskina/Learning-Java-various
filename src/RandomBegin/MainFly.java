package RandomBegin;

public class MainFly {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        FlyExecutor flyexecutor = new FlyExecutor();

        flyexecutor.makeFly(duck);
        flyexecutor.makeFly(airplane);
    }
}
