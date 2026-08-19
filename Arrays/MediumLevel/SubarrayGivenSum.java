package MediumLevel;

public class SubarrayGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {

            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {

                System.out.println("Subarray:");

                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                return;
            }
        }

        System.out.println("No subarray found");
    }
}
