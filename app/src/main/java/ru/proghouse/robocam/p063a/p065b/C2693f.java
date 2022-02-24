package ru.proghouse.robocam.p063a.p065b;

import android.app.Activity;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.proghouse.robocam.C2705g;
import ru.proghouse.robocam.R;
import ru.proghouse.robocam.p063a.C2695c;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.a.b.f */
public class C2693f extends C2695c implements C2686b {

    /* renamed from: y */
    private static List<C2705g> f7511y = null;

    /* renamed from: z */
    private static HashSet<Integer> f7512z = null;

    /* renamed from: a */
    HashSet<Integer> f7513a = new HashSet<>();

    /* renamed from: b */
    int f7514b = 0;

    /* renamed from: c */
    private int f7515c = 0;

    /* renamed from: d */
    private int f7516d = 0;

    /* renamed from: e */
    private int f7517e = 0;

    /* renamed from: f */
    private int f7518f = 0;

    /* renamed from: g */
    private int f7519g = 0;

    /* renamed from: h */
    private int f7520h = 0;

    /* renamed from: i */
    private int f7521i = 100;

    /* renamed from: j */
    private int f7522j = 100;

    /* renamed from: k */
    private long f7523k = System.currentTimeMillis();

    /* renamed from: l */
    private long f7524l = System.currentTimeMillis();

    /* renamed from: m */
    private String f7525m = "";

    /* renamed from: n */
    private boolean f7526n = true;

    /* renamed from: o */
    private HashSet<Integer> f7527o = null;

    /* renamed from: p */
    private int f7528p = 0;

    /* renamed from: q */
    private HashSet<Integer> f7529q = new HashSet<>();

    /* renamed from: r */
    private HashSet<Integer> f7530r = new HashSet<>();

    /* renamed from: s */
    private HashSet<Integer> f7531s = new HashSet<>();

    /* renamed from: t */
    private HashSet<Integer> f7532t = new HashSet<>();

    /* renamed from: u */
    private List<C2694g> f7533u = new ArrayList();

    /* renamed from: v */
    private List<C2694g> f7534v = new ArrayList();

    /* renamed from: w */
    private int f7535w = 0;

    /* renamed from: x */
    private int f7536x = 0;

    /* renamed from: a */
    public static String m10819a(Activity activity, HashSet<Integer> hashSet) {
        String str = "";
        if (hashSet != null) {
            for (C2705g gVar : m10820a()) {
                str = hashSet.contains(Integer.valueOf(gVar.mo7825a())) ? str.isEmpty() ? str + gVar.mo7826b() : str + ", " + gVar.mo7826b() : str;
            }
        }
        return str.isEmpty() ? activity.getString(R.string.nothing_selected) : str;
    }

