package co.jmessias.meteorologiayt.data

import co.jmessias.meteorologiayt.data.remote.RemoteDataSource
import co.jmessias.meteorologiayt.data.remote.response.WeatherDataResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class KtorRemoteDataSource @Inject constructor(
    private val httpClient: HttpClient
): RemoteDataSource {

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/data/2.5"
        private const val API_KEY = "2bcd66f1719b7f3884a7c4589340b0ef"
    }

    override suspend fun getWeatherDataResponse(lat: Float, lng: Float): WeatherDataResponse {
        return httpClient
            .get("${BASE_URL}/weather?lat=$lat&lon=$lng&appid=${API_KEY}&units=metric")
            .body()
    }

}