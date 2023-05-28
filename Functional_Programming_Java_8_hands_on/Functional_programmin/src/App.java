import java.io.*;

/*
 * Given the arrival and departure times of all trains that reach a railway station, the task          
 * is to find the minimum number of platforms required for the railway station so that no train waits.
 * 
 * We are given two arrays that represent the arrival and departure times of trains that stop.
 * 
 * Examples: 
 * 
 * Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
 * dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
 * Output: 3
 * Explanation: There are at-most three trains at a time (time between 9:40 to 12:00)
 * 
 * Input: arr[] = {9:00, 9:40} 
 * dep[] = {9:10, 12:00}
 * Output: 1 
 * Explanation: Only one platform is needed. 
 * 
 */

import java.util.*;
public class App {
	
	public static int findPlatform(int arr[], int dep[]) {
     int ans=1;
     int pt=1;
     Arrays.sort(arr);
     Arrays.sort(dep);
     int i=1,j=0;
     while(i<arr.length && j<dep.length){
         if(arr[i]<=dep[j]){
             pt++;
             i++;
         }else if(arr[i]>dep[j]){
           pt--;
           j++;
         }
    ans=Math.max(ans,pt);
     }
     System.out.println(ans);
     return ans;
	}
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        
        int arr1[] = {900, 940};
        int dep1[] = {910, 1200}; 

        if (findPlatform(arr, dep) == 3 && findPlatform(arr1, dep1) == 1)
            System.out.println("All Tests Pass");
          else
            System.out.println("There are test failures");
        
        }
    

}
