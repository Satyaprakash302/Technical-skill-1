/*Q.You are given an array . you have to find second largest element value */
public class max{
    public static void main (String []args){
        int [] arr={10,60,50,80,20,90};
        int largest=0;
        int second_largest=0;
        for(int i=0;i<arr.length;i++){
           if (arr[i]>largest){
            second_largest=largest;
            largest=arr[i];
           }else if(arr[i]> second_largest && arr[i]!=largest);
           second_largest=arr[i];
        }
        System.out.print(second_largest);
    }
}