public class Mario {

    private MarioState state;
    private int lives;
    private int coins;
    private int score;
    private int steps;

    public Mario() {
        this.lives = 3;
        this.state = new SmallMarioState(); // start small
        this.coins = 0;
        this.score = 0;
        this.steps = 0;
    }

    void setState(MarioState state) {
        this.state = state;
    }

    public MarioState getState() {
        return state;
    }

    public int getLives() {
        return lives;
    }

    public void loseLife() {
        lives--;
        if (lives <= 0) {
            lives = 0;
            setState(new DeadMarioState());
        }
    }

    public void gainLife() 
    {
        lives++;
    }
    public int getCoins() 
    {
        return coins;
    }

    public int getScore() 
    {
        return score;
    }

    public int getSteps() 
    {
        return steps;
    }
    public void stepTaken() 
    {
        steps++;
    }

    // coin gives 10 points (you can change this later)
    public void collectCoin() 
    {
        coins++;
        score += 10;
    }

    // if you ever want to add other scoring rules:
    public void addScore(int points) 
    {
        score += points;
    }

    // ---------- Delegate events to the current state ----------

    public void onMushroom() {
        state.onMushroom(this);
    }

    public void onStar() {
        state.onStar(this);
    }

    public void onEnemy() {
        state.onEnemy(this);
    }

    public void onPit() {
        state.onPit(this);
    }

    public void printStatus() {
        System.out.println("[STATUS] Mario is " + state.getName()
                + " | Lives = " + lives
                + " | Coins = " + coins
                + " | Score = " + score
                + " | Steps = " + steps);
    }
}
