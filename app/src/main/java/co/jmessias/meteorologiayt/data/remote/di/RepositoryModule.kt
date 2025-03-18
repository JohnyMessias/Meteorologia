package co.jmessias.meteorologiayt.data.remote.di

import co.jmessias.meteorologiayt.data.repository.WeatherRepository
import co.jmessias.meteorologiayt.data.repository.WeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {

    @Binds
    fun bindWeatherRepository(repository: WeatherRepositoryImpl): WeatherRepository
}
