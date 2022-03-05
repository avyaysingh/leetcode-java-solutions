package array;

import java.util.ArrayList;
import java.util.List;

public class KidWithGreatesNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int cand: candies){
            if(cand > max){
                max = cand;
            }
        }
        for(int cand: candies){
            if(cand + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
