package loops;

import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cupVolume = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int times = 0;

        while (totalSum < cupVolume) {
            String input = scanner.nextLine().toLowerCase();

            if ("easy".equals(input))
                totalSum += 50;

            if ("medium".equals(input))
                totalSum += 100;


            if ("hard".equals(input))
                totalSum += 200;

            times++;
        }

        if (totalSum > cupVolume) {
            
            System.out.println((totalSum - cupVolume) + "ml has been spilled.");
            return;
        }
        System.out.println("The dispenser has been tapped " + times + " times.");
    }

}
