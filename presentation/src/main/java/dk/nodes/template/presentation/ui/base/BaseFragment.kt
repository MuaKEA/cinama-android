package dk.nodes.template.presentation.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerFragment

import javax.inject.Inject

abstract class BaseFragment : DaggerFragment() {
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    protected inline fun <reified VM : ViewModel> getViewModel(): VM {
        return ViewModelProviders.of(this, viewModelFactory).get(VM::class.java)
    }

    protected inline fun <reified VM : ViewModel> getSharedViewModel(): VM {
        return ViewModelProviders.of(requireActivity(), viewModelFactory).get(VM::class.java)
    }

    protected inline fun <reified VM : ViewModel> viewModel(): Lazy<VM> = lifecycleAwareLazy(this) {
        getViewModel<VM>()
    }

    protected inline fun <reified VM : ViewModel> sharedViewModel(): Lazy<VM> = lifecycleAwareLazy(this) {
        getSharedViewModel<VM>()
    }
}