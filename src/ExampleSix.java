/**
 * SkyPro. My code dz#6. String
 *
 * @author RAIL
 * @version dated Apr 19, 2022
 */

public class ExampleSix {
    public static void main(String[] args) {

        // ������� 1
        System.out.println();
        System.out.println("������� 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("��� ���������� - " + fullName);

        // ������� 2
        System.out.println();
        System.out.println("������� 2");
        String fullNameUP = fullName.toUpperCase();
        System.out.println("������ ��� ���������� ��� ���������� ������ - " + fullNameUP);

        // ������� 3
        System.out.println();
        System.out.println("������� 3");
        // ���� ����� ������ ����� ������� � �����
        char a = ' ';
        String b = "";
        for (int i = 0; i < fullName.length(); i++) {
            if (a == fullName.charAt(i)) {
                b = b + "; ";
            } else b = b + fullName.charAt(i);
        } System.out.println("������ ��� ���������� ��� ����������������� ������ - " + b);
        // ���� ����� ��� ������� ����� ������� � �����
        fullName = fullName.replace(' ', ';');
        System.out.println("������ ��� ���������� ��� ����������������� ������ - " + fullName);


        // ������� 4
        System.out.println();
        System.out.println("������� 4");
        fullName = "������ ���� ��������";
        fullName = fullName.replace('�', '�');
        System.out.println("������ ��� ���������� - " + fullName);

    }
}