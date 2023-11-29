package com.training.org;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase1 {

   String message = "Vipul";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }	
}