class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n=nums.length;
        int res=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum=sum+nums[j];
                if(k==sum)
                    res++;
            
               
            }
            sum=0;
            
        }
        return res;
        
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
            
        }
        int k=s.nextInt();
        Solution obj=new Solution();
        int re=obj.subarraySum(nums,k);
        System.out.println(re);
    }
}
