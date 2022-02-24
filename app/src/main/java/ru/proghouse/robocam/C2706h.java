package ru.proghouse.robocam;

import android.hardware.Camera;
import android.os.Build;
import android.util.Size;

/* renamed from: ru.proghouse.robocam.h */
public final class C2706h {

    /* renamed from: a */
    public int f7567a = 0;

    /* renamed from: b */
    public int f7568b = 0;

    public C2706h(Object obj) {
        if (Build.VERSION.SDK_INT < 23 && Camera.Size.class.isAssignableFrom(obj.getClass())) {
            this.f7567a = ((Camera.Size) obj).width;
            this.f7568b = ((Camera.Size) obj).height;
        } else if (Build.VERSION.SDK_INT >= 23 && Size.class.isAssignableFrom(obj.getClass())) {
            this.f7567a = ((Size) obj).getWidth();
            this.f7568b = ((Size) obj).getHeight();
        }
    }
}
