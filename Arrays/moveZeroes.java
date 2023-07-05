package DSAsheetByArsh;
import java.util.*;
public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int balls = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                balls++;
            }
            else{
                int num = nums[i];
                nums[i] = 0;

                nums[i-balls] = num;
            }
        }
    }
}
