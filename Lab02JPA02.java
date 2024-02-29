import java.util.Scanner;

public class Lab02JPA02 {
    public static void main(String[] args) {
        for (int i = 0;i<2;i++){
            System.out.println("Input:");
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            String[] calculte = a.split("\\s+");
            int number1 = Integer.parseInt(calculte[0]);
            int number2 = Integer.parseInt(calculte[1]);
            if(number1>number2){
                System.out.println(number1+" is larger than "+number2);

            }else{
                System.out.println(number2+" is larger than "+number1);
            }
        }
    }
}
