public class Main {
    private ConsoleInput in;

    public Main(){
        in = ConsoleInput.getInstance();
    }

    private void title(){
        System.out.println("Course-Net Burger");
        System.out.println("-----------------");
    }

    private void optHome(){
        System.out.println("1. Add Burger");
        System.out.println("2. Sell Burger");
        System.out.println("3. Update Burger");
        System.out.println("4. Exit");
    }

    private void menuHome(){
        boolean run = true;
        int opt = -1;

        while (run) {
            title();
            optHome();
            opt = in.getIntInRange("Input [1..4]", 1, 4);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
