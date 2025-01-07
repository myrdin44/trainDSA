package week15;

public class calculateAmountPaidInTaxes {
    public double calculateTax(int[][] brackets, int income) {
        if (income == 0) return 0.0;
        
        double totalTax = 0.0;
        int prevBracket = 0;
        
        for (int i = 0; i < brackets.length; i++) {
            int upper = brackets[i][0];
            int percent = brackets[i][1];
            
            // Calculate taxable amount in current bracket
            int taxableInThisBracket = Math.min(income, upper) - prevBracket;
            if (taxableInThisBracket <= 0) break;
            
            // Calculate tax for current bracket
            totalTax += (taxableInThisBracket * percent) / 100.0;
            
            // If we've processed all income, break
            if (income <= upper) break;
            
            prevBracket = upper;
        }
        
        return totalTax;
    }
}
