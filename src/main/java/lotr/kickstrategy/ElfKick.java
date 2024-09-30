package lotr.kickstrategy;
import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whoIsKicked, Character whoKicked) {
        if (whoIsKicked.getPower() < whoKicked.getPower()){
            whoIsKicked.setHp(0);
        }

        else{
            whoIsKicked.setPower(whoIsKicked.getPower() - 1);
        }
    }
}
