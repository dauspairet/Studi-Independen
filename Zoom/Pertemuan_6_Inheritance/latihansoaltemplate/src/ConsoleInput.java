import java.util.Scanner;

public class ConsoleInput {
    private Scanner in;
    
    private static ConsoleInput instance;

    private ConsoleInput(){
        in = new Scanner(System.in);
    }

    public static ConsoleInput getInstance(){
        if (instance == null) { 
            instance = new ConsoleInput();
        }

        return instance;
    }

    public int getIntInRange(String msg, int min, int max){
        int res = min - 1;

        do {
            System.out.println(msg);
            res = in.nextInt();
        } while (res < min || res > max);
        return res;
    }
}
