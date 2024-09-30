package lotr.kickstrategy;
import java.util.Random;

import lotr.Character;

public class NobleKick implements KickStrategy {
    @Override
    public void kick(Character whoIsKicked, Character whoKicked){
        whoIsKicked.setHp(whoIsKicked.getHp() - new Random().nextInt(whoIsKicked.getPower()));
    }
}
