class Vehicle {
    String make;
    String model;
    int year;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numOfDoors;

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public void display() {
        super.display();
        System.out.println("Number of doors: " + numOfDoors);
    }
}

class SportsCar extends Car {
    String type;

    public void setType(String type) {
        this.type = type;
    }

    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}

public class MultilevelInheritanceDemo1 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.setMake("Porsche");
        sportsCar.setModel("911");
        sportsCar.setYear(2022);
        sportsCar.setNumOfDoors(2);
        sportsCar.setType("Coupe");
        sportsCar.display();
    }
}