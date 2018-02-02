package business;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Created by Nuno on 02/02/2018.
 */
public class State {

    private Point2D player;
    private ArrayList<Point2D> boxes;

    public State(Point2D player, ArrayList<Point2D> boxes){
        this.player = (Point2D) player.clone();
        this.boxes = (ArrayList<Point2D>) boxes.clone();
    }

    public Point2D getPlayer() {
        return player;
    }

    public ArrayList<Point2D> getBoxes() {
        return boxes;
    }
}