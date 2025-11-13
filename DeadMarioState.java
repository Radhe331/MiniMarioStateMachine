public class DeadMarioState implements MarioState 
{

    public void onMushroom(Mario mario) 
    {
        System.out.println("Mario is dead. Mushroom can't help now.");
    }
    public void onStar(Mario mario) 
    {
        System.out.println("Mario is dead. Star can’t help now.");
    }

    public void onEnemy(Mario mario) 
    {
        System.out.println("Mario is already dead.");
    }

    public void onPit(Mario mario) 
    {
        System.out.println("Mario is already dead.");
    }

    public String getName() 
    {
        return "Dead";
    }
}
