/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.blackerdk.mathutil.core;

/**
 *
 * @author DUY KHANH
 */
public class MathUtility {

    // hàm tính  n!=1,2,3...n
    // 0! 1! = 1
    //Ko có giai thừa âm
    //21 giai thừa trong long(18 con số 0) ko chứa nỗi-gài ràng buộc đầu vào
    //Ko nhận lớn hơn 21
    public static double PI=3.1415;
    public static long getFactorial(int n) {
        long products =1; // tích ban đầu bằng 1
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invaild n , "
                    + "n must be 0 ... 20 , plaese!!");//Ngoại lệ nhập
        }
        if (n==0 | n==1) {
            return 1;
        }for (int i = 2; i <=n; i++) {
            products*=i;
        }
        return products;
    } // return sớm để ko báo lỗi
    
}
