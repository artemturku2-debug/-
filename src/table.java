import java.util.Scanner;

class haal{
    {
    System.out.println("Здравствуйте, какой столик выберете?");}
    String [] Tables = new String [10];
    Scanner scanner = new Scanner(System.in);
    {
        String input = scanner.nextLine();
        boolean found = false;
        for (String dcm : Tables) {
            if (dcm.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Да, свободно");

        } else {
            System.out.println("Хмммммм, в системе такого нет, видимо либо стола нет, либо занято");

        }
    }
}



