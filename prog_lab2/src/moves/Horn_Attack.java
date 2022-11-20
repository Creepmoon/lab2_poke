package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Horn_Attack extends PhysicalMove {
    public Horn_Attack() {
        super(Type.NORMAL, 65, 100);
    }
    @Override
    protected String describe() {
        return "использует Horn Attack";
    }
}
