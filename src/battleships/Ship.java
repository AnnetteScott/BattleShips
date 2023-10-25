package battleships;

/**
 *
 * @author gmt3870
 */
public abstract class Ship {
    private final int size;
    private Point[] location;

    public Ship(int size){
        this.size = size;
        this.location = new Point[size];
    }
    
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the location
     */
    public Point[] getLocation() {
        return location;
    }
    
    /**
     * @param location the location to set
     */
    public void setLocation(Point[] location) {
        this.location = location;
    }
    
    /**
     * Whether the ship has been sunk
     * @return Boolean
     */
    public boolean isSunk(){
        boolean sunk = true;
        for(Point point : location){
            if(point.getState().equals(PointState.Ship)){
                sunk = false;
                break;
            }
        }
        return sunk;
    }
}
