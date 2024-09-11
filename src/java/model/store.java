
package model;

public class store {
    
    private String id;
    private String toyName;
    private String Type;
    private String size;
    private String color;
    private int price;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return toyName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String toyName) {
        this.toyName = toyName;
    }
    
    /**
     * @return the name
     */
    public String getType() {
        return Type;
    }

    /**
     * @param name the name to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }
    
    /**
     * @return the name
     */
    public String getsize() {
        return size;
    }

    /**
     * @param name the name to set
     */
    public void setsize(String size) {
        this.size = size;
    }
    
    /**
     * @return the name
     */
    public String getcolor() {
        return color;
    }

    /**
     * @param name the name to set
     */
    public void setcolor(String color) {
        this.color = color;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
}