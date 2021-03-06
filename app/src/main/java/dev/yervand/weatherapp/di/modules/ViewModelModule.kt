package dev.yervand.weatherapp.di.modules

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dev.yervand.weatherapp.base.ViewModelKey
import dev.yervand.weatherapp.weather.WeatherActivityViewModel


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(WeatherActivityViewModel::class)
    internal abstract fun bindWeatherViewModel(weatherViewModel: WeatherActivityViewModel): ViewModel

}