package pokemons;

import moves.*;

public class Nidorino extends Nidoran_M {
    public Nidorino(String name, int level) {
        super(name, level);
        setStats(61, 72, 57, 55, 55, 65);
        addMove(new Horn_Attack());
    }
}
