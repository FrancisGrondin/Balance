/* Copyright (C) Balance Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Francis Grondin and Alexandre Lauzon, September 2017
 */
package balance;

import java.util.ArrayList;


public class Intervention {
    
    private ArrayList<UsedPiece> usedPiecesList;
    private String documentation;
    private Dollar price;
    
    
    //Constructors
    public Intervention(){
        this.price = null;
        this.usedPiecesList = null;
        this.documentation = null;
    }
     
    public Intervention(Dollar price, String documentation, ArrayList<UsedPiece> usedPiecesList){
        this.price = new Dollar(price.getPenny());
        this.usedPiecesList = new ArrayList<> (usedPiecesList);
        this.documentation = documentation;
    }
    
    public Intervention(Intervention x){
        this(x.price, x.documentation, new ArrayList(x.usedPiecesList));
    }
        
    //Setters
    public void setPrice(Dollar price){
        this.price = price;
    }
    
    public void setDocumentation(String documentation){
        this.documentation = documentation;
    }
    
    public void setUsedPieceList(ArrayList<UsedPiece> usedPieceList){
        this.usedPiecesList = new ArrayList<>(usedPieceList);
    }
    
    //Getters
    public Dollar getPrice(){
        return price;
    }
    
    public String getDocumentation(){
        return documentation;
    }
    
    public ArrayList<UsedPiece> getUsedPiecesList(){
        return usedPiecesList;
    }
    
    
}
