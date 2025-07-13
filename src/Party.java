public class Party {
    private final String name;
    private double percentage;

    public Party(String name) {
        this.name = name;
        this.percentage = 0;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
