public class Car {
    private String brand, model,  color,  productionCountry;
    private int productionYear;
    private float engineVolume;

    public Car(String brand, String model, String color, String productionCountry, float engineVolume, int productionYear) {
        this.brand = brand;
        if(this.brand == null || this.brand.isBlank()){
            this.brand = "default";
        }
        this.model = model;
        if(this.model == null || this.model.isBlank()){
            this.model = "default";
        }
        this.color = color;
        if(this.color == null || this.color.isBlank()){
            this.color = "белый";
        }
        this.productionCountry = productionCountry;
        if(this.productionCountry == null || this.productionCountry.isBlank()){
            this.productionCountry = "default";
        }
        this.engineVolume = engineVolume;
        if(this.engineVolume <= 0){
            this.engineVolume = 1.5f;
        }
        this.productionYear = productionYear;
        if(this.productionYear <= 0){
            this.productionYear = 2000;
        }
    }

    @Override
    public String toString() {
        return "Автомобиль={" +
                "Марка = '" + brand + '\'' +
                ", модель = '" + model + '\'' +
                ", цвет кузова = '" + color + '\'' +
                ", страна сборки = '" + productionCountry + '\'' +
                ", объем двигателя в литрах = " + engineVolume +
                ", год производства = " + productionYear +
                '}';
    }
}
