/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author HP
 */
//CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI ĐÓ LÀ LÚC TA K CẦN NHỚ CÁI GÌ CHO RIÊNG TA => HÀM STATIC
public class MathUtil {

    //n! = 1.2.3....n
    //0! = 1! = 1
    //k tính giai thừa cho số âm
    //20! là vừa khớp kiểu long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20.");
        }
        //Hàm dừng liền éo cần return

        if (n == 0 || n == 1) 
            return 1; //dừng ngay khi n đặc biệt
        
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
