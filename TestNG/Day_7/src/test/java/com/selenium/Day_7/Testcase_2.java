package com.selenium.Day_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase_2 {
  @Test
  public void f() {
 int a =10 ;int b=70;
	  
	  int c= a+b;
	  Assert.assertEquals(c, 80);
	  
  }
  @Test
  public void subtract() {
	  int a =30 ;int b=10;
	  
	  int c= a-b;
	  Assert.assertEquals(c, 20);
	  
  }
  @Test
  public void multiply() {
	  int a =20 ;int b=50;
	  
	  int c= a*b;
	  Assert.assertEquals(c, 1000);
	  }
  @Test
  public void divide() {
	  int a =50;int b=10;
	  int c=a/b;
	  Assert.assertEquals(c, 5);
  }
}
