package nl.han.ica.birdhunter;

import java.util.List;

import nl.han.ica.OOPDProcessingEngineHAN.Collision.CollidedTile;
import nl.han.ica.OOPDProcessingEngineHAN.Collision.ICollidableWithTiles;
import nl.han.ica.OOPDProcessingEngineHAN.Exceptions.TileNotFoundException;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.AnimatedSpriteObject;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;
import nl.han.ica.waterworld.tiles.BoardsTile;
import processing.core.PVector;

public class Hunter extends AnimatedSpriteObject implements ICollidableWithTiles{
	
	private Birdhunter world;
	
	public Hunter(Birdhunter world) {
		super(new Sprite("src/main/java/nl/han/ica/waterworld/media/hunter-sprite.png"),3);
		this.world = world;
		setCurrentFrameIndex(1);
	}
	
	@Override
	public void update() {
        if (getX()<=0) {
            setxSpeed(0);
            setX(0);
        }
        if (getX()>=world.getWidth()-100) {
            setxSpeed(0);
            setX(world.getWidth() - 100);
        }

    }
	
	public void keyPressed(int keyCode, char key) {

        if (keyCode == world.LEFT) {
            setDirectionSpeed(270, 10);
            setCurrentFrameIndex(0);
        }

        if (keyCode == world.RIGHT) {
        	setDirectionSpeed(90, 7);
            setCurrentFrameIndex(2);
        }

        if (key == ' ') {
        	setCurrentFrameIndex(1);
        }
    }

	@Override
	public void tileCollisionOccurred(List<CollidedTile> collidedTiles) {

		
	}

	

}