package MediumLevel;

public class ArrayIntersection {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6};

        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            // Check if element exists in arr2
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            // Avoid printing duplicate elements
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {

                if (arr1[k] == arr1[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (found && !alreadyPrinted) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}