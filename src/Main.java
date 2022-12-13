public class Main {
    public static void main(String[] args) {
        System.out.println("Классы Кот и Собака");
        Pet pet = new Pet();
        pet.type = "Кот";
        pet.name = "Барсик";
        pet.weight = 10;

        System.out.println("Домашнее животное: " + pet.type +"\nКличка: " + pet.name +"\nВес: " + pet.weight);
        //pet.weight = pet.weight + 1;
        //System.out.println(
        //        "Домашнее животное: " + pet.type +
        //                "\nКличка: " + pet.name +
        //                "\nВес: " + pet.weight);
        System.out.println("Кот поел и теперь весит " + pet.eat(2) + " кг");

        for (int i = 0; i < 8; i++) {
            pet.run();
        }

        System.out.println(
                "Домашнее животное: " + pet.type +
                        "\nКличка: " + pet.name +
                        "\nВес: " + pet.weight);
    }
}