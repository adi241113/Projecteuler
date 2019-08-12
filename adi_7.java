class adi_7 
{
    public static void main()
	{
	    int x=3,count=2,y=0,f=0;
	    double k=0;
	    while(count<=10001)
	    {
	        k=Math.sqrt(x);
	        for(y=3;y<=x;y=y+2)
	        {
	            if(x%y==0)
	            {
	               f=1;
	               break;
	            }
                }
                x=x+2;
                if(f==0)
                count++;
                f=0;
                }
            System.out.println("The 10001st prime number ="+(x-2));
        }
}
