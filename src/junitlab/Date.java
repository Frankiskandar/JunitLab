/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab;

/**
 *
 * @author tug37915
 */
public class Date {
    
    private int day, month, year;
    
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int daysTo(Date date) {
        Date d2 = new Date(year,month,day);
        int daybetween, monthbetween, yearbetween, daytotal =0;
        
        yearbetween = (date.year - d2.year) * 365;
        daytotal += yearbetween;
        monthbetween = (date.month - d2.month)*30;
        daytotal += monthbetween;
        daybetween = (date.day - d2.day);
        daytotal += daybetween;
        return Math.abs(daytotal);
  
    }
    
}
