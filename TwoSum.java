import java.util.HashMap;
import java.util.Map;

public class TwoSum {

      public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> count = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            int needed = target - nums[i];

            if(count.containsKey(needed)){

                return new int[]{count.get(needed),i};
               
            }
            count.put(nums[i],i);
           
        }

        return new int[]{};
    }

    public static void main(String[] args) {

     TwoSum n = new TwoSum(); 
     
     int[] srr = {1,2,4,5,6,7,8};
     int target = 6;
     int[] arr =   n.twoSum(srr, target);

     System.out.println(arr[0]+","+arr[1]);
 

    }
}
