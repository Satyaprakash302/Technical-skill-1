/*Q Given an array element checked if they exist a pair(i,j) such that array [i] + array [j] is ==k
and i is not equal to j note i and j are the indexes and k is the given sum*/

public class Check{
    public static void main(String args[]){
       int [] arr={3,-2,1,4,3,6,8};
       int k=10;
       for (int i=0;i<arr.length;i++){
        for(int j =1;j<arr.length;j++){
            if (arr[i]+arr[j]==k && arr[i]!=arr[j]);
             System.out.println("yes");
        }
        }
       }
    }

