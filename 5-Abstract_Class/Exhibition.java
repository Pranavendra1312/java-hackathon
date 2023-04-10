public class Exhibition extends Event {
    private int noOfStalls;
    private double rentPerStall;

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public double getRentPerStall() {
        return rentPerStall;
    }

    public void setRentPerStall(double rentPerStall) {
        this.rentPerStall = rentPerStall;
    }

    @Override
    double calculateAmount() {
        return getRentPerStall()* getNoOfStalls();
    }
    public Exhibition(String name, String detail, String type, String organizer, int noOfStalls,Double rentPerStall){
        super(name, detail, type, organizer);
        setNoOfStalls(noOfStalls);
        setRentPerStall(rentPerStall);
    }
}
