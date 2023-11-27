public class Room {
    private String roomtype;
    private String direction;
    private int windowsNo;

public Room(String roomtype, String direction, int windowsNo){
    this.roomtype = roomtype;
    this.direction = direction;
    this.windowsNo = windowsNo;
}
public String getRoomtype(){
    return roomtype;
}

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getWindowsNo() {
        return windowsNo;
    }

    public void setWindowsNo(int windowsNo) {
        this.windowsNo = windowsNo;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomtype='" + roomtype + '\'' +
                ", direction='" + direction + '\'' +
                ", windowsNo=" + windowsNo +
                '}';
    }
    public void displayDetails(){
        System.out.println("Room type" + roomtype);
        System.out.println("the Direction" + direction);
        System.out.println("the Room have window" + windowsNo);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
}

