package ru.proghouse.robocam;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.RenderScript;
import android.support.v8.renderscript.Script;
import android.support.v8.renderscript.Type;
import ru.proghouse.robocam.C2671a;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.i */
public class C2707i implements C2671a.C2676a {

    /* renamed from: a */
    private RenderScript f7569a = null;

    /* renamed from: b */
    private Allocation f7570b = null;

    /* renamed from: c */
    private Allocation f7571c = null;

    @Override // ru.proghouse.robocam.C2671a.C2676a
    /* renamed from: a */
    public Bitmap mo7665a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        C2711l lVar = new C2711l(this.f7569a);
        Type.Builder builder = new Type.Builder(this.f7569a, Element.U8(this.f7569a));
        builder.setX(i3).setY(i4);
        Allocation createTyped = Allocation.createTyped(this.f7569a, builder.create());
        createTyped.copyFrom(bArr);
        lVar.mo7830a(createTyped);
        Type.Builder builder2 = new Type.Builder(this.f7569a, Element.U8(this.f7569a));
        builder2.setX(bArr2.length);
        Allocation createTyped2 = Allocation.createTyped(this.f7569a, builder2.create());
        createTyped2.copyFrom(bArr2);
        lVar.mo7834b(createTyped2);
        Allocation createTyped3 = Allocation.createTyped(this.f7569a, builder2.create());
        createTyped3.copyFrom(bArr3);
        lVar.mo7836c(createTyped3);
        lVar.mo7833b((long) i);
        lVar.mo7829a((long) i2);
        if (i5 < 0) {
            i5 += 3600;
        }
        lVar.mo7835c((long) (i5 % 360));
        Script.LaunchOptions launchOptions = new Script.LaunchOptions();
        if (i5 == 270 || i5 == 90) {
            bitmap = Bitmap.createBitmap(i4, i3, Bitmap.Config.ARGB_8888);
            launchOptions.setX(0, i4);
            launchOptions.setY(0, i3);
            lVar.mo7828a(i4);
            lVar.mo7832b(i3);
        } else {
            bitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            launchOptions.setX(0, i3);
            launchOptions.setY(0, i4);
            lVar.mo7828a(i3);
            lVar.mo7832b(i4);
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f7569a, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        lVar.mo7831a(createFromBitmap, launchOptions);
        createFromBitmap.copyTo(bitmap);
        return bitmap;
    }

    @Override // ru.proghouse.robocam.C2671a.C2676a
    /* renamed from: a */
    public void mo7666a(Activity activity) {
        this.f7569a = RenderScript.create(activity);
    }
}
