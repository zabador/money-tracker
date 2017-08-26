package net.zabador.money.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.content.Intent
import android.os.Bundle
import net.zabador.money.R

/**
 * Created by libinsalal on 10/8/15.
 */
class NotificationEnableDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.dialog_title_enable_notifications)
                .setMessage(getString(R.string.dialog_message_enable_notifications))
                .setPositiveButton(R.string.dialog_button_enable_now, { dialog, which ->
                    dialog.dismiss()
                    // navigate to settings
                    navigateToSettings()
                })
                .setNegativeButton(R.string.dialog_button_cancel, { dialog, which -> dialog.dismiss() })
                .setCancelable(false)
                .create()
    }

    private fun navigateToSettings() {
        startActivity(Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"))
        activity.finish()
    }

    companion object {

        fun newInstance(): DialogFragment {
            return NotificationEnableDialogFragment()
        }
    }

}
