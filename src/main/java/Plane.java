public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getType(){
        return this.planeType;
    }

    public int getCapacityEnum(){
        return this.planeType.getCapacity();
    }

    public int getTotalLoadEnum(){
        return this.planeType.getTotalLoad();
    }
}
