package array;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String args[])
    {
        int[] scores = {80,82,87,95,96,77,87,89,78,98};
        int sum = 0;
        for(int i =0; i<scores.length; i++){
            sum += scores[i];

        }
        System.out.println("sum: " + sum);
        double average = (double) sum /scores.length;
        System.out.println("Average: " + average );

        int max = scores[0];
        for(int j =0; j <scores.length; j++){
            if(max < scores[j]){
                max = scores[j];
            }
        }
        System.out.println("Max value: " + max);

        int low = scores[0];
        for (int k = 0; k < scores.length; k++){
            if(low > scores[k]){
                low = scores[k];
            }
        }
        System.out.println("Low score is: " + low);

        // Calculate the median
        Arrays.sort(scores);  // sort the array
        double median;
        int middle = scores.length / 2;

        if (scores.length % 2 == 0) {
            // even number of scores
            median = (scores[middle - 1] + scores[middle]) / 2.0;
        } else {
            // odd number of scores
            median = scores[middle];
        }

        System.out.println("Median: " + median);

        // BONUS: difference between average and median
        double difference = Math.abs(average - median);
        System.out.println("Difference between average and median: " + difference);

    }

}
