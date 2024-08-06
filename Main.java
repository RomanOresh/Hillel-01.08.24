public class Main {
    public static void main(String[] args) {

        Person john = new Person("John", 30, "Инженер");
        Person mary = new Person("Mary", 25, "Учитель");
        Person bob = new Person("Bob", 35, "Врач");

        john.displayInfo();
        mary.displayInfo();
        bob.displayInfo();

        Person alice = new Person("Alice", 28, "Архитектор");
        alice.displayInfo();
        alice.updateProfession("Дизайнер");
        alice.displayInfo();

    }
}
