package lotr;
import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character{
    public Hobbit(){
        super(0, 3, new HobbitKick());
    }
}
