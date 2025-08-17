/**
 * This is the main class that demonstrates the Chain of Responsibility pattern.
 * It creates waste containers and processes them through the collection chain.
 */
public class WasteManagement {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("========== Waste Management System ==========");
        System.out.println("=============================================");
        
        // Create the waste collection chain
        WasteCollectionChain chain = new WasteCollectionChain();
        
        // Create different types of waste containers
        WasteContainer organicContainer = new WasteContainer("organic", 10, "Downtown Park");
        WasteContainer recyclableContainer = new WasteContainer("recyclable", 20, "Shopping Mall");
        WasteContainer hazardousContainer = new WasteContainer("hazardous", 5, "Industrial Zone");
        WasteContainer generalContainer = new WasteContainer("general", 15, "Residential Area");
        
        System.out.println("\n--- Processing Containers ---");
        
        // Process each container through the chain
        chain.collect(organicContainer);
        System.out.println();
        
        chain.collect(recyclableContainer);
        System.out.println();
        
        chain.collect(hazardousContainer);
        System.out.println();
        
        chain.collect(generalContainer);
    }
}