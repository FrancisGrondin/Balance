/* Copyright (C) Balance Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Francis Grondin and Alexandre Lauzon, September 2017
 */
package balance;

import java.util.Arrays;
import java.util.ArrayList;



public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(new Integer(1), new Integer(2)));
        ArrayList<Integer> b = new ArrayList<>( a );
        System.out.println(a == b);
        Intervention h = new Intervention(new Dollar(-2), "awd", null);
        
        for(Integer A: b){
            System.out.println(A);
        }
        
    }
    
}
