public class Car extends Vehicle{
    private String model;

    public Car(String brand, int year, String model){
        super(brand, year);
        this.model = model;
    }

    @Override
    public String toString(){
        String mask = "марка: %s модель: %s год выпуска: %d%n";
        return String.format(mask, this.model, this.model, this.year);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(this.model);
    }
}
