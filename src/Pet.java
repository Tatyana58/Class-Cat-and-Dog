public class Pet {
    int weight; //вес
    String name; // имя
    String type; // какое животное
    int amountOfFood;
    static int amountOfAllFood;

    /*int eat(int amount) {
        weight += amount;
        System.out.println("Я поел");
        return weight;
    }
     */
    Pet eat(int amount) {
        weight += amount;
        System.out.println("Я поел");
        amountOfFood += amount;
        amountOfAllFood += amount;
        return this;
    }

    void run() {
        if (weight <= 5) {
            System.out.println("Я не могу бежать");
            return;
        }

        weight--;
        System.out.println("Я бегу");
    }

    void setName(String name) {
        this.name = name;
        System.out.println("Теперь это домашнее животное зовут " + this.name);
    }
}