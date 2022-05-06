import java.io.*;

public class Question2 {

        public int findMin(int arr[], int n)
        {
            int min = arr[0];
            for (int i = 1; i < n; i++)
                min = Math.min(min, arr[i]);
            return min;
        }

        public int findMax(int arr[], int n)
        {
            int max = arr[0];
            for (int i = 1; i < n; i++)
                max = Math.max(max, arr[i]);
            return max;
        }

}


