package ru.proghouse.robocam.p063a;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.widget.Toast;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

import ru.proghouse.robocam./*ToDo: C2714o*/o;
import ru.proghouse.robocam.HttpServer;
import ru.proghouse.robocam.R;
import ru.proghouse.robocam.p063a.p064a.C2679a;
import ru.proghouse.robocam.p063a.p065b.C2687c;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.a.a */
public abstract class C2677a {

    /* renamed from: a */
    private static List<String> f7414a = new ArrayList();

    /* renamed from: b */
    private static List<Class<? extends C2677a>> f7415b = new ArrayList();

    /* renamed from: c */
    private static volatile C2677a f7416c = new C2687c();

    /* renamed from: d */
    private C2678a f7417d = null;

    /* renamed from: e */
    private boolean f7418e = true;

    /* renamed from: ru.proghouse.robocam.a.a$a */
    public interface C2678a {
        /* renamed from: a */
        void mo7567a(int i, Object... objArr);

        /* renamed from: c */
        void mo7568c(int i);

        /* renamed from: d */
        void mo7569d(int i);

        /* renamed from: j */
        void mo7570j();

        /* renamed from: k */
        void mo7571k();
    }

    static {
        m10588a("EV3", C2687c.class);
        m10588a("Custom", C2679a.class);
    }

    /* renamed from: a */
    public static C2677a m10586a(Context context, String str) {
        int indexOf = f7414a.indexOf(str);
        if (indexOf >= 0) {
            try {
                return (C2677a) f7415b.get(indexOf).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        try {
            throw new Exception(String.format(context.getString(R.string.unknown_driver_name), str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //ToDo: return statement...
        return null;
    }

    /* WARN: Type inference failed for: r10v0, types: [android.content.Context] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static void m10587a(Context r10, boolean z) {
        String string = r10.getSharedPreferences("RoboCamSettings", 0).getString("current_robot_settings", "");
        File a =
/*ToDo: C2714o.m10947a*/o.a((Context) r10);
        try {
            if (string.equals("")) {
                string = "researcher.xml";
                C2687c.m10735a((Context) r10);
            }
            File file = new File(a, string);
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            parse.getDocumentElement().normalize();
            String nodeName = parse.getDocumentElement().getNodeName();
            if ((!m10590q().mo7681f().equals(nodeName) || !m10590q().mo7683g().equals(file.getName()) || m10590q().mo7687k() != file.lastModified()) && z) {
                C2677a a2 = m10586a((Context) r10, nodeName);
                a2.mo7670a(r10, file, parse);
                m10589a(a2);
            }
        } catch (Throwable th) {
            Toast.makeText((Context) r10, r10.getString(R.string.error_while_opening_settings_file, string, th.getMessage()), 1).show();
        }
    }

    /* renamed from: a */
    protected static void m10588a(String str, Class<? extends C2677a> cls) {
        if (!f7414a.contains(str)) {
            f7414a.add(str);
            f7415b.add(cls);
        }
    }

    /* renamed from: a */
    public static void m10589a(C2677a aVar) {
        if (f7416c != aVar) {
            if (f7416c != null && !f7416c.mo7685i()) {
                f7416c.mo7689m();
            }
            aVar.f7417d = f7416c.f7417d;
            f7416c.f7417d = null;
            f7416c = aVar;
        }
    }

    /* renamed from: q */
    public static C2677a m10590q() {
        return f7416c;
    }

    /* renamed from: a */
    public abstract String mo7667a();

    /* renamed from: a */
    public void mo7668a(int i, Object... objArr) {
        synchronized (HttpServer.a) {
            if (this.f7417d != null) {
                this.f7417d.mo7567a(i, objArr);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo7669a(BluetoothDevice bluetoothDevice);

    /* renamed from: a */
    public abstract void mo7670a(Context context, File file, Document document);

    /* renamed from: a */
    public abstract void mo7671a(HashSet<Integer> hashSet);

    /* renamed from: a */
    public abstract void mo7672a(Hashtable<String, Integer> hashtable);

    /* renamed from: a */
    public void mo7673a(C2678a aVar) {
        synchronized (HttpServer.a) {
            this.f7417d = aVar;
        }
    }

    /* renamed from: a */
    public void mo7674a(boolean z) {
        this.f7418e = z;
    }

    /* renamed from: a_ */
    public int mo7675a_(int i) {
        switch (i) {
            case 0:
                return R.string.robot_is_disconnected;
            case 1:
                return R.string.robot_is_connecting;
            case 2:
                return R.string.robot_bonded_devices_not_found;
            case 3:
                return R.string.robot_is_connected_to;
            case 4:
                return R.string.robot_is_connecting_to;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public abstract String mo7676b();

    /* renamed from: c */
    public abstract String mo7677c();

    /* renamed from: d */
    public abstract String mo7678d();

    /* renamed from: e */
    public void mo7679e(int i) {
        synchronized (HttpServer.a) {
            if (this.f7417d != null) {
                this.f7417d.mo7568c(i);
            }
        }
    }

    /* renamed from: e */
    public abstract boolean mo7680e();

    /* renamed from: f */
    public abstract String mo7681f();

    /* renamed from: f */
    public void mo7682f(int i) {
        synchronized (HttpServer.a) {
            if (this.f7417d != null) {
                this.f7417d.mo7569d(i);
            }
        }
    }

    /* renamed from: g */
    public abstract String mo7683g();

    /* renamed from: h */
    public abstract String mo7684h();

    /* renamed from: i */
    public abstract boolean mo7685i();

    /* renamed from: j */
    public abstract boolean mo7686j();

    /* renamed from: k */
    public abstract long mo7687k();

    /* renamed from: l */
    public abstract boolean mo7688l();

    /* renamed from: m */
    public abstract void mo7689m();

    /* renamed from: n */
    public abstract void mo7690n();

    /* renamed from: r */
    public void mo7691r() {
        synchronized (HttpServer.a) {
            if (this.f7417d != null) {
                this.f7417d.mo7570j();
            }
        }
    }

    /* renamed from: s */
    public void mo7692s() {
        synchronized (HttpServer.a) {
            if (this.f7417d != null) {
                this.f7417d.mo7571k();
            }
        }
    }

    /* renamed from: t */
    public boolean mo7693t() {
        return this.f7418e;
    }
}
