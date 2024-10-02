import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[7];
        for(int i =0; i<nums.length-1;i++){
            nums[i] = input.nextInt();
        }
        System.out.println("Do you want to see the results?");
        String wantsToOutput = input.nextLine();

        if (wantsToOutput.equalsIgnoreCase("yes")){
            for (int i = 0; i<nums.length-1;  i++){
                System.out.println(nums[i]);
            }
        }

    }
}
