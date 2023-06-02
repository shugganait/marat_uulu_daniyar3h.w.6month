package lib.kg.vp2_svm.commonViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    val count = MutableLiveData<Int>()
    val history = MutableLiveData<ArrayList<String>>()
    private var mHistory = ArrayList<String>()
    private var mCount = 0

    init {
        count.value = mCount
        history.value = mHistory
    }

    fun onIncrementClick() {
        mCount++
        count.value = mCount
        mHistory.add("Completed fun Incrementation")
        history.value = mHistory
    }
    fun onDecrementClick() {
        mCount--
        count.value = mCount
        mHistory.add("Completed fun Decremental")
        history.value = mHistory
    }
}