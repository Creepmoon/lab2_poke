import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Volcanion("pok1", 1);
        Pokemon p2 = new Nidoran_M("pok2", 1);
        Pokemon p3 = new Donphan("pok3", 1);
        Pokemon p4 = new Nidoking("pok4", 1);
        Pokemon p5 = new Phanpy("pok5", 1);
        Pokemon p6 = new Nidorino("pok6", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}