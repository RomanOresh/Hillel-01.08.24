public class Person {

    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void displayInfo(){
        System.out.println("Имя: " + name + " Возраст: " + age + " Профессия: " + profession);
    }

    public void updateProfession(String profession){
        this.profession = profession;
    }
}
