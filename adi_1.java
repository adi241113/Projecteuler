class adi_1
{
    public static void main()
    {
        int s=0,x=0;
        for(x=0;x<1000;x++)
        {
            if(x%3==0||x%5==0)
            {
                s=s+x;
            }
        }
        System.out.println("summation of all multiples="+s);
    }
}
