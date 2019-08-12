class adi_6
{
    public static void main()
    {
        int sum1=0;int sum2=0,x=0,y=0;
        for(x=1;x<=100;x++)
        {
            sum1=sum1+(x*x);
        }
        for (y=1;y<=100;y++)
        {
            sum2=sum2+y;
        }
        System.out.println("Difference between the sum of the squares of the first 10 natural numbers and the square of the sum is "+((sum2*sum2)-sum1));
    }
}
