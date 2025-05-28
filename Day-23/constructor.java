package Day22;

public class constructor {
    public static void main(String[] args) {
        Passenger shashank = new Passenger("Shashank", 21, "Hyderabad");
        System.out.println("Name: " + shashank.name);
        System.out.println("Age: " + shashank.age);
        System.out.println("Place: " + shashank.place);
    }
    static class Passenger{
        String name;
        int age;
        String place;

        public Passenger(String name, int age, String place) {
            // Parameterized constructor
            this.name = name;
            this.age = age;
            this.place = place;
        }
    }
}
