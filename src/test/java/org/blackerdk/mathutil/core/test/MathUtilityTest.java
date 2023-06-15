/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.blackerdk.mathutil.core.test;

import static org.blackerdk.mathutil.core.MathUtility.getFactorial;
//import static org.blackerdk.mathutil.core.MathUtility.*; 
//Tất cả hàm static ko cần gọi import
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author DUY KHANH
 */
public class MathUtilityTest {
    
@Test
public void testFactorialGivenRightsArgumentReturnWell(){
    assertEquals(1,getFactorial(0));
    assertEquals(1,getFactorial(1));
    assertEquals(2,getFactorial(2));
    assertEquals(6,getFactorial(3));
    assertEquals(24,getFactorial(4));
    assertEquals(120,getFactorial(5));    
}
@Test 
//TEST ngoại lệ 
public void testFactorialGivenWrongsArgumentReturnException() {
    //assertThrows(expectedType,        executable),);
    //Bạn hãy đưa ngoại lệ cần bắt / đoạn code gây ra ngoại lệ,
    //                              đoạn code ngoại lệ
//    Executable ex = new Executable() {
//        @Override
//        public void execute() throws Throwable {
//            getFactorial(-5);
//        }
//    };
//    Executable exLambda = () -> getFactorial(-5);
//    assertThrows(IllegalArgumentException.class, exLambda);
    //Kĩ thuật đưa 1 đoạn code vào hàm
    assertThrows(IllegalArgumentException.class,()-> getFactorial(-5));
    
    
}
}
