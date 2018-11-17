public enum PlaneType {
    BOEING747(100, 10000),
    BOEING787(200, 5000000),
    AIRBUS(150, 20000),
    SEAPLANE(2, 500);

    private final int capacity;
    private final int totalLoad;

    PlaneType(int capacity, int totalLoad){
        this.capacity = capacity;
        this.totalLoad = totalLoad;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalLoad() {
        return totalLoad;
    }
}


