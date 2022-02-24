package ru.proghouse.robocam;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ru.proghouse.robocam.p063a.C2677a;
import ru.proghouse.robocam.p063a.p065b.C2687c;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.MainActivity */
public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback, C2677a.C2678a, k.a {

    /* renamed from: A */
    private static boolean f7229A = true;
    /* renamed from: N */
    public static volatile int f7230N = 0;

    /* renamed from: O */
    private static volatile String f7231O = null;
    /* renamed from: U */
    public static volatile boolean f7232U = false;

    /* renamed from: n */
    public static double f7233n = 0.0d;

    /* renamed from: o */
    private static int f7234o = 10;

    /* renamed from: p */
    private static int f7235p = 11;

    /* renamed from: q */
    private static int f7236q = 12;

    /* renamed from: r */
    private static int f7237r = 13;

    /* renamed from: s */
    private static int f7238s = 14;
    /* renamed from: z */
    public static volatile MainActivity f7239z = null;

    /* renamed from: B */
    private TextView f7240B = null;

    /* renamed from: C */
    private ImageView f7241C = null;

    /* renamed from: D */
    private TextView f7242D = null;

    /* renamed from: E */
    private ImageView f7243E = null;

    /* renamed from: F */
    private Animation f7244F = null;

    /* renamed from: G */
    private Animation f7245G = null;

    /* renamed from: H */
    private ImageButton f7246H = null;

    /* renamed from: I */
    private ImageButton f7247I = null;

    /* renamed from: J */
    private ImageButton f7248J = null;

    /* renamed from: K */
    private BroadcastReceiver f7249K = null;

    /* renamed from: L */
    private BroadcastReceiver f7250L = null;
    /* renamed from: M */
    public ListView f7251M = null;

    /* renamed from: P */
    private volatile C2658c f7252P = null;
    /* renamed from: Q */
    public volatile C2657b f7253Q = null;

    /* renamed from: R */
    private TextView f7254R = null;

    /* renamed from: S */
    private volatile String f7255S = null;

    /* renamed from: T */
    private ImageView f7256T = null;
    /* renamed from: V */
    public WebView f7257V = null;
    /* renamed from: W */
    public String f7258W = null;
    /* renamed from: X */
    public String f7259X = "";
    /* renamed from: Y */
    public boolean f7260Y = false;
    /* renamed from: Z */
    public AdView f7261Z = null;
    /* renamed from: aa */
    public volatile boolean f7262aa = false;

    /* renamed from: ab */
    private Thread f7263ab = null;
    /* renamed from: ac */
    public volatile boolean f7264ac = false;
    /* renamed from: ad */
    public volatile int f7265ad = 0;
    /* renamed from: ae */
    public volatile int f7266ae = 0;
    /* renamed from: af */
    public volatile int f7267af = 0;

    /* renamed from: ag */
    private boolean f7268ag = false;

    /* renamed from: ah */
    private SharedPreferences.Editor f7269ah = null;
    /* renamed from: ai */
    public String f7270ai = null;
    /* renamed from: t */
    public /*C2671a*/a f7271t = /*C2671a*/a./*m10540a*/a();

    /* renamed from: u */
    private SurfaceView f7272u = null;
    /* renamed from: v */
    public View f7273v = null;

    /* renamed from: w */
    private TextureView.SurfaceTextureListener f7274w = null;
    /* renamed from: x */
    public RelativeLayout f7275x = null;
    /* renamed from: y */
    public MainActivity f7276y = null;

    @Override
    public void l() {
        m10440G();
    }

    /* renamed from: ru.proghouse.robocam.MainActivity$a */
    class C2655a implements Runnable {

        /* renamed from: a */
        List<Locale> f7289a;

        C2655a(List<Locale> list) {
            this.f7289a = list;
        }

        public void run() {
            Document parse;
            boolean z;
            String attribute;
            boolean z2 = true;
            if (!MainActivity.f7232U) {
                try {
                    MainActivity.f7232U = true;
                    File b = /*ToDo: C2714o.m10956b*/ o.b(MainActivity.this.f7276y);
                    File file = new File(b, "nv.xml");
                    MainActivity.this.m10446a("http://www.proghouse.ru/robocam/v.xml", file);
                    DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                    Document parse2 = newDocumentBuilder.parse(file);
                    File file2 = new File(b, "v.xml");
                    Element[] elementArr = {null};
                    String[] strArr = {null};
                    String[] strArr2 = {null};
                    if (!file2.exists()) {
                        parse = null;
                        z = true;
                    } else {
                        parse = newDocumentBuilder.parse(file2);
                        z = !parse2.getDocumentElement().getAttribute("number").equals(parse.getDocumentElement().getAttribute("number"));
                    }
                    if (z || !MainActivity.a(parse, this.f7289a, elementArr, strArr, strArr2)) {
                        z2 = z;
                    } else if (new File(b, "v" + strArr[0] + "-" + strArr2[0] + ".xml").exists()) {
                        z2 = false;
                    }
                    if (z2) {
                        File file3 = new File(b, parse2.getDocumentElement().getAttribute("number"));
                        file3.mkdirs();
                        if (MainActivity.a(parse2, this.f7289a, elementArr, strArr, strArr2)) {
                            String attribute2 = elementArr[0].getAttribute("path");
                            NodeList childNodes = elementArr[0].getChildNodes();
                            for (int i = 0; i < childNodes.getLength(); i++) {
                                if (childNodes.item(i).getNodeName().equals("file") && (attribute = ((Element) childNodes.item(i)).getAttribute("path")) != null && !attribute.isEmpty()) {
                                    File file4 = new File(file3, attribute);
                                    file4.getParentFile().mkdirs();
                                    MainActivity.this.m10446a("http://www.proghouse.ru/robocam/" + (attribute2 != null ? attribute2 : "") + attribute, file4);
                                }
                            }
                        }
                        //ToDo: m10350c method name
                        if (HttpServer.c() == 0) {
                            File[] listFiles = b.listFiles();
                            for (File file5 : listFiles) {
                                if (file5.isFile() && !file5.getName().equals(file.getName())) {
                                    file5.delete();
                                } else if (file5.isDirectory() && !file5.getName().equals(file3.getName())) {
                                    /*ToDo: C2714o.m10951a*/ o.a(file5);
                                }
                            }
                        }
                        File file6 = new File(b, "v" + strArr[0] + "-" + strArr2[0] + ".xml");
                        file6.delete();
                        file2.delete();
                        /*ToDo: C2714o.m10952a*/ o.a(file, file6);
                        file.renameTo(file2);
                    }
                } catch (Throwable th) {
                    th.getMessage();
                    th.printStackTrace();
                }
                MainActivity.f7232U = false;
            }
            try {
                if (MainActivity.f7239z != null) {
                    for (int i2 = 0; i2 < 7 && !MainActivity.f7239z.f7262aa; i2++) {
                        MainActivity.f7239z.f7275x.post(new Runnable() {
                            /* class ru.proghouse.robocam.MainActivity.C2655a.C26561 */

                            public void run() {
                                MainActivity.f7239z.m10488u();
                            }
                        });
                        Thread.sleep(1000);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ru.proghouse.robocam.MainActivity$b */
    public class C2657b implements Runnable {

        /* renamed from: a */
        public volatile MainActivity f7292a = null;

        public C2657b(MainActivity mainActivity) {
            this.f7292a = mainActivity;
        }

        public void run() {
            try {
                Thread.sleep(1000);
                if (this.f7292a != null) {
                    this.f7292a.m10440G();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: ru.proghouse.robocam.MainActivity$c */
    class C2658c implements Runnable {

        /* renamed from: a */
        public volatile MainActivity f7294a = null;

        public C2658c(MainActivity mainActivity) {
            this.f7294a = mainActivity;
        }

        public void run() {
            try {
                Thread.sleep(10000);
                if (this.f7294a != null && MainActivity.f7230N == 1) {
                    int unused = MainActivity.f7230N = 0;
                    this.f7294a.m10440G();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: A */
    private void m10434A() {
        this.f7242D.setVisibility(0);
        this.f7243E.setVisibility(0);
        this.f7251M.setVisibility(4);
    }

    /* renamed from: B */
    private void m10435B() {
        this.f7242D.setVisibility(4);
        this.f7243E.setVisibility(4);
        this.f7251M.setVisibility(4);
    }

    /* renamed from: C */
    public void m10436C() {
        this.f7275x.post(new Runnable() {
            /* class ru.proghouse.robocam.MainActivity.C264410 */

            public void run() {
                MainActivity.this.m10438E();
            }
        });
    }

    /* renamed from: D */
    private void m10437D() {
        float f;
        float f2;
        f7271t = /*C2671a*/a./*m10540a*/a();
        /*C2706h*/ru.proghouse.robocam.h c = this.f7271t./*mo7645c*/c();
        if (c != null) {
            ViewGroup.LayoutParams layoutParams = Build.VERSION.SDK_INT >= 23 ? this.f7273v.getLayoutParams() : this.f7272u.getLayoutParams();
            if (getResources().getConfiguration().orientation != 2) {
                f = (float) c./*f7568b*/b;
                f2 = (float) c./*f7567a*/a;
            } else {
                f = (float) c./*f7567a*/a;
                f2 = (float) c./*f7568b*/b;
            }
            float width = ((float) this.f7275x.getWidth()) / f;
            float height = ((float) this.f7275x.getHeight()) / f2;
            if (width < height) {
                layoutParams.width = this.f7275x.getWidth();
                layoutParams.height = (int) (f2 * width);
            } else {
                layoutParams.width = (int) (f * height);
                layoutParams.height = this.f7275x.getHeight();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.f7273v.setLayoutParams(layoutParams);
            } else {
                this.f7272u.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: E */
    public void m10438E() {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT < 23) {
                this.f7271t./*mo7656n*/n();
            }
            if (f7229A) {
                z = this.f7271t./*mo7641a*/a((Activity) this.f7276y);
            }
            boolean o = this.f7271t./*mo7657o*/o();
            m10437D();
            if (Build.VERSION.SDK_INT < 23) {
                this.f7271t./*mo7655m*/m();
            }
            if (z || o) {
                //ToDo: m10342a
                HttpServer.a("<msg><name>updatePictureSize</name><prw>" + this.f7271t./*mo7648f*/f() + "</prw>" + "<prh>" + this.f7271t./*mo7649g*/g() + "</prh>" + "</msg>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* WARNING: Removed duplicated region for block: B:61:0x0152 A[LOOP:2: B:22:0x0079->B:61:0x0152, LOOP_END] */
    /* WARNING: Removed duplicated region for block: B:64:0x015c A[LOOP:4: B:42:0x00d6->B:64:0x015c, LOOP_END] */
    /* WARNING: Removed duplicated region for block: B:83:0x00b5 A[EDGE_INSN: B:83:0x00b5->B:35:0x00b5 ?: BREAK  , SYNTHETIC] */
    /* WARNING: Removed duplicated region for block: B:90:0x0112 A[EDGE_INSN: B:90:0x0112->B:56:0x0112 ?: BREAK  , SYNTHETIC] */
    /* renamed from: F */
    private String m10439F() {
        String str;
        String str2;
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        try {
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("getWifiApState", new Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(wifiManager, null)).intValue();
            if (intValue < 10) {
                intValue += 10;
            }
            if (intValue == f7237r) {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                String str3 = null;
                while (true) {
                    if (!networkInterfaces.hasMoreElements()) {
                        str = str3;
                        break;
                    }
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (true) {
                        if (!inetAddresses.hasMoreElements()) {
                            str = str3;
                            break;
                        }
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && nextElement.getAddress().length == 4) {
                            str = nextElement.getHostAddress();
                            if ("192.168.43.1".equals(str)) {
                                break;
                            }
                        }
                    }
                    if (str != null) {
                        break;
                    }
                    str3 = str;
                }
                if (str == null) {
                    Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
                    while (true) {
                        if (!networkInterfaces2.hasMoreElements()) {
                            str = str;
                            break;
                        }
                        NetworkInterface nextElement2 = networkInterfaces2.nextElement();
                        if (nextElement2.getName().contains("ap")) {
                            Enumeration<InetAddress> inetAddresses2 = nextElement2.getInetAddresses();
                            while (true) {
                                if (!inetAddresses2.hasMoreElements()) {
                                    break;
                                }
                                InetAddress nextElement3 = inetAddresses2.nextElement();
                                if (!nextElement3.isLoopbackAddress() && nextElement3.getAddress().length == 4) {
                                    str2 = nextElement3.getHostAddress();
                                    break;
                                }
                            }
                            if (str == null) {
                                break;
                            }
                        }
                        str2 = str;
                        if (str == null) {
                        }
                    }
                }
                if (str == null) {
                    str = m10468i(wifiManager.getDhcpInfo().ipAddress);
                }
            } else {
                str = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        String i = str == null ? m10468i(wifiManager.getConnectionInfo().getIpAddress()) : str;
        if (i == null) {
            try {
                Enumeration<NetworkInterface> networkInterfaces3 = NetworkInterface.getNetworkInterfaces();
                while (true) {
                    if (!networkInterfaces3.hasMoreElements()) {
                        i = i;
                        break;
                    }
                    NetworkInterface nextElement4 = networkInterfaces3.nextElement();
                    if (nextElement4.getName().contains("wlan")) {
                        Enumeration<InetAddress> inetAddresses3 = nextElement4.getInetAddresses();
                        while (true) {
                            if (!inetAddresses3.hasMoreElements()) {
                                break;
                            }
                            InetAddress nextElement5 = inetAddresses3.nextElement();
                            if (!nextElement5.isLoopbackAddress() && nextElement5.getAddress().length == 4) {
                                i = nextElement5.getHostAddress();
                                break;
                            }
                        }
                        if (i == null) {
                            break;
                        }
                    }
                    i = i;
                    if (i == null) {
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                i = null;
            }
        }
        if (i == null) {
            return i;
        }
        String str4 = "http://" + i;
        //ToDo: m10345b
        return HttpServer.b() != 80 ? str4 + ":" + Integer.toString(HttpServer.b()) : str4;
    }

    /* renamed from: G */
    public void m10440G() {
        try {
            this.f7275x.post(new Runnable() {
                /* class ru.proghouse.robocam.MainActivity.C264511 */

                public void run() {
                    try {
                        MainActivity.this.f7276y.mo7573m();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static List<Locale> a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                arrayList.add(locales.get(i));
            }
        } else {
            arrayList.add(context.getResources().getConfiguration().locale);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m10445a(String str) {
        this.f7240B.setText(str);
        this.f7240B.setTextColor(-16777216);
        m10494y();
    }

    /* renamed from: a */
    public void m10446a(String str, File file) {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new URL(str).openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bArr = new byte[1024];
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            int read = 0;
            try {
                read = dataInputStream.read(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (read > 0) {
                try {
                    fileOutputStream.write(bArr, 0, read);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean a(Document document, List<Locale> list, Element[] elementArr, String[] strArr, String[] strArr2) {
        elementArr[0] = null;
        strArr2[0] = "";
        strArr[0] = "";
        NodeList childNodes = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (childNodes.item(i).getNodeName().equals("condition")) {
                String attribute = ((Element) childNodes.item(i)).getAttribute("language");
                String attribute2 = ((Element) childNodes.item(i)).getAttribute("country");
                if (attribute == null) {
                    attribute = "";
                }
                if (attribute2 == null) {
                    attribute2 = "";
                }
                String[] split = attribute.split(",");
                String[] split2 = attribute2.split(",");
                for (Locale locale : list) {
                    if (locale.getCountry() != null && !locale.getCountry().isEmpty()) {
                        int length = split2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            String str = split2[i2];
                            if (str.equals(locale.getCountry())) {
                                elementArr[0] = (Element) childNodes.item(i);
                                strArr[0] = str;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (elementArr[0] != null) {
                        break;
                    }
                    if (locale.getLanguage() != null && !locale.getLanguage().isEmpty()) {
                        int length2 = split.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                break;
                            }
                            String str2 = split[i3];
                            if (str2.equals(locale.getLanguage())) {
                                elementArr[0] = (Element) childNodes.item(i);
                                strArr2[0] = str2;
                                break;
                            }
                            i3++;
                        }
                    }
                    if (elementArr[0] != null) {
                        break;
                    }
                }
            }
            if (elementArr[0] != null) {
                break;
            }
        }
        return elementArr[0] != null;
    }

    /* renamed from: b */
    private void m10452b(String str) {
        this.f7242D.setText(str);
        this.f7242D.setTextColor(-16777216);
        m10434A();
    }

    /* renamed from: c */
    private void m10456c(String str) {
        this.f7242D.setText(str);
        this.f7242D.setTextColor(-65536);
        m10434A();
    }

    /* renamed from: f */
    private void m10462f(int i) {
        this.f7240B.setText(i);
        this.f7240B.setTextColor(-16777216);
        m10494y();
    }

    /* renamed from: g */
    private void m10464g(int i) {
        getString(i);
        this.f7242D.setText(i);
        this.f7242D.setTextColor(-16777216);
        m10434A();
    }

    /* renamed from: h */
    private void m10466h(int i) {
        this.f7242D.setText(i);
        this.f7242D.setTextColor(-65536);
        m10434A();
    }

    /* renamed from: i */
    private String m10468i(int i) {
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            i = Integer.reverseBytes(i);
        }
        try {
            return InetAddress.getByAddress(BigInteger.valueOf((long) i).toByteArray()).getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: q */
    public SharedPreferences.Editor m10479q() {
        if (this.f7269ah == null) {
            this.f7269ah = getSharedPreferences("RoboCamSettings", 0).edit();
        }
        return this.f7269ah;
    }

    /* renamed from: r */
    public void m10482r() {
        if (this.f7269ah == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            this.f7269ah.apply();
        } else {
            this.f7269ah.commit();
        }
    }

    /* renamed from: s */
    private void m10483s() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f7274w = new TextureView.SurfaceTextureListener() {
                /* class ru.proghouse.robocam.MainActivity.C26495 */

                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    if (MainActivity.this.f7271t./*mo7644b*/ b()) {
                        MainActivity.this.f7271t./*mo7635a*/a(MainActivity.this.f7276y, surfaceTexture);
                    } else {
                        MainActivity.this.f7271t./*mo7642b*/b(MainActivity.this.f7276y, surfaceTexture);
                    }
                    int unused = MainActivity.this.f7266ae = i;
                    int unused2 = MainActivity.this.f7267af = i2;
                    MainActivity.this.f7275x.post(new Runnable() {
                        /* class ru.proghouse.robocam.MainActivity.C26495.C26501 */

                        public void run() {
                            MainActivity.this.f7271t./*mo7637a*/ a(MainActivity.this.f7276y, MainActivity.this.f7273v, MainActivity.this.f7266ae, MainActivity.this.f7267af);
                            MainActivity.this.m10438E();
                        }
                    });
                }

                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    MainActivity.this.f7271t./*mo7639a*/a(surfaceTexture);
                    return true;
                }

                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    MainActivity.this.f7271t./*mo7637a*/ a(MainActivity.this.f7276y, MainActivity.this.f7273v, i, i2);
                    MainActivity.this.m10438E();
                }

                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }
            };
            ((TextureView) this.f7273v).setSurfaceTextureListener(this.f7274w);
        }
    }

    /* renamed from: t */
    private void m10486t() {
        try {
            new Thread(new C2655a(a((Context) this))).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* WARNING: Removed duplicated region for block: B:50:0x01a2 A[SYNTHETIC, Splitter:B:50:0x01a2] */
    /* WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    public void m10488u() {
        boolean z;
        float f;
        String str;
        float f2;
        //ToDo: initialized...

        Element element = null;
        boolean z2 = true;
        if (!this.f7262aa) {
            this.f7262aa = true;
            try {
                File b = /*ToDo: C2714o.m10956b*/ o.b(this);
                File file = new File(b, "v.xml");
                if (file.exists()) {
                    Element[] elementArr = {null};
                    String[] strArr = {null};
                    String[] strArr2 = {null};
                    Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                    if (a(parse, a((Context) this), elementArr, strArr, strArr2)) {
                        File file2 = new File(b, parse.getDocumentElement().getAttribute("number"));
                        int i = 0;
                        while (true) {
                            if (i >= elementArr[0].getChildNodes().getLength()) {
                                f = 0.0f;
                                str = null;
                                f2 = 0.0f;
                                break;
                            }
                            if (elementArr[0].getChildNodes().item(i).getNodeName().equals("device")) {
                                element = (Element) elementArr[0].getChildNodes().item(i);
                                if ((element.getAttribute("target") == null || element.getAttribute("target").isEmpty() || element.getAttribute("target").equals("server")) && ((element.getAttribute("screenMin") == null || element.getAttribute("screenMin").isEmpty() || f7233n >= Double.parseDouble(element.getAttribute("screenMin"))) && (element.getAttribute("sdkMin") == null || element.getAttribute("sdkMin").isEmpty() || Build.VERSION.SDK_INT >= Integer.parseInt(element.getAttribute("sdkMin"))))) {
                                    String attribute = element.getAttribute("path");
                                    this.f7258W = element.getAttribute("url");
                                    float parseFloat = Float.parseFloat(element.getAttribute("width"));
                                    float parseFloat2 = Float.parseFloat(element.getAttribute("height"));
                                    float applyDimension = TypedValue.applyDimension(1, parseFloat, getResources().getDisplayMetrics());
                                    float applyDimension2 = TypedValue.applyDimension(1, parseFloat2, getResources().getDisplayMetrics());
                                    this.f7259X = element.getAttribute("type");
                                    f = applyDimension2;
                                    f2 = applyDimension;
                                    str = attribute;
                                }
                            }
                            i++;
                        }
                        String attribute2 = element.getAttribute("path");
                        this.f7258W = element.getAttribute("url");
                        float parseFloat3 = Float.parseFloat(element.getAttribute("width"));
                        float parseFloat22 = Float.parseFloat(element.getAttribute("height"));
                        float applyDimension3 = TypedValue.applyDimension(1, parseFloat3, getResources().getDisplayMetrics());
                        float applyDimension22 = TypedValue.applyDimension(1, parseFloat22, getResources().getDisplayMetrics());
                        this.f7259X = element.getAttribute("type");
                        f = applyDimension22;
                        f2 = applyDimension3;
                        str = attribute2;
                        if (str != null && f2 > 0.0f && f > 0.0f && (this.f7259X.equals("replace") || (this.f7259X.equals("offline") && this.f7260Y))) {
                            File file3 = new File(file2, str);
                            if (file3.exists()) {
                                String uri = file3.toURI().toString();
                                this.f7257V.getSettings().setJavaScriptEnabled(true);
                                this.f7257V.loadUrl(uri);
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(f2), Math.round(f));
                                layoutParams.addRule(14);
                                this.f7257V.setLayoutParams(layoutParams);
                                try {
                                    this.f7257V.setVisibility(0);
                                    this.f7261Z.setVisibility(8);
                                    z = false;
                                } catch (Exception e) {
                                    e = e;
                                    z2 = false;
                                    e.printStackTrace();
                                    z = z2;
                                    if (!z) {
                                    }
                                }
                                if (!z) {
                                    try {
                                        this.f7257V.setVisibility(8);
                                        this.f7261Z.setVisibility(0);
                                        AdRequest a = new AdRequest.Builder().build();
                                        this.f7261Z.setAdListener(new AdListener() {
                                            /* class ru.proghouse.robocam.MainActivity.C26516 */

                                            @Override // com.google.android.gms.ads.AdListener
                                            /* renamed from: a */
                                            public void onAdLoaded() {
                                                try {
                                                    MainActivity.this.f7257V.setVisibility(8);
                                                    MainActivity.this.f7261Z.setVisibility(0);
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }

                                            /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
                                             method: ru.proghouse.robocam.MainActivity.a(ru.proghouse.robocam.MainActivity, boolean):boolean
                                             arg types: [ru.proghouse.robocam.MainActivity, int]
                                             candidates:
                                              ru.proghouse.robocam.MainActivity.a(ru.proghouse.robocam.MainActivity, int):int
                                              ru.proghouse.robocam.MainActivity.a(ru.proghouse.robocam.MainActivity, java.lang.String):java.lang.String
                                              ru.proghouse.robocam.MainActivity.a(java.lang.String, java.io.File):void
                                              ru.proghouse.robocam.MainActivity.a(int, java.lang.Object[]):void
                                              android.support.v4.a.n.a(android.view.View, android.view.Menu):boolean
                                              ru.proghouse.robocam.a.a.a.a(int, java.lang.Object[]):void
                                              ru.proghouse.robocam.MainActivity.a(ru.proghouse.robocam.MainActivity, boolean):boolean */
                                            /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
                                             method: ru.proghouse.robocam.MainActivity.b(ru.proghouse.robocam.MainActivity, boolean):boolean
                                             arg types: [ru.proghouse.robocam.MainActivity, int]
                                             candidates:
                                              ru.proghouse.robocam.MainActivity.b(ru.proghouse.robocam.MainActivity, int):int
                                              ru.proghouse.robocam.MainActivity.b(ru.proghouse.robocam.MainActivity, boolean):boolean */
                                            @Override // com.google.android.gms.ads.AdListener
                                            /* renamed from: a */
                                            public void onAdFailedToLoad(int i) {
                                                try {
                                                    if (MainActivity.this.f7259X.equals("offline")) {
                                                        MainActivity.this.f7260Y = true;
                                                        MainActivity.this.f7262aa = false;
                                                        MainActivity.this.m10488u();
                                                    }
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }

                                            @Override // com.google.android.gms.ads.AdListener
                                            /* renamed from: b */
                                            public void onAdLeftApplication() {
                                                try {
                                                    MainActivity.this.f7257V.setVisibility(8);
                                                    MainActivity.this.f7261Z.setVisibility(0);
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }
                                        });
                                        this.f7261Z.loadAd(a);
                                        return;
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    z = z2;
                    if (!z) {
                    }
                }
            } catch (Exception e2) {
               // e = e2;
                e2.printStackTrace();
                z = z2;
                if (!z) {
                }
            }
        }
    }

    /* renamed from: v */
    private void m10490v() {
        this.f7249K = new BroadcastReceiver() {
            /* class ru.proghouse.robocam.MainActivity.C26527 */

            public void onReceive(Context context, Intent intent) {
                MainActivity.this.m10491w();
            }
        };
        registerReceiver(this.f7249K, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.f7250L = new BroadcastReceiver() {
            /* class ru.proghouse.robocam.MainActivity.C26538 */

            public void onReceive(Context context, Intent intent) {
                new Thread(MainActivity.this.f7253Q).start();
            }
        };
        registerReceiver(this.f7250L, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
    }

    /* renamed from: w */
    public void m10491w() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (f7230N == 1) {
            if (defaultAdapter.getState() == 10) {
                f7230N = 0;
                mo7573m();
            } else if (defaultAdapter.getState() == 12) {
                f7230N = 2;
                mo7573m();
            }
        } else if ((f7230N == 5 || f7230N == 4) && defaultAdapter.getState() == 10) {
            C2677a.m10590q().mo7689m();
            f7230N = 0;
            mo7573m();
        }
    }

    /* renamed from: x */
    private void m10493x() {
        this.f7251M.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class ru.proghouse.robocam.MainActivity.C26549 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                BluetoothAdapter.getDefaultAdapter();
                if (MainActivity.f7230N == 2) {
                    C2677a q = C2677a.m10590q();
                    int unused = MainActivity.f7230N = 4;
                    String unused2 = MainActivity.this.f7270ai = ((BluetoothDevice) MainActivity.this.f7251M.getAdapter().getItem(i)).getName();
                    MainActivity.this.m10479q().putString("last_bluetooth_device", MainActivity.this.f7270ai);
                    MainActivity.this.m10482r();
                    q.mo7669a((BluetoothDevice) MainActivity.this.f7251M.getAdapter().getItem(i));
                    MainActivity.this.mo7573m();
                }
            }
        });
    }

    /* renamed from: y */
    private void m10494y() {
        this.f7240B.setVisibility(0);
        this.f7241C.setVisibility(0);
    }

    /* renamed from: z */
    private void m10495z() {
        this.f7240B.setVisibility(4);
        this.f7241C.setVisibility(4);
    }

    @Override // ru.proghouse.robocam.p063a.C2677a.C2678a
    /* renamed from: a */
    public void mo7567a(int i, Object... objArr) {
        if (f7230N == 4) {
            f7230N = 6;
            f7231O = getString(i, objArr);
            m10440G();
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a.C2678a
    /* renamed from: c */
    public void mo7568c(int i) {
        if (f7230N == 4) {
            f7230N = 6;
            f7231O = getString(i);
            m10440G();
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a.C2678a
    /* renamed from: d */
    public void mo7569d(int i) {
        f7230N = 6;
        f7231O = getString(i);
        m10440G();
    }

    @Override // ru.proghouse.robocam.p063a.C2677a.C2678a
    /* renamed from: j */
    public void mo7570j() {
        if (f7230N == 4) {
            f7230N = 5;
            m10440G();
        }
    }

    @Override // ru.proghouse.robocam.p063a.C2677a.C2678a
    /* renamed from: k */
    public void mo7571k() {
        f7230N = 0;
        f7231O = null;
        m10440G();
    }

    //ToDo: implemented...
    /*@Override // ru.proghouse.robocam.k.a
    *//* renamed from: l *//*
    public void mo7572l() {
        m10440G();
    }*/

    /* renamed from: m */
    public void mo7573m() {
        try {
            if (!this.f7268ag) {
                switch (HttpServer.c()) {
                    case 0:
                        m10462f(R.string.server_is_off);
                        this.f7246H.clearAnimation();
                        this.f7246H.setBackgroundResource(R.drawable.start_server_bg);
                        break;
                    case 1:
                        String F = m10439F();
                        if (F == null && ((WifiManager) getApplicationContext().getSystemService("wifi")).getWifiState() == 3) {
                            new Thread(this.f7253Q).start();
                        }
                        m10445a(getString(R.string.server_is_working) + (F == null ? "" : ":\r\n" + F));
                        this.f7246H.clearAnimation();
                        this.f7246H.setBackgroundResource(R.drawable.server_started_bg);
                        break;
                    case 2:
                        m10462f(R.string.server_is_initializing);
                        break;
                    case 3:
                        m10462f(R.string.server_is_stopping);
                        break;
                }
            } else {
                m10462f(R.string.go_to_the_controllers);
            }
            C2677a q = C2677a.m10590q();
            if (q.mo7685i() && f7230N == 5) {
                f7230N = 0;
            }
            switch (f7230N) {
                case 0:
                    this.f7247I.clearAnimation();
                    this.f7247I.setBackgroundResource(R.drawable.connect_robot);
                    m10452b(getString(q.mo7675a_(0)) + ("".equals(q.mo7684h()) ? "" : ":\r\n" + q.mo7684h()));
                    return;
                case 1:
                    this.f7247I.startAnimation(this.f7245G);
                    m10464g(q.mo7675a_(1));
                    return;
                case 2:
                    this.f7247I.startAnimation(this.f7245G);
                    m10435B();
                    ArrayList arrayList = new ArrayList(BluetoothAdapter.getDefaultAdapter().getBondedDevices());
                    if (arrayList.size() > 0) {
                        Collections.sort(arrayList, new Comparator<BluetoothDevice>() {
                            /* class ru.proghouse.robocam.MainActivity.C26462 */

                            /* renamed from: a */
                            public int compare(BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2) {
                                if (bluetoothDevice.getName().equals(MainActivity.this.f7270ai) && bluetoothDevice2.getName().equals(MainActivity.this.f7270ai)) {
                                    return 0;
                                }
                                if (bluetoothDevice.getName().equals(MainActivity.this.f7270ai)) {
                                    return -1;
                                }
                                if (bluetoothDevice2.getName().equals(MainActivity.this.f7270ai)) {
                                    return 1;
                                }
                                return bluetoothDevice.getName().compareTo(bluetoothDevice2.getName());
                            }
                        });
                        this.f7251M.setAdapter((ListAdapter) new ArrayAdapter<BluetoothDevice>(this, 17367043, arrayList) {
                            /* class ru.proghouse.robocam.MainActivity.C26473 */

                            public View getView(int i, View view, ViewGroup viewGroup) {
                                View view2 = super.getView(i, view, viewGroup);
                                ((TextView) view2.findViewById(16908308)).setText(((BluetoothDevice) getItem(i)).getName());
                                return view2;
                            }
                        });
                        this.f7243E.setVisibility(0);
                        this.f7251M.setVisibility(0);
                        return;
                    }
                    f7230N = 3;
                    mo7573m();
                    return;
                case 3:
                    this.f7247I.clearAnimation();
                    m10466h(q.mo7675a_(2));
                    return;
                case 4:
                    this.f7247I.startAnimation(this.f7245G);
                    m10452b(String.format(getString(q.mo7675a_(4)), q.mo7667a()) + ("".equals(q.mo7684h()) ? "" : ":\r\n" + q.mo7684h()));
                    return;
                case 5:
                    this.f7247I.clearAnimation();
                    this.f7247I.setBackgroundResource(R.drawable.robot_connected_bg);
                    m10452b(String.format(getString(q.mo7675a_(3)), q.mo7667a()) + ("".equals(q.mo7684h()) ? "" : ":\r\n" + q.mo7684h()));
                    return;
                case 6:
                    this.f7247I.clearAnimation();
                    this.f7247I.setBackgroundResource(R.drawable.connect_robot);
                    m10456c(f7231O);
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.support.v4.app.C0106n
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m10436C();
    }

    public void onConnectToRobot(View view) {
        try {
            if (f7230N == 0 || f7230N == 3 || f7230N == 6) {
                if (!C2677a.m10590q().mo7688l()) {
                    return;
                }
                if (BluetoothAdapter.getDefaultAdapter() == null) {
                    m10456c(getString(R.string.bluetooth_is_not_supported));
                } else if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                    f7231O = null;
                    f7230N = 1;
                    mo7573m();
                    startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
                    this.f7252P = new C2658c(this);
                    new Thread(this.f7252P).start();
                } else {
                    f7231O = null;
                    f7230N = 2;
                    mo7573m();
                }
            } else if (f7230N == 2) {
                f7230N = 0;
                mo7573m();
            } else if (f7230N == 4 || f7230N == 5) {
                f7230N = 0;
                C2677a.m10590q().mo7689m();
                mo7573m();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* WARNING: Removed duplicated region for block: B:47:0x0294  */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        //ToDo: initialized...
        int i = 0;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_main);
            //ToDo: getSupportActionBar().show();
            getSupportActionBar().hide();
            f7239z = this;
            this.f7276y = this;
            SharedPreferences sharedPreferences = getSharedPreferences("RoboCamSettings", 0);
            if (bundle != null) {
                this.f7270ai = bundle.getString("last_bluetooth_device");
            } else {
                this.f7270ai = sharedPreferences.getString("last_bluetooth_device", null);
            }
            this.f7268ag = sharedPreferences.getBoolean("use_local_controls", false);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;

            if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT < 17) {
                try {
                    i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    i3 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    Point point = new Point();
                    Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                    i2 = point.x;
                    i = point.y;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                f7233n = Math.min(((double) i2) / ((double) displayMetrics.density), ((double) i) / ((double) displayMetrics.density));
                this.f7257V = (WebView) findViewById(R.id.banner);
                this.f7257V.setOnTouchListener(new View.OnTouchListener() {
                    /* class ru.proghouse.robocam.MainActivity.C26431 */

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        switch (motionEvent.getAction()) {
                            case 1:
                                if (MainActivity.this.f7258W == null || MainActivity.this.f7258W.isEmpty()) {
                                    return false;
                                }
                                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(MainActivity.this.f7258W)));
                                return false;
                            default:
                                return false;
                        }
                    }
                });

                MobileAds.initialize(getApplicationContext(), "ca-app-pub-7800876624909705~9648407673");
                this.f7261Z = (AdView) findViewById(R.id.adView);
                this.f7275x = (RelativeLayout) findViewById(R.id.parentLayout);
                this.f7272u = (SurfaceView) findViewById(R.id.surfaceView);
                //ToDo: Preview...
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f7273v = new TextureView(this);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(14);
                    layoutParams.addRule(15);
                    this.f7275x.addView(this.f7273v, 0, layoutParams);
                    this.f7272u.setVisibility(8);
                    m10483s();
                    this.f7273v.setVisibility(this.f7268ag ? 8 : 0);
                } else {
                    this.f7272u.getHolder().addCallback(this);
                    this.f7272u.getHolder().setType(3);
                    m10437D();
                    this.f7272u.setVisibility(this.f7268ag ? 8 : 0);
                }
                this.f7265ad = getWindowManager().getDefaultDisplay().getRotation();
                this.f7263ab = new Thread(new Runnable() {
                    /* class ru.proghouse.robocam.MainActivity.C26484 */

                    public void run() {
                        while (!MainActivity.this.f7276y.f7264ac) {
                            try {
                                Thread.sleep(1000);
                                if (MainActivity.this.f7265ad != MainActivity.this.getWindowManager().getDefaultDisplay().getRotation()) {
                                    MainActivity.this.m10436C();
                                    int unused = MainActivity.this.f7265ad = MainActivity.this.getWindowManager().getDefaultDisplay().getRotation();
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
                this.f7240B = (TextView) findViewById(R.id.serverMessage);
                this.f7241C = (ImageView) findViewById(R.id.serverMessageConnector);
                this.f7242D = (TextView) findViewById(R.id.robotMessage);
                this.f7243E = (ImageView) findViewById(R.id.robotMessageConnector);
                this.f7254R = (TextView) findViewById(R.id.testMessage);
                this.f7244F = new AlphaAnimation(1.0f, 0.0f);
                this.f7244F.setDuration(200);
                this.f7244F.setInterpolator(new LinearInterpolator());
                this.f7244F.setRepeatCount(-1);
                this.f7244F.setRepeatMode(2);
                this.f7245G = new AlphaAnimation(1.0f, 0.0f);
                this.f7245G.setDuration(200);
                this.f7245G.setInterpolator(new LinearInterpolator());
                this.f7245G.setRepeatCount(-1);
                this.f7245G.setRepeatMode(2);
                this.f7246H = (ImageButton) findViewById(R.id.btnServer);
                this.f7247I = (ImageButton) findViewById(R.id.btnRobot);
                this.f7248J = (ImageButton) findViewById(R.id.btnLocalControls);
                this.f7256T = (ImageView) findViewById(R.id.imageViewBackground);
                this.f7256T.setVisibility(!this.f7268ag ? 0 : 8);
                this.f7251M = (ListView) findViewById(R.id.robotListView);
                if (this.f7268ag) {
                    this.f7246H.setVisibility(8);
                    this.f7248J.setVisibility(0);
                }
                m10490v();
                m10495z();
                m10435B();
                m10493x();
                this.f7253Q = new C2657b(this);
                C2687c.m10735a((Context) this);
                this.f7257V.setVisibility(8);
                this.f7261Z.setVisibility(8);
                m10486t();
                this.f7263ab.start();
                return;
            }
            i = i3;
            f7233n = Math.min(((double) i2) / ((double) displayMetrics.density), ((double) i) / ((double) displayMetrics.density));
            this.f7257V = (WebView) findViewById(R.id.banner);
            this.f7257V.setOnTouchListener(new View.OnTouchListener() {
                /* class ru.proghouse.robocam.MainActivity.C26431 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 1:
                            if (MainActivity.this.f7258W == null || MainActivity.this.f7258W.isEmpty()) {
                                return false;
                            }
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(MainActivity.this.f7258W)));
                            return false;
                        default:
                            return false;
                    }
                }
            });
            MobileAds.initialize(getApplicationContext(), "ca-app-pub-7800876624909705~9648407673");
            this.f7261Z = (AdView) findViewById(R.id.adView);
            this.f7275x = (RelativeLayout) findViewById(R.id.parentLayout);
            this.f7272u = (SurfaceView) findViewById(R.id.surfaceView);
            if (Build.VERSION.SDK_INT < 23) {
            }
            this.f7265ad = getWindowManager().getDefaultDisplay().getRotation();
            this.f7263ab = new Thread(new Runnable() {
                /* class ru.proghouse.robocam.MainActivity.C26484 */

                public void run() {
                    while (!MainActivity.this.f7276y.f7264ac) {
                        try {
                            Thread.sleep(1000);
                            if (MainActivity.this.f7265ad != MainActivity.this.getWindowManager().getDefaultDisplay().getRotation()) {
                                MainActivity.this.m10436C();
                                int unused = MainActivity.this.f7265ad = MainActivity.this.getWindowManager().getDefaultDisplay().getRotation();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            this.f7240B = (TextView) findViewById(R.id.serverMessage);
            this.f7241C = (ImageView) findViewById(R.id.serverMessageConnector);
            this.f7242D = (TextView) findViewById(R.id.robotMessage);
            this.f7243E = (ImageView) findViewById(R.id.robotMessageConnector);
            this.f7254R = (TextView) findViewById(R.id.testMessage);
            this.f7244F = new AlphaAnimation(1.0f, 0.0f);
            this.f7244F.setDuration(200);
            this.f7244F.setInterpolator(new LinearInterpolator());
            this.f7244F.setRepeatCount(-1);
            this.f7244F.setRepeatMode(2);
            this.f7245G = new AlphaAnimation(1.0f, 0.0f);
            this.f7245G.setDuration(200);
            this.f7245G.setInterpolator(new LinearInterpolator());
            this.f7245G.setRepeatCount(-1);
            this.f7245G.setRepeatMode(2);
            this.f7246H = (ImageButton) findViewById(R.id.btnServer);
            this.f7247I = (ImageButton) findViewById(R.id.btnRobot);
            this.f7248J = (ImageButton) findViewById(R.id.btnLocalControls);
            this.f7256T = (ImageView) findViewById(R.id.imageViewBackground);
            this.f7256T.setVisibility(!this.f7268ag ? 0 : 8);
            this.f7251M = (ListView) findViewById(R.id.robotListView);
            if (this.f7268ag) {
            }
            m10490v();
            m10495z();
            m10435B();
            m10493x();
            this.f7253Q = new C2657b(this);
            try {
                C2687c.m10735a((Context) this);
            } catch (Exception e3) {
                Toast.makeText(this, (int) R.string.error_while_creating_default_ev3_settings_file, 1).show();
                e3.printStackTrace();
            }
            this.f7257V.setVisibility(8);
            this.f7261Z.setVisibility(8);
            m10486t();
            this.f7263ab.start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onDestroy() {
        super.onDestroy();
        this.f7264ac = true;
    }

    public void onLocalControlsButtonClick(View view) {
        startActivity(new Intent(this, LocalControllersActivity.class));
    }

    @Override // android.support.v4.app.C0106n
    public void onPause() {
        //ToDo: m10918b
        k.b(this);
        C2677a.m10590q().mo7673a((C2677a.C2678a) null);
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (Build.VERSION.SDK_INT >= 20) {
            f7229A = powerManager.isInteractive();
        } else {
            f7229A = powerManager.isScreenOn();
        }
        super.onPause();
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void
     arg types: [ru.proghouse.robocam.MainActivity, ?, int]
     candidates:
      ru.proghouse.robocam.o.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void
      ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void */
    @Override // android.support.v4.app.C0106n, android.support.v4.app.ActivityCompat.C0020a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr.length != 1 || iArr[0] != 0) {

//ToDo: C2714o.m10949a
o.a((Activity) this, (int) R.string.request_camera_permission, false);
        } else if (this.f7271t./*mo7644b*/ b()) {
        } else {
            if (this.f7271t./*mo7652j*/j()) {

//ToDo: C2714o.m10949a
o.a((Activity) this, (int) R.string.cannot_init_camera, false);
                return;
            }
            this.f7271t./*mo7638a*/a((Activity) this, true);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f7271t./*mo7637a*/ a(this.f7276y, this.f7273v, this.f7273v.getWidth(), this.f7273v.getHeight());
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f7270ai = bundle.getString("last_bluetooth_device");
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void
     arg types: [ru.proghouse.robocam.MainActivity, int]
     candidates:
      ru.proghouse.robocam.a.a.a(android.content.Context, java.lang.String):ru.proghouse.robocam.a.a
      ru.proghouse.robocam.a.a.a(java.lang.String, java.lang.Class<? extends ru.proghouse.robocam.a.a>):void
      ru.proghouse.robocam.a.a.a(int, java.lang.Object[]):void
      ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void */
    @Override // android.support.v4.app.C0106n
    public void onResume() {
        int i = 8;
        this.f7268ag = getSharedPreferences("RoboCamSettings", 0).getBoolean("use_local_controls", false);
        this.f7246H.setVisibility(this.f7268ag ? 8 : 0);
        this.f7248J.setVisibility(this.f7268ag ? 0 : 8);
        this.f7256T.setVisibility(this.f7268ag ? 0 : 8);
        //ToDo: m10341a, m10348b
        HttpServer.a((Context) this, false);
        if (this.f7268ag && HttpServer.c() != 0) {

            HttpServer.b(this);
        }

        //ToDo: Check this...
        if (Build.VERSION.SDK_INT >= 23) {
            View view = this.f7273v;
            if (!this.f7268ag) {
                i = 0;
            }
            view.setVisibility(i);
        } else {
            SurfaceView surfaceView = this.f7272u;
            if (!this.f7268ag) {
                i = 0;
            }
            surfaceView.setVisibility(i);
        }
        //ToDo; m10916a
        k.a(this);
        C2677a.m10590q().mo7673a(this);
        mo7573m();
        f7229A = true;
        super.onResume();
        C2677a.m10587a((Context) this, true);
        m10440G();
        m10436C();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("last_bluetooth_device", this.f7270ai);
        super.onSaveInstanceState(bundle);
    }

    public void onSettingsButtonClick(View view) {
        startActivity(new Intent(this, GlobalSettingsActivity.class));
    }

    public void onStartButtonClick(View view) {
        try {
            if (HttpServer.c() == 0) {
                //ToDo: m10340a
                HttpServer.a(this);
                this.f7246H.startAnimation(this.f7244F);
            } else if (HttpServer.c() == 1) {
                //ToDo: m10341a, m10348b
                HttpServer.a((Context) this, true);
                HttpServer.b(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onStop() {
        if (f7230N == 1) {
            f7230N = 0;
        }
        super.onStop();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        try {
            m10436C();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            if (this.f7271t./*mo7644b*/ b()) {
                this.f7271t./*mo7636a*/a(this, surfaceHolder);
            } else {
                this.f7271t./*mo7643b*/b(this, surfaceHolder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            this.f7271t./*mo7640a*/a(surfaceHolder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
