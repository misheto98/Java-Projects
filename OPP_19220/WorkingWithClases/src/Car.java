public class Car {
    //Дефинира class CAR с полета : Марка и Модел
    String model;
    String brand;

    public Car(String model, String brand) {
        this.setModel(model);
        this.setBrand(brand);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                '}';
    }
}
