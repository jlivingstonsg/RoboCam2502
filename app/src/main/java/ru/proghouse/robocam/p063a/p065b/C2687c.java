package ru.proghouse.robocam.p063a.p065b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.support.v8.renderscript.Allocation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.proghouse.robocam.k;
import ru.proghouse.robocam.C2713n;

import ru.proghouse.robocam./*ToDo: C2714o*/o;
import ru.proghouse.robocam.R;
import ru.proghouse.robocam.p063a.C2677a;
import ru.proghouse.robocam.p063a.C2695c;
import ru.proghouse.robocam.p063a.C2696d;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.a.b.c */
public class C2687c extends C2677a {

    /* renamed from: a */
    public static int f7456a = 0;

    /* renamed from: b */
    public static int f7457b = 1;

    /* renamed from: c */
    static final String[] f7458c = {"x", "y", "w", "z", "a", "b", "c", "d"};

    /* renamed from: A */
    private volatile long f7459A = 0;

    /* renamed from: B */
    private volatile boolean f7460B = true;
    /* renamed from: d */
    public int[] f7461d = new int[8];
    /* renamed from: e */
    public List<C2692e> f7462e = new ArrayList();
    /* renamed from: f */
    public List<C2693f> f7463f = new ArrayList();
    /* renamed from: g */
    public boolean f7464g = false;
    /* renamed from: h */
    public HashSet<Integer> f7465h = new HashSet<>();

    /* renamed from: i */
    private boolean f7466i = false;

    /* renamed from: j */
    private String f7467j = "";

    /* renamed from: k */
    private Object f7468k = new Object();

    /* renamed from: l */
    private Object f7469l = new Object();
    /* renamed from: m */
    public volatile BluetoothSocket f7470m = null;
    /* renamed from: n */
    public volatile BluetoothDevice f7471n = null;
    /* renamed from: o */
    public HashSet<Integer> f7472o = new HashSet<>();
    /* renamed from: p */
    public Hashtable<String, C2691d> f7473p = new Hashtable<>();
    /* renamed from: q */
    public Hashtable<String, C2694g> f7474q = new Hashtable<>();
    /* renamed from: r */
    public List<C2694g> f7475r = new ArrayList();
    /* renamed from: s */
    public volatile int f7476s = 100;
    /* renamed from: t */
    public volatile int f7477t = 0;
    /* renamed from: u */
    public volatile boolean f7478u = false;
    /* renamed from: v */
    public final Object f7479v = new Object();
    /* renamed from: w */
    public final Object f7480w = new Object();
    /* renamed from: x */
    public Hashtable<String, Integer> f7481x = new Hashtable<>();

    /* renamed from: y */
    private volatile String f7482y = "";
    /* renamed from: z */
    public volatile String f7483z = "";

    /* renamed from: ru.proghouse.robocam.a.b.c$a */
    class C2688a implements Runnable {

        /* renamed from: a */
        HashSet<Integer> f7484a = null;

        /* renamed from: b */
        long f7485b = System.currentTimeMillis();

        /* renamed from: d */
        private C2687c f7487d = null;

        /* renamed from: e */
        private boolean f7488e = true;

