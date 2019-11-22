package Oven;

import Interfaces.Command;

public class OvenCommandStartCooking implements Command {
    private Oven oven;

    public OvenCommandStartCooking(Oven oven){ // Tf?
        this.oven = oven;
    }

    @Override
    public void execute() {
        oven.startCooking();
        System.out.println("Started the cooking process");
    }

    @Override
    public String toString(){
        return "[START COOKING]";
    }
}
