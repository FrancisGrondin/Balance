/* Copyright (C) Balance Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Francis Grondin and Alexandre Lauzon, September 2017
 */
package balance;

public class UsedPiece {

    private String id;
    private Dollar price;

    // Constructors
    public UsedPiece() {
        this.id = null;
        this.price = null;
    }

    public UsedPiece(String id, Dollar price) {
        this.id = id;
        this.price = price;
    }

    public UsedPiece(UsedPiece x) {
        this.id = x.id;
        this.price = x.price;
    }

    //Setters
    public void setPrice(Dollar price) {
        this.price = price;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    //Getters
    public Dollar getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
