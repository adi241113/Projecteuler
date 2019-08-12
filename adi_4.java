class adi_4
{
    public static void main()
    {
        int SUM1=0;int SUM2=0,X=0,Y=0;
        for(X=1;X<=100;X++)
        {
            SUM1=SUM1+(X*X);
        }
        for (Y=1;Y<=100;Y++)
        {
            SUM2=SUM2+Y;
        }
        System.out.print("The difference between the sum of the squares of the first 10 natural numbers and the square of the sum="+((SUM2*SUM2)-SUM1));
    }
}
