package array;

import java.util.List;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            int j = 0;
            if (ruleKey.equals("color")) {
                j = 1;
            } else if (ruleKey.equals("name")) {
                j = 2;
            }
            if (items.get(i).get(j).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
