/*Q.Given an array of integer A. Find and return product array of the same size where the i
th element of the product element will be equal to the product of the all element divided by 
the i th element if the array .*/

/*Q Given an array element checked if they exist a pair(i,j) such that array [i] + array [j] is ==k
and i is not equal to j note i and j are the indexes and k is the given sum*/

// public class Check{
//     public static void main(String args[]){
//        int [] arr={3,-2,1,4,3,6,8};
//        int k=10;
//        for (int i=0;i<arr.length;i++){
//         for(int j =1;j<arr.length;j++){
//             if (arr[i]+arr[j]==k && arr[i]!=arr[j]);
//              System.out.println("yes");
//         }
//         }
//        }
//     }

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