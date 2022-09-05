import java.util.List;
public class Task10 {
        public static void main(final String[] args) throws Exception {

            final House house= new House(List.of(
                    new Room(TypeRoom.child_room, 1,2,2,"white",  50)),
                    List.of(
                            new Porch(11,30,12,"white",TypePorch.Summer_Porch )),"Levunskogo",2);

            System.out.println(house);
            System.out.println(house.getRooms().get(0).hashCode() );
            house.getPorch().get(0).buildArchway();
            System.out.println("Result" + house);
        }
}
