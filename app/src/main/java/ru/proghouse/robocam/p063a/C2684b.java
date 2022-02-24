package ru.proghouse.robocam.p063a;

/* renamed from: ru.proghouse.robocam.a.b */
public class C2684b {

    /* renamed from: a */
    private boolean f7448a = false;

    /* renamed from: b */
    private String f7449b = "c";

    /* renamed from: c */
    private int f7450c = 0;

    /* renamed from: d */
    private int f7451d = 0;

    /* renamed from: a */
    public void mo7700a(int i, int i2) {
        if (i == 0) {
            this.f7450c = i2;
        } else {
            this.f7451d = i2;
        }
    }

    /* renamed from: a */
    public void mo7701a(String str) {
        this.f7449b = str;
    }

    /* renamed from: a */
    public void mo7702a(boolean z) {
        this.f7448a = z;
    }

    /* renamed from: d */
    public String mo7703d() {
        return !this.f7448a ? "-" : this.f7449b;
    }

    /* renamed from: e */
    public String mo7704e() {
        return new Integer(this.f7450c).toString() + new Integer(this.f7451d).toString();
    }
}
