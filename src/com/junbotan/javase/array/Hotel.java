package com.junbotan.javase.array;

/**
 * @author Tan
 * @date 2022年03月31日 16:46
 */


/**
 *二维数组，模拟大厦房间。
 * @author Tan
 * @date 2022/3/31 17:59
 */
public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        //动态初始化构建大厦
        rooms = new Room[3][5];
        
        //构建每一层及每一个房间
        //第一层循环构建层
        for (int i = 0; i < rooms.length; i++) {
            //第二层循环构建每一个房间
            for (int j = 0; j < rooms[i].length; j++) {
                if(i == 0){//第一层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"单人间",true);
                }else if (i == 1){//第二层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"双人间",true);
                }else{//第三层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"特价房",true);
                }
                
            }
            
        }
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public void print(){
        for (int i = 0; i < rooms.length; i++) {//每层
            for (int j = 0; j < rooms[i].length; j++) {//每间
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }

    /*
     *订房
     * @author Tan
     * @date 2022/3/31 18:19
     * @param roomNo 房间号
     */
    public void orderRoom(int roomNo){
        //根据房间编号，演算成下标。将房间状态更改
        rooms[roomNo / 100 -1][roomNo % 100 - 1].setStatus(false);

    }

    /*
     *退房
     * @author Tan
     * @date 2022/3/31 19:23
     * @param roomNO 房间号
     */
    public void checkOut(int roomNO){
        rooms[roomNO / 100 -1][roomNO % 100 -1].setStatus(true);
    }
}
