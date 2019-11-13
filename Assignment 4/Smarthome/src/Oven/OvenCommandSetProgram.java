package Oven;
import Interfaces.Command;
import java.util.Scanner;
public class OvenCommandSetProgram implements Command {
    private Oven oven;
    public void execute() {
        System.out.println("Choose one of the following Programs:");
        System.out.println(("[Ventilated]  [Grill]  [Normal]"));

        Scanner in = new Scanner(System.in);

        String answer = in.nextLine();

        switch (answer){
            case "Ventilated":
                oven.setProgramVentilated();
                break;
            case "Grill":
                oven.setProgramGrill();
                break;
            case "Normal":
                oven.setProgramNormal();
                break;
        }
    }
}
