public class Main {
    // 1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
    // Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
    // 2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
    // 3. Написать конструкторы для обоих классов, заполняющие все поля.
    // 4. Создать геттеры для всех полей автора и всех полей книги.
    // 5. Создать сеттер для поля «Год публикации» у книги.
    // 6. В методе main создать несколько объектов Книга (достаточно двух) и несколькообъектов Автор
    // (достаточно тоже двух) и инициализировать друг друга.
    // Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
    // Метод main не должен находиться в классах Book и Author.
    // Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
    // 7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

    public static void main(String[] args) {
        Author john = new Author("John", "Adams");
        Author michael = new Author("Michael", "Smith");
        Book twilight = new Book("Twilight",  john,  1995);
        Book moonLight = new Book("Moonlight", michael, 2000);
        System.out.println("twilight.getName() = " + twilight.getName());
        System.out.println("twilight.getYearOfRelease() = " + twilight.getYearOfRelease());
        System.out.println("twilight.getAuthor() = " + twilight.getAuthor());
        System.out.println();
        System.out.println("moonLight.getName() = " + moonLight.getName());
        System.out.println("moonLight.getYearOfRelease() = " + moonLight.getYearOfRelease());
        System.out.println("moonLight.getAuthor() = " + moonLight.getAuthor());
        moonLight.setYearOfRelease(2001);
        System.out.println("moonLight.getYearOfRelease() = " + moonLight.getYearOfRelease());
    }
}