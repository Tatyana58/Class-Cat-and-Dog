public class Main {
    public static void main(String[] args) {
        System.out.println("Классы Кот и Собака");
        Pet cat = new Pet();
        /*pet.type = "Кот";
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

         */
        //pet.eat(1).eat(1).run();
        cat.type = "Кот";
        cat.name = "Барсик";
        cat.weight = 10;
        System.out.println(
                "Домашнее животное: " + cat.type +
                        "\nКличка: " + cat.name +
                        "\nВес: " + cat.weight +
                        "\nСколько животное съело: " + cat.amountOfFood);

        Pet dog = new Pet();
        dog.type = "Собака";
        dog.name = "Тузик";
        dog.weight = 15;

        System.out.println(
                "Домашнее животное: " + dog.type +
                        "\nКличка: " + dog.name +
                        "\nВес: " + dog.weight +
                        "\nСколько животное съело: " + dog.amountOfFood);

        System.out.println("Общее количество съеденной еды: " + Pet.amountOfAllFood);

        cat.eat(4);
        dog.eat(6);

        System.out.println(
                "Домашнее животное: " + cat.type +
                        "\nКличка: " + cat.name +
                        "\nВес: " + cat.weight +
                        "\nСколько животное съело: " + cat.amountOfFood);

        System.out.println(
                "Домашнее животное: " + dog.type +
                        "\nКличка: " + dog.name +
                        "\nВес: " + dog.weight +
                        "\nСколько животное съело: " + dog.amountOfFood);

        System.out.println("Общее количество съеденной еды: " + Pet.amountOfAllFood);

    }
}