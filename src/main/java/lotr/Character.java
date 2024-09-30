package lotr;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lotr.kickstrategy.KickStrategy;

@AllArgsConstructor
public abstract class Character {
    @Getter @Setter
    private int power;
    @Getter
    private int hp;
    private KickStrategy kickStrategy;

    public boolean isAlive(){
        return this.getHp() > 0;
    }

    public void kick(Character whoIsKicked) {
        kickStrategy.kick(whoIsKicked, this);
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else{
            this.hp = hp;
        }
    }

    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + '}';
    }
}
