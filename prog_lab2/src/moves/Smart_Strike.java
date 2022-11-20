package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Smart_Strike extends PhysicalMove {
    public Smart_Strike() {
        super(Type.NORMAL, 70, 0);

    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    @Override
    protected String describe() {
        return "использует Smart Strike";
    }
}
