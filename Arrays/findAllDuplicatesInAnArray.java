package DSAsheetByArsh;
import java.util.*;
public class findAllDuplicatesInAnArray {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> list = new ArrayList<>();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i< nums.length ; i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i], 1);
                }
            }
            for(Map.Entry<Integer, Integer> e: map.entrySet()){
                if(e.getValue() > 1){
                    list.add(e.getKey());
                }
            }
            return list;
        }
    }