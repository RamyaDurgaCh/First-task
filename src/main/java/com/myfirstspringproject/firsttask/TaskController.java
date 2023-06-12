package com.myfirstspringproject.firsttask;

import org.springframework.web.bind.annotation.GetMapping;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TaskController {
    @GetMapping("/health")
    @ResponseBody
    public String MyFirstApi() {
        return "Running sucessfully..";
    }

    @GetMapping("/weather")
    @ResponseBody
    public String getCurrentWeather() {
        try {

            com.mashape.unirest.http.HttpResponse<com.mashape.unirest.http.JsonNode> response = Unirest
                    .get("https://api.open-meteo.com/v1/forecast?")
                    .queryString("daily", "temperature_2m_max,temperature_2m_min,sunrise,sunset")
                    .queryString("longitude", 44.3148)
                    .queryString("latitude", 85.6024)
                    .queryString("current_weather", true)
                    .queryString("forecast_days", 1)
                    .queryString("timezone", "auto")
                    .header("content-type", "application/json")
                    .asJson();
            System.out.println("response  1" + response.getBody());
            System.out.println("----------------------");
            System.out.println("response  2" + response.toString());
            System.out.println("----------------------");
            System.out.println("response  3" + response.getBody());
            String myobj = response.getBody().toString();
            return myobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

}
