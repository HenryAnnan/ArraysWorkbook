public class task3 {
    public static void main(String[] args) {
        int score[] = {98, 78, 66, 81, 66, 77, 12, 105, 26, 87, 89, 67};

        int highestScore = 0;
        for(int i = 0; i < 11;i++){
            if (score[i]>highestScore){
                highestScore = score[i];
            }
        }
        System.out.println(highestScore);
    }
}
