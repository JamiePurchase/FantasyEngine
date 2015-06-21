package state;

import gfx.Drawing;
import input.InputKeyboardKey;
import java.awt.Color;
import java.awt.Graphics;

public class StateBattle extends State
{
    
    public StateBattle()
    {
        
    }
    
    public void keyPressed(InputKeyboardKey key)
    {
        
    }
    
    public void keyReleased(InputKeyboardKey key)
    {
        
    }
    
    public void render(Graphics gfx)
    {
        // Temp Background
        //gfx.setColor(Drawing.getColorRGB(218, 250, 122));
        gfx.setColor(Drawing.getColorRGB(98, 168, 85));
        gfx.fillRect(0, 0, 1366, 768);
        
        // Temp Units
        //gfx.drawImage(Drawing.getImage("sprite/Kharl/temp1.png"), 1000, 200, null);
        gfx.drawImage(Drawing.resize(Drawing.getImage("sprite/Kharl/temp1.png"), 200, 200), 900, 80, null);
        gfx.drawImage(Drawing.resize(Drawing.getImage("sprite/Markum/temp1.png"), 200, 200), 900, 230, null);
        gfx.drawImage(Drawing.resize(Drawing.getImage("sprite/Barrat/temp3.png"), 200, 200), 900, 380, null);
        
        // Temp Message
        gfx.setColor(Color.BLACK);
        gfx.drawRect(25, 25, 1316, 50);
        
        // Temp Commands
        gfx.setColor(Color.BLACK);
        gfx.drawRect(25, 493, 250, 250);
        
        // Temp Turns
        gfx.setColor(Color.BLACK);
        gfx.drawRect(1141, 100, 200, 400);
        
        // Temp Party
        gfx.setColor(Color.BLACK);
        gfx.drawRect(891, 573, 450, 170);
    }
    
    public void tick()
    {
        
    }
    
}