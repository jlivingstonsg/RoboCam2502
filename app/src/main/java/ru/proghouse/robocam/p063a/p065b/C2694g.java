package ru.proghouse.robocam.p063a.p065b;

/* renamed from: ru.proghouse.robocam.a.b.g */
public class C2694g {

    /* renamed from: a */
    private int f7537a = 0;

    /* renamed from: b */
    private int f7538b = 0;

    /* renamed from: c */
    private volatile boolean f7539c = false;

    /* renamed from: d */
    private volatile float f7540d = 1.0f;

    /* renamed from: e */
    private volatile int f7541e = C2687c.f7456a;

    /* renamed from: f */
    private volatile int f7542f = 0;

    /* renamed from: g */
    private volatile float f7543g = 0.0f;

    /* renamed from: h */
    private volatile int f7544h = 0;

    /* renamed from: i */
    private volatile int f7545i = 1;

    public C2694g(int i, int i2) {
        this.f7537a = i;
        this.f7538b = i2;
    }

    /* renamed from: a */
    public int mo7781a() {
        return this.f7537a;
    }

    /* renamed from: a */
    public void mo7782a(float f) {
        this.f7543g = f;
    }

    /* renamed from: a */
    public void mo7783a(int i) {
        this.f7542f = i;
    }

    /* renamed from: a */
    public void mo7784a(C2694g gVar) {
        if (this.f7544h > 0 && gVar.f7538b == this.f7538b && gVar.f7541e == this.f7541e && gVar.f7537a == this.f7537a) {
            C2694g i = gVar.mo7797i();
            if (this.f7541e == C2687c.f7456a) {
                this.f7542f = i.f7542f + this.f7542f;
            } else {
                this.f7543g += i.f7543g;
                this.f7542f = i.f7542f + this.f7542f;
            }
            if (gVar.f7545i == 0 && this.f7545i == 0) {
                this.f7545i = 0;
            } else {
                this.f7545i = 1;
            }
            this.f7544h++;
        }
    }

    /* renamed from: a */
    public void mo7785a(boolean z) {
        this.f7539c = z;
    }

    /* renamed from: b */
    public float mo7786b() {
        return this.f7543g;
    }

    /* renamed from: b */
    public void mo7787b(float f) {
        this.f7540d = f;
    }

    /* renamed from: b */
    public void mo7788b(int i) {
        this.f7541e = i;
    }

    /* renamed from: b */
    public boolean mo7789b(C2694g gVar) {
        return gVar.f7537a == this.f7537a && gVar.f7542f == this.f7542f && gVar.f7543g == this.f7543g && gVar.f7541e == this.f7541e && gVar.f7539c == this.f7539c && gVar.f7538b == this.f7538b && gVar.f7540d == this.f7540d && this.f7545i == this.f7545i;
    }

    /* renamed from: c */
    public int mo7790c() {
        return this.f7542f;
    }

    /* renamed from: c */
    public void mo7791c(int i) {
        this.f7545i = i;
    }

    /* renamed from: d */
    public int mo7792d() {
        return this.f7541e;
    }

    /* renamed from: e */
    public boolean mo7793e() {
        return this.f7539c;
    }

    /* renamed from: f */
    public float mo7794f() {
        return this.f7540d;
    }

    /* renamed from: g */
    public int mo7795g() {
        return this.f7538b;
    }

    /* renamed from: h */
    public int mo7796h() {
        return this.f7545i;
    }

    /* renamed from: i */
    public C2694g mo7797i() {
        C2694g gVar = new C2694g(this.f7537a, this.f7538b);
        gVar.f7541e = this.f7541e;
        gVar.f7545i = this.f7545i;
        if (this.f7541e == C2687c.f7456a) {
            gVar.f7542f = Math.round(((float) this.f7542f) * this.f7540d);
            if (this.f7539c) {
                gVar.f7542f *= -1;
            }
        } else {
            gVar.f7543g = this.f7543g * this.f7540d;
            if (this.f7539c) {
                gVar.f7543g = (float) (((double) gVar.f7543g) * -1.0d);
            }
            gVar.f7542f = Math.abs(this.f7542f);
        }
        gVar.f7544h = 1;
        return gVar;
    }

    /* renamed from: j */
    public String mo7798j() {
        return new Integer(this.f7537a).toString() + ":" + new Integer(C2687c.m10748c(this.f7538b)).toString();
    }

    /* renamed from: k */
    public int mo7799k() {
        if (this.f7542f > 100) {
            return 100;
        }
        if (this.f7542f < -100) {
            return -100;
        }
        return this.f7542f;
    }

    /* renamed from: l */
    public Object mo7800l() {
        switch (this.f7538b) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                return Integer.valueOf(this.f7538b);
            case 4:
                return "C";
            case 8:
                return "D";
        }
    }
}
