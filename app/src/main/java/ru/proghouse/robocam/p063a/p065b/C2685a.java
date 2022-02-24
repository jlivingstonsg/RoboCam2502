package ru.proghouse.robocam.p063a.p065b;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import ru.proghouse.robocam.p063a.C2696d;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.a.b.a */
public class C2685a {

    /* renamed from: b */
    private static Object f7452b = new Object();

    /* renamed from: c */
    private static int f7453c = 0;

    /* renamed from: a */
    ByteArrayOutputStream f7454a;

    /* renamed from: d */
    private boolean f7455d;

    public C2685a() {
        this.f7454a = null;
        this.f7455d = false;
        this.f7454a = new ByteArrayOutputStream();
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: c */
    private void m10688c(int i, int i2) {
        C2696d.m10883a((OutputStream) this.f7454a, i & 255);
        C2696d.m10883a((OutputStream) this.f7454a, ((i >> 8) & 3) | ((i2 << 2) & 252));
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: d */
    private void m10689d(int i, int i2) {
        C2696d.m10883a((OutputStream) this.f7454a, i);
        C2696d.m10883a((OutputStream) this.f7454a, i2);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: o */
    private void m10690o(int i) {
        C2696d.m10883a((OutputStream) this.f7454a, i);
    }

    /* renamed from: s */
    private static int m10691s() {
        int i;
        synchronized (f7452b) {
            f7453c++;
            if (f7453c > 65535) {
                f7453c = 0;
            }
            i = f7453c;
        }
        return i;
    }

    /* renamed from: a */
    public int mo7705a() {
        return this.f7454a.size();
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: a */
    public int mo7706a(int i, int i2) {
        int s = m10691s();
        C2696d.m10889b(this.f7454a, s);
        C2696d.m10883a((OutputStream) this.f7454a, i);
        C2696d.m10883a((OutputStream) this.f7454a, i2);
        return s;
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: a */
    public int mo7707a(int i, int i2, int i3) {
        int s = m10691s();
        C2696d.m10889b(this.f7454a, s);
        C2696d.m10883a((OutputStream) this.f7454a, i);
        m10688c(i2, i3);
        return s;
    }

    /* renamed from: a */
    public void mo7708a(int i) {
        if (i <= 31) {
            mo7711b(i);
        } else if (i <= 255) {
            mo7715c(i);
        } else if (i <= 65535) {
            mo7717d(i);
        } else {
            mo7709a((long) i);
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: a */
    public void mo7709a(long j) {
        C2696d.m10883a((OutputStream) this.f7454a, 227);
        C2696d.m10884a(this.f7454a, j);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, ?]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: a */
    public void mo7710a(String str) {
        C2696d.m10883a((OutputStream) this.f7454a, (int) ScriptIntrinsicBLAS.UNIT);
        C2696d.m10890b(this.f7454a, str);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: b */
    public void mo7711b(int i) {
        C2696d.m10883a((OutputStream) this.f7454a, i | 96);
    }

    /* renamed from: b */
    public void mo7712b(int i, int i2) {
        byte[] byteArray = this.f7454a.toByteArray();
        C2696d.m10895d(byteArray, i, i2);
        this.f7454a.reset();
        try {
            this.f7454a.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public byte[] mo7713b() {
        byte[] bArr = new byte[(this.f7454a.size() + 2)];
        C2696d.m10894c(bArr, 0, this.f7454a.size());
        System.arraycopy(this.f7454a.toByteArray(), 0, bArr, 2, this.f7454a.size());
        return bArr;
    }

    /* renamed from: c */
    public void mo7714c() {
        m10690o(2);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: c */
    public void mo7715c(int i) {
        C2696d.m10883a((OutputStream) this.f7454a, 225);
        C2696d.m10883a((OutputStream) this.f7454a, i);
    }

    /* renamed from: d */
    public void mo7716d() {
        m10690o(3);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: d */
    public void mo7717d(int i) {
        C2696d.m10883a((OutputStream) this.f7454a, 226);
        C2696d.m10889b(this.f7454a, i);
    }

    /* renamed from: e */
    public void mo7718e() {
        m10690o(22);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: e */
    public void mo7719e(int i) {
        C2696d.m10883a((OutputStream) this.f7454a, i | 64);
    }

    /* renamed from: f */
    public void mo7720f() {
        m10690o(24);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: f */
    public void mo7721f(int i) {
        C2696d.m10883a((OutputStream) this.f7454a, 193);
        C2696d.m10883a((OutputStream) this.f7454a, i);
    }

    /* renamed from: g */
    public void mo7722g() {
        m10690o(26);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: g */
    public void mo7723g(int i) {
        if (i >= 0 || i <= 31) {
            C2696d.m10883a((OutputStream) this.f7454a, i);
            return;
        }
        throw new IllegalArgumentException("The value should be in the range of 0 to 31.");
    }

    /* renamed from: h */
    public void mo7724h() {
        m10690o(48);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
     arg types: [java.io.ByteArrayOutputStream, byte]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void */
    /* renamed from: h */
    public void mo7725h(int i) {
        if (i >= -128 || i <= 127) {
            C2696d.m10883a((OutputStream) this.f7454a, 129);
            C2696d.m10881a((OutputStream) this.f7454a, (byte) i);
            return;
        }
        throw new IllegalArgumentException("The value should be in the range of -128 to 127.");
    }

    /* renamed from: i */
    public void mo7726i() {
        m10690o(58);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
     arg types: [java.io.ByteArrayOutputStream, short]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void */
    /* renamed from: i */
    public void mo7727i(int i) {
        if (i >= -32768 || i <= 32767) {
            C2696d.m10883a((OutputStream) this.f7454a, 130);
            C2696d.m10887a((OutputStream) this.f7454a, (short) i);
            return;
        }
        throw new IllegalArgumentException("The value should be in the range of -32768 to 32767.");
    }

    /* renamed from: j */
    public void mo7728j() {
        m10690o(ScriptIntrinsicBLAS.LOWER);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, ?]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
     arg types: [java.io.ByteArrayOutputStream, int]
     candidates:
      ru.proghouse.robocam.a.d.a(byte[], int):int
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
      ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void */
    /* renamed from: j */
    public void mo7729j(int i) {
        C2696d.m10883a((OutputStream) this.f7454a, (int) ScriptIntrinsicBLAS.NON_UNIT);
        C2696d.m10883a((OutputStream) this.f7454a, i & 255);
        C2696d.m10883a((OutputStream) this.f7454a, (i >> 8) & 255);
        C2696d.m10883a((OutputStream) this.f7454a, (i >> 16) & 255);
        C2696d.m10883a((OutputStream) this.f7454a, (i >> 24) & 255);
    }

    /* renamed from: k */
    public void mo7730k() {
        m10690o(163);
    }

    /* renamed from: k */
    public void mo7731k(int i) {
        m10689d(130, i);
    }

    /* renamed from: l */
    public void mo7732l() {
        m10690o(164);
    }

    /* renamed from: l */
    public void mo7733l(int i) {
        m10689d(153, i);
    }

    /* renamed from: m */
    public void mo7734m() {
        m10690o(166);
    }

    /* renamed from: m */
    public void mo7735m(int i) {
        m10689d(129, i);
    }

    /* renamed from: n */
    public void mo7736n() {
        m10690o(170);
    }

    /* renamed from: n */
    public void mo7737n(int i) {
        m10689d(192, i);
    }

    /* renamed from: o */
    public void mo7738o() {
        m10690o(174);
    }

    /* renamed from: p */
    public void mo7739p() {
        m10690o(178);
    }

    /* renamed from: q */
    public void mo7740q() {
        m10690o(180);
    }

    /* renamed from: r */
    public void mo7741r() {
        m10690o(221);
    }
}
