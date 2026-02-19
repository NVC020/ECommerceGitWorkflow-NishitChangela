package ca.sheridan.ecommerce;

public class InventoryTracker {

    public static void main(String[] args) {
        System.out.println("Inventory Tracker started...");
    }

    // Method 1: Check stock level
    public void checkStockLevel(String productId, int currentStock) {
        System.out.println("Checking stock for product: " + productId);
        System.out.println("Current stock: " + currentStock);
    }

   
    }
