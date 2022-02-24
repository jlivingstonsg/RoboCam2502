package ru.proghouse.robocam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import java.io.File;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.proghouse.robocam.p063a.C2677a;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.LocalControllersActivity */
public class LocalControllersActivity extends AppCompatActivity {
    /* renamed from: n */
    public static LocalControllersActivity f7191n = null;

    /* renamed from: A */
    private ImageView f7192A = null;

    /* renamed from: B */
    private ImageView f7193B = null;

    /* renamed from: C */
    private ImageView f7194C = null;

    /* renamed from: D */
    private ImageView f7195D = null;

    /* renamed from: E */
    private TextView f7196E = null;

    /* renamed from: F */
    private TextView f7197F = null;

    /* renamed from: G */
    private RelativeLayout f7198G = null;

    /* renamed from: H */
    private String f7199H = "left-handed";

    /* renamed from: I */
    private int[] f7200I = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: J */
    private int[] f7201J = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: K */
    private int f7202K = -1;

    /* renamed from: L */
    private int f7203L = -1;

    /* renamed from: M */
    private boolean f7204M = true;

    /* renamed from: N */
    private boolean f7205N = false;

    /* renamed from: O */
    private boolean f7206O = true;

    /* renamed from: P */
    private boolean f7207P = false;

    /* renamed from: Q */
    private String f7208Q = "xywzabcd";

    /* renamed from: R */
    private String f7209R = "----";

    /* renamed from: S */
    private String f7210S = "00000000";

    /* renamed from: T */
    private int f7211T = 0;

    /* renamed from: U */
    private double f7212U = 1.0d;

    /* renamed from: V */
    private HashSet<Integer> f7213V = new HashSet<>();

    /* renamed from: W */
    private HashSet<Integer> f7214W = new HashSet<>();
    /* renamed from: o */
    public AdView f7215o = null;
    /* renamed from: p */
    public WebView f7216p = null;
    /* renamed from: q */
    public String f7217q = null;

    /* renamed from: r */
    private double f7218r = 0.0d;

    /* renamed from: s */
    private int f7219s = 0;

    /* renamed from: t */
    private int f7220t = 0;

    /* renamed from: u */
    private int f7221u = 0;
    /* renamed from: v */
    public String f7222v = "";
    /* renamed from: w */
    public boolean f7223w = false;
    /* renamed from: x */
    public volatile boolean f7224x = false;

    /* renamed from: y */
    private ImageView f7225y = null;

    /* renamed from: z */
    private ImageView f7226z = null;

    /* renamed from: a */
    private double m10406a(ImageView imageView) {
        return (double) ((imageView.getLeft() + imageView.getRight()) / 2);
    }

