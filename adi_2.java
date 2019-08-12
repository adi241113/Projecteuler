class adi_2
{
    public static void main()
    {
        int s=0;
        int a=1;
        int b=2;
        while(a<4000000)
        {
            if(a%2==0)
            {
                s+=a;
            }
            b=a+b;
            a=b-a;
        }
        System.out.print("the sum of the even-valued terms="+s);
    }
}
