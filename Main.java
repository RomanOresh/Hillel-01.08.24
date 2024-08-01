public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        System.out.println("1." + person.doPersonInfo("John", 30, "Инженер"));
        System.out.println(person.doPersonInfo("Mary", 25, "Учитель"));
        System.out.println(person.doPersonInfo("Bob", 35, "Доктор"));

        person.setName("Alice");
        person.setAge(28);
        person.setProfession("Архитектор");
        System.out.println("\n2. " + person.doPersonInfo());
        System.out.println("(После обновления профессии)");
        person.setProfession("Дизайнер");
        System.out.println(person.doPersonInfo());

    }
}
