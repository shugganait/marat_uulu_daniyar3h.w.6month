package lib.kg.vp2_svm.vpadapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import lib.kg.vp2_svm.fragments.FirstFragment
import lib.kg.vp2_svm.fragments.SecondFragment
import lib.kg.vp2_svm.fragments.ThirdFragment

class ViewPagerAdapter(activity: FragmentActivity) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> throw IllegalArgumentException("Exception")
        }
    }
}