    /* renamed from: a */
    public static List<C2705g> m10820a() {
        if (f7511y == null) {
            f7511y = new ArrayList();
            m10823b(48, 57);
            m10823b(65, 90);
            f7511y.addAll(Arrays.asList(new C2705g(192, "(`)"), new C2705g(189, "(-)"), new C2705g(219, "([)"), new C2705g(221, "(])"), new C2705g(220, "(\\)"), new C2705g(186, "(;)"), new C2705g(222, "(')"), new C2705g(188, "(,)"), new C2705g(190, "(.)"), new C2705g(191, "(/)"), new C2705g(27, "Esc"), new C2705g(113, "F2"), new C2705g(115, "F4"), new C2705g(118, "F7"), new C2705g(119, "F8"), new C2705g(120, "F9"), new C2705g(ScriptIntrinsicBLAS.UPPER, "F10"), new C2705g(33, "Page Up"), new C2705g(34, "Page Down"), new C2705g(36, "Home"), new C2705g(35, "End"), new C2705g(45, "Ins"), new C2705g(46, "Del"), new C2705g(8, "Backspace"), new C2705g(9, "Tab"), new C2705g(20, "Caps Lock"), new C2705g(13, "Enter"), new C2705g(16, "Shift"), new C2705g(17, "Ctrl"), new C2705g(18, "Alt"), new C2705g(32, "Space"), new C2705g(37, "Left"), new C2705g(38, "Up"), new C2705g(39, "Right"), new C2705g(40, "Down"), new C2705g(144, "Num Lock"), new C2705g(96, "0 (Numpad)"), new C2705g(97, "1 (Numpad)"), new C2705g(98, "2 (Numpad)"), new C2705g(99, "3 (Numpad)"), new C2705g(100, "4 (Numpad)"), new C2705g(/*101*/101, "5 (Numpad)"), new C2705g(/*102*/102, "6 (Numpad)"), new C2705g(/*103*/103, "7 (Numpad)"), new C2705g(/*104*/104, "8 (Numpad)"), new C2705g(/*105*/105, "9 (Numpad)"), new C2705g(/*110*/110, "(.) (Numpad)"), new C2705g(/*107*/107, "(+) (Numpad)"), new C2705g(/*109*/109, "(-) (Numpad)"), new C2705g(/*C0497a.C0507j.106*/106, "(*) (Numpad)"), new C2705g(12, "Clear"), new C2705g(145, "Scroll Lock"), new C2705g(19, "Pause")));
        }
        return f7511y;
    }

