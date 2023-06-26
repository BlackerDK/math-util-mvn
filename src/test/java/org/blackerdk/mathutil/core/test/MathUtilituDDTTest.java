/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.blackerdk.mathutil.core.test;

import org.blackerdk.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DUY KHANH
 */
public class MathUtilituDDTTest {
    //Kĩ thuật DDT test :DATA DRIVEN TESTING : tách data kiểm thử ra assert()
    //Cho dễ theo dõi , dễ bảo trì
    //TEST CASE : BỘ DATA TEST
    //THƯỜNG DÙNG MÃNG 2 CHIỀU CHỨA BỘ DATA TEST
    //MÃNG GỒM INPUT / EXCEPTED
    //UNIT TEST FRAMEWORK TỰ DỘNG TÁCH BIỆT TỪNG CẶP
    //INPUT/EXPECTED Ở TRONG MÃNG RA NHỒI VÀO HÀM SO SÁNH
    //MÃNG DỮ LIỆU TEST CASE PHẢI NẰM TRONG PUBLIC STATIC
    
    public static Object[][] initTestData(){
        Integer testData[][]={{0,1},
                              {1,1},
                              {2,2},
                              {4,24},
                              {5,1200}};
                              //n expected
                              //c0 ,c1
                              //tách data kiểm thử ra assert(c0-getF,c1-expected)
        return  testData;        
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactoryGivenRightArgumentReturnWell(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
    }
}
