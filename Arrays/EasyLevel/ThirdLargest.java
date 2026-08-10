package EasyLevel;

public class ThirdLargest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15, 25};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                thirdLargest = secondLargest;
                secondLargest = arr[i];

            } else if (arr[i] > thirdLargest &&
                       arr[i] != secondLargest &&
                       arr[i] != largest) {

                thirdLargest = arr[i];
            }
        }

        System.out.println("Third Largest: " + thirdLargest);
    }
}