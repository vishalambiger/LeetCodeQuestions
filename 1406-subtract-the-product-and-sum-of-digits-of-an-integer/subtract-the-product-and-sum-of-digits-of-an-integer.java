class Solution {
    public int subtractProductAndSum(int n) {
         int sum =0;
            int product =1;
        for(int i=0;n>0;i++){
            
            int x=n%10;
            n=n/10;

            sum =sum+x;
            product=product*x;
            
        }
        int result=product-sum;

          return result;  
    }
     

}