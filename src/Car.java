public class Car {
    // Atributlar
    private String color;
    private String model;
    private long price;
    private boolean isMechanic;


    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public long getPrice() {
        return price;
    }

    public boolean isMechanic() {
        return isMechanic;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public void setMechanic(boolean isMechanic) {
        this.isMechanic = isMechanic;
    }

}
