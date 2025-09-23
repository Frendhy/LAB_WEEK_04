package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// Titles (string resource IDs)
val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title
)

// Descriptions (string resource IDs) — align index-to-index with TABS_FIXED
val TABS_DESCRIPTION = listOf(
    R.string.starbucks_desc,
    R.string.janjijiwa_desc,
    R.string.kopikenangan_desc
)

class CafeAdapter(private val fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        // Pass the description resource id (Int) to the fragment
        val descResId = TABS_DESCRIPTION[position]
        return CafeDetailFragment.newInstance(descResId)
    }
}
