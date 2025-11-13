public interface MarioState 
{
    void onMushroom(Mario mario);
    void onStar(Mario mario);
    void onEnemy(Mario mario);
    void onPit(Mario mario);
    String getName();
}
