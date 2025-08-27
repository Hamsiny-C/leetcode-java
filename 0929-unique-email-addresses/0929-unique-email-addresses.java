class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet();
        for(String email:emails)
        {
            int atpos=email.indexOf("@");
            String local=email.substring(0,atpos);
            String domain=email.substring(atpos);
            local=local.replaceAll("\\.","");
            if(local.contains("+")){
                int pluspos=local.indexOf("+");
                local=local.substring(0,pluspos);
            }
            String newmail=local+domain;
            set.add(newmail);
        }
        return set.size();
        }
}