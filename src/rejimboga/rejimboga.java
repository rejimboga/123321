package rejimboga;

import java.util.*;

public class rejimboga {
    public static void doJob(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число:");
        int a = sc.nextInt();
        byte b = (byte) a;
        System.out.print(b);
    }
    public static void main(String[] args){
        doJob();
    }
}
