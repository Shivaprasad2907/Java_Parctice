package controlStatements;

public class MaximumProfitCode {
	static void proposeAds(int breaktime,String duration[],String charge[])
    {
     int n = duration.length;
     breaktime = breaktime*60;
     int w[] = new int[duration.length];
     
     for(int i=0;i<duration.length;i++)
        {
            w[i]=(int)Integer.parseInt(duration[i]);
        }
        int v[]=new int[charge.length];
        for(int i=0;i<charge.length;i++)
        {
            v[i]=Integer.parseInt(charge[i]);
        }
        int k = breaktime;
        
        int dp[][]=new int[n+1][k+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=k;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(j>=w[i-1])
                {
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-w[i-1]]+v[i-1]);
                }
            }
        }
        System.out.println("Profit: $"+dp[n][k]);
        int i=n,j=k;
        while(i!=0)
        {
            if(dp[i][j]==dp[i-1][j])
            {
                i--;
            }
            else
            {
                System.out.println("Advertisement "+i+" with duration "+w[i-1]+" seconds and charge $"+v[i-1]);
                j=j-w[i-1];
                i--;
            }
        }
    }

}
