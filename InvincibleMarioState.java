public class InvincibleMarioState implements MarioState 
{
    public void onMushroom(Mario mario)
    {
        System.out.println("Invincible Mario eats a mushroom. Nice, but still INVINCIBLE!");
    }
    public void onStar(Mario mario) 
    {
        System.out.println("Another star! You're already INVINCIBLE.");
    }
    public void onEnemy(Mario mario) 
    {
        System.out.println("Enemy defeated! Invincible Mario takes no damage.");
    }
    public void onPit(Mario mario) 
    {
        System.out.println("Even invincible Mario can't survive a pit. You lose a life.");
        mario.loseLife();
    }
    public String getName() 
    {
        return "Invincible";
    }
}
