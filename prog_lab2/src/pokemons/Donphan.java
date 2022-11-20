package pokemons;

import moves.Horn_Attack;

public class Donphan extends Phanpy {
    public Donphan(String name, int level) {
        super(name, level);
        setStats(90, 120, 120, 60, 60, 50);
        addMove(new Horn_Attack());
    }
}
