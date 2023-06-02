package lib.kg.vp2_svm.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import lib.kg.vp2_svm.BaseFragment
import lib.kg.vp2_svm.commonViewModel.SharedViewModel
import lib.kg.vp2_svm.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding, SharedViewModel>() {

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater, container, false)
    }

    override fun setVM(): Class<SharedViewModel> {
        return SharedViewModel::class.java
    }

    override fun initObservers() {
        super.initObservers()
        viewModel.count.observe(viewLifecycleOwner) {
            binding.tvCount.text = it.toString()
        }
    }
}