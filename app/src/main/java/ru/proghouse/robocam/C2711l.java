package ru.proghouse.robocam;

import android.content.res.Resources;
import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.FieldPacker;
import android.support.v8.renderscript.RSRuntimeException;
import android.support.v8.renderscript.RenderScript;
import android.support.v8.renderscript.Script;
import android.support.v8.renderscript.ScriptC;

/* renamed from: ru.proghouse.robocam.l */
public class C2711l extends ScriptC {

    /* renamed from: a */
    private Element f7591a;

    /* renamed from: b */
    private Element f7592b;

    /* renamed from: c */
    private Element f7593c;

    /* renamed from: d */
    private Element f7594d;

    /* renamed from: e */
    private FieldPacker f7595e;

    /* renamed from: f */
    private int f7596f;

    /* renamed from: g */
    private int f7597g;

    /* renamed from: h */
    private long f7598h;

    /* renamed from: i */
    private long f7599i;

    /* renamed from: j */
    private long f7600j;

    /* renamed from: k */
    private Allocation f7601k;

    /* renamed from: l */
    private Allocation f7602l;

    /* renamed from: m */
    private Allocation f7603m;

    public C2711l(RenderScript renderScript) {
        this(renderScript, renderScript.getApplicationContext().getResources(), renderScript.getApplicationContext().getResources().getIdentifier("yuv420888", "raw", renderScript.getApplicationContext().getPackageName()));
    }

    public C2711l(RenderScript renderScript, Resources resources, int i) {
        super(renderScript, resources, i);
        this.f7592b = Element.I32(renderScript);
        this.f7593c = Element.U32(renderScript);
        this.f7591a = Element.ALLOCATION(renderScript);
        this.f7594d = Element.U8_4(renderScript);
    }

    /* renamed from: a */
    public synchronized void mo7828a(int i) {
        setVar(0, i);
        this.f7596f = i;
    }

    /* renamed from: a */
    public synchronized void mo7829a(long j) {
        if (this.f7595e != null) {
            this.f7595e.reset();
        } else {
            this.f7595e = new FieldPacker(4);
        }
        this.f7595e.addU32(j);
        setVar(2, this.f7595e);
        this.f7598h = j;
    }

    /* renamed from: a */
    public synchronized void mo7830a(Allocation allocation) {
        setVar(5, allocation);
        this.f7601k = allocation;
    }

    /* renamed from: a */
    public void mo7831a(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.f7594d)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(1, (Allocation) null, allocation, (FieldPacker) null, launchOptions);
    }

    /* renamed from: b */
    public synchronized void mo7832b(int i) {
        setVar(1, i);
        this.f7597g = i;
    }

    /* renamed from: b */
    public synchronized void mo7833b(long j) {
        if (this.f7595e != null) {
            this.f7595e.reset();
        } else {
            this.f7595e = new FieldPacker(4);
        }
        this.f7595e.addU32(j);
        setVar(3, this.f7595e);
        this.f7599i = j;
    }

    /* renamed from: b */
    public synchronized void mo7834b(Allocation allocation) {
        setVar(6, allocation);
        this.f7602l = allocation;
    }

    /* renamed from: c */
    public synchronized void mo7835c(long j) {
        if (this.f7595e != null) {
            this.f7595e.reset();
        } else {
            this.f7595e = new FieldPacker(4);
        }
        this.f7595e.addU32(j);
        setVar(4, this.f7595e);
        this.f7600j = j;
    }

    /* renamed from: c */
    public synchronized void mo7836c(Allocation allocation) {
        setVar(7, allocation);
        this.f7603m = allocation;
    }
}
