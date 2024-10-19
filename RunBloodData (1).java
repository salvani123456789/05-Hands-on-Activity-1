//Name: Salvani, Christian Joseph S.
//Sention: BSIT - 307
import java.util.Scanner;

class BloodData {
    private String bloodType = "O";
    private String rhFactor = "+";

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    public String getBloodType() {
        return bloodType;
    }
    public String getRhFactor() {
        return rhFactor;
    }
    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}

class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BloodData bd = new BloodData();

        System.out.print("Enter blood type of patient: ");
        String input1 = scanner.nextLine();
        bd.setBloodType(input1);

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = scanner.nextLine();
        bd.setRhFactor(input2);

        bd.display();
        scanner.close();
    }
}