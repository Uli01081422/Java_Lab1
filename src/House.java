import java.util.List;
import java.util.Objects;

public class House {
    private List<Room> rooms;
    private List<Porch> porch;
    private String address;
    private int lodge;

    public House(final List<Room> rooms, final List<Porch> porch, final String address, final int lodge) {
        this.rooms = rooms;
        this.porch = porch;
        this.address = address;
    }

    public List<Porch> getPorch() {
        return porch;
    }

    public void setPorch(final List<Porch> porch) {
        this.porch = porch;
    }

    public int getLodge() {
        return lodge;
    }

    public void setLodge(final int lodge) {
        this.lodge = lodge;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;
        return lodge == house.lodge && Objects.equals(rooms, house.rooms) && Objects.equals(porch, house.porch) && Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, porch, address, lodge);
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", porch=" + porch +
                ", address='" + address + '\'' +
                ", lodge=" + lodge +
                '}';
    }

}
