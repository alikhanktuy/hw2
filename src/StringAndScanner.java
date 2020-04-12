import java.util.Scanner;

public class StringAndScanner {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Введите число");
            int numberFromConsole = scanner.nextInt();
            int tempNum = numberFromConsole;
            boolean yes = true;
            while (numberFromConsole > 0) {
                numberFromConsole = tempNum;
                tempNum /= 10;
                if (numberFromConsole % 10 < tempNum % 10) {
                    yes = false;
                    break;
                }
            }
            if (yes) {
                System.out.println("Образует");
            } else {
                System.out.println("Не образует");
            }
        }
        }
        catch (Exception ex)
        {
            System.out.println("Ошибка " +ex.fillInStackTrace());
        }
    }
}
