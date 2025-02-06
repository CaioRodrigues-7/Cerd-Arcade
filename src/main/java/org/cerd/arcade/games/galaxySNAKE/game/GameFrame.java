package org.cerd.arcade.games.galaxySNAKE.game;

import org.cerd.arcade.games.galaxySNAKE.logic.Events;
import org.cerd.arcade.games.galaxySNAKE.ui.Assets;

import javax.swing.*;

public class GameFrame extends JFrame {
    
    Assets assets = new Assets();
    Events events = new Events();
    GamePanel panel = new GamePanel();

    public void screen() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Galaxy Snake Game");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setIconImage(assets.getIcon());
        this.setVisible(true);
        this.setResizable(false);
        events.requestFocusInWindow();
    }  
}
