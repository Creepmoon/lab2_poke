package pokemons;

import moves.Fire_Blast;
import ru.ifmo.se.pokemon.Type;

public class Nidoking extends Nidorino {
    public Nidoking(String name, int level) {
        super(name, level);
        setStats(81, 102, 77, 85, 75, 85);
        addType(Type.GROUND);
        addMove(new Fire_Blast());
    }
}