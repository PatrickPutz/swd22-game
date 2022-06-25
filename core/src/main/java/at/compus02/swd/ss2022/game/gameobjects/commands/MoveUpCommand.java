package at.compus02.swd.ss2022.game.gameobjects.commands;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;

public class MoveUpCommand implements Command{
    private LivingBeing livingBeing;

    public MoveUpCommand(LivingBeing livingBeing) {
        this.livingBeing = livingBeing;
    }

    @Override
    public void execute() {
        livingBeing.moveUp();
    }
}
