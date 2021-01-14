package Model;

public class Vehicle
{
    private String color;
    private String owner;
    private String manufacturer;
    private String model;
    private String licensePlate;


    public Vehicle(String color, String owner, String manufacturer, String model, String licensePlate) {
        this.color = color;
        this.owner = owner;
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n",getLicensePlate()));
        sb.append(String.format("%s%n",getColor()));
        sb.append(String.format("%s%n",getOwner()));
        sb.append(String.format("%s%n",getManufacturer()));
        sb.append(String.format("%s%n",getModel()));

        return sb.toString();
    }
}
