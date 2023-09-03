class Solution {
    public String defangIPaddr(String address) {
        String defang = address.replaceAll("\\." , "[.]");
        return defang;

    // The replaceAll method in Java uses regular expressions to perform replacements, and the period (".") 
      is a special character in regular expressions that matches any character. To match a literal period, you
      need to escape it using double backslashes ("\.").//
 
    }
}

