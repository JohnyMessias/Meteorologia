package co.jmessias.meteorologiayt.data.repository

import co.jmessias.meteorologiayt.data.model.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Float, lng: Float): WeatherInfo
}