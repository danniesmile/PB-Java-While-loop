package loops;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;
        // цел = 10 000 стъпки
        while (steps < 10000) { // Докато стъпките са < 10000
            String input = scanner.nextLine(); // Четем стринг от конзолата
            if (input.equalsIgnoreCase("Going home")) { // Ако той е Going home без значение главни/малки букви
                steps += Integer.parseInt(scanner.nextLine()); // Увеличаваме броя на стъпките с въведено число от конзолата
                // като стъпките са равни на стъпките + прочетеното число
                break; // тук цикълът приключва
            } else { 
                steps += Integer.parseInt(input); // В противен случай четем число, парсваме го към стринга
                // и стъпките са равни на стъпките + прочетеното число
            }
        }
        if (steps >= 10000) { // Ако целта е изпълнена
            System.out.println("Goal reached! Good job!");
        } else { // Ако целта не е изпълнена
            System.out.println((10000 - steps) + " more steps to reach goal.");
        }
    }
}


