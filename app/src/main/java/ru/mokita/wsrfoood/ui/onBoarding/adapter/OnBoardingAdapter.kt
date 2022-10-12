package ru.mokita.wsrfoood.ui.onBoarding.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.mokita.wsrfoood.ui.onBoarding.onBoardingFirst.OnBoardingFirstFragment
import ru.mokita.wsrfoood.ui.onBoarding.onBoardingSecond.OnBoardingSecondFragment

class OnBoardingAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            1 -> OnBoardingFirstFragment()
            else -> OnBoardingSecondFragment()
        }
    }
}