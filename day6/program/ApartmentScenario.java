import java.util.ArrayList;

public class ApartmentScenario {

    public static void main(String[] args) {
        var RoomList1 = new ArrayList<Area>();
        RoomList1.add(new Area(false, 1, "bedroom"));
        RoomList1.add(new Area(false, 1, "kitchen"));
        RoomList1.add(new Area(true, 1, "bathroom (washroom)"));
        RoomList1.add(new Area(false, 1, "hall"));
        RoomList1.add(new Area(false, 1, "kitchen"));
        RoomList1.add(new Area(true, 1, "playground for all apartments"));
        RoomList1.add(new Area(false, 1, "dining hall"));

        IO.print("First Apartment: ");
        var apt1 = new Apartment(RoomList1);
        IO.print("\n\n");

        var RoomList2 = new ArrayList<Area>();
        RoomList2.add(new Area(false, 2, "bedroom with attached washroom"));
        RoomList2.add(new Area(true, 1, "hall for both bedrooms"));
        RoomList2.add(new Area(false, 1, "kitchen"));
        RoomList2.add(new Area(true, 1, "dining hall"));
        RoomList2.add(new Area(true, 1, "playground"));

        IO.print("Second Apartment: ");
        var apt2 = new Apartment(RoomList2);
        IO.print("\n\n");

        var RoomList3 = new ArrayList<Area>();
        RoomList3.add(new Area(false, 4, "bedroom attached with washroom"));
        RoomList3.add(new Area(false, 2, "hall (one for every two bedrooms)"));
        RoomList3.add(new Area(false, 1, "kitchen"));
        RoomList3.add(new Area(false, 1, "dining"));
        RoomList3.add(new Area(true, 1, "playground"));

        IO.print("Third Apartment: ");
        var apt3 = new Apartment(RoomList3);
    }
}

class Apartment {

    ArrayList<Area> rooms;

    public Apartment(ArrayList<Area> rooms) {
        this.rooms = rooms;
        IO.print("This apartment has ");

        for (int i = 0; i < rooms.size(); i++) {
            Area room = rooms.get(i);
            String label = room.isPublic ? "public " : "";
            IO.print(room.count + " " + label + room.name);

            if (i < rooms.size() - 1) {
                IO.print(", ");
            }
        }
    }
}

class Area {

    boolean isPublic;
    int count;
    String name;

    public Area(boolean isPublic, int count, String name) {
        this.isPublic = isPublic;
        this.count = count;
        this.name = name;
    }
}
