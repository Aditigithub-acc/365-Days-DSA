package EasyLevel;

public class Average {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,1,14};
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        double Average = sum/arr.length;
        System.out.println("The average of elements in an Array is: "+ Average);
    }
}
