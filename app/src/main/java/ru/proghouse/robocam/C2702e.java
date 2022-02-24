package ru.proghouse.robocam;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

@TargetApi(11)
/* renamed from: ru.proghouse.robocam.e */
public class C2702e extends DialogFragment {
    /* renamed from: a */
    public static C2702e m10900a(String str, boolean z) {
        C2702e eVar = new C2702e();
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putBoolean("finish_activity", z);
        eVar.setArguments(bundle);
        return eVar;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        final Activity activity = getActivity();
        final boolean z = getArguments().getBoolean("finish_activity");
        return new AlertDialog.Builder(activity).setMessage(getArguments().getString("message")).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            /* class ru.proghouse.robocam.C2702e.C27031 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (z) {
                    activity.finish();
                }
            }
        }).create();
    }
}
