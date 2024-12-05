package week10;

import java.util.HashSet;
import java.util.Set;

public class uniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0];
            String domainName = parts[1];
            
            int plusIndex = localName.indexOf('+');
            if (plusIndex != -1) {
                localName = localName.substring(0, plusIndex);
            }
            localName = localName.replace(".", "");
            
            String normalizedEmail = localName + "@" + domainName;
            
            uniqueEmails.add(normalizedEmail);
        }
        
        return uniqueEmails.size(); 
    }
}
