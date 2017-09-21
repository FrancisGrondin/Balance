/* Copyright (C) Balance Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Francis Grondin and Alexandre Lauzon, September 2017
 */
package balance;

import java.io.IOException;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class JsonFile {
    
    /**
     * parse a string file that is written in JSON format in a JSONObject.
     * 
     * @param file the string file in JSON format.
     * @return source the input file parse in JSONObject.
     */
    public static JSONObject parseJson(String file) {
        JSONObject source = null;
        try {
            source = (JSONObject) JSONSerializer.toJSON(file);
        } catch (JSONException e) {
            System.out.print("ERR : File is not in JSON format.");
            System.exit(1);
        }
        return source;
    }

    /**
     * open a file that is written in UTF8 in a string file.
     *
     * @param inputFile the file in UTF8.
     * @return readFile the input file written in UTF8 in a string.
     */
    public static String openJson(String inputFile) {
        String readFile = null;

        try {
            readFile = Utf8File.loadFileIntoString(inputFile);
        } catch (IOException e) {
            System.out.print("ERR : The input file is not loadable.");
            System.exit(1);
        }

        return readFile;
    }

    /**
     * write a JSONObject in a file.
     *
     * @param file
     * @param output the JSONObject to write.
     */
    public static void writeJson(String file, JSONObject output) {
        try {
            Utf8File.saveStringIntoFile(file, output.toString(2));
        } catch (IOException e) {
            System.out.println("ERR : The output file -> " + e.getLocalizedMessage());
            System.exit(1);
        }
    }

}
