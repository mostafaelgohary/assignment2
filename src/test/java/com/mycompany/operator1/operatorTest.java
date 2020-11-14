/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operator1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author seifhesham
 */
public class operatorTest {
    
    public operatorTest() {
    }
    
    public void testdivide(){
        System.out.println("divide");
        int a=2;
        int b=3;
        operator instance =new operator();
        int result=instance.divide(a, b);
        assertEquals(2/3,result);
    }
    public void testmultiply(){
        System.out.println("multiply");
        int a=4;
        int b=3;
        operator instance =new operator();
        int result=instance.multiply(a, b);
        assertEquals(12,result);
    }
    /**
     * Test of main method, of class operator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        operator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
