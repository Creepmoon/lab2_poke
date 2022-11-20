package pokemons;

import moves.Bulldoze;
import moves.Growl;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Phanpy extends Pokemon {
    public Phanpy(String name, int level) {
        super(name, level);
        setStats(90, 60, 60, 40, 40, 40);
        setType(Type.GROUND);
        setMove(new Rest(), new Growl(), new Bulldoze());
    }
}
