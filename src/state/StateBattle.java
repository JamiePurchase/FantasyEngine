package state;

import battle.Battle;
import gfx.Drawing;
import input.InputKeyboardKey;
import java.awt.Color;
import java.awt.Graphics;

public class StateBattle extends State
{
    private Battle battle;
    
    public StateBattle()
    {
        //new Character("Jamie");
        this.battle = new Battle();
    }
    
    public void keyPressed(InputKeyboardKey key)
    {
        
    }
    
    public void keyReleased(InputKeyboardKey key)
    {
        
    }
    
    public void render(Graphics gfx)
    {
        renderBattlefieldBackground(gfx);
        renderForceAllies(gfx);
        renderForceEnemies(gfx);
    }
    
    public void renderBattlefieldBackground(Graphics gfx)
    {
        //gfx.setColor(Drawing.getColorRGB(218, 250, 122));
        gfx.setColor(Drawing.getColorRGB(98, 168, 85));
        gfx.fillRect(0, 0, 1366, 768);
    }
    
    public void renderForceAllies(Graphics gfx)
    {
        /*for(int x = 0; x < this.battle.getForceAllies().size(); x++)
        {
            //
        }*/
        gfx.drawImage(Drawing.resize(Drawing.getImage("sprite/Kharl/temp1.png"), 200, 200), 900, 80, null);
        gfx.drawImage(Drawing.resize(Drawing.getImage("sprite/Markum/temp1.png"), 200, 200), 900, 230, null);
        gfx.drawImage(Drawing.resize(Drawing.getImage("sprite/Barrat/temp3.png"), 200, 200), 900, 380, null);
    }
    
    public void renderForceEnemies(Graphics gfx)
    {
        
    }
    
    public void renderInterfaceCommands(Graphics gfx)
    {
        gfx.setColor(Color.BLACK);
        gfx.drawRect(25, 493, 250, 250);
    }
    
    public void renderInterfaceMessage(Graphics gfx)
    {
        gfx.setColor(Color.BLACK);
        gfx.drawRect(25, 25, 1316, 50);
    }
    
    public void renderInterfaceOrder(Graphics gfx)
    {
        gfx.setColor(Color.BLACK);
        gfx.drawRect(1141, 100, 200, 400);
    }
    
    public void renderInterfaceParty(Graphics gfx)
    {
        gfx.setColor(Color.BLACK);
        gfx.drawRect(891, 573, 450, 170);
    }
    
    public void tick()
    {
        
    }
    
}