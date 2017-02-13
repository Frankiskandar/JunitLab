/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author tug37915
 */
public class TestJunit {
    Date d1 = new Date(2017, 1, 1);
    Date d2 = new Date(2017, 1, 20);
    Date d3 = new Date(2017, 10, 1);
    Date d4 = new Date(2016, 1 , 1);
    Date d5 = new Date(2016, 5 , 5);
    
    
    
   @Test
   //success
   public void testPrintMessage() {
      assertEquals(19, d1.daysTo(d2));
      assertEquals(270, d1.daysTo(d3));     
   }
   
   @Test
   //failure 1
   public void testPrintMessage2() {
      assertEquals(360, d1.daysTo(d4));
     
   }
   
   @Test
   //failure 2
   public void testPrintMessage3() {
      assertEquals(230, d1.daysTo(d5));
      
   }
    
}
