package com.shoppingapp.hilt

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    // Function to provide the service implementation
    @Provides
    fun provideMyService(): MyService {
        return MyServiceImpl()
    }
}