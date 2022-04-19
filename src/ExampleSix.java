/**
 * SkyPro. My code dz#6. String
 *
 * @author RAIL
 * @version dated Apr 19, 2022
 */

public class ExampleSix {
    public static void main(String[] args) {

        // Задание 1
        System.out.println();
        System.out.println("Задание 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание 2
        System.out.println();
        System.out.println("Задание 2");
        String fullNameUP = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUP);

        // Задание 3
        System.out.println();
        System.out.println("Задание 3");
        // если нужен пробел после фамилии и имени
        char a = ' ';
        String b = "";
        for (int i = 0; i < fullName.length(); i++) {
            if (a == fullName.charAt(i)) {
                b = b + "; ";
            } else b = b + fullName.charAt(i);
        } System.out.println("Данные ФИО сотрудника для административного отдела - " + b);
        // если можно без пробела после фамилии и имени
        fullName = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName);


        // Задание 4
        System.out.println();
        System.out.println("Задание 4");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }
}