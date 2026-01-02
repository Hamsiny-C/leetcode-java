class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int cup=n;
        while(n!=0){
            product*=n%10;
            n/=10;
        }
        while(cup!=0){
              sum+=cup%10;
              cup/=10;
        }
        return product-sum;
    }
}