public class RobotOne extends RobotWork {
    //@Override позволяет, выделить ошибку в  переопределенном методе
    @Override
    public void robotWork() {
        System.out.println("Робот, первый моет посуду");
    }
}
