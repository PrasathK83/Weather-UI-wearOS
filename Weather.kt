
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.URL

object WeatherApi {

    suspend fun getWeather(apiKey: String, city: String): WeatherData? {
        return withContext(Dispatchers.IO) {
            try {
                val url =
                    "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$apiKey&units=metric"

                val response = URL(url).readText()

                val json = JSONObject(response)
                val main = json.getJSONObject("main")
                val weather = json.getJSONArray("weather").getJSONObject(0)

                WeatherData(
                    temp = main.getDouble("temp"),
                    condition = weather.getString("main")
                )
            } catch (e: Exception) {
                null
            }
        }
    }
}
