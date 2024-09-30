package lotr.kickstrategy;
import lotr.Character;

public class HobbitKick implements KickStrategy {
    @Override
    public void kick(Character whoIsKicked, Character whoKicked) {
        toCry();
    }

    public void toCry() {
        System.out.println("😢😢😢");
    }
}