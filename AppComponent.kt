package com.shoppingapp.hilt

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    // Function to provide the service implementation
    fun provideMyService(): MyService
}