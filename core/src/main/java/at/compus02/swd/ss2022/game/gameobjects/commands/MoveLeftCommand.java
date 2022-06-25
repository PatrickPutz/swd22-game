package at.compus02.swd.ss2022.game.gameobjects.commands;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;

public class MoveLeftCommand implements Command{
    private LivingBeing livingBeing;

    public MoveLeftCommand(LivingBeing livingBeing) {
        this.livingBeing = livingBeing;
    }

    @Override
    public void execute() {
        livingBeing.moveLeft();
    }
}
