package ru.proghouse.robocam.p063a.p065b;

/* renamed from: ru.proghouse.robocam.a.b.d */
public class C2691d {

    /* renamed from: a */
    private int f7496a = 0;

    /* renamed from: b */
    private int f7497b = 0;

    /* renamed from: c */
    private int f7498c = 126;

    /* renamed from: d */
    private int f7499d = 0;

    /* renamed from: e */
    private float f7500e = 0.0f;

    /* renamed from: f */
    private float f7501f = 0.0f;

    /* renamed from: g */
    private boolean f7502g = false;

    public C2691d(int i, int i2, int i3, int i4) {
        this.f7496a = i;
        this.f7497b = i2;
        this.f7498c = i3;
        this.f7499d = i4;
    }

    /* renamed from: a */
    public int mo7751a() {
        return this.f7496a;
    }

    /* renamed from: a */
    public void mo7752a(float f) {
        this.f7500e = f;
        if (!this.f7502g) {
            this.f7501f = f;
            this.f7502g = true;
        }
    }

    /* renamed from: b */
    public int mo7753b() {
        return this.f7497b;
    }

    /* renamed from: c */
    public String mo7754c() {
        return new Integer(this.f7496a).toString() + ":" + new Integer(this.f7497b).toString();
    }
}
