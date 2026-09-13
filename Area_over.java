class Area
{
    public void  Area(int l,int b )
    {
        int ans =l*b;
        System.out.println("Area of rectangle: " + ans);
    }
    public void Area(float r)
    {
        float ans =3.14f*r*r;
        System.out.println("Area of circle: " + ans);
    }
    public void Area(int l)
    {
        int ans =l*l;
        System.out.println("Area of square: " + ans);
    }
}
public class Area_over
{
    public static void main(String[]args)
    {
        Area a=new Area();
        a.Area(5,3);
        a.Area(5.5f);
        a.Area(5);
    }
}