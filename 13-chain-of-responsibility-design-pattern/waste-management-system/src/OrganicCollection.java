/**
 * This class handles organic waste collection.
 * It implements the Chain of Responsibility pattern.
 */
public class OrganicCollection implements CollectionChain {
    private CollectionChain nextChain;

    /**
     * Sets the next handler in the chain
     */
    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.nextChain = nextChain;
    }

    /**
     * Collects waste from a container.
     * If the container has organic waste, this handler processes it.
     * Otherwise, it passes the request to the next handler.
     */
    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equals("organic")) {
            System.out.println("Collecting organic waste from " + container.getLocation());
            System.out.println("Capacity: " + container.getCapacity());
            System.out.println("Processing for composting...");
        } else {
            // Pass to next handler in the chain
            if (nextChain != null) {
                nextChain.collect(container);
            }
        }
    }
}
