package Testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testng.Listeners.class)
public class Listnr
{
  @Test
  public void runn()
  {
	  System.out.println("working");
  }
}

