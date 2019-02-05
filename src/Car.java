public class Car extends Vehicle {
    private boolean airConditioning;

    public Car(String name, double tankVolume, double combustion, boolean airConditioning) {
        super(name, tankVolume, combustion);
        this.airConditioning = airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    //    @Override
//    public boolean isAirConditioning() {
//        return airConditioning;
//    }

    @Override
    public double distance() {
        if (!isAirConditioning())
            return super.distance();
        else {
            double tmp = getCombustion() + 0.8;
            return getTankVolume() * 100 / tmp;
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(isAirConditioning()+" " + distance());
    }
}
