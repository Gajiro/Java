package jp.co.july.tokyo.weatherforecasts;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Created by kato.yuzo on 2015/09/15.
 */
public class WeatherApi {
    private static final String USER_AGENT = "WeatherForecasts Sample";
    private static final String WebAPI ="http://weather.livedoor.com/forecast/webservice/json/v1?city=";

    public static String getWeather(Context context, String pointId)
        throws IOException {

        String resultStr = new String();

        try {
            HttpURLConnection connection = null;
            URL url = new URL(WebAPI + pointId);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            connection.connect();

            if (connection.getResponseCode() != 200) {
                resultStr = "failed";
                return resultStr;
            }

            BufferedInputStream inputStream = new BufferedInputStream(connection.getInputStream());
            ByteArrayOutputStream responseArray = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];

            int length;
            while ((length = inputStream.read(buff)) != -1) {
                if (length > 0) {
                    responseArray.write(buff, 0, length);
                }
            }

            JSONObject jsonObj = new JSONObject(new String(responseArray.toByteArray()));
            resultStr = jsonObj.toString();

        } catch (Exception e) {
            resultStr = e.getMessage();
        }
        return resultStr;
    }










        /*
        HttpURLConnection client = AndroidHttpURLConnection.newInstance(USER_AGENT, context);
            HttpGet get = new HttpGet(URL + pointId);

        StringBuilder sb = new StringBuilder();
        try{
            HttpResponse response = client.execute(get);
            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            String line = null;
            while ((line = br.readLine()) != null){
                sb.append(line);
            }

        }finally{
            client.close();
        }
        return sb.toString();

        }
    */

}
