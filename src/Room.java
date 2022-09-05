import java.util.Objects;

public class Room {
    private TypeRoom typeRoom;
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfRadiators;
    private String color;
    private double size;

    public Room(final TypeRoom typeRoom, final int numberOfDoors, final int numberOfWindows, final int numberOfradiators, final String color, final double size) {
        this.typeRoom = typeRoom;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfRadiators = numberOfradiators;
        this.color = color;
        this.size = size;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(final int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(final int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfRadiators() {
        return numberOfRadiators;
    }

    public void setNumberOfRadiators(final int numberOfRadiators) {
        this.numberOfRadiators = numberOfRadiators;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(final double size) {
        this.size = size;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return numberOfDoors == room.numberOfDoors && numberOfWindows == room.numberOfWindows && numberOfRadiators == room.numberOfRadiators && Double.compare(room.size, size) == 0 && typeRoom == room.typeRoom && Objects.equals(color, room.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeRoom, numberOfDoors, numberOfWindows, numberOfRadiators, color, size);
    }

    @Override
    public String toString() {
        return "Room{" +
                "typeRoom=" + typeRoom +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfWindows=" + numberOfWindows +
                ", numberOfRadiators=" + numberOfRadiators +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public void installationWindow() {
        numberOfWindows++;
    }

    public void installationDoor() {
        numberOfDoors++;
    }

    public void installationRadiators() {
        numberOfRadiators++;
    }
    public void puttyRoom(final String color) {
        setColor(color);
    }
}
