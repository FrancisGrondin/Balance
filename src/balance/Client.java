/* Copyright (C) Balance Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Francis Grondin and Alexandre Lauzon, September 2017
 */
package balance;

import java.util.ArrayList;

public class Client {

    private String name;
    private String firstname;
    private ArrayList<Intervention> interventionsList;
    
    //Constructors
    public Client(){
        this.name = null;
        this.firstname = null;
        this.interventionsList = null;
    
    }
    
    public Client(String name, String firstname, ArrayList<Intervention> interventionsList){
        this.name = name;
        this.firstname = firstname;
        this.interventionsList = new ArrayList<>(interventionsList);
    }
    
    public Client(Client e){
       this(e.name, e.firstname, new ArrayList(e.interventionsList));
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    
    public void setInterventionsList(ArrayList<Intervention> interventionsList){
        this.interventionsList = new ArrayList<>(interventionsList);
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    public String getFirstname(){
        return firstname;
    }
    
    public ArrayList<Intervention> getInterventionsList(){
        return interventionsList;
    }
    
}
