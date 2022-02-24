package ru.proghouse.robocam;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

@TargetApi(11)
/* renamed from: ru.proghouse.robocam.c */
public class C2698c extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        final Fragment parentFragment = getParentFragment();
        return new AlertDialog.Builder(getActivity()).setMessage(getArguments().getInt("message_id")).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            /* class ru.proghouse.robocam.C2698c.C27002 */

            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    Bundle arguments = C2698c.this.getArguments();
                    ActivityCompat.requestPermissions(C2698c.this.getActivity(), arguments.getStringArray("permissions"), arguments.getInt("request_code"));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
            /* class ru.proghouse.robocam.C2698c.C26991 */

            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (C2698c.this.getArguments().getBoolean("finish_activity")) {
                        Activity activity = null;
                        if (parentFragment != null) {
                            activity = parentFragment.getActivity();
                        }
                        if (activity == null) {
                            activity = C2698c.this.getActivity();
                        }
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }).create();
    }
}
