package pokemons;

import moves.Smart_Strike;
import moves.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran_M extends Pokemon {
    public Nidoran_M(String name, int level){
        super(name, level);
        setStats(46,57,40,40,40,50);
        setType(Type.POISON);
        setMove(new Thunder(), new Smart_Strike());
    }
}
