class Greater{
    public int findGreater(int x,int y)
    {
        if (x>y)
        {
            return x;
        }
        return y;
    }
    public int findGreater(int x,int y,int z)
    {
        if (x>y&&x>z)
        {
            return x;
        }
        else if (y>z)
        {
            return y;
        }
        else
        {
            return z;
        }
        }
    }
    class  findgreater_over
    {
        public static void main(String[]args)
        {
            Greater g = new Greater();
            System.out.println("Greater of two number is "+g.findGreater(5,3));
            
            System.out.println("Greater of three number is "+g.findGreater(5,3,7));

        }
    }
    