    /* renamed from: a */
    public static void m10821a(int[] iArr, HashSet<Integer> hashSet) {
        hashSet.clear();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static int[] m10822a(HashSet<Integer> hashSet) {
        int i = 0;
        int[] iArr = new int[(hashSet == null ? 0 : hashSet.size())];
        if (hashSet != null) {
            Iterator<Integer> it = hashSet.iterator();
            while (it.hasNext()) {
                iArr[i] = it.next().intValue();
                i++;
            }
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m10823b(int i, int i2) {
        byte[] bArr = new byte[1];
        for (byte b = (byte) i; b <= ((byte) i2); b = (byte) (b + 1)) {
            bArr[0] = b;
            f7511y.add(new C2705g(b, new String(bArr)));
        }
    }

    /* renamed from: b */
    public static boolean m10824b(int i) {
        if (f7512z == null) {
            f7512z = new HashSet<>();
            for (C2705g gVar : f7511y) {
                f7512z.add(Integer.valueOf(gVar.mo7825a()));
            }
        }
        return f7512z.contains(Integer.valueOf(i));
    }

    /* renamed from: e */
    private void m10825e(HashSet<Integer> hashSet) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        if (mo7803j()) {
            int i5 = 0;
            int i6 = 0;
            boolean z4 = false;
            boolean z5 = false;
            if (this.f7528p == 0 || this.f7528p == 1 || this.f7528p == 3) {
                Iterator<Integer> it = hashSet.iterator();
                while (true) {
                    i3 = i5;
                    i4 = i6;
                    z3 = z4;
                    if (!it.hasNext()) {
                        break;
                    }
                    int intValue = it.next().intValue();
                    if (this.f7529q.contains(Integer.valueOf(intValue))) {
                        i4 += 100;
                        z3 = true;
                    }
                    if (this.f7530r.contains(Integer.valueOf(intValue))) {
                        i3 -= 100;
                        z5 = true;
                    } else {
                        z5 = z5;
                    }
                    if (this.f7531s.contains(Integer.valueOf(intValue))) {
                        i6 = i4 - 100;
                        z4 = true;
                    } else {
                        z4 = z3;
                        i6 = i4;
                    }
                    if (this.f7532t.contains(Integer.valueOf(intValue))) {
                        i5 = i3 + 100;
                        z5 = true;
                    } else {
                        i5 = i3;
                    }
                }
                z5 = z5;
                z4 = z3;
                i6 = i4;
                i5 = i3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f7535w != 0 && !z5) {
                i5 = this.f7515c;
                z2 = true;
            } else if (((m10826j(i5) == m10826j(this.f7515c) || (i5 != 0 && this.f7515c == 0)) && this.f7517e > 0 && this.f7517e <= 200) || ((m10826j(i5) * m10826j(this.f7515c) < 0 || (i5 == 0 && this.f7515c != 0)) && this.f7519g > 0 && this.f7519g <= 200)) {
                int i7 = (m10826j(i5) == m10826j(this.f7515c) || (i5 != 0 && this.f7515c == 0)) ? this.f7517e : this.f7519g;
                if (currentTimeMillis - this.f7523k >= ((long) this.f7521i)) {
                    int min = i5 > this.f7515c ? Math.min(i5, i7 + this.f7515c) : Math.max(i5, this.f7515c - i7);
                    this.f7523k = currentTimeMillis;
                    i = min;
                } else {
                    i = this.f7515c;
                }
                z2 = i5 == i;
                i5 = i;
            } else {
                z2 = true;
            }
            if (this.f7536x != 0 && !z4) {
                i6 = this.f7516d;
                z = z2;
            } else if (((m10826j(i6) == m10826j(this.f7516d) || (i6 != 0 && this.f7516d == 0)) && this.f7518f > 0 && this.f7518f <= 200) || ((m10826j(i6) * m10826j(this.f7516d) < 0 || (i6 == 0 && this.f7516d != 0)) && this.f7520h > 0 && this.f7520h <= 200)) {
                int i8 = (m10826j(i6) == m10826j(this.f7516d) || (i6 != 0 && this.f7516d == 0)) ? this.f7518f : this.f7520h;
                if (currentTimeMillis - this.f7524l >= ((long) this.f7522j)) {
                    i2 = i6 > this.f7516d ? Math.min(i6, i8 + this.f7516d) : Math.max(i6, this.f7516d - i8);
                    this.f7524l = currentTimeMillis;
                } else {
                    i2 = this.f7516d;
                }
                boolean z6 = i6 == i2 && z2;
                i6 = i2;
                z = z6;
            } else {
                z = z2;
            }
            this.f7515c = i5;
            this.f7516d = i6;
            if (this.f7528p == 0) {
                for (C2694g gVar : this.f7533u) {
                    if (gVar.mo7792d() == C2687c.f7456a) {
                        gVar.mo7783a(i5);
                    } else {
                        gVar.mo7782a((float) i5);
                    }
                }
                for (C2694g gVar2 : this.f7534v) {
                    if (gVar2.mo7792d() == C2687c.f7456a) {
                        gVar2.mo7783a(i6);
                    } else {
                        gVar2.mo7782a((float) i6);
                    }
                }
            } else if (this.f7528p == 1 || this.f7528p == 3) {
                if (i6 == 0) {
                    i6 = -i5;
                } else if (i5 == 0) {
                    i5 = i6;
                } else if (i5 < 0) {
                    i5 = m10826j(i6) * (Math.abs(i6) - Math.abs(i5));
                } else {
                    int abs = (Math.abs(i6) - Math.abs(i5)) * m10826j(i6);
                    i5 = i6;
                    i6 = abs;
                }
                for (C2694g gVar3 : this.f7533u) {
                    gVar3.mo7783a(i5);
                }
                for (C2694g gVar4 : this.f7534v) {
                    gVar4.mo7783a(i6);
                }
            }
        } else {
            z = true;
        }
        this.f7526n = z;
    }

    /* renamed from: j */
    private static int m10826j(int i) {
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    /* renamed from: m */
    private boolean m10827m() {
        return (this.f7517e > 0 && this.f7517e <= 200) || (this.f7519g > 0 && this.f7519g <= 200);
    }

    /* renamed from: n */
    private boolean m10828n() {
        return (this.f7518f > 0 && this.f7518f <= 200) || (this.f7520h > 0 && this.f7520h <= 200);
    }

    @Override // ru.proghouse.robocam.p063a.p065b.C2686b
    /* renamed from: a */
    public List<C2694g> mo7742a(int i) {
        return i == 0 ? this.f7533u : this.f7534v;
    }

    /* renamed from: a */
    public void mo7760a(int i, int i2) {
        if (i == 0) {
            this.f7535w = i2;
        } else {
            this.f7536x = i2;
        }
    }

    /* renamed from: a */
    public void mo7761a(int i, HashSet<Integer> hashSet) {
        this.f7513a.clear();
        if (hashSet != null) {
            Iterator<Integer> it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (mo7805l().contains(Integer.valueOf(intValue))) {
                    this.f7513a.add(Integer.valueOf(intValue));
                }
            }
        }
        this.f7514b = i;
    }

    /* renamed from: a */
    public void mo7762a(String str) {
        if (str == null) {
            mo7802b("");
        }
        mo7802b(str);
    }

    /* renamed from: b */
    public String mo7763b() {
        return mo7804k();
    }

    /* renamed from: b */
    public boolean mo7764b(HashSet<Integer> hashSet) {
        if (this.f7514b != 0 && (hashSet == null || !hashSet.contains(Integer.valueOf(this.f7514b)))) {
            return true;
        }
        if (hashSet != null) {
            Iterator<Integer> it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (mo7805l().contains(Integer.valueOf(intValue)) && !this.f7513a.contains(Integer.valueOf(intValue))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public int mo7765c(HashSet<Integer> hashSet) {
        if (hashSet != null) {
            Iterator<Integer> it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (mo7805l().contains(Integer.valueOf(intValue)) && !this.f7513a.contains(Integer.valueOf(intValue))) {
                    return intValue;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public HashSet<Integer> mo7766c() {
        return this.f7529q;
    }

    /* renamed from: c */
    public void mo7767c(int i) {
        this.f7528p = i;
    }

    /* renamed from: d */
    public HashSet<Integer> mo7768d() {
        return this.f7530r;
    }

    /* renamed from: d */
    public void mo7769d(int i) {
        this.f7517e = Math.min(200, Math.max(0, i));
    }

    /* renamed from: d */
    public boolean mo7770d(HashSet<Integer> hashSet) {
        String str = "";
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            str = str + it.next().toString() + ":";
        }
        if (this.f7525m.equals(str) && this.f7526n) {
            return true;
        }
        this.f7527o = (HashSet) hashSet.clone();
        long currentTimeMillis = System.currentTimeMillis();
        if ((m10827m() && currentTimeMillis - this.f7523k >= ((long) this.f7521i)) || (m10828n() && currentTimeMillis - this.f7524l >= ((long) this.f7522j))) {
            m10825e(hashSet);
        }
        this.f7525m = str;
        return this.f7526n;
    }

    /* renamed from: e */
    public HashSet<Integer> mo7771e() {
        return this.f7531s;
    }

    /* renamed from: e */
    public void mo7772e(int i) {
        this.f7519g = Math.min(200, Math.max(0, i));
    }

    /* renamed from: f */
    public HashSet<Integer> mo7773f() {
        return this.f7532t;
    }

    /* renamed from: f */
    public void mo7774f(int i) {
        this.f7518f = Math.min(200, Math.max(0, i));
    }

    /* renamed from: g */
    public int mo7775g() {
        return this.f7528p;
    }

    /* renamed from: g */
    public void mo7776g(int i) {
        this.f7520h = Math.min(200, Math.max(0, i));
    }

    /* renamed from: h */
    public void mo7777h(int i) {
        this.f7521i = Math.max(100, (i / 100) * 100);
    }

    /* renamed from: h */
    public boolean mo7778h() {
        if (!this.f7526n) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f7523k >= ((long) this.f7521i) || currentTimeMillis - this.f7524l >= ((long) this.f7522j)) {
                m10825e(this.f7527o);
            }
        }
        return this.f7526n;
    }

    /* renamed from: i */
    public void mo7779i() {
        this.f7513a.clear();
        this.f7514b = 0;
    }

    /* renamed from: i */
    public void mo7780i(int i) {
        this.f7522j = Math.max(100, (i / 100) * 100);
    }
}
