import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        int[] binary = new int[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i< 4;i++){
            int num = 3;
            int attempts = 0;
            while (num != 0 && num != 1){
                if (attempts>0){
                    System.out.println("Incorrect value, Try again");
                }else{
                    System.out.println("Insert Value (1 or 0");
                }

                num = input.nextInt();
                attempts++;
            }
            binary[i] = num;
        }

        int sum = 0;
        if (binary[3] == 1){
            sum += 1;
        }
        if (binary[2] == 1){
            sum += 2;
        }

        if (binary[1] == 1){
            sum += 4;
        }

        if (binary[0] == 1){
            sum += 8;
        }
        System.out.println("Your binary in deanary is: " + sum);
    }
}
