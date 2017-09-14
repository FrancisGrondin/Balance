/* Copyright (C) Balance Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Francis Grondin and Alexandre Lauzon, September 2017
 */
package balance;


public class Dollar {

    private int penny;
    
    //Constructors
    public Dollar() {
	this.penny = 0;
    }
    
    public Dollar(int penny) {
        this.penny = penny;
    }
    
    public Dollar(Dollar x){
        this.penny = x.getPenny();
    }

    //Setters
    public void setPenny(int a) {
        this.penny = a;
    }
    
    //Getters
    public int getPenny() {
        return penny;
    }

    
    public void add(Dollar a) {
        this.penny = this.penny + a.getPenny();
    }

    public String printDollar() {
        String dollar = null;
        int nbDollar = getPenny() / 100;
        int nbPenny = getPenny() % 100;
        
        if (nbPenny < 10) {
            dollar = nbDollar + ".0" + nbPenny + "$";
        } else {
            dollar = nbDollar + "." + nbPenny + "$";
        }
        return dollar;
    }

}
