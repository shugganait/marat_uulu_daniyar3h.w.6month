package lib.kg.vp2_svm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : ViewModel> : Fragment() {
    protected lateinit var binding: VB
    protected lateinit var viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = setBinding(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
        initListener()
        initObservers()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(requireActivity())[setVM()]
    }

    abstract fun setBinding(inflater: LayoutInflater, container: ViewGroup?): VB

    abstract fun setVM(): Class<VM>

    open fun initListener() {}

    open fun initObservers() {}
}