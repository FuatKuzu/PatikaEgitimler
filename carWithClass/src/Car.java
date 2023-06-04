public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, String color, int speed) {
        System.out.println("Parametreli constructor oluştu!");
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.type = "Sedan";
        this.speedLimit = 180;
    }

    Car() {
        System.out.println("Parametresiz constructor oluştu!");
    }

    // davranışlar
    int increaseSpeed(int increment) {
        this.speed += increment;
        return this.speed;
    }

    int decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
        return this.speed;
    }

    void printInfo() {
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type  \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);
    }

    void printSpeed() {
        System.out.println(model + " Speed : " + speed);
    }
}
