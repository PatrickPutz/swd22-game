package at.compus02.swd.ss2022.game.gameobjects.commands;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;

public class MoveDownCommand implements Command{
    private LivingBeing livingBeing;

    public MoveDownCommand(LivingBeing livingBeing) {
        this.livingBeing = livingBeing;
    }

    @Override
    public void execute() {
        livingBeing.moveDown();
    }
}
