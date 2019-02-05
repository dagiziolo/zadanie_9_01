public class Truck extends Car {
    private double weight;

    public Truck(String name, double tankVolume, double combustion, boolean airConditioning, double weight) {
        super(name, tankVolume, combustion, airConditioning);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


//    @Override
//    public boolean isAirConditioning() {
//        return super.isAirConditioning();
//    }


    @Override
    public double distance() {
        double addCombWeight = getWeight() * 0.5 / 100;
        if (!isAirConditioning()) {
            double tmp = getCombustion() + addCombWeight;
            return super.distance() * getCombustion() / tmp;
        } else {
            double tmp = getCombustion() + addCombWeight + 1.6;
            return (getTankVolume() * 100 / tmp);
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
