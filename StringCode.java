import java.util.*;
public class StringCode{
    public static void main(String args[]) {
        int a=108;
        int b=a;
        int n=0,count=0;
        while(a>0)
        {
            ++n;
            a=a/10;
        }
        System.out.println("n:"+n);
        int ar[]=new int[n];
        int k=0;
        while(b>0)
        {
            ar[k]=b%10;
            b=b/10;
            k++;
        }
        System.out.println("k:"+k);
        for(int i=0;i<k;i++)
        {
            System.out.print(ar[i]+" ");
        }
        Arrays.sort(ar);
        int ba[]=new int[k];
        int j=1,m=0;
        for(int i=0;i<k;i++)
        {
            if(j<k){
            if(ar[i]==ar[j])
            {
                ar[m]=0;
                m++;
                //continue;
            }
            }
            j++;
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=0)
            {
                ++count;
            }
        } 
        System.out.println();
        System.out.println(count);
    }
}