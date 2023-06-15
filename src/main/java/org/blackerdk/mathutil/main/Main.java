/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.blackerdk.mathutil.main;

import org.blackerdk.mathutil.core.MathUtility;

/**
 *
 * @author DUY KHANH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Chuẩn bị bộ test case :
        //Test  case 1 : n = 0
        System.out.println("Check getF(0) | 0! | expected: 1 | actual : " + MathUtility.getFactorial(0));
        //Test case 2 : n = 1
        System.out.println("Check getF(1) | 1! | expected: 1 | actual : " + MathUtility.getFactorial(1));
        //Test case  3 : n = 2 
        System.out.println("Check getF(2) | 2! | expected: 2 | actual : " + MathUtility.getFactorial(2));
        //Test case 4 : n = 3
        System.out.println("Check getF(3) | 3! | expected: 6 | actual : " + MathUtility.getFactorial(3));
        //Test case 5 : n = 5
        System.out.println("Check getF(5) | 5! | expected: 120 | actual : " + MathUtility.getFactorial(5));
        //Test case 6 : n < 0
        System.out.println("Check getF(-1) | -1! | expected: EXCEPTIONS | actual : ");
        MathUtility.getFactorial(-1); // Vì ngoại lệ sẽ ngắt lệnh println();
                                      //in trước rồi ms hiển thị ngoại lệ
    }
    //test case 1  : check if getF app returns well with n =0;
    //Step/Procedures : Các bước tiếng hành
    //GIVEN N=0
    //EXCUTE : getF(n=0)
    //Expected Value : Hàm hy vọng trả về mấy
    //getF(0) 0! must return 1;
    //test case 2  : check if getF app returns well with n =1;
    //Step/Procedures : Các bước tiếng hành
    //GIVEN N=1
    //EXCUTE : getF(n=1)
    //Expected Value : Hàm hy vọng trả về mấy
    //getF(1) 1! must return 1;
    //ÂM GIAI THỪA VÀ LỚN 21 THÌ NÉN RA NGOẠI LỆ
    //TDD : TEST DRIVEN DEVELOPMENT : viết code và làm app theo theo style
    //code và test song hành vs nhau
    //code liên tục dk test
    //Nghĩ bộ test ngay khi code
    //ĐẶC TRƯNG : XANH XANH ĐỎ ĐỎ

}
