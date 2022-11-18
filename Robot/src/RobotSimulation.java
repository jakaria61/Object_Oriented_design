public class RobotSimulation {
    public static void main(String[] args) {
        WalkForword Forword=new WalkForword();
        Forword.execute();
        WalkBackword Backword=new WalkBackword();
        Backword.execute();
        TurnRight right=new TurnRight();
        right.execute();
        TurnLeft left=new TurnLeft();
        left.execute();
        Stop stop=new Stop();
        stop.execute();
    }
}
