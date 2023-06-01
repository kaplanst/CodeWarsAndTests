package project1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ApiGetText {
    public static void main(String[] args){
        String country = "Iraq";
        String output  = getUrlContents("https://jsonmock.hackerrank.com/api/countries?name=" + country);

//        System.out.println(output);
        String capital = output.substring(output.lastIndexOf("capital\":\"") + 10);

        capital = capital.substring(0, capital.indexOf('"'));
        System.out.println(capital);
    }

    private static String getUrlContents(String theUrl)
    {
        StringBuilder content = new StringBuilder();
        // Use try and catch to avoid the exceptions
        try
        {
            URL url = new URL(theUrl); // creating a url object
            URLConnection urlConnection = url.openConnection(); // creating a urlconnection object

            // wrapping the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            // reading from the urlconnection using the bufferedreader
            while ((line = bufferedReader.readLine()) != null)
            {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return content.toString();
    }
}