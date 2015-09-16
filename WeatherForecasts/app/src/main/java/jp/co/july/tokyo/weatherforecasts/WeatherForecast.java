package jp.co.july.tokyo.weatherforecasts;

import android.text.style.ForegroundColorSpan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by kato.yuzo on 2015/09/16.
 */
public class WeatherForecast {

    public final Location location;
    public  final List<Forecast> forecastList = new ArrayList<Forecast>();

    public  WeatherForecast(JSONObject jsonObject) throws JSONException{
        JSONObject locationObject = jsonObject.getJSONObject("location");
        location = new Location(locationObject);

        JSONArray forecastArray = jsonObject.getJSONArray("forecasts");

        int len = forecastArray.length();
        for(int i = 0; i < len; i++){
            JSONObject forecastJson = forecastArray.getJSONObject(i);
            Forecast forecast = new Forecast(forecastJson);

        }
    }

    public class Location{
        public final String area;
        public final String prefecture;
        public final String city;

        public Location (JSONObject jsonObject) throws  JSONException{
            area = jsonObject.getString("area");
            prefecture = jsonObject.getString("prefucture");
            city = jsonObject.getString("city");
        }
    }

    public class Forecast{
        public final String date;
        public final String dateLabel;
        public final Image image;
        public final Temperature;

        public Forecast (JSONObject jsonObject) throws JSONException{
            date = jsonObject.getString("date");
            telop = jsonObject.getString("telop");
            image = new Image (jsonObject.getJSON("temperature));

        }

        public class Image{
            public final String title;
            public final String link;
            public final String url;
            public final int width ;
            public final int height;

            public Image (JSONObject jsonObject) throws JSONException{
                title = jsonObject.getString("title");
                if(jsonObject.has("link")){
                    link  = jsonObject.getString("link");
                }else{
                    link = null;

                }

                url = jsonObject.get("url");
                width = jsonObject.getInt("width");
                height = jsonObject.getInt("height";)

            }

        }
    public class Temperture{
        public final Temp min;
        public final Temp max;

        public Temperture (JSONObject jsonObject) throws JSONException{
            if (!jsonObject.isNull("min")) {
                min = new Temp(jsonObject.getJSONObject("max"));
            }else{
                max = new Temp(null);
            }
            public class Temp{
                public final String celsius;
                public final String fahrenheit;
            }
        }

    }





    }







}
