class Cube
{
    int l;
    int w;
    int h;

    Cube()
    {
        l=10;
        w=12;
        h=13;
    }
     Cube(int le,int wi,int he)
    {
        l=le;
        w=wi;
        h=he;
    }
     Cube(Cube c)
    {
        l=c.l;
        w=c.w;
        h=c.h;
    }
    void displayVolume()
    {
        int v=l*h*w;
        System.out.println("Length="+l);
        System.out.println("Width="+w);
        System.out.println("Height="+h);
        System.out.println("Volume="+v);
    }
}

public class Main{
  public static void main (String[]args)
   {
      Cube c1=new Cube();
      Cube c2=new Cube(6,4,3);
      Cube c3=new Cube(c1);
      System.out.println("Cube 1:");
      c1.displayVolume();

      System.out.println("Cube 2:");
      c2.displayVolume();

      System.out.println("Cube 3:");
      c3.displayVolume();


   }
}
