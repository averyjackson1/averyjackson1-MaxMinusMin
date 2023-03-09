
import java.util.List;


public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
     
        
        for (Integer a : nums){
            if (max > a){
                max = a;
            }
        }
        for(Integer b : nums){
            if(min < b){
                min = b;

        }
    
    }
      return min - max;
}

}
