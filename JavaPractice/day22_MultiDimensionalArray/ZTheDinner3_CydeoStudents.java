package day22_MultiDimensionalArray;

public class ZTheDinner3_CydeoStudents {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String [][] batch25Groups = new String [3][];

        batch25Groups[0] = batch25Group1;
        batch25Groups[1] = batch25Group2;
        batch25Groups[2] = batch25Group3;

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] batch24Groups = new String[4][];
        batch24Groups[0] = batch24Group1;
        batch24Groups[1] = batch24Group2;
        batch24Groups[2] = batch24Group3;

        String [][][] CydeoStudents = new String[2][][];
        CydeoStudents[0] = batch25Groups;
        CydeoStudents[1] = batch24Groups;

int count = 1;
        for (String[][] batch : CydeoStudents) {
            for (String[] groups : batch) {
                for (String students : groups) {
                    System.out.println(count++ +". "+students);
                }
            }
        }




    }
}
