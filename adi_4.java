class adi_4
{
    public static void main ()
    {
        int product=0,x=0,y=0,digit=0,reverse=0,maxi=0,store;
        for(x=100;x<=999;x++)
        {
            for(y=100;y<=999;y++)
            {
                product=x*y;
                store=product;
                while(product!=0)
                {
                    digit=product%10;
                    reverse=reverse*10+digit;
                    product=product/10;
                }
                if(store==reverse)
                {
                    if(store>maxi)
                {
                    maxi=store;
                }
            }
            reverse=0;
        }
    }
        System.out.print("largest palindrome product="+maxi);
    }
}
    
