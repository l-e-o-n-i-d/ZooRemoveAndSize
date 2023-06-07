package home_work_7.task2;

/**
 * Використовуючи Intelij IDEA, створити проект, пакет. Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин,
 * дізнатися розмір списку і вивести в консоль.
 */

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(0,"Пелікан");
        zoo.add(1,"Слон");
        zoo.add(2, "Жираф");
        zoo.add(3, "Бегемот");
        zoo.add(4, "Лев");
        zoo.add(5, "Тигр");
        zoo.add(6, "Черепаха");
        zoo.add(7, "Вовк");

        //Можемо видалити по назві тварини
//        zoo.removeAnimal("Бегемот");
//        zoo.removeAnimal("Тигр");
//        zoo.removeAnimal("Вовк");
        zoo.removeAnimalByIndex(7);
        zoo.removeAnimalByIndex(5);
        zoo.removeAnimalByIndex(3);
        System.out.println("Розмір списку: " + zoo.getSize());
        for (String animal : zoo.getAnimals()) {
            System.out.println(animal);
        }
    }
}
