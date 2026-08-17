package MediumLevel;

public class ArrayUnion {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};

        int[] union = new int[arr1.length + arr2.length];

        int index = 0;

        // Add elements of first array
        for (int i = 0; i < arr1.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < index; j++) {

                if (union[j] == arr1[i]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                union[index] = arr1[i];
                index++;
            }
        }

        // Add elements of second array
        for (int i = 0; i < arr2.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < index; j++) {

                if (union[j] == arr2[i]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                union[index] = arr2[i];
                index++;
            }
        }

        // Print union
        System.out.print("Union: ");

        for (int i = 0; i < index; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
