package interviewprep;

public class RemoveDuplicatesWithoutCollection {
    public static void main(String[] args) {
        String[] names = {"Raj", "Kumar", "Raj", "Anu", "Anu", "Bala"};
        String[] temp = new String[names.length];
        int count = 0;

        for (int i = 0; i < names.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (names[i].equals(temp[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count++] = names[i];
            }
        }

        // Print unique names
        System.out.print("List without Duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
