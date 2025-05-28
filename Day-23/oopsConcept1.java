package Day22;

class oopsConcept1 {
    public static void main(String[] args) {
        Passenger shashank;
        shashank = new Passenger();
        shashank.name = "Shashank";
        shashank.age = 20;
        shashank.place = "Hyderabad";
        System.out.println("Name: " + shashank.name);
        System.out.println("Age: " + shashank.age); 
        System.out.println("Place: " + shashank.place);
    }
    static class Passenger{
        String name;
        int age;
        String place;

        public Passenger() {
            // Default constructor
            this.name=" ";
            this.age=0;
            this.place=" ";
        }
    }
}
