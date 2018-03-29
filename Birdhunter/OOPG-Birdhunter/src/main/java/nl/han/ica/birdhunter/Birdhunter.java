package nl.han.ica.birdhunter;
import java.util.ArrayList;

import com.sun.prism.image.ViewPort;
import nl.han.ica.OOPDProcessingEngineHAN.Dashboard.Dashboard;
import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.OOPDProcessingEngineHAN.Persistence.FilePersistence;
import nl.han.ica.OOPDProcessingEngineHAN.Persistence.IPersistence;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileMap;
import nl.han.ica.OOPDProcessingEngineHAN.Tile.TileType;
import nl.han.ica.OOPDProcessingEngineHAN.View.EdgeFollowingViewport;
import nl.han.ica.OOPDProcessingEngineHAN.View.View;
import nl.han.ica.waterworld.Player;
import nl.han.ica.waterworld.Swordfish;
import nl.han.ica.waterworld.tiles.BoardsTile;
import processing.core.PApplet;


import nl.han.ica.OOPDProcessingEngineHAN.Engine.GameEngine;

public class Birdhunter extends GameEngine{
	
	private ArrayList<Bird> birds = new ArrayList<>();

	public static void main(String[] args) {
		 PApplet.main(new String[]{"nl.han.ica.birdhunter.Birdhunter"});

	}

	@Override
	public void setupGame() {
		 createViewWithoutViewport(1920, 1080);
		 
		 Hunter h = new Hunter(this);
		 addGameObject(h, 100, 700);
		 BirdSpawner b = new BirdSpawner(this, 5);
		 
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	private void createViewWithoutViewport(int screenWidth, int screenHeight) {
        View view = new View(screenWidth,screenHeight);
        view.setBackground(loadImage("src/main/java/nl/han/ica/birdhunter/media/background1.jpg"));
        
        setView(view);
        size(screenWidth, screenHeight);
    }

}
