
package javaexample48shortpathnewversion;

import java.util.Arrays;


public class JavaExample48ShortPathNewVersion {

    // memory-complexity
    // ----------------------
    // calculate shortest path from start station to end station through a between-station
    // instead of using a temporal array for summing all the distances
    // i use one cell to calculate the min distance. Then, the method returns the index of the best-between-station
    public static void main(String[] args) {
        
        int[] distancesFromStarStation2BetweenStations= new int[] 
        {10, 11,15,5,27,8,3,19,17};
        
        int[] distancesFromBetweenStations2EndStation= new int[] 
        {27, 5, 8, 11,2, 33, 12, 16, 1};
        
        int bestBetweenStation=MinPathIndex(distancesFromStarStation2BetweenStations, distancesFromBetweenStations2EndStation);
        
        System.out.println("First distances is.: "+Arrays.toString(distancesFromStarStation2BetweenStations));
        System.out.println("second distances is: "+Arrays.toString(distancesFromBetweenStations2EndStation));
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("The best between-station is: " + bestBetweenStation);
    }
     private static int MinPathIndex(int[] distncesStart2Between , int[] distncesBetween2End)
     {
         try 
         {
             if(distncesBetween2End==null || distncesStart2Between ==null
                 || distncesStart2Between.length!=distncesBetween2End.length)
             throw new IllegalArgumentException();
             
             int tempMin=distncesStart2Between[0]+distncesBetween2End[0];
             int minIndex=0;
             for (int i = 1; i < distncesBetween2End.length; i++) {
                 if(tempMin>distncesStart2Between[i]+distncesBetween2End[i])
                 {
                     tempMin=distncesStart2Between[i]+distncesBetween2End[i];
                     minIndex=i;
                 }
             }// end for
             return minIndex;
         }// end try
         catch(Exception e)
         {
             System.out.println(e.toString());
             return -1;
         }
     }
}
