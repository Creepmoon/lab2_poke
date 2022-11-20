package pokemons;

import moves.Bulldoze;
import moves.Flamethrower;
import moves.Focus_Blast;
import moves.Sludge_Wave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Volcanion extends Pokemon {
    public Volcanion(String name, int level) {
        super(name, level);
        setStats(80, 110, 120, 130, 90, 70);
        setType(Type.FAIRY, Type.WATER);
        setMove(new Focus_Blast(), new Bulldoze(), new Flamethrower(), new Sludge_Wave());
    }
}
    