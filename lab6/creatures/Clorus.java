package creatures;
import huglife.Creature;
import huglife.Direction;
import huglife.Action;
import huglife.Occupant;
import huglife.HugLifeUtils;
import java.awt.Color;
import java.util.Map;
import java.util.List;


public class Clorus extends Creature {

    /** red color. */
    private int r;
    /** green color. */
    private int g;
    /** blue color. */
    private int b;

    private static final double energyLossMoving = 0.03;
    private static final double energyLossStaying = 0.01;
    private double repEnergyRetained = 0.5;
    private double repEnergyGiven = 0.5;


    /** creates plip with energy equal to E. */
    public Clorus(double e) {
        super("clorus");
        r = 34;
        g = 0;
        b = 231;
        energy = e;
    }

    /** creates a plip with energy equal to 1. */
    public Clorus() {
        this(1);
    }

    /** Should return a color with red = 99, blue = 76, and green that varies
     *  linearly based on the energy of the Plip. If the plip has zero energy,
     *  it should have a green value of 63. If it has max energy, it should
     *  have a green value of 255. The green value should vary with energy
     *  linearly in between these two extremes. It's not absolutely vital
     *  that you get this exactly correct.
     */
    public Color color() {
        return color(r, g, b);
    }

    /** Do nothing with C, Plips are pacifists. */
    public void attack(Creature c) {
        energy += c.energy();
    }

    /** Plips should lose 0.15 units of energy when moving. If you want to
     *  to avoid the magic number warning, you'll need to make a
     *  private static final variable. This is not required for this lab.
     */
    public void move() {

        energy -= energyLossMoving;
    }


    /** Plips gain 0.2 energy when staying due to photosynthesis. */
    public void stay() {

        energy += energyLossStaying;
    }

    /** Plips and their offspring each get 50% of the energy, with none
     *  lost to the process. Now that's efficiency! Returns a baby
     *  Plip.
     */
    public Clorus replicate() {
        double energyTemp = energy;
        energy = energy * repEnergyRetained;
        double babyEnergy = energyTemp * repEnergyGiven;
        return new Clorus(babyEnergy);
    }



    public Action chooseAction(Map<Direction, Occupant> neighbors) {
        java.util.List<Direction> empties = getNeighborsOfType(neighbors, "empty");
        java.util.List<Direction> plipsList = getNeighborsOfType(neighbors, "plip");
        if(empties.size() == 0)
            return new Action(Action.ActionType.STAY);

        if(plipsList.size() >= 1){
            Direction attackDir = HugLifeUtils.randomEntry(plipsList);
            return new Action(Action.ActionType.ATTACK, attackDir);
        }

        if(energy >= 1){
            Direction replicateDir = HugLifeUtils.randomEntry(empties);
            return new Action(Action.ActionType.REPLICATE, replicateDir);
        }

        Direction moveDir = HugLifeUtils.randomEntry(empties);
        return new Action(Action.ActionType.MOVE, moveDir);

    }

}
