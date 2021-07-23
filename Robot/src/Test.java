public class Test {
    public static void main(String[] args) {

        RobotWork robotWork = new RobotWork();
        RobotCharge robotCharge = new RobotCharge();

        //Создали обьекты роботов
        RobotOne robotOne = new RobotOne();
        RobotTwo robotTwo = new RobotTwo();
        RobotThree robotThree = new RobotThree();
        RobotFour robotFour = new RobotFour();
        RobotFive robotFive = new RobotFive();

        //с помощью метода charge наши роботы работает
        robotCharge.charge(robotOne);
        robotCharge.charge(robotTwo);
        robotCharge.charge(robotThree);
        robotCharge.charge(robotFour);
        robotCharge.charge(robotFive);

    }
}
