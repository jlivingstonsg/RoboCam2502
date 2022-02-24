package ru.proghouse.robocam.p063a.p065b;

import java.util.ArrayList;
import java.util.List;
import ru.proghouse.robocam.p063a.C2684b;

/* renamed from: ru.proghouse.robocam.a.b.e */
public class C2692e extends C2684b implements C2686b {

    /* renamed from: a */
    private int f7503a = 0;

    /* renamed from: b */
    private int f7504b = 0;

    /* renamed from: c */
    private int f7505c = 0;

    /* renamed from: d */
    private int f7506d = 0;

    /* renamed from: e */
    private boolean f7507e = true;

    /* renamed from: f */
    private List<C2694g> f7508f = new ArrayList();

    /* renamed from: g */
    private List<C2694g> f7509g = new ArrayList();

    /* renamed from: h */
    private int f7510h = 0;

    /* renamed from: a */
    public int mo7755a() {
        return this.f7503a;
    }

    @Override // ru.proghouse.robocam.p063a.p065b.C2686b
    /* renamed from: a */
    public List<C2694g> mo7742a(int i) {
        return i == 0 ? this.f7508f : this.f7509g;
    }

    /* renamed from: a */
    public void mo7756a(Integer num, Integer num2) {
        int i;
        int i2;
        if (num != null || num2 != null) {
            if (num != null) {
                this.f7503a = num.intValue();
            }
            if (num2 != null) {
                this.f7504b = num2.intValue();
            }
            if (!(this.f7503a == this.f7505c && this.f7504b == this.f7506d) && !"-".equals(mo7703d())) {
                if (this.f7510h == 0 || this.f7510h == 2 || "h".equals(mo7703d()) || "v".equals(mo7703d()) || "t".equals(mo7703d()) || "l".equals(mo7703d())) {
                    if ("h".equals(mo7703d()) || "t".equals(mo7703d())) {
                        this.f7504b = 0;
                    }
                    if ("v".equals(mo7703d()) || "l".equals(mo7703d())) {
                        this.f7503a = 0;
                    }
                    for (C2694g gVar : this.f7508f) {
                        if (gVar.mo7792d() == C2687c.f7456a) {
                            gVar.mo7783a(this.f7503a);
                        } else {
                            gVar.mo7782a((float) this.f7503a);
                        }
                    }
                    for (C2694g gVar2 : this.f7509g) {
                        if (gVar2.mo7792d() == C2687c.f7456a) {
                            gVar2.mo7783a(this.f7504b);
                        } else {
                            gVar2.mo7782a((float) this.f7504b);
                        }
                    }
                } else if (this.f7510h == 1 || this.f7510h == 3) {
                    int i3 = this.f7504b;
                    int i4 = this.f7504b;
                    if ("a".equals(mo7703d())) {
                        if (this.f7504b == 0) {
                            i = this.f7503a;
                            i2 = -this.f7503a;
                        }
                        i = i3;
                        i2 = i4;
                    } else if (this.f7510h != 1) {
                        if (this.f7510h == 3) {
                            double atan2 = (Math.atan2((double) this.f7504b, (double) this.f7503a) * 180.0d) / 3.141592653589793d;
                            double sqrt = Math.sqrt((double) ((this.f7503a * this.f7503a) + (this.f7504b * this.f7504b)));
                            double d = sqrt > 100.0d ? 100.0d : sqrt;
                            double d2 = 0.0d;
                            double d3 = 0.0d;
                            if (atan2 >= 0.0d && atan2 <= 90.0d) {
                                d3 = ((atan2 / 90.0d) * 201.0d) - 100.0d;
                                d2 = 100.0d;
                            } else if (atan2 < 0.0d && atan2 >= -90.0d) {
                                d2 = -1.0d * (((atan2 / 90.0d) * -201.0d) - 100.0d);
                                d3 = -100.0d;
                            } else if (atan2 > 90.0d && atan2 <= 180.0d) {
                                d2 = -1.0d * ((((atan2 - 90.0d) / 90.0d) * 201.0d) - 100.0d);
                                d3 = 100.0d;
                            } else if (atan2 < -90.0d && atan2 >= -180.0d) {
                                d3 = (((90.0d + atan2) / 90.0d) * -201.0d) - 100.0d;
                                d2 = -100.0d;
                            }
                            i = (int) Math.round((d2 / 100.0d) * d);
                            i2 = (int) Math.round((d3 / 100.0d) * d);
                        }
                        i = i3;
                        i2 = i4;
                    } else if (this.f7503a < 0) {
                        i = Math.round((float) ((i3 * (100 - Math.abs(this.f7503a))) / 100));
                        i2 = i4;
                    } else {
                        if (this.f7503a > 0) {
                            i = i3;
                            i2 = Math.round((float) ((i4 * (100 - this.f7503a)) / 100));
                        }
                        i = i3;
                        i2 = i4;
                    }
                    for (C2694g gVar3 : this.f7508f) {
                        gVar3.mo7783a(i);
                    }
                    for (C2694g gVar4 : this.f7509g) {
                        gVar4.mo7783a(i2);
                    }
                }
            }
            this.f7505c = this.f7503a;
            this.f7506d = this.f7504b;
        }
    }

    /* renamed from: b */
    public int mo7757b() {
        return this.f7504b;
    }

    /* renamed from: b */
    public void mo7758b(int i) {
        this.f7510h = i;
    }

    /* renamed from: c */
    public int mo7759c() {
        return this.f7510h;
    }
}
