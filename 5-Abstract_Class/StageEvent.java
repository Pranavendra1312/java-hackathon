public class StageEvent extends Event{
    private int noOfShows;
    private double costPerShow;

    public int getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }

    public double getCostPerShow() {
        return costPerShow;
    }

    public void setCostPerShow(double costPerShow) {
        this.costPerShow = costPerShow;
    }

    @Override
    double calculateAmount() {
        return getCostPerShow()*getNoOfShows();
    }
    public StageEvent(String name, String detail, String type, String organizer, Integer noOfShows,Double costPerShow){
        super(name, detail, type, organizer);
        setNoOfShows(noOfShows);
        setCostPerShow(costPerShow);
        System.out.println("Total cost:"+calculateAmount());
    }
}
