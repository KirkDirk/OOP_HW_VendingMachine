public class Groats extends Products {
    private double capacity;
    private String quality;
    
    public Groats(String name, double price, double capacity, String quality) {
        super(name, price);
        //TODO Auto-generated constructor stub

        this.setCapacity(capacity);
        this.setQuality(quality);      
    }

    private void setCapacity(double capacity2) {this.capacity = capacity2;}

    private void setQuality(String quality2) {this.quality = quality2;}

    public double getCapacity() {return capacity;}

    public String getQuality() {return quality;}

    @Override
    public String toString() {
        return "Groats [capacity=" + capacity + ", quality=" + quality + "]";
    }
    
    
}
