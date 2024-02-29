package com.cars.whereismycar.API.HttpApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpApi {

    static String getId(String URLAdd) throws IOException {
        URLConnection urlConnection = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(URLAdd);
            urlConnection = url.openConnection();

            inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);

            return bufferedReader.readLine();

        } catch (IOException e) {
            return "0";
        } finally {
            if (inputStreamReader != null)
                inputStreamReader.close();
            if (bufferedReader != null)
                bufferedReader.close();
        }
    }

}
