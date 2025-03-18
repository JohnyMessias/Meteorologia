package co.jmessias.meteorologiayt.data.di

import co.jmessias.meteorologiayt.data.KtorRemoteDataSource
import co.jmessias.meteorologiayt.data.remote.RemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    @Singleton
    fun bindRemoteDataSource(remoteDataSource: KtorRemoteDataSource) : RemoteDataSource
}