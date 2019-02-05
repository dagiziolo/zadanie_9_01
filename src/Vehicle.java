public class Vehicle {
    private String name;
    private double tankVolume;
    private double combustion;

    public Vehicle(String name, double tankVolume, double combustion) {
        this.name = name;
        this.tankVolume = tankVolume;
        this.combustion = combustion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double avrTankVolume) {
        this.tankVolume = avrTankVolume;
    }

    public double getCombustion() {
        return combustion;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }

    public double distance() {
        return getTankVolume() * 100 / getCombustion();
    }

    public void showInfo() {
        System.out.print(getName() + " " + getTankVolume() + " " + getCombustion() + " ");
    }
}
