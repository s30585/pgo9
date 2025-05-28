public class Car implements Comparable<Car>{
    protected String model;
    public int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car car) {
        if (year > car.year){
            return 1;
        } else if (year < car.year){
            return -1;
        } else {
            return 0;
        }
    }
    public String toString(){
        return model + "\t" + year;
    }
}