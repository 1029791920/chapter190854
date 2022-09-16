package com.junbotan.javase.array;

import java.util.Objects;

/**
 * @author Tan
 * @date 2022年03月31日 16:32
 */
public class Room {
    private int no;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no &&
                status == room.status &&
                Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, type, status);
    }

    @Override
    public String toString() {
        return "["+ no +"，"+ type+"，"+(status ? "空闲" : "占用")+"]";
    }

    //测试程序
    public static void main(String[] args) {
        Room rm1 = new Room(101, "总统", false);
        Room rm2 = new Room(101, "总统", false);
        System.out.println(rm1.equals(rm2));
    }
}
