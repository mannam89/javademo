package ANY;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPI {
    public static void main(String[] args) {
        try {
            // 1. API URL 설정
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather";
            String city = "Seoul";
            String apiKey = "YOUR_API_KEY";  // 실제 키로 교체 필요
            
            // 2. 완전한 URL 만들기
            String fullUrl = apiUrl + "?q=" + city + "&appid=" + apiKey;
            
            // 3. API 호출
            URL url = new URL(fullUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            // 4. 응답 받기
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );
            
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            
            // 5. 결과 출력
            System.out.println("날씨 정보: " + response.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}