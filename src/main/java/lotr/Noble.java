package lotr;
import lotr.kickstrategy.KickStrategy;

public abstract class Noble extends Character { 

    public Noble(int power, int hp, KickStrategy kickStrategy) {
        super(power, hp, kickStrategy); 
    }
}
