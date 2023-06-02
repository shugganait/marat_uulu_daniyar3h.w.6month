package lib.kg.vp2_svm.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import lib.kg.vp2_svm.BaseFragment
import lib.kg.vp2_svm.commonViewModel.SharedViewModel
import lib.kg.vp2_svm.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding, SharedViewModel>() {
    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater, container, false)
    }

    override fun setVM(): Class<SharedViewModel> {
        return SharedViewModel::class.java
    }

    override fun initListener() {
        super.initListener()
        binding.apply {
            btnIncrement.setOnClickListener { viewModel.onIncrementClick() }
            btnDecrement.setOnClickListener { viewModel.onDecrementClick() }
        }
    }
}