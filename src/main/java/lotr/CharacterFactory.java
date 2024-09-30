package lotr;

import org.reflections.Reflections;
import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {
    // @SuppressWarnings("unused")
    private List<Class<? extends Character>> getCharacterSubs() {
        List<Class<? extends Character>> subs = new ArrayList<>();
        Reflections reflections = new Reflections("lotr");

        subs.addAll(reflections.getSubTypesOf(Character.class));
        return subs;
    }
}