package com.myfirstspringproject.firsttask;

// package com.myfirstspringproject.firsttask;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileOutputStream;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import java.net.HttpURLConnection;
// import java.net.URL;

// import org.springframework.web.bind.annotation.GetMapping;
// //import org.springframework.web.bind.annotation.RequestMapping;
// //import org.springframework.web.bind.annotation.RequestParam;
// import com.mashape.unirest.http.Unirest;

// // @RestController
public class WeatherController {
    

  public static void main(String[] args) {
  }
}
//         try {
//             URL u = new URL("https://www.accuweather.com/en/in/visakhapatnam/202192/weather-forecast/202192?current=true");
//             HttpURLConnection hr = (HttpURLConnection) u.openConnection();
//             System.out.println(hr.getResponseCode());
//             if (hr.getResponseCode() == 200) {
//                 InputStream im = hr.getInputStream();
//                 StringBuffer sb = new StringBuffer();
//                 BufferedReader br = new BufferedReader(new InputStreamReader(im));
//                 FileOutputStream fo = new FileOutputStream("C:\\Users\\Public\\MuleSoft docs\\output.txt");
//                 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
//                  String line = br.readLine();
//                 while (line != null) {
//                     System.out.println(line);
//                     bw.write(line);
//                     bw.newLine();
                   

//                 }

//             }

//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }

// }

// // @GetMapping("/weather")
// // public String getCurrentWeather(){
// // try {

// // com.mashape.unirest.http.HttpResponse<com.mashape.unirest.http.JsonNode>
// // response = Unirest.get("https://api.open-meteo.com/v1/forecast")
// // .queryString("daily","temperature_2m_max,temperature_2m_min,sunrise,sunset")
// // .queryString("longitude",44.3148)
// // .queryString("latitude",85.6024)
// // .queryString("current_weather",true)
// // .queryString("forecast_days",1)
// // .queryString("timezone","auto")
// // .header("content-type","application/json")
// // .asJson();
// // System.out.println("response 1"+response.getBody());
// // System.out.println("----------------------");
// // System.out.println("response 2"+response.toString());
// // System.out.println("----------------------");
// // System.out.println("response 3"+response.getBody());
// // String myobj = response.toString();
// // return myobj;
// // //System.out.println("the weather is "+myobj);
// // } catch (Exception e) {
// // e.printStackTrace();
// // }
// // return "success";
// // }

// // @GetMapping("/getLinkToFile/{id}")
// // public URL getLinkToFile(@PathVariable int id) throws Exception {
// // URL base = new
// // URL("https://weather.com/en-IN/weather/today/l/17.74,83.34?par=google");
// // return base;
// // }
