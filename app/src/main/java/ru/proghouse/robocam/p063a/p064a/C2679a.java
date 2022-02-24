package ru.proghouse.robocam.p063a.p064a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.proghouse.robocam.k;
import ru.proghouse.robocam.C2713n;
import ru.proghouse.robocam.R;
import ru.proghouse.robocam.p063a.C2677a;
import ru.proghouse.robocam.p063a.C2684b;
import ru.proghouse.robocam.p063a.C2695c;
import ru.proghouse.robocam.p063a.C2696d;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.a.a.a */
public class C2679a extends C2677a {

    /* renamed from: a */
    static final String[] f7419a = {"x", "y", "w", "z", "a", "b", "c", "d"};
    /* renamed from: b */
    public volatile int f7420b = 1;

    /* renamed from: c */
    private volatile String f7421c = "";

    /* renamed from: d */
    private volatile String f7422d = "";
    /* renamed from: e */
    public volatile String f7423e = "";
    /* renamed from: f */
    public volatile String f7424f = "";
    /* renamed from: g */
    public volatile String f7425g = "US-ASCII";

    /* renamed from: h */
    private List<C2684b> f7426h = new ArrayList();

    /* renamed from: i */
    private volatile boolean f7427i = false;
    /* renamed from: j */
    public HashSet<Integer> f7428j = new HashSet<>();

    /* renamed from: k */
    private volatile long f7429k = 0;

    /* renamed from: l */
    private volatile boolean f7430l = true;
    /* renamed from: m */
    public volatile int f7431m = 0;
    /* renamed from: n */
    public volatile BluetoothSocket f7432n = null;
    /* renamed from: o */
    public volatile BluetoothDevice f7433o = null;

    /* renamed from: p */
    private final Object f7434p = new Object();
    /* renamed from: q */
    public final Object f7435q = new Object();
    /* renamed from: r */
    public final Object f7436r = new Object();
    /* renamed from: s */
    public boolean f7437s = false;
    /* renamed from: t */
    public Hashtable<String, Integer> f7438t = new Hashtable<>();
    /* renamed from: u */
    public HashSet<Integer> f7439u = new HashSet<>();
    /* renamed from: v */
    public HashSet<Integer> f7440v = new HashSet<>();
    /* renamed from: w */
    public int[] f7441w = new int[8];

    /* renamed from: ru.proghouse.robocam.a.a.a$a */
    private class C2681a implements Runnable {
        private C2681a() {
        }