    /* renamed from: a */
    private void m10408a(ImageView imageView, int i) {
        String substring = this.f7209R.substring(i, i + 1);
        if (substring.equals("v")) {
            imageView.setImageResource(R.drawable.joystick1);
        } else if (substring.equals("c")) {
            imageView.setImageResource(R.drawable.joystick2);
        } else if (substring.equals("q")) {
            imageView.setImageResource(R.drawable.joystick3);
        } else if (substring.equals("a")) {
            imageView.setImageResource(R.drawable.joystick4);
        } else if (substring.equals("h")) {
            imageView.setImageResource(R.drawable.joystick7);
        } else if (substring.equals("t")) {
            imageView.setImageResource(R.drawable.joystick5);
        } else if (substring.equals("l")) {
            imageView.setImageResource(R.drawable.joystick6);
        }
        if (substring.equals("-")) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m10409a(String str, double[] dArr) {
        double d;
        double d2;
        double d3;
        double d4;
        if (str.equals("v")) {
            dArr[0] = 0.0d;
            dArr[1] = dArr[1] < -100.0d ? -100.0d : dArr[1] > 100.0d ? 100.0d : dArr[1];
        } else if (str.equals("h")) {
            dArr[0] = dArr[0] < -100.0d ? -100.0d : dArr[0] > 100.0d ? 100.0d : dArr[0];
            dArr[1] = 0.0d;
        } else if (str.equals("c") && Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1])) > 100.0d) {
            double atan2 = (Math.atan2(dArr[0], dArr[1]) - 1.5707963267948966d) * -1.0d;
            dArr[0] = Math.cos(atan2) * 100.0d;
            dArr[1] = Math.sin(atan2) * 100.0d;
        } else if (str.equals("q")) {
            dArr[0] = dArr[0] < -100.0d ? -100.0d : dArr[0] > 100.0d ? 100.0d : dArr[0];
            dArr[1] = dArr[1] < -100.0d ? -100.0d : dArr[1] > 100.0d ? 100.0d : dArr[1];
        } else if (str.equals("t")) {
            if ((dArr[1] > -40.0d) && (dArr[1] < 40.0d)) {
                if ((dArr[0] >= -100.0d) && (dArr[0] < -40.0d)) {
                    d4 = -100.0d;
                } else {
                    d4 = ((dArr[0] > 100.0d ? 1 : (dArr[0] == 100.0d ? 0 : -1)) <= 0) & ((dArr[0] > 40.0d ? 1 : (dArr[0] == 40.0d ? 0 : -1)) > 0) ? 100.0d : 0.0d;
                }
            } else {
                d4 = 0.0d;
            }
            dArr[0] = d4;
            dArr[1] = 0.0d;
        } else if (str.equals("l")) {
            dArr[0] = 0.0d;
            if ((dArr[0] > -40.0d) && (dArr[0] < 40.0d)) {
                if ((dArr[1] >= -100.0d) && (dArr[1] < -40.0d)) {
                    d3 = -100.0d;
                } else {
                    d3 = ((dArr[1] > 100.0d ? 1 : (dArr[1] == 100.0d ? 0 : -1)) <= 0) & ((dArr[1] > 40.0d ? 1 : (dArr[1] == 40.0d ? 0 : -1)) > 0) ? 100.0d : 0.0d;
                }
            } else {
                d3 = 0.0d;
            }
            dArr[1] = d3;
        } else if (str.equals("a")) {
            if ((dArr[1] > -40.0d) && (dArr[1] < 40.0d)) {
                if ((dArr[0] >= -100.0d) && (dArr[0] < -40.0d)) {
                    d = -100.0d;
                } else {
                    d = ((dArr[0] > 100.0d ? 1 : (dArr[0] == 100.0d ? 0 : -1)) <= 0) & ((dArr[0] > 40.0d ? 1 : (dArr[0] == 40.0d ? 0 : -1)) > 0) ? 100.0d : 0.0d;
                }
            } else {
                d = 0.0d;
            }
            dArr[0] = d;
            if ((dArr[0] > -40.0d) && (dArr[0] < 40.0d)) {
                if ((dArr[1] >= -100.0d) && (dArr[1] < -40.0d)) {
                    d2 = -100.0d;
                } else {
                    d2 = ((dArr[1] > 100.0d ? 1 : (dArr[1] == 100.0d ? 0 : -1)) <= 0) & ((dArr[1] > 40.0d ? 1 : (dArr[1] == 40.0d ? 0 : -1)) > 0) ? 100.0d : 0.0d;
                }
            } else {
                d2 = 0.0d;
            }
            dArr[1] = d2;
        }
        dArr[0] = (double) Math.round(dArr[0]);
        dArr[1] = (double) Math.round(dArr[1]);
    }

    /* renamed from: a */
    private boolean m10410a(ImageView imageView, int i, int i2) {
        return imageView.getLeft() <= i && imageView.getRight() >= i && imageView.getTop() <= i2 && imageView.getBottom() >= i2;
    }

    /* renamed from: b */
    private double m10412b(ImageView imageView) {
        return (double) ((imageView.getTop() + imageView.getBottom()) / 2);
    }

    /* renamed from: c */
    private double m10415c(ImageView imageView) {
        return (double) ((imageView.getWidth() * 450) / 540);
    }

    /* renamed from: c */
    private boolean m10417c(int i) {
        try {
            return this.f7210S.substring(i, i + 1).equals("0");
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    /* renamed from: d */
    private String m10419d(int i) {
        return this.f7209R.substring(i, i + 1);
    }

    /* renamed from: e */
    private void m10421e(int i) {
        if (i == 1) {
            this.f7202K = -1;
            if (this.f7211T == 0) {
                if (m10417c(0)) {
                    this.f7200I[0] = 0;
                }
                if (m10417c(1)) {
                    this.f7200I[1] = 0;
                    return;
                }
                return;
            }
            if (m10417c(4)) {
                this.f7200I[4] = 0;
            }
            if (m10417c(5)) {
                this.f7200I[5] = 0;
                return;
            }
            return;
        }
        this.f7203L = -1;
        if (this.f7211T == 0) {
            if (m10417c(2)) {
                this.f7200I[2] = 0;
            }
            if (m10417c(3)) {
                this.f7200I[3] = 0;
                return;
            }
            return;
        }
        if (m10417c(6)) {
            this.f7200I[6] = 0;
        }
        if (m10417c(7)) {
            this.f7200I[7] = 0;
        }
    }

    /* renamed from: f */
    private int m10422f(int i) {
        if (i >= 29 && i <= 54) {
            return (i - 29) + 65;
        }
        if (i >= 7 && i <= 16) {
            return (i - 7) + 48;
        }
        if (i == 67) {
            return 8;
        }
        if (i == 59 || i == 60) {
            return 16;
        }
        if (i == 113 || i == 114) {
            return 17;
        }
        if (i == 57 || i == 58) {
            return 18;
        }
        if (i == 143) {
            return 144;
        }
        if (i == 116) {
            return 145;
        }
        if (i >= 144 && i <= 153) {
            return (i - 144) + 96;
        }
        if (i == 121) {
            return 19;
        }
        if (i == 68) {
            return 192;
        }
        if (i == 69) {
            return 189;
        }
        if (i == 71) {
            return 219;
        }
        if (i == 72) {
            return 221;
        }
        if (i == 73) {
            return 220;
        }
        if (i == 74) {
            return 186;
        }
        if (i == 75) {
            return 222;
        }
        if (i == 55) {
            return 188;
        }
        if (i == 56) {
            return 190;
        }
        if (i == 76) {
            return 191;
        }
        if (i == 132) {
            return 113;
        }
        if (i == 134) {
            return 115;
        }
        if (i == 137) {
            return 118;
        }
        if (i == 138) {
            return 119;
        }
        if (i == 139) {
            return 120;
        }
        if (i == 140) {
            return ScriptIntrinsicBLAS.UPPER;
        }
        if (i == 61) {
            return 9;
        }
        if (i == 28) {
            return 12;
        }
        if (i == 66) {
            return 13;
        }
        if (i == 115) {
            return 20;
        }
        if (i == 111) {
            return 27;
        }
        if (i == 62) {
            return 32;
        }
        if (i == 92) {
            return 33;
        }
        if (i == 93) {
            return 34;
        }
        if (i == 123) {
            return 35;
        }
        if (i == 122) {
            return 36;
        }
        if (i == 21) {
            return 37;
        }
        if (i == 19) {
            return 38;
        }
        if (i == 22) {
            return 39;
        }
        if (i == 20) {
            return 40;
        }
        if (i == 124) {
            return 45;
        }
        if (i == 112) {
            return 46;
        }
        if (i == 155) {
            return 106;
        }
        if (i == 157) {
            return 107;
        }
        if (i == 156) {
            return 109;
        }
        if (i == 158) {
            return 110;
        }
        return 0;
    }

    /* renamed from: j */
    public static void m10424j() {
        if (f7191n != null) {
            f7191n.f7198G.post(new Runnable() {
                /* class ru.proghouse.robocam.LocalControllersActivity.C26423 */

                public void run() {
                    if (LocalControllersActivity.f7191n != null) {
                        LocalControllersActivity.f7191n.m10429o();
                    }
                }
            });
        }
    }

    /* renamed from: l */
    private void m10426l() {
        if (Build.VERSION.SDK_INT <= 17) {
            getWindow().setFlags(1024, 1024);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(6150);
        }
    }

    /* WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    public void m10427m() {
        boolean z;
        float f;
        String str;
        float f2;
        //ToDo: initialized...
        Element element = null;

        boolean z2 = true;
        if (!this.f7224x) {
            this.f7224x = true;
            try {
                File b = /*ToDo: C2714o.m10956b*/ o.b(this);
                File file = new File(b, "v.xml");
                if (file.exists()) {
                    Element[] elementArr = {null};
                    String[] strArr = {null};
                    String[] strArr2 = {null};
                    Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                    if (MainActivity.a(parse, MainActivity.a(this), elementArr, strArr, strArr2)) {
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
                                if ((element.getAttribute("target") == null || element.getAttribute("target").isEmpty() || element.getAttribute("target").equals("server")) && ((element.getAttribute("screenMin") == null || element.getAttribute("screenMin").isEmpty() || this.f7218r >= Double.parseDouble(element.getAttribute("screenMin"))) && (element.getAttribute("sdkMin") == null || element.getAttribute("sdkMin").isEmpty() || Build.VERSION.SDK_INT >= Integer.parseInt(element.getAttribute("sdkMin"))))) {
                                    String attribute = element.getAttribute("path");
                                    this.f7217q = element.getAttribute("url");
                                    float parseFloat = Float.parseFloat(element.getAttribute("width"));
                                    float parseFloat2 = Float.parseFloat(element.getAttribute("height"));
                                    float applyDimension = TypedValue.applyDimension(1, parseFloat, getResources().getDisplayMetrics());
                                    float applyDimension2 = TypedValue.applyDimension(1, parseFloat2, getResources().getDisplayMetrics());
                                    this.f7222v = element.getAttribute("type");
                                    f = applyDimension2;
                                    f2 = applyDimension;
                                    str = attribute;
                                }
                            }
                            i++;
                        }
                        String attribute2 = element.getAttribute("path");
                        this.f7217q = element.getAttribute("url");
                        float parseFloat3 = Float.parseFloat(element.getAttribute("width"));
                        float parseFloat22 = Float.parseFloat(element.getAttribute("height"));
                        float applyDimension3 = TypedValue.applyDimension(1, parseFloat3, getResources().getDisplayMetrics());
                        float applyDimension22 = TypedValue.applyDimension(1, parseFloat22, getResources().getDisplayMetrics());
                        this.f7222v = element.getAttribute("type");
                        f = applyDimension22;
                        f2 = applyDimension3;
                        str = attribute2;
                        if (str != null && f2 > 0.0f && f > 0.0f && (this.f7222v.equals("replace") || (this.f7222v.equals("offline") && this.f7223w))) {
                            File file3 = new File(file2, str);
                            if (file3.exists()) {
                                String uri = file3.toURI().toString();
                                this.f7216p.getSettings().setJavaScriptEnabled(true);
                                this.f7216p.loadUrl(uri);
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(f2), Math.round(f));
                                layoutParams.addRule(14);
                                this.f7216p.setLayoutParams(layoutParams);
                                try {
                                    this.f7216p.setVisibility(0);
                                    this.f7215o.setVisibility(8);
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
                                        this.f7216p.setVisibility(8);
                                        this.f7215o.setVisibility(0);
                                        AdRequest a = new AdRequest.Builder().build();
                                        this.f7215o.setAdListener(new AdListener() {
                                            /* class ru.proghouse.robocam.LocalControllersActivity.C26412 */

                                            //ToDo: Ad Listener implemented methods...
                                            @Override // com.google.android.gms.ads.AdListener
                                            /* renamed from: a */
                                            public void onAdLoaded() {
                                                try {
                                                    LocalControllersActivity.this.f7216p.setVisibility(8);
                                                    LocalControllersActivity.this.f7215o.setVisibility(0);
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }

                                            /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
                                             method: ru.proghouse.robocam.LocalControllersActivity.a(ru.proghouse.robocam.LocalControllersActivity, boolean):boolean
                                             arg types: [ru.proghouse.robocam.LocalControllersActivity, int]
                                             candidates:
                                              ru.proghouse.robocam.LocalControllersActivity.a(android.widget.ImageView, int):void
                                              ru.proghouse.robocam.LocalControllersActivity.a(java.lang.String, double[]):void
                                              android.support.v4.a.n.a(android.view.View, android.view.Menu):boolean
                                              ru.proghouse.robocam.LocalControllersActivity.a(ru.proghouse.robocam.LocalControllersActivity, boolean):boolean */
                                            @Override // com.google.android.gms.ads.AdListener
                                            /* renamed from: a */
                                            public void onAdFailedToLoad(int i) {
                                                try {
                                                    if (LocalControllersActivity.this.f7222v.equals("offline")) {
                                                        LocalControllersActivity.this.f7223w = true;
                                                        LocalControllersActivity.this.f7224x = false;
                                                        LocalControllersActivity.this.m10427m();
                                                    }
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }

                                            @Override // com.google.android.gms.ads.AdListener
                                            /* renamed from: b */
                                            public void onAdLeftApplication() {
                                                try {
                                                    LocalControllersActivity.this.f7216p.setVisibility(8);
                                                    LocalControllersActivity.this.f7215o.setVisibility(0);
                                                } catch (Throwable th) {
                                                    th.printStackTrace();
                                                }
                                            }
                                        });
                                        this.f7215o.loadAd(a);
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

    /* renamed from: n */
    private void m10428n() {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 8) {
                z = false;
                break;
            } else if (this.f7200I[i] != this.f7201J[i]) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            String str = "";
            Hashtable hashtable = new Hashtable();
            for (int i2 = 0; i2 < 8; i2++) {
                if (this.f7200I[i2] != this.f7201J[i2]) {
                    hashtable.put(this.f7208Q.substring(i2, i2 + 1), Integer.valueOf(this.f7200I[i2]));
                    str = str + this.f7208Q.substring(i2, i2 + 1) + "=" + Integer.toString(this.f7200I[i2]) + ";";
                }
            }
            TextView textView = this.f7196E;
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
            }
            textView.setText(str);
//ToDo: m10915a
ru.proghouse.robocam.k.a(hashtable);
            for (int i3 = 0; i3 < 8; i3++) {
                this.f7201J[i3] = this.f7200I[i3];
            }
        }
    }

    /* renamed from: o */
    public void m10429o() {
        int i = 4;
        boolean z = false;
        try {
            this.f7209R = C2677a.m10590q().mo7686j() ? C2677a.m10590q().mo7677c() : "----";
            this.f7210S = C2677a.m10590q().mo7686j() ? C2677a.m10590q().mo7676b() : "00000000";
            this.f7206O = C2677a.m10590q().mo7686j() ? C2677a.m10590q().mo7693t() : true;
            TextView textView = this.f7196E;
            if (this.f7206O) {
                i = 0;
            }
            textView.setVisibility(i);
            this.f7213V.clear();
            if (C2677a.m10590q().mo7686j()) {
                String d = C2677a.m10590q().mo7678d();
                for (int i2 = 0; i2 < d.length() / 3; i2++) {
                    this.f7213V.add(new Integer(d.substring(i2 * 3, (i2 * 3) + 3)));
                }
            }
            if (C2677a.m10590q().mo7686j()) {
                z = C2677a.m10590q().mo7680e();
            }
            this.f7205N = z;
            if (this.f7204M) {
                if (this.f7199H.equals("left-handed")) {
                    this.f7226z = (ImageView) findViewById(R.id.imageViewJoystick1);
                    this.f7225y = (ImageView) findViewById(R.id.imageViewJoystick2);
                    this.f7195D.setImageResource(R.drawable.hands_r);
                } else {
                    this.f7226z = (ImageView) findViewById(R.id.imageViewJoystick2);
                    this.f7225y = (ImageView) findViewById(R.id.imageViewJoystick1);
                    this.f7195D.setImageResource(R.drawable.hands_l);
                }
                if (this.f7211T == 0 && this.f7209R.substring(0, 2).equals("--")) {
                    this.f7211T = 1;
                }
                if (this.f7211T == 1 && this.f7209R.substring(2, 4).equals("--")) {
                    this.f7211T = 0;
                }
                if (this.f7211T == 0) {
                    m10408a(this.f7226z, 0);
                    m10408a(this.f7225y, 1);
                } else {
                    m10408a(this.f7226z, 2);
                    m10408a(this.f7225y, 3);
                }
                if (this.f7209R.substring(0, 2).equals("--") || this.f7209R.substring(2, 4).equals("--")) {
                    this.f7192A.setVisibility(4);
                } else {
                    this.f7192A.setVisibility(0);
                }
                if (this.f7211T == 0) {
                    this.f7192A.setImageResource(R.drawable.joystick_1_2);
                } else {
                    this.f7192A.setImageResource(R.drawable.joystick_3_4);
                }
                if (this.f7209R.equals("----")) {
                    this.f7195D.setVisibility(4);
                } else {
                    this.f7195D.setVisibility(0);
                }
            } else {
                this.f7226z.setVisibility(4);
                this.f7225y.setVisibility(4);
                this.f7192A.setVisibility(4);
                this.f7195D.setVisibility(4);
            }
            if (!C2677a.m10590q().mo7686j()) {
                this.f7197F.setText(R.string.robot_is_not_connected);
            } else {
                this.f7197F.setText("");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m10430p() {
        if (this.f7205N && this.f7204M && this.f7214W.size() > 0) {
            this.f7204M = false;
            m10429o();
        }
        String str = "";
        Iterator<Integer> it = this.f7214W.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (!str.isEmpty()) {
                str = str + ", ";
            }
            str = str + next.toString();
        }
        this.f7196E.setText(str);
        //TODo: m10914a
        ru.proghouse.robocam.k.a((HashSet) this.f7214W.clone());
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_local_controllers);
        f7191n = this;
        this.f7198G = (RelativeLayout) findViewById(R.id.parentLayout);
        //ToDo:getSupportActionBar().show()
        getSupportActionBar().show();
        m10426l();
        SharedPreferences sharedPreferences = getSharedPreferences("RoboCamSettings", 0);
        this.f7199H = sharedPreferences.getString("local_control", "left-handed");
        this.f7211T = sharedPreferences.getInt("joystick_current_panel", 0);
        this.f7207P = sharedPreferences.getBoolean("maximize_joysticks", false);
        if (this.f7199H.equals("left-handed")) {
            this.f7226z = (ImageView) findViewById(R.id.imageViewJoystick1);
            this.f7225y = (ImageView) findViewById(R.id.imageViewJoystick2);
        } else {
            this.f7226z = (ImageView) findViewById(R.id.imageViewJoystick2);
            this.f7225y = (ImageView) findViewById(R.id.imageViewJoystick1);
        }
        this.f7196E = (TextView) findViewById(R.id.textViewDebugMessage);
        this.f7196E.setText("");
        this.f7197F = (TextView) findViewById(R.id.textViewText);
        this.f7197F.setText("");
        this.f7193B = (ImageView) findViewById(R.id.imageViewEmpty1);
        this.f7192A = (ImageView) findViewById(R.id.imageViewCurrentJoystick);
        this.f7194C = (ImageView) findViewById(R.id.imageViewEmpty2);
        this.f7195D = (ImageView) findViewById(R.id.imageViewHands);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (Build.VERSION.SDK_INT < 14 || Build.VERSION.SDK_INT >= 17) {
            i = i4;
            i2 = i3;
        } else {
            try {
                i3 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = i3;
            } catch (Exception e) {
                e.printStackTrace();
                i2 = i3;
                i = i4;
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
        }
        this.f7220t = i2;
        this.f7221u = i;
        this.f7219s = Math.min(i2, i);
        this.f7212U = ((double) this.f7219s) / 1080.0d;
        this.f7218r = Math.min(((double) i2) / ((double) displayMetrics.density), ((double) i) / ((double) displayMetrics.density));
        this.f7226z.setVisibility(4);
        this.f7225y.setVisibility(4);
        int i5 = this.f7219s / 2;
        if (this.f7207P && i2 > i) {
            i5 = (int) Math.min((((double) i) - (120.0d * this.f7212U)) - (30.0d * this.f7212U), ((double) i2) / 2.0d);
        }
        int i6 = (int) (120.0d * this.f7212U);
        int i7 = (int) (30.0d * this.f7212U);
        this.f7225y.getLayoutParams().width = i5;
        this.f7225y.getLayoutParams().height = i5;
        this.f7226z.getLayoutParams().width = i5;
        this.f7226z.getLayoutParams().height = i5;
        this.f7193B.getLayoutParams().width = i7;
        this.f7193B.getLayoutParams().height = i7;
        this.f7192A.getLayoutParams().width = i6;
        this.f7192A.getLayoutParams().height = i6;
        this.f7194C.getLayoutParams().width = i7;
        this.f7194C.getLayoutParams().height = i7;
        this.f7195D.getLayoutParams().width = i6;
        this.f7195D.getLayoutParams().height = i6;
        this.f7196E.setTextSize(0, (float) Math.round((float) (this.f7219s / 32)));
        this.f7197F.setTextSize(0, (float) Math.round((float) (this.f7219s / 32)));
        if (this.f7207P && i2 > i) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i6, i6);
            layoutParams.addRule(3, R.id.imageViewEmpty2);
            layoutParams.addRule(0, R.id.imageViewEmpty2);
            this.f7192A.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i7, i7);
            layoutParams2.addRule(3, R.id.imageViewEmpty2);
            layoutParams2.addRule(0, R.id.imageViewCurrentJoystick);
            this.f7193B.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i6, i6);
            layoutParams3.addRule(3, R.id.imageViewEmpty2);
            layoutParams3.addRule(0, R.id.imageViewEmpty1);
            this.f7195D.setLayoutParams(layoutParams3);
        }
        m10429o();
        this.f7215o = (AdView) findViewById(R.id.adView);
        this.f7216p = (WebView) findViewById(R.id.banner);
        this.f7216p.setOnTouchListener(new View.OnTouchListener() {
            /* class ru.proghouse.robocam.LocalControllersActivity.C26401 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 1:
                        if (LocalControllersActivity.this.f7217q == null || LocalControllersActivity.this.f7217q.isEmpty()) {
                            return false;
                        }
                        LocalControllersActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(LocalControllersActivity.this.f7217q)));
                        return false;
                    default:
                        return false;
                }
            }
        });
        this.f7216p.setVisibility(8);
        this.f7215o.setVisibility(8);
        m10427m();
    }

    public void onCurrentJoystickClick(View view) {
        if (this.f7202K < 0 && this.f7203L < 0 && this.f7192A.getVisibility() == 0) {
            if (this.f7211T == 0) {
                this.f7211T = 1;
            } else {
                this.f7211T = 0;
            }
            m10429o();
            SharedPreferences.Editor edit = getSharedPreferences("RoboCamSettings", 0).edit();
            edit.putInt("joystick_current_panel", this.f7211T);
            if (Build.VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
    }

    public void onHandsClick(View view) {
        if (this.f7202K < 0 && this.f7203L < 0 && this.f7195D.getVisibility() == 0) {
            if (this.f7199H.equals("left-handed")) {
                this.f7199H = "right-handed";
            } else {
                this.f7199H = "left-handed";
            }
            m10429o();
            SharedPreferences.Editor edit = getSharedPreferences("RoboCamSettings", 0).edit();
            edit.putString("local_control", this.f7199H);
            if (Build.VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int f = m10422f(i);
        if (this.f7213V.contains(Integer.valueOf(f)) && !this.f7214W.contains(Integer.valueOf(f))) {
            this.f7214W.add(Integer.valueOf(f));
            m10430p();
        }
        if (f > 0) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.getDownTime() == keyEvent.getEventTime()) {
            return super.onKeyUp(i, keyEvent);
        }
        int f = m10422f(i);
        if (this.f7214W.contains(Integer.valueOf(f))) {
            this.f7214W.remove(Integer.valueOf(f));
            m10430p();
        }
        if (f > 0) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.support.v4.app.C0106n
    public void onPause() {
        f7191n = null;
        super.onPause();
    }

    @Override // android.support.v4.app.C0106n
    public void onResume() {
        super.onResume();
        f7191n = this;
        m10424j();
        m10426l();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 5:
                    int x = (int) motionEvent.getX(motionEvent.getActionIndex());
                    int y = (int) motionEvent.getY(motionEvent.getActionIndex());
                    if (m10410a(this.f7226z, x, y) && this.f7202K < 0 && this.f7204M) {
                        this.f7202K = motionEvent.getPointerId(motionEvent.getActionIndex());
                    } else if (m10410a(this.f7225y, x, y) && this.f7203L < 0 && this.f7204M) {
                        this.f7203L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    }
                    if (!this.f7204M) {
                        this.f7204M = true;
                        m10424j();
                        break;
                    }
                    break;
                case 1:
                case 3:
                case 6:
                    if (this.f7202K != motionEvent.getPointerId(motionEvent.getActionIndex())) {
                        if (this.f7203L == motionEvent.getPointerId(motionEvent.getActionIndex())) {
                            m10421e(2);
                            break;
                        }
                    } else {
                        m10421e(1);
                        break;
                    }
                    break;
            }
            double[] dArr = {0.0d, 0.0d};
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                if (this.f7202K >= 0 && motionEvent.getPointerId(i) == this.f7202K) {
                    dArr[0] = (((m10406a(this.f7226z) - ((double) motionEvent.getX(i))) * 100.0d) / m10415c(this.f7226z)) * 2.0d * -1.0d;
                    dArr[1] = (((m10412b(this.f7226z) - ((double) motionEvent.getY(i))) * 100.0d) / m10415c(this.f7226z)) * 2.0d;
                    if (this.f7211T == 0 && !m10419d(0).equals("-")) {
                        m10409a(m10419d(0), dArr);
                        this.f7200I[0] = (int) dArr[0];
                        this.f7200I[1] = (int) dArr[1];
                    }
                    if (this.f7211T == 1 && !m10419d(2).equals("-")) {
                        m10409a(m10419d(2), dArr);
                        this.f7200I[4] = (int) dArr[0];
                        this.f7200I[5] = (int) dArr[1];
                    }
                }
                if (this.f7203L >= 0 && motionEvent.getPointerId(i) == this.f7203L) {
                    dArr[0] = (((m10406a(this.f7225y) - ((double) motionEvent.getX(i))) * 100.0d) / m10415c(this.f7225y)) * 2.0d * -1.0d;
                    dArr[1] = (((m10412b(this.f7225y) - ((double) motionEvent.getY(i))) * 100.0d) / m10415c(this.f7225y)) * 2.0d;
                    if (this.f7211T == 0 && !m10419d(1).equals("-")) {
                        m10409a(m10419d(1), dArr);
                        this.f7200I[2] = (int) dArr[0];
                        this.f7200I[3] = (int) dArr[1];
                    }
                    if (this.f7211T == 1 && !m10419d(3).equals("-")) {
                        m10409a(m10419d(3), dArr);
                        this.f7200I[6] = (int) dArr[0];
                        this.f7200I[7] = (int) dArr[1];
                    }
                }
            }
            m10428n();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }
}
