package com.junbotan.javase.array;

/**
 * @author Tan
 * @date 2022年03月31日 16:28
 */

/*
第二题：
    为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
    1、该系统的用户是：酒店前台。
    2、酒店使用一个二维数组来模拟。"Room【】【】rooms;"
    3、酒店中的每一个房间应该是一个java对象：Room
    4、每一个房间Roo应该有：房间编号、房间类型、房间是否空闲。
    5、系统应该对外提供的功能：
    可以预定房间：用户输入房间编号，订房。
    可以退房：用户输入房间编号，退房。
    可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
*/
public class HotelMgtSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();


        hotel.orderRoom(202);
        hotel.orderRoom(101);
        hotel.orderRoom(301);
        hotel.print();
        System.out.println();

        hotel.checkOut(101);
        hotel.print();
    }
}
