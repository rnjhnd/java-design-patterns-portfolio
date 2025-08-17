/**
 * This is the interface for the Chain of Responsibility pattern.
 * Each waste collection handler must implement this interface.
 */
public interface CollectionChain {
    
    /**
     * Sets the next handler in the chain
     */
    void setNextChain(CollectionChain nextChain);
    
    /**
     * Collects waste from a container. If this handler can't handle it,
     * it passes the request to the next handler in the chain.
     */
    void collect(WasteContainer container);
}
