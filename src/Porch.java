import java.util.Objects;

public class Porch {
    private int numberofArchway;
    private int numberofRadiators;
    private int furniture;
    private int wooden_utensils;
    private int flower_pots;
    private String color;
    private TypePorch typePorch;


    public Porch(final int numberofArchway, final int numberofRadiators, final int furniture, final int wooden_utensils, final int flower_pots, final String color, final TypePorch typePorch) {
        this.numberofArchway = numberofArchway;
        this.numberofRadiators = numberofRadiators;
        this.furniture = furniture;
        this.wooden_utensils = wooden_utensils;
        this.flower_pots = flower_pots;
        this.color = color;
        this.typePorch = typePorch;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getNumberofArchway() {
        return numberofArchway;
    }

    public void setNumberofArchway(final int numberofArchway) {
        this.numberofArchway = numberofArchway;
    }

    public int getNumberofRadiators() {
        return numberofRadiators;
    }

    public void setNumberofRadiators(final int numberofRadiators) {
        this.numberofRadiators = numberofRadiators;
    }

    public int getFurniture() {
        return furniture;
    }

    public void setFurniture(final int furniture) {
        this.furniture = furniture;
    }

    public int getWooden_utensils() {
        return wooden_utensils;
    }

    public void setWooden_utensils(final int wooden_utensils) {
        this.wooden_utensils = wooden_utensils;
    }

    public int getFlower_pots() {
        return flower_pots;
    }

    public void setFlower_pots(final int flower_pots) {
        this.flower_pots = flower_pots;
    }

    public TypePorch getTypePorch() {
        return typePorch;
    }

    public void setTypePorch(final TypePorch typePorch) {
        this.typePorch = typePorch;
    }



    public void layoutfurniture() {
        wooden_utensils++;
    }

    public void layoutWooden_utensils() {
        wooden_utensils++;
    }

    public void layoutflower_pots() {
        flower_pots++;
    }

    public void  buildrchway() {
        numberofArchway++;
    }

    public void installationRadiators() {
        numberofRadiators++;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Porch porch)) return false;
        return numberofArchway == porch.numberofArchway && numberofRadiators == porch.numberofRadiators && furniture == porch.furniture && wooden_utensils == porch.wooden_utensils && flower_pots == porch.flower_pots && color.equals(porch.color) && typePorch == porch.typePorch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberofArchway, numberofRadiators, furniture, wooden_utensils, flower_pots, color, typePorch);
    }

    @Override
    public String toString() {
        return "Porch{" +
                "numberofArchway=" + numberofArchway +
                ", numberofRadiators=" + numberofRadiators +
                ", furniture=" + furniture +
                ", wooden_utensils=" + wooden_utensils +
                ", flower_pots=" + flower_pots +
                ", color='" + color + '\'' +
                ", typePorch=" + typePorch +
                '}';
    }
}
