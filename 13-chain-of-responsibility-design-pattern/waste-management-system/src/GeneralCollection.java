/**
 * This class handles general waste collection.
 * It acts as a fallback handler for any waste type that doesn't match specific handlers.
 */
public class GeneralCollection implements CollectionChain {

    /**
     * Sets the next handler in the chain
     */
    @Override
    public void setNextChain(CollectionChain nextChain) {
        // This is the final handler, so no next chain is needed
    }

    /**
     * Collects waste from a container.
     * This handler processes any type of waste as a fallback.
     */
    @Override
    public void collect(WasteContainer container) {
        System.out.println("Collecting general waste from " + container.getLocation());
        System.out.println("Type: " + container.getType());
        System.out.println("Capacity: " + container.getCapacity());
        System.out.println("Processing for landfill disposal...");
    }
}
