import java.util.Scanner;

public class App {


    // method to return the maximum score
    static int maxScore(int[] scores){
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }

        return max;
    }


    // method to return the minimum score
    static int minScore(int[] scores){
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] < min){
                min = scores[i];
            }
        }

        return min;
    }


    static double average(int[] scores){
        double sum = 0;
        double count = scores.length;
        double average = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        average = sum/count;


        return average;
    }

    static void createGraph(int[] stats){

        // find max y axis
        int maxY = stats[0];
        for (int i = 0; i < stats.length; i++) {
            if(stats[i] > maxY){
                maxY = stats[i];
            }
        }

        int bucket0 = stats[0];
        int bucket1 = stats[1];
        int bucket2 = stats[2];
        int bucket3 = stats[3];
        int bucket4 = stats[4];

        for (int i = maxY - 1; i >= 0; i--) {
            System.out.print(i+1 + " >");
            for (int j = 0; j < stats.length; j++) {
                // if it's the first bucket 0 ie j = 0
                if(j == 0){
                    if(bucket0 == maxY){
                        System.out.print("   #####");
                        bucket0--;
                    }
                    else{
                        System.out.print("        ");
                    }
                }
                else if(j == 1){
                    if(bucket1 == maxY){
                        System.out.print("     #####");
                        bucket1--;
                    }
                    else{
                        System.out.print("          ");
                    }
                }
                else if(j == 2){
                    if(bucket2 == maxY){
                        System.out.print("     #####");
                        bucket2--;
                    }
                    else{
                        System.out.print("          ");
                    }
                }
                else if(j == 3){
                    if(bucket3 == maxY){
                        System.out.print("     #####");
                        bucket3--;
                    }
                    else{
                        System.out.print("         ");
                    }
                }
                else if(j == 4){
                    if(bucket4 == maxY){
                        System.out.print("     #####");
                        bucket4--;
                    }
                    else{
                        System.out.print("              ");
                    }
                }
                
                
            }
            maxY--;
            System.out.println("\t");
        }

        
        System.out.println("   +.........+.........+.........+.........+.........+");
        System.out.println("   I   0-20  I  21-40  I  41-60  I  61-80  I 80-100  I");

    }
    
    public static void main(String[] args) throws Exception {
        

        // taking in scores of the students
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number of students in the class N: ");
            int N = scanner.nextInt();

            int[] scores = new int[N];
            int[] stats = {0, 0, 0, 0, 0};

            for (int i = 0; i < N; i++) {
                int score = -1;
                while (score < 0 || score > 100) {
                    System.out.printf("Enter student %s's score: ",i);
                    score = scanner.nextInt();
                    scores[i] = score;
                }

                // bucket0
                if(score >= 0 && score < 21){
                    stats[0] += 1;
                }
                else if(score >= 21 && score < 41){
                    stats[1] += 1;
                }
                else if(score >= 41 && score < 61){
                    stats[2] += 1;
                }
                else if(score >= 61 && score < 81){
                    stats[3] += 1;
                }
                else if(score >= 81 && score < 101){
                    stats[4] += 1;
                }
            }

            // for (int i : stats) {
            //     System.out.println(i);
            // }
            

            System.out.println("Values: \n\n");
            // find the largest score
            int maxScore = maxScore(scores);
            System.out.println("The maximum score is " + maxScore);
            // find the smallest score
            int minScore = minScore(scores);
            System.out.println("The minimum score is " + minScore);
            // find the average score
            double average = average(scores);
            System.out.println("The average score is " + average);

            
            

            

            // draw graph
            createGraph(stats);
            
        } catch (Exception e) {
            System.out.println("Something went wrong. Try again...");
        }

        

    }
}
