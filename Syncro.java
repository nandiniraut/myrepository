class First
{
  public void display(String message)
  {
    System.out.print ("I"+message);
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println ("Love");
  }
}

class Second extends Thread
{
  String message;
  First fobj;
  Second (First fp,String stringg)
  {
    fobj = fp;
    message = stringg;
    start();
  }
  public void run()
  {
    fobj.display(message);
  }
}

public class Syncro
{
  public static void main (String[] args)
  {
    First newfun = new First();
    Second ss = new Second(newfun, "I");
    Second ss1= new Second(newfun,"Love");
    Second ss2 = new Second(newfun, "UPES");
  }
}
