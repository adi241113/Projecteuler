class adi_3
{
    public static void main()
    {
        long n=600851475143L;
        int x=2;
        for(;x<=n;x++)
        {
            while(n%x==0)
            {
                n/=x;
            }
        }
        System.out.println("largest prime factor="+(x-1));
    }
}
