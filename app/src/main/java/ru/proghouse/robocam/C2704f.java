package ru.proghouse.robocam;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.HashSet;
import ru.proghouse.robocam.p063a.p065b.C2693f;

/* renamed from: ru.proghouse.robocam.f */
public class C2704f extends LinearLayout {

    /* renamed from: a */
    HashSet<Integer> f7561a = null;

    /* renamed from: b */
    String f7562b;

    /* renamed from: c */
    private TextView f7563c;

    /* renamed from: d */
    private TextView f7564d;

    public C2704f(Context context) {
        super(context);
    }

    @TargetApi(11)
    public C2704f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public static C2704f m10901a(Activity activity, LinearLayout linearLayout, HashSet<Integer> hashSet, int i, String str) {
        C2704f fVar = Build.VERSION.SDK_INT >= 11 ? new C2704f(new ContextThemeWrapper(activity, (int) R.style.KeyCodeControl), null, R.style.KeyCodeControl) : new C2704f(activity);
        fVar.f7561a = hashSet;
        fVar.f7562b = str;
        fVar.setPadding(0, 0, 0, 0);
        fVar.setOrientation(0);
        fVar.setWeightSum(1.0f);
        linearLayout.addView(fVar);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LayoutParams(0, -2, 1.0f));
        fVar.addView(linearLayout2);
        fVar.f7563c = C2712m.m10936a(activity, linearLayout2, i);
        fVar.f7564d = C2712m.m10937a(activity, linearLayout2, C2693f.m10819a(activity, fVar.f7561a));
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        fVar.addView(relativeLayout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        ImageView imageView = new ImageView(activity);
        imageView.setBackgroundResource(R.drawable.overflow);
        imageView.setLayoutParams(layoutParams);
        relativeLayout.addView(imageView);
        return fVar;
    }

    /* renamed from: a */
    public void mo7819a(Activity activity) {
        this.f7564d.setText(C2693f.m10819a(activity, this.f7561a));
    }

    /* renamed from: a */
    public void mo7820a(Activity activity, int i) {
        Intent intent = new Intent(activity, SelectKeyActivity.class);
        intent.putExtra("android.intent.extra.remote_intent_token", this.f7562b);
        intent.putExtra("android.intent.extra.TEXT", getTitle());
        intent.putExtra("android.intent.extra.STREAM", C2693f.m10822a(this.f7561a));
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public void mo7821a(Activity activity, HashSet<Integer> hashSet) {
        if (hashSet == null) {
            this.f7561a = null;
        } else {
            if (this.f7561a == null) {
                this.f7561a = new HashSet<>();
            } else {
                this.f7561a.clear();
            }
            this.f7561a.addAll(hashSet);
        }
        mo7819a(activity);
    }

    /* renamed from: a */
    public void mo7822a(Activity activity, int[] iArr) {
        if (iArr == null) {
            this.f7561a = null;
        } else {
            if (this.f7561a == null) {
                this.f7561a = new HashSet<>();
            }
            C2693f.m10821a(iArr, this.f7561a);
        }
        mo7819a(activity);
    }

    /* renamed from: b */
    public void mo7823b(Activity activity) {
        this.f7561a = null;
        mo7819a(activity);
    }

    public String getTitle() {
        return this.f7563c.getText().toString();
    }
}
