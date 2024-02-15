import java.util.*;
public class trapingwater{
    public static int trappingWater(int heights[]){
        //calculate left max boundary - array
        int n = heights.length;
        int leftMax[] = new int[n];
        leftMax[0] = heights[0]; // first bar height equal to its own length
        for(int i= 1; i<n; i++){
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }
        
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];// last bar height will be same as the height of the first bar
        for(int i=n-2; i>=0; i--){
            rightMax[i]= Math.max(heights[i], rightMax[i+1]);
        }
        int TrappedWater = 0;
        for(int i=0; i<n; i++){
            int WaterLevel = Math.min(leftMax[i],rightMax[i]);
            TrappedWater += WaterLevel - heights[i];

        
        }
        return TrappedWater;
    }
    public static void main(String args[]){
        int heights[]= {4,2,0,6,3,2,5};
        System.out.println(trappingWater(heights));
    }
}