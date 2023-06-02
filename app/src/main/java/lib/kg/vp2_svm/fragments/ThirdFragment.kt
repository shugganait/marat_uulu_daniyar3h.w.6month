package lib.kg.vp2_svm.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import lib.kg.vp2_svm.BaseFragment
import lib.kg.vp2_svm.commonViewModel.SharedViewModel
import lib.kg.vp2_svm.databinding.FragmentThirdBinding

class ThirdFragment : BaseFragment<FragmentThirdBinding, SharedViewModel>() {
    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(inflater,container,false)
    }

    override fun setVM(): Class<SharedViewModel> {
        return SharedViewModel::class.java
    }

    override fun initObservers() {
        super.initObservers()
        viewModel.history.observe(viewLifecycleOwner) {
            binding.tvList.text = "History: $it"
        }
    }

}