import java.util.List;
public class Task10 {
        public static void main(final String[] args) throws Exception {

            final House house= new House(List.of(
                    new Room(TypeRoom.child_room, 1,2,2,"white",  50)),
                    List.of(
                            new Porch(1,1,5,12,9,
                            "white",TypePorch.Summer_Porch )),"Levitskogo",2);

            System.out.println(house);
            System.out.println(house.getRooms().get(0).hashCode() );
            house.getPorch().get(0).buildrchway();
            System.out.println("Result" + house);
        }
}