        C2688a() {
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
         method: ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void
         arg types: [java.io.ByteArrayOutputStream, float]
         candidates:
          ru.proghouse.robocam.a.d.a(byte[], int):int
          ru.proghouse.robocam.a.d.a(java.io.OutputStream, byte):void
          ru.proghouse.robocam.a.d.a(java.io.OutputStream, int):void
          ru.proghouse.robocam.a.d.a(java.io.OutputStream, long):void
          ru.proghouse.robocam.a.d.a(java.io.OutputStream, java.lang.String):void
          ru.proghouse.robocam.a.d.a(java.io.OutputStream, short):void
          ru.proghouse.robocam.a.d.a(java.io.OutputStream, float):void */
        /* renamed from: a */
        private void m10801a(String str, int i) {
            try {
                C2685a aVar = new C2685a();
                aVar.mo7706a(129, 158);
                C2696d.m10883a((OutputStream) aVar.f7454a, str.length() + 1);
                C2696d.m10890b(aVar.f7454a, str);
                C2696d.m10889b(aVar.f7454a, 4);
                C2696d.m10882a((OutputStream) aVar.f7454a, (float) i);
                C2687c.this.m10737a(aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ru.proghouse.robocam.a.b.c.a(ru.proghouse.robocam.a.b.c, boolean):boolean
         arg types: [ru.proghouse.robocam.a.b.c, int]
         candidates:
          ru.proghouse.robocam.a.b.c.a(ru.proghouse.robocam.a.b.c, int):int
          ru.proghouse.robocam.a.b.c.a(ru.proghouse.robocam.a.b.c, android.bluetooth.BluetoothSocket):android.bluetooth.BluetoothSocket
          ru.proghouse.robocam.a.b.c.a(org.w3c.dom.Element, ru.proghouse.robocam.a.b.b):void
          ru.proghouse.robocam.a.b.c.a(ru.proghouse.robocam.a.b.c, ru.proghouse.robocam.a.b.a):void
          ru.proghouse.robocam.a.b.c.a(ru.proghouse.robocam.a.b.a, int):byte[]
          ru.proghouse.robocam.a.a.a(android.content.Context, java.lang.String):ru.proghouse.robocam.a.a
          ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void
          ru.proghouse.robocam.a.a.a(java.lang.String, java.lang.Class<? extends ru.proghouse.robocam.a.a>):void
          ru.proghouse.robocam.a.a.a(int, java.lang.Object[]):void
          ru.proghouse.robocam.a.b.c.a(ru.proghouse.robocam.a.b.c, boolean):boolean */
        /* renamed from: a */
        public void mo7746a() {
            Hashtable<String, Integer> hashtable;
            while (C2687c.this.f7477t != 2 && C2687c.this.f7470m != null) {
                synchronized (C2687c.this.f7480w) {
                    if (C2687c.this.f7481x.size() > 0) {
                        hashtable = (Hashtable) C2687c.this.f7481x.clone();
                        C2687c.this.f7481x.clear();
                    } else {
                        hashtable = null;
                    }
                    if (C2687c.this.f7464g) {
                        this.f7484a = C2687c.this.f7465h;
                        C2687c.this.f7464g = false;
                        this.f7488e = false;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (hashtable != null || (!this.f7488e && currentTimeMillis - this.f7485b >= 100)) {
                    this.f7488e = mo7747a(hashtable, this.f7484a);
                    if (this.f7488e) {
                        this.f7484a = null;
                    }
                    this.f7485b = currentTimeMillis;
                } else {
                    return;
                }
            }
        }

        /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, boolean):boolean
         arg types: [ru.proghouse.robocam.a.b.c, int]
         candidates:
          ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, int):void
          ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, ru.proghouse.robocam.a.b.a):void
          ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, boolean):boolean */
        /* renamed from: a */
        public boolean mo7747a(Hashtable<String, Integer> hashtable, HashSet<Integer> hashSet) {
            boolean z = true;
            if (C2687c.this.f7477t != 2 || (hashtable == null && hashSet == null)) {
                try {
                    if (C2687c.this.f7470m != null) {
                        Hashtable hashtable2 = new Hashtable();
                        for (int i = 0; i < 4; i++) {
                            if (hashtable != null && (hashtable.containsKey(C2687c.f7458c[i * 2]) || hashtable.containsKey(C2687c.f7458c[(i * 2) + 1]))) {
                                ((C2692e) C2687c.this.f7462e.get(i)).mo7756a(hashtable.containsKey(C2687c.f7458c[i * 2]) ? hashtable.get(C2687c.f7458c[i * 2]) : null, hashtable.containsKey(C2687c.f7458c[(i * 2) + 1]) ? hashtable.get(C2687c.f7458c[(i * 2) + 1]) : null);
                            }
                            for (int i2 = 0; i2 < 2; i2++) {
                                for (C2694g gVar : ((C2692e) C2687c.this.f7462e.get(i)).mo7742a(i2)) {
                                    String j = gVar.mo7798j();
                                    if (!hashtable2.containsKey(j)) {
                                        hashtable2.put(j, gVar.mo7797i());
                                    } else {
                                        ((C2694g) hashtable2.get(j)).mo7784a(gVar);
                                    }
                                }
                            }
                        }
                        for (C2693f fVar : C2687c.this.f7463f) {
                            if (fVar.mo7803j() && fVar.mo7775g() != 2) {
                                if (hashSet != null) {
                                    z = fVar.mo7770d(hashSet) && z;
                                } else {
                                    z = fVar.mo7778h() && z;
                                }
                                for (int i3 = 0; i3 < 2; i3++) {
                                    for (C2694g gVar2 : fVar.mo7742a(i3)) {
                                        String j2 = gVar2.mo7798j();
                                        if (!hashtable2.containsKey(j2)) {
                                            hashtable2.put(j2, gVar2.mo7797i());
                                        } else {
                                            ((C2694g) hashtable2.get(j2)).mo7784a(gVar2);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList<String> arrayList = new ArrayList();
                        Enumeration keys = hashtable2.keys();
                        while (keys.hasMoreElements()) {
                            String str = (String) keys.nextElement();
                            if (C2687c.this.f7474q.containsKey(str) && ((C2694g) hashtable2.get(str)).mo7789b((C2694g) C2687c.this.f7474q.get(str))) {
                                arrayList.add(str);
                            }
                        }
                        for (String str2 : arrayList) {
                            hashtable2.remove(str2);
                        }
                        int size = C2687c.this.f7475r.size() * 9;
                        if (hashtable2.size() > 0) {
                            C2685a aVar = null;
                            Enumeration keys2 = hashtable2.keys();
                            while (keys2.hasMoreElements()) {
                                C2694g gVar3 = (C2694g) hashtable2.get(keys2.nextElement());
                                if (gVar3.mo7792d() == C2687c.f7456a && gVar3.mo7790c() != 0) {
                                    aVar = C2687c.this.m10733a(aVar, 0, size, 0);
                                    aVar.mo7732l();
                                    aVar.mo7723g(gVar3.mo7781a());
                                    aVar.mo7723g(gVar3.mo7795g());
                                    aVar.mo7725h(gVar3.mo7799k());
                                    aVar.mo7734m();
                                    aVar.mo7723g(gVar3.mo7781a());
                                    aVar.mo7723g(gVar3.mo7795g());
                                }
                                aVar = aVar;
                            }
                            Enumeration keys3 = hashtable2.keys();
                            while (keys3.hasMoreElements()) {
                                C2694g gVar4 = (C2694g) hashtable2.get(keys3.nextElement());
                                if (gVar4.mo7792d() == C2687c.f7456a && gVar4.mo7790c() == 0) {
                                    aVar = C2687c.this.m10733a(aVar, 0, size, 0);
                                    aVar.mo7730k();
                                    aVar.mo7723g(gVar4.mo7781a());
                                    aVar.mo7723g(gVar4.mo7795g());
                                    aVar.mo7723g(gVar4.mo7796h());
                                }
                                aVar = aVar;
                            }
                            int i4 = 0;
                            while (i4 < C2687c.this.f7475r.size()) {
                                if (hashtable2.containsKey(((C2694g) C2687c.this.f7475r.get(i4)).mo7798j())) {
                                    int size2 = C2687c.this.f7475r.size() * 8;
                                    aVar = C2687c.this.m10733a(aVar, 0, size, 0);
                                    C2694g gVar5 = (C2694g) hashtable2.get(((C2694g) C2687c.this.f7475r.get(i4)).mo7798j());
                                    int i5 = (i4 * 8) + 0;
                                    int i6 = 0 + (i4 * 8) + 4;
                                    int i7 = size2 + i4;
                                    aVar.mo7730k();
                                    aVar.mo7723g(gVar5.mo7781a());
                                    aVar.mo7723g(gVar5.mo7795g());
                                    aVar.mo7723g(gVar5.mo7796h());
                                    aVar.mo7733l(28);
                                    aVar.mo7723g(gVar5.mo7781a());
                                    aVar.mo7723g(C2687c.m10748c(gVar5.mo7795g()));
                                    aVar.mo7723g(0);
                                    aVar.mo7723g(0);
                                    aVar.mo7723g(1);
                                    aVar.mo7715c(i5);
                                    aVar.mo7718e();
                                    aVar.mo7729j(Math.round(gVar5.mo7786b()));
                                    aVar.mo7715c(i5);
                                    aVar.mo7715c(i6);
                                    aVar.mo7724h();
                                    aVar.mo7725h(gVar5.mo7799k());
                                    aVar.mo7715c(i7);
                                    aVar.mo7728j();
                                    aVar.mo7715c(i6);
                                    aVar.mo7729j(0);
                                    aVar.mo7729j(0);
                                    int a = aVar.mo7705a();
                                    aVar.mo7720f();
                                    aVar.mo7725h(-1);
                                    aVar.mo7715c(i7);
                                    aVar.mo7715c(i7);
                                    aVar.mo7722g();
                                    aVar.mo7729j(-1);
                                    aVar.mo7715c(i6);
                                    aVar.mo7715c(i6);
                                    aVar.mo7712b(a - 4, aVar.mo7705a() - a);
                                    aVar.mo7738o();
                                    aVar.mo7723g(gVar5.mo7781a());
                                    aVar.mo7723g(gVar5.mo7795g());
                                    aVar.mo7715c(i7);
                                    aVar.mo7729j(0);
                                    aVar.mo7715c(i6);
                                    aVar.mo7729j(0);
                                    aVar.mo7723g(gVar5.mo7796h());
                                }
                                i4++;
                                aVar = aVar;
                            }
                            if (aVar == null || C2687c.this.m10741a(aVar, 1000) != null) {
                            }
                        }
                        Enumeration keys4 = hashtable2.keys();
                        while (keys4.hasMoreElements()) {
                            String str3 = (String) keys4.nextElement();
                            C2694g gVar6 = (C2694g) C2687c.this.f7474q.get(str3);
                            C2694g gVar7 = (C2694g) hashtable2.get(str3);
                            gVar6.mo7785a(gVar7.mo7793e());
                            gVar6.mo7787b(gVar7.mo7794f());
                            gVar6.mo7783a(gVar7.mo7790c());
                            float b = gVar6.mo7786b();
                            float b2 = gVar7.mo7786b();
                            gVar6.mo7782a(b2);
                            gVar6.mo7791c(gVar7.mo7796h());
                            gVar6.mo7788b(gVar7.mo7792d());
                            if (b2 != b) {
                                C2687c.this.f7478u = true;
                            }
                        }
                        for (int i8 = 0; i8 < C2687c.this.f7462e.size(); i8++) {
                            if (((C2692e) C2687c.this.f7462e.get(i8)).mo7759c() == 2) {
                                if (C2687c.this.f7461d[i8 * 2] != ((C2692e) C2687c.this.f7462e.get(i8)).mo7755a()) {
                                    m10801a(C2687c.f7458c[i8 * 2], ((C2692e) C2687c.this.f7462e.get(i8)).mo7755a());
                                    C2687c.this.f7461d[i8 * 2] = ((C2692e) C2687c.this.f7462e.get(i8)).mo7755a();
                                }
                                if (C2687c.this.f7461d[(i8 * 2) + 1] != ((C2692e) C2687c.this.f7462e.get(i8)).mo7757b()) {
                                    m10801a(C2687c.f7458c[(i8 * 2) + 1], ((C2692e) C2687c.this.f7462e.get(i8)).mo7757b());
                                    C2687c.this.f7461d[(i8 * 2) + 1] = ((C2692e) C2687c.this.f7462e.get(i8)).mo7757b();
                                }
                            }
                        }
                        for (C2693f fVar2 : C2687c.this.f7463f) {
                            if (fVar2.mo7803j() && fVar2.mo7775g() == 2 && fVar2.mo7764b(hashSet)) {
                                int c = fVar2.mo7765c(hashSet);
                                m10801a(fVar2.mo7763b(), c);
                                fVar2.mo7761a(c, hashSet);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return z;
        }

        /* WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        public void run() {
            while (true) {
                try {
                    synchronized (C2687c.this.f7479v) {
                        if (C2687c.this.f7477t != 2 && C2687c.this.f7470m != null) {
                            C2687c.this.f7479v.wait(100);
                            if (C2687c.this.f7477t == 2 || C2687c.this.f7470m == null) {
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mo7746a();
            }
        }
    }

    /* renamed from: ru.proghouse.robocam.a.b.c$b */
    class C2689b implements Runnable {

        /* renamed from: b */
        private C2687c f7490b = null;

        C2689b(C2687c cVar) {
            this.f7490b = cVar;
        }

        /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, boolean):boolean
         arg types: [ru.proghouse.robocam.a.b.c, int]
         candidates:
          ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, int):void
          ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, ru.proghouse.robocam.a.b.a):void
          ru.proghouse.robocam.a.b.c.b(ru.proghouse.robocam.a.b.c, boolean):boolean */
        public void run() {
            while (C2687c.this.f7477t != 2 && this.f7490b.f7470m != null && C2687c.this.f7473p.size() != 0) {
                C2685a aVar = new C2685a();
                aVar.mo7707a(0, C2687c.this.f7473p.size() * 4, 0);
                Enumeration keys = C2687c.this.f7473p.keys();
                int i = 0;
                while (keys.hasMoreElements()) {
                    C2691d dVar = (C2691d) C2687c.this.f7473p.get(keys.nextElement());
                    aVar.mo7733l(29);
                    aVar.mo7723g(dVar.mo7751a());
                    aVar.mo7723g(dVar.mo7753b());
                    aVar.mo7723g(0);
                    aVar.mo7723g(0);
                    aVar.mo7723g(1);
                    aVar.mo7715c(i * 4);
                    i++;
                }
                byte[] a = C2687c.this.m10741a(aVar, 1000);
                if (C2687c.this.f7477t != 2 && this.f7490b.f7470m != null) {
                    if (a == null || a.length < 3 || a[2] == 4) {
                        C2687c.this.mo7743b(R.string.ev3_error_no_reply_while_reading_input_port_values);
                        return;
                    }
                    ByteBuffer wrap = ByteBuffer.wrap(a);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    C2687c.this.f7478u = false;
                    Enumeration keys2 = C2687c.this.f7473p.keys();
                    int i2 = 0;
                    while (keys2.hasMoreElements()) {
                        ((C2691d) C2687c.this.f7473p.get(keys2.nextElement())).mo7752a(wrap.getFloat((i2 * 4) + 3));
                        i2++;
                    }
                    int i3 = 0;
                    while (true) {
                        try {
                            if (i3 * 20 >= (C2687c.this.f7478u ? 0 : C2687c.this.f7476s)) {
                                break;
                            }
                            Thread.sleep(20);
                            i3++;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: ru.proghouse.robocam.a.b.c$c */
    class C2690c implements Runnable {

        /* renamed from: b */
        private C2687c f7492b = null;

        /* renamed from: c */
        private int f7493c = 0;

        /* renamed from: d */
        private Object f7494d = null;

        /* renamed from: e */
        private Object f7495e = null;

        C2690c(C2687c cVar) {
            this.f7492b = cVar;
        }

        /* renamed from: a */
        private void m10804a() {
            C2685a aVar = new C2685a();
            aVar.mo7707a(0, 1020, 0);
            aVar.mo7735m(3);
            aVar.mo7729j(255);
            aVar.mo7708a(0);
            aVar.mo7735m(9);
            aVar.mo7729j(255);
            aVar.mo7708a(255);
            aVar.mo7735m(10);
            aVar.mo7729j(255);
            aVar.mo7708a(510);
            aVar.mo7735m(26);
            aVar.mo7729j(255);
            aVar.mo7708a(765);
            byte[] a = C2687c.this.m10741a(aVar, 1000);
            if (a != null && a.length == 1023 && a[2] == 2) {
                String a2 = C2696d.m10879a(a, 3, 255);
                String a3 = C2696d.m10879a(a, 258, 255);
                String a4 = C2696d.m10879a(a, 513, 255);
                String a5 = C2696d.m10879a(a, 768, 255);
                if (a2 == null || a3 == null || a4 == null || a5 == null || !a2.startsWith("Linux") || !a3.startsWith("V") || !a4.startsWith("V") || !a5.startsWith("LMS2012")) {
                    this.f7493c = R.string.ev3_error_strange_reply;
                    return;
                }
                return;
            }
            this.f7493c = R.string.ev3_error_unknown_device;
        }

        /* renamed from: b */
        private void m10805b() {
            C2685a aVar = new C2685a();
            aVar.mo7707a(0, 64, 0);
            for (int i = 0; i < 4; i++) {
                int i2 = 0;
                while (i2 < 8) {
                    aVar.mo7733l(5);
                    aVar.mo7723g(i);
                    aVar.mo7723g(i2 < 4 ? i2 : i2 + 12);
                    aVar.mo7708a((i2 * 2) + (i * 16));
                    aVar.mo7708a((i2 * 2) + (i * 16) + 1);
                    i2++;
                }
            }
            byte[] a = C2687c.this.m10741a(aVar, 1000);
            C2685a aVar2 = null;
            if (a != null && a.length >= 3 && a[2] == 2) {
                for (int i3 = 0; i3 < 4; i3++) {
                    int i4 = 0;
                    while (i4 < 8) {
                        byte b = a[(i4 * 2) + 3 + (i3 * 16)];
                        byte b2 = a[(i4 * 2) + 3 + (i3 * 16) + 1];
                        if (!(b == 126 || b == 125 || b == 255 || b == Byte.MAX_VALUE)) {
                            if (!C2687c.this.f7472o.contains(Integer.valueOf(i3))) {
                                C2687c.this.f7472o.add(Integer.valueOf(i3));
                            }
                            int i5 = i4 < 4 ? i4 : i4 + 12;
                            C2691d dVar = new C2691d(i3, i5, b, b2);
                            C2687c.this.f7473p.put(dVar.mo7754c(), dVar);
                            if (i5 >= 16) {
                                C2694g gVar = new C2694g(i3, C2687c.m10751d(i5));
                                C2687c.this.f7474q.put(gVar.mo7798j(), gVar);
                                aVar2 = C2687c.this.m10733a(aVar2, Allocation.USAGE_SHARED, 0, 0);
                                aVar2.mo7739p();
                                aVar2.mo7723g(i3);
                                aVar2.mo7723g(gVar.mo7795g());
                            }
                        }
                        i4++;
                    }
                }
                if (aVar2 != null) {
                    C2687c.this.m10737a(aVar2);
                    return;
                }
                return;
            }
            this.f7493c = R.string.ev3_error_cannot_read_input_port_list;
        }

        /* renamed from: c */
        private void m10806c() {
            if (C2687c.this.f7483z.equals("")) {
                C2687c.this.m10771v();
            }
            Hashtable hashtable = new Hashtable();
            for (int i = 0; i < C2687c.this.f7462e.size(); i++) {
                for (int i2 = 0; i2 < 2; i2++) {
                    for (int i3 = 0; i3 < ((C2692e) C2687c.this.f7462e.get(i)).mo7742a(i2).size(); i3++) {
                        C2694g gVar = ((C2692e) C2687c.this.f7462e.get(i)).mo7742a(i2).get(i3);
                        if (!hashtable.containsKey(gVar.mo7798j())) {
                            hashtable.put(gVar.mo7798j(), Integer.valueOf(gVar.mo7792d()));
                        } else if (!((Integer) hashtable.get(gVar.mo7798j())).equals(Integer.valueOf(gVar.mo7792d()))) {
                            this.f7493c = R.string.ev3_error_joysticks_have_different_types_for_same_port;
                            this.f7494d = gVar.mo7800l();
                        }
                        if (!C2687c.this.f7474q.containsKey(gVar.mo7798j())) {
                            this.f7493c = R.string.ev3_error_motor_not_connected;
                            this.f7494d = gVar.mo7800l();
                            return;
                        }
                        ((C2694g) C2687c.this.f7474q.get(gVar.mo7798j())).mo7788b(gVar.mo7792d());
                        if (gVar.mo7792d() == C2687c.f7457b) {
                            ((C2694g) C2687c.this.f7474q.get(gVar.mo7798j())).mo7783a(gVar.mo7790c());
                            C2687c.this.f7475r.add(C2687c.this.f7474q.get(gVar.mo7798j()));
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m10807d() {
            C2685a aVar = new C2685a();
            aVar.mo7707a(Allocation.USAGE_SHARED, 0, 0);
            aVar.mo7731k(27);
            aVar.mo7723g(8);
            C2687c.this.m10737a(aVar);
        }

        /* renamed from: e */
        private void m10808e() {
            if (this.f7492b.mo7744o() && this.f7492b.mo7745p() != null && !"".equals(this.f7492b.mo7745p())) {
                try {
                    C2685a aVar = new C2685a();
                    aVar.mo7707a(0, 0, 8);
                    this.f7492b.m10744b(aVar);
                    byte[] unused = C2687c.this.m10741a(aVar, 1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void run() {
            boolean z;
            int i = 0;
            while (true) {
                try {
                    BluetoothSocket unused = this.f7492b.f7470m = this.f7492b.f7471n.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"));
                    if (C2687c.this.f7477t == 2) {
                        break;
                    }
                    try {
                        this.f7492b.f7470m.connect();
                        z = true;
                    } catch (IOException e) {
                        this.f7492b.f7470m.close();
                        if (i >= 7) {
                            throw e;
                        }
                        z = false;
                    }
                    if (z) {
                        this.f7493c = 0;
                        m10804a();
                        if (i >= 7 || this.f7493c == R.string.ev3_error_unknown_device || this.f7493c == 0) {
                            break;
                        }
                    }
                    Thread.sleep(3000);
                    i++;
                } catch (Exception e2) {
                    if (C2687c.this.f7477t != 2) {
                        e2.printStackTrace();
                        this.f7492b.mo7679e(R.string.ev3_connection_error);
                        this.f7492b.m10773w();
                        return;
                    }
                    return;
                }
            }
            if (this.f7493c == 0 && C2687c.this.f7477t != 2) {
                m10805b();
            }
            if (this.f7493c == 0 && C2687c.this.f7477t != 2) {
                m10806c();
            }
            if (C2687c.this.f7477t == 2) {
                return;
            }
            if (this.f7493c == 0) {
                C2687c.this.m10770u();
                for (C2693f fVar : C2687c.this.f7463f) {
                    fVar.mo7779i();
                }
                m10808e();
                C2687c.this.m10778z();
                C2687c.this.m10777y();
                m10807d();
                this.f7492b.mo7691r();
                int unused2 = C2687c.this.f7477t = 3;
                //ToDo: m10919c
                ru.proghouse.robocam.k.c();
                return;
            }
            int unused3 = C2687c.this.f7477t = 0;
            if (this.f7494d == null) {
                this.f7492b.mo7679e(this.f7493c);
            } else {
                this.f7492b.mo7668a(this.f7493c, this.f7494d);
            }
            this.f7492b.m10773w();
        }
    }

    public C2687c() {
        this.f7462e.add(new C2692e());
        this.f7462e.add(new C2692e());
        this.f7462e.add(new C2692e());
        this.f7462e.add(new C2692e());
        m10770u();
    }

    /* renamed from: a */
    public C2685a m10733a(C2685a aVar, int i, int i2, int i3) {
        if (aVar != null) {
            return aVar;
        }
        C2685a aVar2 = new C2685a();
        aVar2.mo7707a(i, i2, i3);
        return aVar2;
    }

    /* renamed from: a */
    public static void m10735a(Context context) {
        File file = new File(
/*ToDo: C2714o.m10947a*/o.a(context), "researcher.xml");
        if (!file.exists()) {
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                try {
                    fileOutputStream.write(new String("<EV3 Name=\"" + context.getString(R.string.ev3_researcher) + "\"" + " Description=\"" + context.getString(R.string.ev3_researcher_desc) + "\"" + ">" + "<Joystick Index=\"0\" Visible=\"1\" Shape=\"c\" Type=\"1\">" + "<OutputPort Group=\"0\" Layer=\"0\" Number=\"B\"/>" + "<OutputPort Group=\"1\" Layer=\"0\" Number=\"C\"/>" + "</Joystick>" + "<Joystick Index=\"1\" Visible=\"1\" Shape=\"v\" Type=\"0\" Behavior1=\"1\">" + "<OutputPort Group=\"1\" Layer=\"0\" Number=\"A\" JoystickType=\"1\" Power=\"50\" Invert=\"1\"/>" + "</Joystick>" + "<KeyGroup Active=\"1\" Type=\"1\" IncX=\"15\" IncY=\"15\" DecX=\"50\" DecY=\"50\">" + "<UpKey>87</UpKey>" + "<UpKey>38</UpKey>" + "<LeftKey>65</LeftKey>" + "<LeftKey>37</LeftKey>" + "<DownKey>83</DownKey>" + "<DownKey>40</DownKey>" + "<RightKey>68</RightKey>" + "<RightKey>39</RightKey>" + "<OutputPort Group=\"0\" Layer=\"0\" Number=\"B\"/>" + "<OutputPort Group=\"1\" Layer=\"0\" Number=\"C\"/>" + "</KeyGroup>" + "<KeyGroup Active=\"1\" Type=\"0\" Behavior1=\"1\" IncY=\"5\" DecY=\"5\">" + "<UpKey>89</UpKey>" + "<DownKey>72</DownKey>" + "<OutputPort Group=\"1\" Layer=\"0\" Number=\"A\" JoystickType=\"1\" Power=\"50\" Invert=\"1\"/>" + "</KeyGroup>" + "</EV3>").getBytes("UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      ru.proghouse.robocam.n.a(java.lang.String, float):float
      ru.proghouse.robocam.n.a(java.lang.String, int):int
      ru.proghouse.robocam.n.a(java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.n.a(java.lang.String, float):float
     arg types: [java.lang.String, int]
     candidates:
      ru.proghouse.robocam.n.a(java.lang.String, int):int
      ru.proghouse.robocam.n.a(java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean
      ru.proghouse.robocam.n.a(java.lang.String, float):float */
    /* renamed from: a */
    private void m10736a(Element element, C2686b bVar) {
        NodeList elementsByTagName = element.getElementsByTagName("OutputPort");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element2 = (Element) elementsByTagName.item(i);
            int a = C2713n.m10944a(element2.getAttribute("Group"), -1);
            int a2 = C2713n.m10944a(element2.getAttribute("Layer"), -1);
            String a3 = C2713n.m10945a(element2.getAttribute("Number"), "");
            int i2 = a3.equals("A") ? 1 : a3.equals("B") ? 2 : a3.equals("C") ? 4 : a3.equals("D") ? 8 : -1;
            if (a >= 0 && a <= 1 && a2 >= 0 && a2 < 4 && i2 >= 0) {
                C2694g gVar = new C2694g(a2, i2);
                bVar.mo7742a(a).add(gVar);
                gVar.mo7788b(C2713n.m10944a(element2.getAttribute("JoystickType"), f7456a));
                gVar.mo7783a(C2713n.m10944a(element2.getAttribute("Power"), 0));
                gVar.mo7785a(C2713n.m10946a(element2.getAttribute("Invert"), false));
                gVar.mo7787b(C2713n.m10943a(element2.getAttribute("Coefficient"), 1.0f));
                gVar.mo7791c(C2713n.m10944a(element2.getAttribute("Brake"), 1));
            }
        }
    }

    /* renamed from: a */
    public void m10737a(C2685a aVar) {
        OutputStream outputStream = null;
        try {
            outputStream = this.f7470m.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] b = aVar.mo7713b();
        synchronized (this.f7468k) {
            try {
                outputStream.write(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public byte[] m10741a(C2685a aVar, int i) {
        byte[] bArr;
        int b;
        int i2 = 0;
        OutputStream outputStream = null;
        try {
            outputStream = this.f7470m.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] b2 = aVar.mo7713b();
        synchronized (this.f7468k) {
            try {
                outputStream.write(b2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            InputStream inputStream = null;
            try {
                inputStream = this.f7470m.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                try {
                    if (!(i3 * 20 < i && (i4 = inputStream.available()) <= 0)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(20);
                    i3++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (i4 <= 0 || (b = C2696d.m10888b(inputStream)) <= 0) {
                bArr = null;
            } else {
                bArr = new byte[b];
                int i5 = 0;
                while (true) {
                    try {
                        i2 = inputStream.read(bArr, i2, b);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (i2 == b) {
                        break;
                    } else if (i2 <= 0) {
                        if (i5 * 20 >= i) {
                            bArr = null;
                            break;
                        }
                        try {
                            Thread.sleep(20);
                            i5++;
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        b -= i2;
                    }
                }
                if (!(b2[2] == bArr[0] && b2[3] == bArr[1])) {
                    bArr = null;
                }
            }
        }
        return bArr;
    }

    /* renamed from: b */
    public void m10744b(C2685a aVar) {
        if (mo7744o() && mo7745p() != null && !"".equals(mo7745p())) {
            aVar.mo7737n(8);
            aVar.mo7727i(1);
            aVar.mo7710a(mo7745p());
            aVar.mo7719e(0);
            aVar.mo7719e(4);
            aVar.mo7716d();
            aVar.mo7727i(1);
            aVar.mo7719e(0);
            aVar.mo7719e(4);
            aVar.mo7723g(0);
        }
    }

    /* renamed from: c */
    public static int m10748c(int i) {
        switch (i) {
            case 1:
                return 16;
            case 2:
                return 17;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                return 0;
            case 4:
                return 18;
            case 8:
                return 19;
        }
    }

    /* renamed from: d */
    public static int m10751d(int i) {
        switch (i) {
            case 16:
                return 1;
            case 17:
                return 2;
            case 18:
                return 4;
            case 19:
                return 8;
            default:
                return i;
        }
    }

    /* renamed from: u */
    public void m10770u() {
        for (int i = 0; i < this.f7462e.size(); i++) {
            this.f7461d[i * 2] = this.f7462e.get(i).mo7755a();
            this.f7461d[(i * 2) + 1] = this.f7462e.get(i).mo7757b();
        }
    }

    /* renamed from: v */
    public void m10771v() {
        m10776x();
        this.f7463f.clear();
        this.f7462e.get(0).mo7702a(true);
        this.f7462e.get(0).mo7701a("c");
        this.f7462e.get(1).mo7702a(true);
        this.f7462e.get(1).mo7701a("v");
        this.f7462e.get(0).mo7758b(1);
        this.f7462e.get(0).mo7742a(0).add(new C2694g(0, 2));
        this.f7462e.get(0).mo7742a(1).add(new C2694g(0, 4));
        this.f7462e.get(1).mo7758b(0);
        this.f7462e.get(1).mo7742a(1).add(new C2694g(0, 1));
        this.f7462e.get(1).mo7742a(1).get(0).mo7788b(f7457b);
        this.f7462e.get(1).mo7742a(1).get(0).mo7783a(50);
        this.f7462e.get(1).mo7742a(1).get(0).mo7785a(true);
        this.f7462e.get(1).mo7700a(1, 1);
        this.f7463f.add(new C2693f());
        this.f7463f.get(0).mo7767c(1);
        this.f7463f.get(0).mo7766c().add(87);
        this.f7463f.get(0).mo7766c().add(38);
        this.f7463f.get(0).mo7768d().add(65);
        this.f7463f.get(0).mo7768d().add(37);
        this.f7463f.get(0).mo7771e().add(83);
        this.f7463f.get(0).mo7771e().add(40);
        this.f7463f.get(0).mo7773f().add(68);
        this.f7463f.get(0).mo7773f().add(39);
        this.f7463f.get(0).mo7769d(15);
        this.f7463f.get(0).mo7772e(50);
        this.f7463f.get(0).mo7774f(15);
        this.f7463f.get(0).mo7776g(50);
        this.f7463f.get(0).mo7742a(0).add(new C2694g(0, 2));
        this.f7463f.get(0).mo7742a(1).add(new C2694g(0, 4));
        this.f7463f.add(new C2693f());
        this.f7463f.get(1).mo7766c().add(89);
        this.f7463f.get(1).mo7771e().add(72);
        this.f7463f.get(1).mo7767c(0);
        this.f7463f.get(1).mo7774f(5);
        this.f7463f.get(1).mo7776g(5);
        this.f7463f.get(1).mo7742a(1).add(new C2694g(0, 1));
        this.f7463f.get(1).mo7742a(1).get(0).mo7788b(f7457b);
        this.f7463f.get(1).mo7742a(1).get(0).mo7783a(50);
        this.f7463f.get(1).mo7742a(1).get(0).mo7785a(true);
        this.f7463f.get(1).mo7760a(1, 1);
    }

    /* renamed from: w */
    public void m10773w() {
        if (this.f7470m != null) {
            try {
                C2685a aVar = new C2685a();
                aVar.mo7707a(Allocation.USAGE_SHARED, 0, 0);
                aVar.mo7714c();
                aVar.mo7727i(1);
                aVar.mo7740q();
                aVar.mo7731k(27);
                aVar.mo7723g(1);
                m10737a(aVar);
                this.f7470m.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.f7470m = null;
        this.f7472o.clear();
        this.f7473p.clear();
        this.f7474q.clear();
        this.f7475r.clear();
        this.f7477t = 0;
        synchronized (this.f7479v) {
            this.f7479v.notifyAll();
        }
        synchronized (this.f7480w) {
            this.f7481x.clear();
            this.f7465h.clear();
        }
    }

    /* renamed from: x */
    private void m10776x() {
        for (int i = 0; i < this.f7462e.size(); i++) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.f7462e.get(i).mo7742a(i2).clear();
                this.f7462e.get(i).mo7702a(false);
            }
        }
    }

    /* renamed from: y */
    public void m10777y() {
        new Thread(new C2688a()).start();
    }

    /* renamed from: z */
    public void m10778z() {
        new Thread(new C2689b(this)).start();
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public String mo7667a() {
        if (this.f7471n != null) {
            return this.f7471n.getName();
        }
        return null;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7669a(BluetoothDevice bluetoothDevice) {
        if (this.f7477t == 0 || this.f7477t == 2) {
            this.f7471n = bluetoothDevice;
            this.f7477t = 1;
            new Thread(new C2690c(this)).start();
        }
    }

    /* WARN: Type inference failed for: r10v0, types: [ru.proghouse.robocam.a.b.c] */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      ru.proghouse.robocam.n.a(java.lang.String, float):float
      ru.proghouse.robocam.n.a(java.lang.String, int):int
      ru.proghouse.robocam.n.a(java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean */
    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7670a(Context context, File file, Document document) {
        if (!document.getDocumentElement().getNodeName().equals("EV3")) {
            try {
                throw new Exception(context.getString(R.string.unknown_driver_name, document.getDocumentElement().getNodeName()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ((C2687c) this).f7482y = document.getDocumentElement().getAttribute("Name");
        ((C2687c) this).f7467j = C2713n.m10945a(document.getDocumentElement().getAttribute("UserProgram"), "");
        ((C2687c) this).f7466i = C2713n.m10946a(document.getDocumentElement().getAttribute("StartUserProgram"), false);
        ((C2687c) this).f7460B = C2713n.m10946a(document.getDocumentElement().getAttribute("HideJoysticks"), true);
        mo7674a(C2713n.m10946a(document.getDocumentElement().getAttribute("ShowDebugInfo"), true));
        ((C2687c) this).f7483z = file.getName();
        ((C2687c) this).f7459A = file.lastModified();
        m10776x();
        ((C2687c) this).f7463f.clear();
        NodeList elementsByTagName = document.getElementsByTagName("Joystick");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
            int a = C2713n.m10944a(element.getAttribute("Index"), -1);
            if (a >= 0 && a < ((C2687c) this).f7462e.size()) {
                C2692e eVar = ((C2687c) this).f7462e.get(a);
                eVar.mo7702a(C2713n.m10946a(element.getAttribute("Visible"), false));
                eVar.mo7701a(C2713n.m10945a(element.getAttribute("Shape"), "c"));
                eVar.mo7758b(C2713n.m10944a(element.getAttribute("Type"), 0));
                eVar.mo7700a(0, C2713n.m10944a(element.getAttribute("Behavior0"), 0));
                eVar.mo7700a(1, C2713n.m10944a(element.getAttribute("Behavior1"), 0));
                if (eVar.mo7759c() != 2) {
                    m10736a(element, eVar);
                }
            }
        }
        NodeList elementsByTagName2 = document.getElementsByTagName("KeyGroup");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            C2693f fVar = new C2693f();
            fVar.mo7767c(C2713n.m10944a(element2.getAttribute("Type"), 0));
            fVar.mo7801a(C2713n.m10946a(element2.getAttribute("Active"), false));
            fVar.mo7762a(C2713n.m10945a(element2.getAttribute("Mailbox"), ""));
            fVar.mo7760a(0, C2713n.m10944a(element2.getAttribute("Behavior0"), 0));
            fVar.mo7760a(1, C2713n.m10944a(element2.getAttribute("Behavior1"), 0));
            fVar.mo7769d(C2713n.m10944a(element2.getAttribute("IncX"), 0));
            fVar.mo7772e(C2713n.m10944a(element2.getAttribute("DecX"), 0));
            fVar.mo7774f(C2713n.m10944a(element2.getAttribute("IncY"), 0));
            fVar.mo7776g(C2713n.m10944a(element2.getAttribute("DecY"), 0));
            fVar.mo7777h(C2713n.m10944a(element2.getAttribute("StepXPause"), 100));
            fVar.mo7780i(C2713n.m10944a(element2.getAttribute("StepYPause"), 100));
            if (fVar.mo7775g() != 2) {
                C2695c.m10871a(element2, fVar.mo7766c(), "UpKey");
                C2695c.m10871a(element2, fVar.mo7768d(), "LeftKey");
                C2695c.m10871a(element2, fVar.mo7771e(), "DownKey");
                C2695c.m10871a(element2, fVar.mo7773f(), "RightKey");
                m10736a(element2, fVar);
            } else {
                C2695c.m10871a(element2, fVar.mo7805l(), "Key");
            }
            ((C2687c) this).f7463f.add(fVar);
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7671a(HashSet<Integer> hashSet) {
        synchronized (this.f7480w) {
            this.f7465h = hashSet;
            this.f7464g = true;
        }
        synchronized (this.f7479v) {
            this.f7479v.notifyAll();
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7672a(Hashtable<String, Integer> hashtable) {
        synchronized (this.f7480w) {
            Enumeration<String> keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                String nextElement = keys.nextElement();
                this.f7481x.put(nextElement, hashtable.get(nextElement));
            }
        }
        synchronized (this.f7479v) {
            this.f7479v.notifyAll();
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a_ */
    public int mo7675a_(int i) {
        switch (i) {
            case 0:
                return R.string.ev3_is_disconnected;
            case 1:
                return R.string.ev3_is_connecting;
            case 2:
                return R.string.ev3_bonded_devices_not_found;
            default:
                return super.mo7675a_(i);
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: b */
    public String mo7676b() {
        String str = "";
        Iterator<C2692e> it = this.f7462e.iterator();
        while (it.hasNext()) {
            str = str + it.next().mo7704e();
        }
        return str;
    }

    /* renamed from: b */
    public void mo7743b(int i) {
        this.f7477t = 2;
        //ToDo: m10919c
        ru.proghouse.robocam.k.c();
        if (this.f7470m != null) {
            mo7690n();
            m10773w();
        }
        if (i == 0) {
            mo7692s();
        } else {
            mo7682f(i);
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: c */
    public String mo7677c() {
        String str = "";
        Iterator<C2692e> it = this.f7462e.iterator();
        while (it.hasNext()) {
            str = str + it.next().mo7703d();
        }
        return str;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: d */
    public String mo7678d() {
        HashSet hashSet = new HashSet();
        for (C2693f fVar : this.f7463f) {
            if (fVar.mo7803j()) {
                hashSet.addAll(fVar.mo7766c());
                hashSet.addAll(fVar.mo7768d());
                hashSet.addAll(fVar.mo7771e());
                hashSet.addAll(fVar.mo7773f());
                hashSet.addAll(fVar.mo7805l());
            }
        }
        String str = "";
        if (hashSet.size() <= 0) {
            return str;
        }
        char[] cArr = {'0'};
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String num = ((Integer) it.next()).toString();
            if (num.length() < 3) {
                num = new String(cArr, 0, 3 - num.length()) + num;
            }
            str = str + num;
        }
        return str;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: e */
    public boolean mo7680e() {
        return this.f7460B;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: f */
    public String mo7681f() {
        return "EV3";
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: g */
    public String mo7683g() {
        return this.f7483z;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: h */
    public String mo7684h() {
        return this.f7482y;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: i */
    public boolean mo7685i() {
        return this.f7477t == 0;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: j */
    public boolean mo7686j() {
        return this.f7477t == 3;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: k */
    public long mo7687k() {
        return this.f7459A;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: l */
    public boolean mo7688l() {
        return true;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: m */
    public void mo7689m() {
        mo7743b(0);
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: n */
    public void mo7690n() {
        int i;
        if (this.f7470m != null && this.f7474q.size() > 0) {
            C2685a aVar = new C2685a();
            Enumeration<String> keys = this.f7474q.keys();
            int i2 = 0;
            while (keys.hasMoreElements()) {
                i2 = this.f7474q.get(keys.nextElement()).mo7792d() == f7457b ? i2 + 1 : i2;
            }
            aVar.mo7707a(Allocation.USAGE_SHARED, 0, i2 * 8);
            aVar.mo7714c();
            aVar.mo7727i(1);
            aVar.mo7741r();
            aVar.mo7723g(0);
            Enumeration<String> keys2 = this.f7474q.keys();
            while (keys2.hasMoreElements()) {
                C2694g gVar = this.f7474q.get(keys2.nextElement());
                aVar.mo7730k();
                aVar.mo7723g(gVar.mo7781a());
                aVar.mo7723g(gVar.mo7795g());
                aVar.mo7723g(gVar.mo7796h());
            }
            Enumeration<String> keys3 = this.f7474q.keys();
            int i3 = 0;
            while (keys3.hasMoreElements()) {
                C2694g gVar2 = this.f7474q.get(keys3.nextElement());
                if (gVar2.mo7792d() != f7457b || gVar2.mo7799k() == 0) {
                    i = i3;
                } else {
                    aVar.mo7733l(28);
                    aVar.mo7723g(gVar2.mo7781a());
                    aVar.mo7723g(m10748c(gVar2.mo7795g()));
                    aVar.mo7723g(0);
                    aVar.mo7723g(0);
                    aVar.mo7723g(1);
                    aVar.mo7721f(i3 * 8);
                    aVar.mo7718e();
                    aVar.mo7729j(0);
                    aVar.mo7721f(i3 * 8);
                    aVar.mo7721f(i3 * 8);
                    aVar.mo7726i();
                    aVar.mo7729j(gVar2.mo7799k());
                    aVar.mo7721f((i3 * 8) + 4);
                    aVar.mo7728j();
                    aVar.mo7721f(i3 * 8);
                    aVar.mo7729j(0);
                    aVar.mo7729j(10);
                    aVar.mo7722g();
                    aVar.mo7729j(-1);
                    aVar.mo7721f((i3 * 8) + 4);
                    aVar.mo7721f((i3 * 8) + 4);
                    aVar.mo7738o();
                    aVar.mo7723g(gVar2.mo7781a());
                    aVar.mo7723g(gVar2.mo7795g());
                    aVar.mo7721f((i3 * 8) + 4);
                    aVar.mo7729j(0);
                    aVar.mo7721f(i3 * 8);
                    aVar.mo7729j(0);
                    aVar.mo7725h(gVar2.mo7796h());
                    aVar.mo7736n();
                    aVar.mo7723g(gVar2.mo7781a());
                    aVar.mo7723g(gVar2.mo7795g());
                    i = i3 + 1;
                }
                i3 = i;
            }
            aVar.mo7740q();
            m10744b(aVar);
            aVar.mo7731k(27);
            aVar.mo7723g(8);
            m10737a(aVar);
        }
    }

    /* renamed from: o */
    public boolean mo7744o() {
        return this.f7466i;
    }

    /* renamed from: p */
    public String mo7745p() {
        return this.f7467j;
    }
}
