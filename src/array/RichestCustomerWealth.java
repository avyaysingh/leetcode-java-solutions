package array;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0 ; i < accounts.length; i++){
            int currMaxWealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                currMaxWealth += accounts[i][j];
            }
            if(currMaxWealth > maxWealth){
                maxWealth = currMaxWealth;
            }
        }
        return maxWealth;
    }
}
