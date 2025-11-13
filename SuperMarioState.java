public class SuperMarioState implements MarioState 
{

    public void onMushroom(Mario mario) 
    {
        System.out.println("Already SUPER! Extra mushroom gives you a life.");
        mario.gainLife();
    }

    public void onStar(Mario mario) 
    {
        System.out.println("Super Mario grabs a star and becomes INVINCIBLE!");
        mario.setState(new InvincibleMarioState());
    }
    public void onEnemy(Mario mario) 
    {
        System.out.println("Super Mario hit by enemy! Back to SMALL.");
        mario.setState(new SmallMarioState());
    }
    public void onPit(Mario mario) 
    {
        System.out.println("Super Mario falls into a pit! You lose a life.");
        mario.loseLife();
    }
    public String getName() 
    {
        return "Super";
    }
}
