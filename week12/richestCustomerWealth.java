package week12;

public class richestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for (int[] customerAccounts : accounts) {
            int currentWealth = 0;
            for (int account : customerAccounts) {
                currentWealth += account;
            }
            
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        
        return maxWealth;
    }
}
