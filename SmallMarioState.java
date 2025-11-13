public class SmallMarioState implements MarioState {

    @Override
    public void onMushroom(Mario mario) {
        System.out.println("Mario eats a mushroom and becomes SUPER!");
        mario.setState(new SuperMarioState());
    }

    @Override
    public void onStar(Mario mario) {
        System.out.println("Mario grabs a star and becomes INVINCIBLE!");
        mario.setState(new InvincibleMarioState());
    }

    @Override
    public void onEnemy(Mario mario) {
        System.out.println("Small Mario hit by enemy! You lose a life.");
        mario.loseLife();
    }

    @Override
    public void onPit(Mario mario) {
        System.out.println("Small Mario falls into a pit! You lose a life.");
        mario.loseLife();
    }

    @Override
    public String getName() {
        return "Small";
    }
}
