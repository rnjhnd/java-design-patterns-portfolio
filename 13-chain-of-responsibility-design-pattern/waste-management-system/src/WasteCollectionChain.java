/**
 * This class manages the chain of waste collection handlers.
 * It demonstrates the Chain of Responsibility pattern.
 */
public class WasteCollectionChain {
    private CollectionChain firstHandler;

    /**
     * Creates a new waste collection chain and sets up the handlers
     */
    public WasteCollectionChain() {
        // Create the handlers
        OrganicCollection organicHandler = new OrganicCollection();
        RecyclableCollection recyclableHandler = new RecyclableCollection();
        HazardousCollection hazardousHandler = new HazardousCollection();
        GeneralCollection generalHandler = new GeneralCollection();

        // Set up the chain: Organic -> Recyclable -> Hazardous -> General
        firstHandler = organicHandler;
        organicHandler.setNextChain(recyclableHandler);
        recyclableHandler.setNextChain(hazardousHandler);
        hazardousHandler.setNextChain(generalHandler);
        
        System.out.println("Waste Collection Chain created successfully!");
    }

    /**
     * Collects waste from a container by passing it through the chain
     */
    public void collect(WasteContainer container) {
        System.out.println("Processing container: " + container);
        firstHandler.collect(container);
        System.out.println("Collection completed!");
    }
}
