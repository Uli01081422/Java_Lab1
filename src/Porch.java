import java.util.Objects;

public class Porch {
    private int numberOfArchway;
    private int numberOfRadiators;
    private int furniture;
    private int wooden_utensils;
    private int flower_pots;
    private String color;
    private TypePorch typePorch;


    public Porch( final int furniture, final int wooden_utensils, final int flower_pots, final String color, final TypePorch typePorch) {
        this.numberOfArchway = numberOfArchway;
        this.numberOfRadiators = numberOfRadiators;
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

    public int getNumberOfArchway() {
        return numberOfArchway;
    }

    public void setNumberOfArchway(final int numberOfArchway) {
        this.numberOfArchway = numberOfArchway;
    }

    public int getNumberOfRadiators() {
        return numberOfRadiators;
    }

    public void setNumberOfRadiators(final int numberOfRadiators) {
        this.numberOfRadiators = numberOfRadiators;
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



    public void layoutFurniture() {
        wooden_utensils++;
    }

    public void layoutWooden_utensils() {
        wooden_utensils++;
    }

    public void layoutFlower_pots() {
        flower_pots++;
    }

    public void  buildArchway() {
        numberOfArchway++;
    }

    public void installationRadiators() {
        numberOfRadiators++;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Porch porch)) return false;
        return numberOfArchway == porch.numberOfArchway && numberOfRadiators == porch.numberOfRadiators && furniture == porch.furniture && wooden_utensils == porch.wooden_utensils && flower_pots == porch.flower_pots && Objects.equals(color, porch.color) && typePorch == porch.typePorch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfArchway, numberOfRadiators, furniture, wooden_utensils, flower_pots, color, typePorch);
    }

    @Override
    public String toString() {
        return "Porch{" +
                "numberOfArchway=" + numberOfArchway +
                ", numberOfRadiators=" + numberOfRadiators +
                ", furniture=" + furniture +
                ", wooden_utensils=" + wooden_utensils +
                ", flower_pots=" + flower_pots +
                ", color='" + color + '\'' +
                ", typePorch=" + typePorch +
                '}';
    }
}
