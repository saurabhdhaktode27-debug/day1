class Avgnm
{
    public int findAvg(int x,int y,int z)
    {
        return (x+y+z)/3;
    }

public float findAvg (float x,float y,float z)
{
    return (x+y+z)/3;
}
}
class Avgnum_over
{
    public static void main(String[]args)
    {
        Avgnm a=new Avgnm();
        System.out.println("Average of three integer number is "+a.findAvg(5,3,7));
        System.out.println("Average of three float number is "+a.findAvg(5.5f,3.5f,7.5f));
    }
}