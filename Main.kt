
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import com.example.safety.R
import com.example.safety.weather.WeatherApi
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val API_KEY = "YOUR_API_KEY"
    private val CITY = "Chennai"//YOUR CITY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherText = findViewById<TextView>(R.id.weatherText)
        val refreshBtn = findViewById<Button>(R.id.refreshBtn)

        fun loadWeather() {
            lifecycleScope.launch {
                weatherText.text = "Loading..."
                val weather = WeatherApi.getWeather(API_KEY, CITY)

                if (weather != null) {
                    weatherText.text = "${weather.temp.toInt()}°C\n${weather.condition}"
                } else {
                    weatherText.text = "Error loading weather"
                }
            }
        }

        // Load weather on start
        loadWeather()

        // Refresh button
        refreshBtn.setOnClickListener {
            loadWeather()
        }
    }
}
