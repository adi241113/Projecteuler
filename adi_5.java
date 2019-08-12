class adi_5
{
    public static void main ()
    {
        int f=0,num=21,x;
        while (f!=1)
        {
            
            for(x=1;x<=20;x++)
            {
                if(num%x!=0)
                {
                    f=1;
                    break;
                }
                
            }
            if(f==0)
            {
                System.out.println("Smallest multiple ="+num);
                break;
            }
            num++;
            f=0;
        }
    }
}
    
