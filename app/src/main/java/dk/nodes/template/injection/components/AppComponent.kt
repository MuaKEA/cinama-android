package dk.nodes.template.injection.components

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dk.nodes.template.App
import dk.nodes.template.injection.DataModule
import dk.nodes.template.injection.modules.*
import dk.nodes.template.models.SavedMovie
import dk.nodes.template.presentation.injection.PresentationModule
import dk.nodes.template.presentation.injection.ViewModelBuilder
import javax.inject.Singleton

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ViewModelBuilder::class,
        PresentationModule::class,
        AppModule::class,
        ExecutorModule::class,
        InteractorModule::class,
        RestModule::class,
        RestRepositoryBinding::class,
        StorageBindingModule::class,
        DataModule::class
    ]
)
@Singleton
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<App>
}