        /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ru.proghouse.robocam.a.a.a.a(ru.proghouse.robocam.a.a.a, boolean):boolean
         arg types: [ru.proghouse.robocam.a.a.a, int]
         candidates:
          ru.proghouse.robocam.a.a.a.a(ru.proghouse.robocam.a.a.a, int):int
          ru.proghouse.robocam.a.a.a.a(ru.proghouse.robocam.a.a.a, android.bluetooth.BluetoothSocket):android.bluetooth.BluetoothSocket
          ru.proghouse.robocam.a.a.a.a(ru.proghouse.robocam.a.a.a, java.lang.String):java.lang.String
          ru.proghouse.robocam.a.a.a.a(java.io.ByteArrayOutputStream, int):byte[]
          ru.proghouse.robocam.a.a.a(android.content.Context, java.lang.String):ru.proghouse.robocam.a.a
          ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void
          ru.proghouse.robocam.a.a.a(java.lang.String, java.lang.Class<? extends ru.proghouse.robocam.a.a>):void
          ru.proghouse.robocam.a.a.a(int, java.lang.Object[]):void
          ru.proghouse.robocam.a.a.a.a(ru.proghouse.robocam.a.a.a, boolean):boolean */
        /* renamed from: a */
        public void mo7695a() {
            Hashtable<String, Integer> hashtable;
            HashSet<Integer> hashSet;
            while (C2679a.this.f7431m != 2 && C2679a.this.f7432n != null) {
                synchronized (C2679a.this.f7436r) {
                    if (C2679a.this.f7438t.size() > 0) {
                        C2679a.this.f7438t.clear();
                        hashtable = (Hashtable) C2679a.this.f7438t.clone();
                    } else {
                        hashtable = null;
                    }
                    if (C2679a.this.f7437s) {
                        hashSet = (HashSet) C2679a.this.f7439u.clone();
                        C2679a.this.f7437s = false;
                    } else {
                        hashSet = null;
                    }
                }
                mo7696a(hashtable, hashSet);
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
        /* renamed from: a */
        public void mo7696a(Hashtable<String, Integer> hashtable, HashSet<Integer> hashSet) {
            ByteArrayOutputStream byteArrayOutputStream;
            if (C2679a.this.f7431m != 2 && C2679a.this.f7432n != null) {
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                if (hashtable != null) {
                    int i = 0;
                    while (i < 4) {
                        if (hashtable.containsKey(C2679a.f7419a[i * 2]) || hashtable.containsKey(C2679a.f7419a[(i * 2) + 1])) {
                            int intValue = hashtable.containsKey(C2679a.f7419a[i * 2]) ? hashtable.get(C2679a.f7419a[i * 2]).intValue() : C2679a.this.f7441w[i * 2];
                            int intValue2 = hashtable.containsKey(C2679a.f7419a[(i * 2) + 1]) ? hashtable.get(C2679a.f7419a[(i * 2) + 1]).intValue() : C2679a.this.f7441w[(i * 2) + 1];
                            if (intValue != C2679a.this.f7441w[i * 2]) {
                                if (byteArrayOutputStream2 == null) {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    C2696d.m10883a((OutputStream) byteArrayOutputStream, 2);
                                } else {
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                }
                                C2696d.m10883a((OutputStream) byteArrayOutputStream, i * 2);
                                C2696d.m10881a((OutputStream) byteArrayOutputStream, (byte) intValue);
                                C2679a.this.f7441w[i * 2] = intValue;
                            } else {
                                byteArrayOutputStream = byteArrayOutputStream2;
                            }
                            if (intValue2 != C2679a.this.f7441w[(i * 2) + 1]) {
                                if (byteArrayOutputStream == null) {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    C2696d.m10883a((OutputStream) byteArrayOutputStream, 2);
                                }
                                C2696d.m10883a((OutputStream) byteArrayOutputStream, (i * 2) + 1);
                                C2696d.m10881a((OutputStream) byteArrayOutputStream, (byte) intValue2);
                                C2679a.this.f7441w[(i * 2) + 1] = intValue2;
                            }
                        } else {
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                        i++;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                    }
                }
                if (hashSet != null) {
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    synchronized (C2679a.this.f7428j) {
                        Iterator<Integer> it = hashSet.iterator();
                        while (it.hasNext()) {
                            Integer next = it.next();
                            if (C2679a.this.f7428j.contains(next) && !C2679a.this.f7440v.contains(next)) {
                                hashSet3.add(next);
                            }
                        }
                        Iterator it2 = C2679a.this.f7440v.iterator();
                        while (it2.hasNext()) {
                            Integer num = (Integer) it2.next();
                            if (!hashSet.contains(num)) {
                                hashSet2.add(num);
                            }
                        }
                        C2679a.this.f7440v.clear();
                        C2679a.this.f7440v.addAll(hashSet);
                    }
                    if (hashSet2.size() > 0 || hashSet3.size() > 0) {
                        if (byteArrayOutputStream2 == null) {
                            byteArrayOutputStream2 = new ByteArrayOutputStream();
                            C2696d.m10883a((OutputStream) byteArrayOutputStream2, 2);
                        }
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            C2696d.m10883a((OutputStream) byteArrayOutputStream2, 255);
                            C2696d.m10883a((OutputStream) byteArrayOutputStream2, ((Integer) it3.next()).intValue());
                        }
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            C2696d.m10883a((OutputStream) byteArrayOutputStream2, 254);
                            C2696d.m10883a((OutputStream) byteArrayOutputStream2, ((Integer) it4.next()).intValue());
                        }
                    }
                }
                if (byteArrayOutputStream2 == null || C2679a.this.m10629a(byteArrayOutputStream2, 1000) != null) {
                }
            }
        }

        /* WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        public void run() {
            while (true) {
                try {
                    synchronized (C2679a.this.f7435q) {
                        if (C2679a.this.f7431m != 2 && C2679a.this.f7432n != null) {
                            C2679a.this.f7435q.wait(100);
                            if (C2679a.this.f7431m == 2 || C2679a.this.f7432n == null) {
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mo7695a();
            }
        }
    }

    /* renamed from: ru.proghouse.robocam.a.a.a$b */
    private class C2682b implements Runnable {

        /* renamed from: a */
        C2679a f7443a = null;

        /* renamed from: c */
        private int f7445c = 0;

        /* renamed from: d */
        private Object f7446d = null;

        public C2682b(C2679a aVar) {
            this.f7443a = aVar;
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
        private void m10681a() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C2696d.m10883a((OutputStream) byteArrayOutputStream, 0);
            int nextInt = new Random().nextInt(254);
            C2696d.m10883a((OutputStream) byteArrayOutputStream, nextInt);
            C2696d.m10883a((OutputStream) byteArrayOutputStream, 1);
            byte[] a = C2679a.this.m10629a(byteArrayOutputStream, 1000);
            if (a == null || a.length != 4) {
                this.f7445c = R.string.robot_error_unknown_device;
                return;
            }
            int a2 = C2696d.m10878a(a, 0);
            if (a2 != 0 && a2 != 1) {
                this.f7445c = R.string.robot_error_wrong_reply;
            } else if (a2 == 1) {
                this.f7445c = R.string.robot_error_internal_error;
            } else if (C2696d.m10878a(a, 1) != nextInt + 1) {
                this.f7445c = R.string.robot_error_wrong_reply;
            } else {
                int a3 = C2696d.m10878a(a, 2);
                if (a3 < 1 || a3 > 1) {
                    this.f7445c = R.string.robot_error_usupported_protocol;
                    return;
                }
                int a4 = C2696d.m10878a(a, 3);
                if (a4 == 0 || a4 == 1) {
                    int unused = C2679a.this.f7420b = a3;
                    String unused2 = C2679a.this.f7425g = a4 == 1 ? "UTF-8" : "US-ASCII";
                    return;
                }
                this.f7445c = R.string.robot_error_usupported_charset;
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
        /* renamed from: b */
        private void m10682b() {
            if (C2679a.this.f7423e != null && !C2679a.this.f7423e.equals("") && C2679a.this.f7424f != null && !C2679a.this.f7424f.equals("")) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C2696d.m10883a((OutputStream) byteArrayOutputStream, 1);
                C2696d.m10891b(byteArrayOutputStream, this.f7443a.f7423e == null ? "" : this.f7443a.f7423e, C2679a.this.f7425g);
                byte[] a = C2679a.this.m10629a(byteArrayOutputStream, 1000);
                if (a == null || a.length < 2) {
                    this.f7445c = R.string.robot_error_wrong_reply;
                    return;
                }
                int a2 = C2696d.m10878a(a, 0);
                if (a2 != 0 && a2 != 1) {
                    this.f7445c = R.string.robot_error_wrong_reply;
                } else if (a2 == 1) {
                    this.f7445c = R.string.robot_error_internal_error;
                } else {
                    String a3 = C2696d.m10880a(a, 1, a.length - 1, C2679a.this.f7425g);
                    if (a3 == null) {
                        a3 = "";
                    }
                    if (!a3.equals(C2679a.this.f7424f)) {
                        this.f7445c = R.string.robot_error_wrong_response_on_callsign;
                    }
                }
            }
        }

        public void run() {
            boolean z;
            int i = 0;
            while (true) {
                try {
                    BluetoothSocket unused = this.f7443a.f7432n = this.f7443a.f7433o.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"));
                    if (C2679a.this.f7431m == 2) {
                        break;
                    }
                    try {
                        this.f7443a.f7432n.connect();
                        z = true;
                    } catch (IOException e) {
                        this.f7443a.f7432n.close();
                        if (i >= 7) {
                            throw e;
                        }
                        z = false;
                    }
                    if (z) {
                        this.f7445c = 0;
                        m10681a();
                        if (this.f7445c == 0 && C2679a.this.f7423e != null && !C2679a.this.f7423e.equals("") && C2679a.this.f7424f != null && !C2679a.this.f7424f.equals("")) {
                            m10682b();
                        }
                        if (i >= 7 || this.f7445c == R.string.robot_error_unknown_device || this.f7445c == R.string.robot_error_internal_error || this.f7445c == R.string.robot_error_wrong_reply || this.f7445c == R.string.robot_error_usupported_protocol || this.f7445c == R.string.robot_error_usupported_charset || this.f7445c == R.string.robot_error_wrong_response_on_callsign || this.f7445c == 0) {
                            break;
                        }
                    }
                    Thread.sleep(3000);
                    i++;
                } catch (Exception e2) {
                    if (C2679a.this.f7431m != 2) {
                        e2.printStackTrace();
                        this.f7443a.mo7679e(R.string.robot_connection_error);
                        this.f7443a.m10656u();
                        return;
                    }
                    return;
                }
            }
            if (C2679a.this.f7431m == 2) {
                return;
            }
            if (this.f7445c == 0) {
                synchronized (C2679a.this.f7428j) {
                    C2679a.this.f7440v.clear();
                }
                C2679a.this.m10649o();
                C2679a.this.m10659x();
                this.f7443a.mo7691r();
                int unused2 = C2679a.this.f7431m = 3;
                //ToDo; m10919c
                ru.proghouse.robocam.k.c();
                C2679a.this.m10658w();
                return;
            }
            int unused3 = C2679a.this.f7431m = 0;
            if (this.f7446d == null) {
                this.f7443a.mo7679e(this.f7445c);
            } else {
                this.f7443a.mo7668a(this.f7445c, this.f7446d);
            }
            this.f7443a.m10656u();
        }
    }

    /* renamed from: ru.proghouse.robocam.a.a.a$c */
    private class C2683c implements Runnable {
        private C2683c() {
        }

        public void run() {
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(100);
                    i += 100;
                    if (C2679a.this.f7431m != 2 && C2679a.this.f7432n != null) {
                        if (i >= 1000) {
                            if (!C2679a.this.m10657v()) {
                                C2679a.this.mo7689m();
                                return;
                            }
                            i = 0;
                        }
                    } else {
                        return;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    public C2679a() {
        this.f7426h.add(new C2684b());
        this.f7426h.add(new C2684b());
        this.f7426h.add(new C2684b());
        this.f7426h.add(new C2684b());
        m10649o();
    }

    /* renamed from: a */
    public byte[] m10629a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byte[] bArr;
        int b;
        int i2 = 0;
        OutputStream outputStream = null;
        try {
            outputStream = this.f7432n.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bArr2 = new byte[(byteArrayOutputStream.size() + 2)];
        C2696d.m10894c(bArr2, 0, byteArrayOutputStream.size());
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr2, 2, byteArrayOutputStream.size());
        synchronized (this.f7434p) {
            try {
                outputStream.write(bArr2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            InputStream inputStream = null;
            try {
                inputStream = this.f7432n.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 * 20 < i) {
                try {
                    i4 = inputStream.available();
                } catch (Throwable th) {
                    th.printStackTrace();
                    i4 = 0;
                }
                if (i4 > 0) {
                    break;
                }
                try {
                    Thread.sleep(20);
                    i3++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (i4 > 0 && (b = C2696d.m10888b(inputStream)) > 0) {
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
            } else {
                bArr = null;
            }
        }
        return bArr;
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
    private void m10632b(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2696d.m10883a((OutputStream) byteArrayOutputStream, i);
        m10629a(byteArrayOutputStream, 1000);
    }

    /* renamed from: o */
    public void m10649o() {
        for (int i = 0; i < this.f7441w.length; i++) {
            this.f7441w[i] = 0;
        }
    }

    /* renamed from: p */
    private void m10651p() {
        for (int i = 0; i < this.f7426h.size(); i++) {
            this.f7426h.get(i).mo7702a(false);
        }
    }

    /* renamed from: u */
    public void m10656u() {
        if (this.f7432n != null) {
            try {
                if (this.f7431m == 3 || this.f7431m == 2) {
                    if (Build.VERSION.SDK_INT < 14) {
                        m10632b(255);
                    } else if (this.f7432n.isConnected()) {
                        m10632b(255);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                this.f7432n.close();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        this.f7432n = null;
        this.f7431m = 0;
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
    /* renamed from: v */
    public boolean m10657v() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2696d.m10883a((OutputStream) byteArrayOutputStream, 3);
        byte[] a = m10629a(byteArrayOutputStream, 1000);
        return a != null && a.length == 1 && C2696d.m10878a(a, 0) == 0;
    }

    /* renamed from: w */
    public void m10658w() {
        new Thread(new C2683c()).start();
    }

    /* renamed from: x */
    public void m10659x() {
        new Thread(new C2681a()).start();
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public String mo7667a() {
        if (this.f7433o != null) {
            return this.f7433o.getName();
        }
        return null;
    }

    /* renamed from: a */
    public void mo7694a(int i) {
        this.f7431m = 2;
        //ToDo: m10919c
        ru.proghouse.robocam.k.c();
        if (this.f7432n != null) {
            m10656u();
        }
        if (i == 0) {
            mo7692s();
        } else {
            mo7682f(i);
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7669a(BluetoothDevice bluetoothDevice) {
        if (this.f7431m == 0 || this.f7431m == 2) {
            this.f7433o = bluetoothDevice;
            this.f7431m = 1;
            new Thread(new C2682b(this)).start();
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
    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7670a(Context context, File file, Document document) {
        if (!document.getDocumentElement().getNodeName().equals("Custom")) {
            try {
                throw new Exception(context.getString(R.string.unknown_driver_name, document.getDocumentElement().getNodeName()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f7422d = file.getName();
        this.f7429k = file.lastModified();
        this.f7421c = document.getDocumentElement().getAttribute("Name");
        this.f7423e = document.getDocumentElement().getAttribute("Callsign");
        this.f7424f = document.getDocumentElement().getAttribute("Response");
        if (C2713n.m10944a(document.getDocumentElement().getAttribute("Charset"), 0) == 1) {
            this.f7425g = "UTF-8";
        } else {
            this.f7425g = "US-ASCII";
        }
        this.f7430l = C2713n.m10946a(document.getDocumentElement().getAttribute("HideJoysticks"), true);
        mo7674a(C2713n.m10946a(document.getDocumentElement().getAttribute("ShowDebugInfo"), true));
        m10651p();
        NodeList elementsByTagName = document.getElementsByTagName("Joystick");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
            int a = C2713n.m10944a(element.getAttribute("Index"), -1);
            if (a >= 0 && a < this.f7426h.size()) {
                C2684b bVar = this.f7426h.get(a);
                bVar.mo7702a(C2713n.m10946a(element.getAttribute("Visible"), false));
                bVar.mo7701a(C2713n.m10945a(element.getAttribute("Shape"), "c"));
                bVar.mo7700a(0, C2713n.m10944a(element.getAttribute("Behavior0"), 0));
                bVar.mo7700a(1, C2713n.m10944a(element.getAttribute("Behavior1"), 0));
            }
        }
        synchronized (this.f7428j) {
            this.f7427i = false;
            this.f7428j.clear();
            NodeList elementsByTagName2 = document.getElementsByTagName("KeyGroup");
            for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                Element element2 = (Element) elementsByTagName2.item(i2);
                this.f7427i = C2713n.m10946a(element2.getAttribute("Active"), false);
                C2695c.m10871a(element2, this.f7428j, "Key");
            }
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7671a(HashSet<Integer> hashSet) {
        synchronized (this.f7436r) {
            this.f7439u = hashSet;
            this.f7437s = true;
        }
        synchronized (this.f7435q) {
            this.f7435q.notifyAll();
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: a */
    public void mo7672a(Hashtable<String, Integer> hashtable) {
        synchronized (this.f7436r) {
            Enumeration<String> keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                String nextElement = keys.nextElement();
                this.f7438t.put(nextElement, hashtable.get(nextElement));
            }
        }
        synchronized (this.f7435q) {
            this.f7435q.notifyAll();
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: b */
    public String mo7676b() {
        String str = "";
        Iterator<C2684b> it = this.f7426h.iterator();
        while (it.hasNext()) {
            str = str + it.next().mo7704e();
        }
        return str;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: c */
    public String mo7677c() {
        String str = "";
        Iterator<C2684b> it = this.f7426h.iterator();
        while (it.hasNext()) {
            str = str + it.next().mo7703d();
        }
        return str;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: d */
    public String mo7678d() {
        HashSet hashSet = new HashSet();
        if (this.f7427i) {
            synchronized (this.f7428j) {
                hashSet.addAll(this.f7428j);
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
        return this.f7430l;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: f */
    public String mo7681f() {
        return "Custom";
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: g */
    public String mo7683g() {
        return this.f7422d;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: h */
    public String mo7684h() {
        return this.f7421c;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: i */
    public boolean mo7685i() {
        return this.f7431m == 0;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: j */
    public boolean mo7686j() {
        return this.f7431m == 3;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: k */
    public long mo7687k() {
        return this.f7429k;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: l */
    public boolean mo7688l() {
        return true;
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: m */
    public void mo7689m() {
        mo7694a(0);
    }

    @Override // ru.proghouse.robocam.p063a.C2677a
    /* renamed from: n */
    public void mo7690n() {
        if (this.f7432n != null) {
            try {
                if (this.f7431m == 3 || this.f7431m == 2) {
                    m10632b(255);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
