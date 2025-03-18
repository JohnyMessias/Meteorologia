package co.jmessias.meteorologiayt.data.remote

import co.jmessias.meteorologiayt.data.remote.response.WeatherDataResponse

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Float, lng: Float) : WeatherDataResponse
}