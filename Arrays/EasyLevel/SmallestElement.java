package EasyLevel;
public class SmallestElement{
    public static void main(String[] args){
        int[] array={10,20,60,3,5};
        int SmallestElement= array[0];
        for(int i=1; i<array.length;i++){
            if(SmallestElement> array[i]){
                SmallestElement=array[i];
            }
        }
        System.out.println("The Smallest element is:" + SmallestElement);
    }
}