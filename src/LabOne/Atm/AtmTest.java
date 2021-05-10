package LabOne.Atm;

public class AtmTest {
    public static void main(String[] args) {
        AtmSimulator atm = new AtmSimulator();
        try {
            atm.readCurrentAccount();
            while (true) {
                atm.Update();
            }
        } catch (AtmException e) {
            return;
        }
    }
}
