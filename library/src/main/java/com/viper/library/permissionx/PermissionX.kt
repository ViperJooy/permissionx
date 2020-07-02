package com.viper.library.permissionx

import androidx.fragment.app.FragmentActivity

/**
 * Created by viper.
 * Time: 20-7-1 17:32:18
 * Description:
 */
object PermissionX {
    private const val TAG = "InVisibleFragment"
    fun request(
        activity: FragmentActivity,
        vararg permissions: String,
        callback: PermissionCallback
    ) {
        val fragmentManager = activity.supportFragmentManager
        val existedFragment = fragmentManager.findFragmentByTag(TAG)
        val fragment = if (existedFragment != null) {
            existedFragment as InvisibleFragment
        } else {
            val invisibleFragment = InvisibleFragment()
            fragmentManager.beginTransaction().add(invisibleFragment, TAG).commitNow()
            invisibleFragment
        }
        fragment.requestNow(callback, *permissions)
    }
}