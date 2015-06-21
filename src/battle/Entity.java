package battle;

public class Entity
{
    // Info
    private String ref, name;
    private int drawX, drawY;
    
    // Stats
    private int statHealthNow, statHealthMax;
    
    public Entity(String ref, Battle battle, int posX, int posY)
    {
        this.ref = ref;
    }
    
}