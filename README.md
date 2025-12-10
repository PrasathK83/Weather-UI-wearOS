# Weather-UI-wearOS
Developed the weather UI with the real time weather data on the smart watch using the WearOS



# Wear OS Weather Monitor – Tile and App

A lightweight Wear OS application that shows real-time weather information using the OpenWeather API.
The project includes both a standalone Wear OS app screen and a dynamic Weather Tile.



## Features

### Wear OS Weather Tile

* Displays current temperature
* Shows real-time weather condition (Clear, Clouds, Rain, etc.)
* Updates whenever the tile is viewed
* Optimized for low power and fast loading

### Wear OS App Interface

* Displays temperature and weather condition
* Includes a manual refresh button
* Built for round and small Wear OS screens
* Simple and responsive UI

### Weather Backend

* Uses the OpenWeatherMap API
* Fetches temperature and condition data
* Uses JSON parsing for lightweight processing
* Safe exception handling to avoid crashes


## Technologies Used

* Kotlin
* Wear OS API Level 34–36
* Jetpack Tiles (Horologist Tile Service)
* OpenWeather REST API
* Coroutines (for background network calls)
* Android XML Layouts



## How It Works

1. The user opens the app or views the tile.
2. The app requests current weather data from OpenWeather.
3. WeatherApi fetches JSON data and converts it into a WeatherData model.
4. MainActivity and MainTileService display the temperature and condition.



## Setup Instructions

1. Clone the repository
2. Open the project in Android Studio
3. Replace the API key in `WeatherApi.kt` with your OpenWeather API key
4. Run the project on a Wear OS emulator or physical watch



## Future Improvements (Optional)

* Add weather icons (sun, clouds, rain)
* Add hourly or weekly forecast
* Add auto-refresh intervals for the tile
* Add city selection from the watch

