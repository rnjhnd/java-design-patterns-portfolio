/**
 * This class represents a waste container.
 * It stores information about the type of waste and its capacity.
 */
public class WasteContainer {
    private String type;
    private int capacity;
    private String location;
    
    /**
     * Creates a new waste container
     * @param type The type of waste (organic, recyclable, hazardous, general)
     * @param capacity The maximum capacity of the container
     * @param location Where the container is located
     */
    public WasteContainer(String type, int capacity, String location) {
        this.type = type.toLowerCase();
        this.capacity = capacity;
        this.location = location;
    }
    
    /**
     * Gets the type of waste this container holds
     */
    public String getType() {
        return type;
    }
    
    /**
     * Gets the capacity of this container
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * Gets the location of this container
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Returns a string representation of the container
     */
    @Override
    public String toString() {
        return "WasteContainer{type='" + type + "', capacity=" + capacity + ", location='" + location + "'}";
    }
}