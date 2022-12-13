public class Pet {
    int weight; //вес
    String name; // имя
    String type; // какое животное

    int eat(int amount) {
        weight += amount;
        System.out.println("Я поел");
        return weight;
    }

    void run() {
        if (weight <= 5) {
            System.out.println("Я не могу бежать");
            return;
        }

        weight--;
        System.out.println("Я бегу");
    }
}
