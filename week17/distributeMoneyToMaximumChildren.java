package week17;

public class distributeMoneyToMaximumChildren {
    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        
        money -= children;
        
        if (money < 7) {
            return 0;
        }
        
        int maxEightDollars = Math.min(money / 7, children);
        
        int remainingMoney = money - (maxEightDollars * 7);
        int remainingChildren = children - maxEightDollars;
        
        
        if (remainingMoney > 0 && remainingChildren == 0) {
            maxEightDollars--;
        }
        
        if (remainingChildren == 1 && remainingMoney == 3) {
            maxEightDollars--;
        }
        
        return maxEightDollars;
    }
}
