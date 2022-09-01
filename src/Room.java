import java.util.Objects;

public class Room {
    private TypeRoom typeRoom;
    private int numberofDoors;
    private int numberofWindows;
    private int numberofRadiators;
    private String color;
    private double size;

    public Room(final TypeRoom typeRoom, final int numberofDoors, final int numberofWindows, final int numberofradiators, final String color, final double size) {
        this.typeRoom = typeRoom;
        this.numberofDoors = numberofDoors;
        this.numberofWindows = numberofWindows;
        this.numberofRadiators = numberofradiators;
        this.color = color;
        this.size = size;
    }

    public int getNumberofDoors() {
        return numberofDoors;
    }

    public void setNumberofDoors(final int numberofDoors) {
        this.numberofDoors = numberofDoors;
    }

    public int getNumberofWindows() {
        return numberofWindows;
    }

    public void setNumberofWindows(final int numberofWindows) {
        this.numberofWindows = numberofWindows;
    }

    public int getNumberofRadiators() {
        return numberofRadiators;
    }

    public void setNumberofRadiators(final int numberofradiators) {
        this.numberofRadiators = numberofradiators;
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
        return numberofDoors == room.numberofDoors && numberofWindows == room.numberofWindows && numberofRadiators == room.numberofRadiators && Double.compare(room.size, size) == 0 && color.equals(room.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberofDoors, numberofWindows, numberofRadiators, color, size);
    }

    @Override
    public String toString() {
        return "Room{" +
                "typeRoom=" + typeRoom +
                ", numberofDoors=" + numberofDoors +
                ", numberofWindows=" + numberofWindows +
                ", numberofRadiators=" + numberofRadiators +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public void installationWindow() {
        numberofWindows++;
    }

    public void installationDoor() {
        numberofDoors++;
    }

    public void installationRadiators() {
        numberofRadiators++;
    }
    public void puttyRoom(final String color) {
        setColor(color);
    }
}
