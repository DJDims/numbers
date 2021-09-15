import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        System.out.println("Введите ваше число --> ");
        Scanner invalue = new Scanner(System.in);
        int num = invalue.nextInt();
        int hundreds = num/100;
        int tens = num/10 - hundreds*10;
        int ones = num - hundreds*100 - tens*10;
        System.out.println("Сотни = " + hundreds);
        System.out.println("Десятки = " + tens);
        System.out.println("Еденицы = " + ones);
    }
}
