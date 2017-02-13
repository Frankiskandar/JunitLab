/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author tug37915
 */
public class JunitLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
     //invoke junit
    Result result = JUnitCore.runClasses(junitlab.TestJunit.class);
		
    for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
    }
    }
}
