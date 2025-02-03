public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "%s %s %s".formatted(lastName, firstName, middleName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("\nЗадача 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);

        System.out.println("\nЗадача 3");
        fullName = "Иванов Семён Семёнович";
        String correctedFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);
    }
}