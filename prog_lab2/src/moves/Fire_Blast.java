package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Fire_Blast extends SpecialMove {
    public Fire_Blast() {
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.burn(p);
        }
    }
    @Override
    protected String describe() {
        return "использует Fire Blast";
    }
}
