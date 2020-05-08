import java.util.Scanner;
public class FindMinValueofArray{

     public static void main(String []args){
      
    Scanner s = new Scanner(System.in);
    int length = s.nextInt();
    int [] arr = new int[length];
    for(int i=0; i<length; i++ ) {
         arr[i] = s.nextInt();
      }

     int n = arr.length; 
     System.out.print(findMinValue(arr, n)); 
    } 

    static int findMinValue(int arr[], int n) 
    { 
       
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += arr[i]; 
  
       
        return ((sum / n) + 1); 
    } 
  
     
       
} 
