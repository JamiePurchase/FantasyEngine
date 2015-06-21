package state;

import app.Engine;
import gfx.Drawing;
import input.InputKeyboardKey;
import java.awt.Color;
import java.awt.Graphics;

public class StateTitle extends State
{
    
    public StateTitle()
    {
        //
    }

    public void keyPressed(InputKeyboardKey key)
    {
        System.out.println();
        Engine.setState(new StateBattle());
    }

    public void keyReleased(InputKeyboardKey key)
    {
        //
    }

    public void render(Graphics gfx)
    {
        gfx.setColor(Color.BLACK);
        gfx.fillRect(0, 0, 1366, 768);
        gfx.setColor(Color.WHITE);
        gfx.setFont(Engine.getThemeFont("TITLE"));
        Drawing.write(gfx, "FANTASY ENGINE", 683, 100, "CENTER");
    }

    public void tick()
    {
        //
    }
    
}