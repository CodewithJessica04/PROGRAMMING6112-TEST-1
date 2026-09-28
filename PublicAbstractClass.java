/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Abstract class
public abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSales;
    
    // constructor
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
    
    // getter methods
    public String getConsoleType() {
        return consoleType;
    }
    
    public String getStore() {
        return storeName;
    }
    
    public int getTotalSales() {
        return totalSales;
    }
}
