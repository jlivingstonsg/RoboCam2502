package ru.proghouse.robocam;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.ActivityCompat;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.a */
public class C2671a implements Camera.PreviewCallback {

    /* renamed from: c */
    private static C2671a f7365c = new C2671a();
    /* renamed from: A */
    public CameraCaptureSession f7366A = null;
    /* renamed from: B */
    public CaptureRequest.Builder f7367B = null;
    /* renamed from: C */
    public CaptureRequest f7368C = null;
    /* renamed from: D */
    public CameraCaptureSession.CaptureCallback f7369D = null;
    /* renamed from: E */
    public Handler f7370E = null;

    /* renamed from: F */
    private HandlerThread f7371F = null;

    /* renamed from: G */
    private SurfaceTexture f7372G = null;

    /* renamed from: H */
    private ImageReader f7373H = null;

    /* renamed from: I */
    private ImageReader.OnImageAvailableListener f7374I = null;

    /* renamed from: J */
    private volatile boolean f7375J = true;

    /* renamed from: K */
    private C2676a f7376K = null;

    /* renamed from: L */
    private int f7377L = Integer.MIN_VALUE;

    /* renamed from: M */
    private C2708j[] f7378M = {new C2708j(), new C2708j(), new C2708j()};

    /* renamed from: N */
    private int f7379N = 1;

    /* renamed from: O */
    private int f7380O = 0;

    /* renamed from: P */
    private int f7381P = 0;

    /* renamed from: Q */
    private Object f7382Q = new Object();

    /* renamed from: R */
    private Object f7383R = new Object();

    /* renamed from: S */
    private int f7384S = 0;

    /* renamed from: a */
    int f7385a = -1;

    /* renamed from: b */
    int f7386b = -1;
    /* renamed from: d */
    public String f7387d = null;

    /* renamed from: e */
    private HttpServer f7388e = null;

    /* renamed from: f */
    private Camera f7389f = null;

    /* renamed from: g */
    private int f7390g = 0;

    /* renamed from: h */
    private int f7391h = -1;

    /* renamed from: i */
    private /*C2706h*/h f7392i = null;

    /* renamed from: j */
    private boolean f7393j = false;
    /* renamed from: k */
    public volatile int f7394k = 0;

    /* renamed from: l */
    private int f7395l = 60;

    /* renamed from: m */
    private volatile int f7396m = -1;

    /* renamed from: n */
    private volatile int f7397n = -1;

    /* renamed from: o */
    private volatile SurfaceHolder f7398o = null;

    /* renamed from: p */
    private volatile boolean f7399p = false;

    /* renamed from: q */
    private volatile boolean f7400q = false;

    /* renamed from: r */
    private volatile boolean f7401r = false;

    /* renamed from: s */
    private CameraManager f7402s = null;

    /* renamed from: t */
    private String f7403t = "";

    /* renamed from: u */
    private int f7404u = 0;

    /* renamed from: v */
    private int f7405v = 0;

    /* renamed from: w */
    private /*C2706h*/h[] f7406w = null;

    /* renamed from: x */
    private List</*C2706h*/h> f7407x = new ArrayList();

    /* renamed from: y */
    private CameraDevice.StateCallback f7408y = null;
    /* renamed from: z */
    public CameraDevice f7409z = null;

    /* renamed from: ru.proghouse.robocam.a$a */
    public interface C2676a {
        /* renamed from: a */
        Bitmap mo7665a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo7666a(Activity activity);
    }

    C2671a() {
    }

    /* renamed from: a */
    public static C2671a m10540a() {
        return f7365c;
    }

    /* renamed from: a */
    public void m10541a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23 && obj != null) {
            Image image = (Image) obj;
            this.f7377L++;
            if (this.f7377L == Integer.MAX_VALUE) {
                this.f7377L = Integer.MIN_VALUE;
            }
            if (this.f7377L == 0) {
                this.f7377L++;
            }
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
            ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
            int remaining = buffer.remaining();
            if (this.f7378M[this.f7379N].f7577f == null || this.f7378M[this.f7379N].f7577f.length != remaining) {
                this.f7378M[this.f7379N].f7577f = new byte[remaining];
            }
            buffer.rewind();
            buffer.get(this.f7378M[this.f7379N].f7577f);
            int remaining2 = buffer2.remaining();
            if (this.f7378M[this.f7379N].f7578g == null || this.f7378M[this.f7379N].f7578g.length != remaining2) {
                this.f7378M[this.f7379N].f7578g = new byte[remaining2];
            }
            buffer2.rewind();
            buffer2.get(this.f7378M[this.f7379N].f7578g);
            int remaining3 = buffer3.remaining();
            if (this.f7378M[this.f7379N].f7579h == null || this.f7378M[this.f7379N].f7579h.length != remaining3) {
                this.f7378M[this.f7379N].f7579h = new byte[buffer3.remaining()];
            }
            buffer3.rewind();
            buffer3.get(this.f7378M[this.f7379N].f7579h);
            this.f7378M[this.f7379N].f7580i = image.getPlanes()[1].getRowStride();
            this.f7378M[this.f7379N].f7581j = image.getPlanes()[1].getPixelStride();
            this.f7378M[this.f7379N].f7582k = image.getPlanes()[2].getRowStride();
            this.f7378M[this.f7379N].f7583l = image.getPlanes()[2].getPixelStride();
            this.f7378M[this.f7379N].f7584m = image.getWidth();
            this.f7378M[this.f7379N].f7585n = image.getHeight();
            this.f7378M[this.f7379N].f7572a = true;
            this.f7378M[this.f7379N].f7587p = this.f7377L;
            synchronized (this.f7382Q) {
                this.f7380O = this.f7379N;
                this.f7379N++;
                if (this.f7379N >= this.f7378M.length) {
                    this.f7379N = 0;
                }
                if (this.f7379N == this.f7381P) {
                    this.f7379N++;
                    if (this.f7379N >= this.f7378M.length) {
                        this.f7379N = 0;
                    }
                }
            }
        }
    }

    /* INFO: additional move instructions added (1) to help type inference */
    /* WARN: Failed to insert an additional move for type inference into block B:36:0x0046 */
    /* WARN: Failed to insert an additional move for type inference into block B:35:0x0046 */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: byte} */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: int} */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: byte} */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: byte} */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: byte} */
    /* DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
    /* WARN: Multi-variable type inference failed */
    /* WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r5v7, types: [byte, int] */
    /* renamed from: a */
    private void m10544a(int[] iArr, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (i5 == 270 || i5 == 90) {
            i6 = i4;
            i4 = i3;
        } else {
            i6 = i3;
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < i4) {
            int i11 = 0;
            int i12 = i10;
            while (i11 < i6) {
                if (i5 == 180) {
                    i8 = (i6 - i11) - 1;
                    i7 = (i4 - i9) - 1;
                } else if (i5 == 90) {
                    i7 = (i6 - i11) - 1;
                    i8 = i9;
                } else if (i5 == 270) {
                    i8 = (i4 - i9) - 1;
                    i7 = i11;
                } else {
                    i7 = i9;
                    i8 = i11;
                }
                byte b = bArr[(i7 * i3) + i8];
                int i13 = b;
                if (b < 0) {
                    i13 = b + 256;
                }
                int i14 = ((i8 / 2) * i2) + ((i7 / 2) * i);
                byte b2 = bArr2[i14];
                int i15 = b2;
                if (b2 < 0) {
                    i15 = b2 + 256;
                }
                int i16 = bArr3[i14];
                if (i16 < 0) {
                    i16 += 256;
                }
                int max = Math.max(0, Math.min(255, (int) (((float) i13) + (1.402f * (((float) i16) - 128.0f)))));
                iArr[i12] = (Math.max(0, Math.min(255, (int) (((((float) i15) - 128.0f) * 1.772f) + ((float) i13)))) & 255) | ((Math.max(0, Math.min(255, (int) ((((float) i13) - (0.34414f * (((float) i15) - 128.0f))) - ((((float) i16) - 128.0f) * 0.71414f)))) << 8) & 65280) | ((max << 16) & 16711680) | -16777216;
                i11++;
                i12++;
            }
            i9++;
            i10 = i12;
        }
    }

    /* renamed from: b */
    private int m10545b(Activity activity) {
        int i;
        int i2 = 90;
        boolean z = false;
        synchronized (HttpServer.a) {
            this.f7399p = false;
            this.f7400q = false;
            if ((this.f7389f == null || this.f7393j) && this.f7409z == null) {
                return this.f7396m;
            }
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            switch (rotation) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 90;
                    break;
                case 2:
                    i = 180;
                    break;
                case 3:
                    i = 270;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.f7405v == 0 || this.f7405v == 1) {
                    i2 = (360 - i) % 360;
                    if ((rotation == 1 || rotation == 3) && this.f7405v == 0) {
                        z = true;
                    }
                    this.f7400q = z;
                } else {
                    i2 = 0;
                }
            } else if (Build.VERSION.SDK_INT >= 9) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(this.f7390g, cameraInfo);
                if (cameraInfo.facing == 1) {
                    i2 = (360 - ((cameraInfo.orientation + i) % 360)) % 360;
                    if (rotation == 0) {
                        z = true;
                    }
                    this.f7399p = z;
                } else {
                    i2 = ((cameraInfo.orientation - i) + 360) % 360;
                }
            } else if (activity.getResources().getConfiguration().orientation == 2) {
                i2 = i - 90;
            }
            this.f7397n = rotation;
            return i2;
        }
    }

    /* renamed from: p */
    private void m10552p() {
        if (Build.VERSION.SDK_INT >= 23 && this.f7408y == null) {
            this.f7408y = new CameraDevice.StateCallback() {
                /* class ru.proghouse.robocam.C2671a.C26721 */

                public void onDisconnected(CameraDevice cameraDevice) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        cameraDevice.close();
                        CameraDevice unused = C2671a.this.f7409z = (CameraDevice) null;
                    }
                }

                public void onError(CameraDevice cameraDevice, int i) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        cameraDevice.close();
                        CameraDevice unused = C2671a.this.f7409z = (CameraDevice) null;
                    }
                }

                public void onOpened(CameraDevice cameraDevice) {
                    CameraDevice unused = C2671a.this.f7409z = cameraDevice;
                    C2671a.this.m10554r();
                }
            };
        }
    }

    /* renamed from: q */
    private /*C2706h*/h m10553q() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = this.f7392i./*f7567a*/ a;
        int i2 = this.f7392i./*f7568b*/ b;
        /*C2706h*/h[] hVarArr = this.f7406w;
        for (/*C2706h*/h hVar : hVarArr) {
            if (hVar./*/*f7568b*/ b == (hVar./*/*f7567a*/ a * i2) / i) {
                if (hVar./*/*f7567a*/ a < i || hVar./*/*f7568b*/ b < i2) {
                    arrayList2.add(hVar);
                } else {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList.size() > 0 ? (/*C2706h*/h) Collections.min(arrayList, new C2697b()) : arrayList2.size() > 0 ? (/*C2706h*/h) Collections.max(arrayList2, new C2697b()) : this.f7392i;
    }

    /* renamed from: r */
    public void m10554r() {
        try {
            if (Build.VERSION.SDK_INT >= 23 && this.f7409z != null && this.f7366A == null && !this.f7393j) {
                /*C2706h*/ru.proghouse.robocam.h q = m10553q();
                this.f7372G.setDefaultBufferSize(q./*/*f7567a*/ a, q./*/*f7568b*/ b);
                Surface surface = new Surface(this.f7372G);
                Surface surface2 = this.f7373H.getSurface();
                this.f7367B = (CaptureRequest.Builder) CameraDevice.class.getMethod("createCaptureRequest", Integer.TYPE).invoke(this.f7409z, 1);
                this.f7367B.addTarget(surface);
                this.f7367B.addTarget(surface2);
                this.f7409z.createCaptureSession(Arrays.asList(surface2, surface), new CameraCaptureSession.StateCallback() {
                    /* class ru.proghouse.robocam.C2671a.C26732 */

                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        String unused = C2671a.this.f7387d = "Preview configure failed.";
                    }

                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        try {
                            if (Build.VERSION.SDK_INT >= 23) {
                                CameraCaptureSession unused = C2671a.this.f7366A = cameraCaptureSession;
                                C2671a.this.f7367B.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
                                C2671a.this.f7367B.set(CaptureRequest.CONTROL_MODE, 1);
                                C2671a.this.f7367B.set(CaptureRequest.CONTROL_EFFECT_MODE, 0);
                                C2671a.this.f7367B.set(CaptureRequest.CONTROL_AWB_MODE, 1);
                                C2671a.this.f7367B.set(CaptureRequest.CONTROL_AE_MODE, 1);
                                C2671a.this.f7367B.set(CaptureRequest.CONTROL_AF_MODE, 3);
                                CaptureRequest unused2 = C2671a.this.f7368C = C2671a.this.f7367B.build();
                                C2671a.this.f7366A.setRepeatingRequest(C2671a.this.f7368C, C2671a.this.f7369D, C2671a.this.f7370E);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: s */
    private void m10555s() {
        if (Build.VERSION.SDK_INT >= 23 && this.f7369D == null) {
            this.f7369D = new CameraCaptureSession.CaptureCallback() {
                /* class ru.proghouse.robocam.C2671a.C26743 */
            };
        }
    }

    /* renamed from: t */
    private void m10556t() {
        if (this.f7371F == null) {
            this.f7371F = new HandlerThread("PreviewBackground");
            this.f7371F.start();
            this.f7370E = new Handler(this.f7371F.getLooper());
        }
    }

    /* renamed from: u */
    private void m10557u() {
        if (this.f7371F != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.f7371F.quitSafely();
            } else {
                this.f7371F.quit();
            }
            try {
                this.f7371F.join();
                this.f7371F = null;
                this.f7370E = null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: v */
    private /*C2706h*/h m10558v() {
        if (this.f7407x == null || this.f7407x.size() == 0) {
            return null;
        }
        if (this.f7391h < 0) {
            /*C2706h*/ru.proghouse.robocam.h hVar = this.f7407x.get(0);
            /*C2706h*/ru.proghouse.robocam.h hVar2 = this.f7407x.get(this.f7407x.size() - 1);
            int round = Math.round(((float) this.f7407x.size()) / 3.0f);
            if (hVar./*f7567a*/ a > hVar2./*f7567a*/ a || hVar./*f7568b*/ b > hVar2./*f7568b*/ b) {
                this.f7391h = this.f7407x.size() - round;
            } else {
                this.f7391h = round - 1;
            }
        }
        if (this.f7391h < 0) {
            this.f7391h = 0;
        }
        if (this.f7391h >= this.f7407x.size()) {
            this.f7391h = this.f7407x.size() - 1;
        }
        return this.f7407x.get(this.f7391h);
    }

    /* renamed from: w */
    private void m10559w() {
        if (Build.VERSION.SDK_INT >= 23 && this.f7374I == null) {
            this.f7374I = new ImageReader.OnImageAvailableListener() {
                /* class ru.proghouse.robocam.C2671a.C26754 */

                public void onImageAvailable(ImageReader imageReader) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            Image acquireLatestImage = imageReader.acquireLatestImage();
                            if (acquireLatestImage != null) {
                                if (C2671a.this.f7394k > 0) {
                                    C2671a.this.m10541a(acquireLatestImage);
                                }
                                acquireLatestImage.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    public int mo7634a(OutputStream outputStream, String str, int i) {
        byte[] bArr;
        //ToDo: initialized...
        int i2 = 0;
        Bitmap bitmap;
        boolean z;
        byte[] bArr2;
        synchronized (this.f7382Q) {
            if (this.f7378M[this.f7381P].f7587p == 0 && this.f7378M[this.f7380O].f7587p == 0) {
                i2 = 0;
            } else {
                if (this.f7378M[this.f7381P].f7587p == 0) {
                    this.f7381P = this.f7380O;
                }
                if (this.f7384S <= 0 || this.f7378M[this.f7381P].f7587p != i) {
                    if (this.f7384S == 0) {
                        this.f7381P = this.f7380O;
                    }
                    this.f7384S++;
                    try {
                        synchronized (this.f7383R) {
                            if (this.f7378M[this.f7381P].f7587p == i) {
                                bArr = null;
                            } else if (this.f7378M[this.f7381P].f7574c != this.f7378M[this.f7381P].f7587p) {
                                int i3 = 0;
                                if (this.f7396m != 0 || Build.VERSION.SDK_INT >= 23) {
                                    i3 = this.f7399p ? this.f7396m + 180 : this.f7400q ? ((this.f7396m + this.f7404u) + 180) % 360 : (this.f7396m + this.f7404u) % 360;
                                }
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                if (this.f7378M[this.f7381P].f7575d != null) {
                                    new YuvImage(this.f7378M[this.f7381P].f7575d, 17, this.f7378M[this.f7381P].f7584m, this.f7378M[this.f7381P].f7585n, null).compressToJpeg(new Rect(0, 0, this.f7378M[this.f7381P].f7584m, this.f7378M[this.f7381P].f7585n), i3 == 0 ? this.f7395l : 100, byteArrayOutputStream);
                                    bitmap = null;
                                    z = true;
                                    bArr2 = byteArrayOutputStream.toByteArray();
                                } else if (this.f7378M[this.f7381P].f7577f != null && this.f7378M[this.f7381P].f7578g != null && this.f7378M[this.f7381P].f7579h != null) {
                                    try {
                                        if (!this.f7375J || this.f7376K == null) {
                                            int[] iArr = new int[(this.f7378M[this.f7381P].f7584m * this.f7378M[this.f7381P].f7585n)];
                                            m10544a(iArr, this.f7378M[this.f7381P].f7577f, this.f7378M[this.f7381P].f7578g, this.f7378M[this.f7381P].f7579h, this.f7378M[this.f7381P].f7580i, this.f7378M[this.f7381P].f7581j, this.f7378M[this.f7381P].f7584m, this.f7378M[this.f7381P].f7585n, i3);
                                            bitmap = (i3 == 270 || i3 == 90) ? Bitmap.createBitmap(iArr, this.f7378M[this.f7381P].f7585n, this.f7378M[this.f7381P].f7584m, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(iArr, this.f7378M[this.f7381P].f7584m, this.f7378M[this.f7381P].f7585n, Bitmap.Config.ARGB_8888);
                                        } else {
                                            bitmap = this.f7376K.mo7665a(this.f7378M[this.f7381P].f7577f, this.f7378M[this.f7381P].f7578g, this.f7378M[this.f7381P].f7579h, this.f7378M[this.f7381P].f7580i, this.f7378M[this.f7381P].f7581j, this.f7378M[this.f7381P].f7584m, this.f7378M[this.f7381P].f7585n, i3);
                                        }
                                        z = false;
                                        bArr2 = null;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        bitmap = null;
                                        z = true;
                                        bArr2 = null;
                                    }
                                } else if (this.f7378M[this.f7381P].f7576e != null) {
                                    bitmap = null;
                                    z = true;
                                    bArr2 = this.f7378M[this.f7381P].f7576e;
                                } else {
                                    bitmap = null;
                                    z = true;
                                    bArr2 = null;
                                }
                                if (z && !(i3 == 0 && this.f7378M[this.f7381P].f7576e == null)) {
                                    if (bArr2 != null) {
                                        bitmap = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                                    }
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate((float) i3);
                                    bitmap = Bitmap.createBitmap(bitmap, 0, 0, this.f7378M[this.f7381P].f7584m, this.f7378M[this.f7381P].f7585n, matrix, true);
                                }
                                if (bitmap != null) {
                                    byteArrayOutputStream.reset();
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, this.f7395l, byteArrayOutputStream);
                                    bArr = byteArrayOutputStream.toByteArray();
                                } else {
                                    bArr = bArr2;
                                }
                                this.f7378M[this.f7381P].f7574c = this.f7378M[this.f7381P].f7587p;
                                this.f7378M[this.f7381P].f7573b = bArr;
                            } else {
                                bArr = this.f7378M[this.f7381P].f7573b;
                            }
                        }
                        if (bArr != null) {
                            outputStream.write(("Content-type: image/jpeg\r\nContent-Length: " + bArr.length + "\r\n\r\n").getBytes());
                            outputStream.write(bArr);
                            outputStream.write("\r\n".getBytes());
                            outputStream.flush();
                        }
                        synchronized (this.f7382Q) {
                            i2 = this.f7378M[this.f7381P].f7587p;
                            this.f7384S--;
                        }
                    } catch (Throwable th) {
                        synchronized (this.f7382Q) {
                            int i4 = this.f7378M[this.f7381P].f7587p;
                            this.f7384S--;
                            try {
                                throw th;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } else {
                    i2 = this.f7378M[this.f7381P].f7587p;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void mo7635a(Activity activity, SurfaceTexture surfaceTexture) {
        synchronized (HttpServer.a) {
            mo7639a(this.f7372G);
            mo7642b(activity, surfaceTexture);
        }
    }

    /* renamed from: a */
    public void mo7636a(Activity activity, SurfaceHolder surfaceHolder) {
        synchronized (HttpServer.a) {
            mo7640a(this.f7398o);
            mo7643b(activity, surfaceHolder);
        }
    }

    /* renamed from: a */
    public void mo7637a(Activity activity, View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            TextureView textureView = (TextureView) view;
            int b = m10545b(activity);
            Matrix matrix = new Matrix();
            RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            if (b == 90 || b == 270) {
                RectF rectF2 = new RectF(0.0f, 0.0f, (float) this.f7392i./*f7568b*/ b, (float) this.f7392i./*f7567a*/ a);
                rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                float max = Math.max(((float) i2) / ((float) this.f7392i./*f7568b*/ b), ((float) i) / ((float) this.f7392i./*f7567a*/ a));
                matrix.postScale(max, max, centerX, centerY);
                matrix.postRotate((float) b, centerX, centerY);
            } else {
                matrix.postRotate((float) b, centerX, centerY);
            }
            textureView.setTransform(matrix);
        }
    }

    /* renamed from: a */
    public void mo7638a(Activity activity, boolean z) {
        this.f7401r = z;
        if (!mo7644b() && this.f7372G != null) {
            mo7642b(activity, this.f7372G);
        }
    }

    /* renamed from: a */
    public void mo7639a(SurfaceTexture surfaceTexture) {
        synchronized (HttpServer.a) {
            if (Build.VERSION.SDK_INT >= 23 && this.f7409z != null && this.f7372G != null && surfaceTexture == this.f7372G) {
                this.f7401r = false;
                if (this.f7366A != null) {
                    this.f7366A.close();
                    this.f7366A = null;
                }
                if (this.f7409z != null) {
                    try {
                        CameraDevice.class.getMethod("close", new Class[0]).invoke(this.f7409z, new Object[0]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    this.f7409z = null;
                }
                if (this.f7373H != null) {
                    this.f7373H.close();
                    this.f7373H = null;
                }
                m10557u();
                this.f7372G = null;
            }
        }
    }

    /* renamed from: a */
    public void mo7640a(SurfaceHolder surfaceHolder) {
        synchronized (HttpServer.a) {
            if (!(this.f7389f == null || this.f7398o == null || surfaceHolder != this.f7398o)) {
                mo7656n();
                this.f7389f.release();
                this.f7389f = null;
                this.f7398o = null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo7641a(Activity activity) {
        boolean z = false;
        synchronized (HttpServer.a) {
            this.f7399p = false;
            int i = this.f7396m;
            this.f7396m = m10545b(activity);
            if (this.f7389f != null) {
                this.f7389f.setDisplayOrientation(this.f7396m);
            }
            if (i != this.f7396m) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo7642b(Activity activity, SurfaceTexture surfaceTexture) {
        synchronized (HttpServer.a) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    this.f7376K = (C2676a) Class.forName("ru.proghouse.robocam.C2707i").newInstance();
                    this.f7376K.mo7666a(activity);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f7372G = surfaceTexture;
                SharedPreferences sharedPreferences = activity.getSharedPreferences("RoboCamSettings", 0);
                this.f7391h = sharedPreferences.getInt("preview_size", -1);
                this.f7375J = sharedPreferences.getBoolean("use_render_script", true);
                this.f7395l = sharedPreferences.getInt("jpeg_quality", 60);
                if (ActivityCompat.checkSelfPermission((Context) activity, "android.permission.CAMERA") == 0) {
                    this.f7402s = (CameraManager) activity.getSystemService("camera");
                    try {
                        this.f7403t = sharedPreferences.getString("camera2_id", null);
                        if (this.f7403t == null) {
                            this.f7403t = this.f7402s.getCameraIdList()[0];
                        }
                        CameraCharacteristics cameraCharacteristics = this.f7402s.getCameraCharacteristics(this.f7403t);
                        this.f7404u = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                        this.f7405v = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                        this.f7406w = new /*C2706h*/h[outputSizes.length];
                        HashSet hashSet = new HashSet();
                        for (int i = 0; i < outputSizes.length; i++) {
                            this.f7406w[i] = new /*C2706h*/h(outputSizes[i]);
                            hashSet.add(Float.valueOf(((float) outputSizes[i].getHeight()) / ((float) outputSizes[i].getWidth())));
                        }
                        Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(35);
                        this.f7407x.clear();
                        for (int i2 = 0; i2 < outputSizes2.length; i2++) {
                            if (hashSet.contains(Float.valueOf(((float) outputSizes2[i2].getHeight()) / ((float) outputSizes2[i2].getWidth())))) {
                                this.f7407x.add(new /*C2706h*/h(outputSizes2[i2]));
                            }
                        }
                        Collections.sort(this.f7407x, new C2697b());
                        this.f7392i = m10558v();
                        m10552p();
                        m10555s();
                        m10556t();
                        m10559w();
                        this.f7373H = ImageReader.newInstance(this.f7392i./*f7567a*/ a, this.f7392i./*f7568b*/ b, 35, 2);
                        this.f7373H.setOnImageAvailableListener(this.f7374I, this.f7370E);
                        this.f7402s.openCamera(this.f7403t, this.f7408y, this.f7370E);
                    } catch (Exception e2) {
                        this.f7387d = e2.getMessage();
                        e2.printStackTrace();
                    }
                } else if (ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.CAMERA")) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("message_id", R.string.request_camera_permission);
                    bundle.putStringArray("permissions", new String[]{"android.permission.CAMERA"});
                    bundle.putInt("request_code", 1);
                    C2698c cVar = new C2698c();
                    cVar.setArguments(bundle);
                    cVar.show(activity.getFragmentManager(), "dialog");
                } else {
                    ActivityCompat.requestPermissions(activity, new String[]{"android.permission.CAMERA"}, 1);
                }
            }
        }
    }

    /* WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* renamed from: b */
    public void mo7643b(Activity activity, SurfaceHolder surfaceHolder) {
        synchronized (HttpServer.a) {
            if (Build.VERSION.SDK_INT < 23) {
                this.f7398o = surfaceHolder;
                SharedPreferences sharedPreferences = activity.getSharedPreferences("RoboCamSettings", 0);
                this.f7391h = sharedPreferences.getInt("preview_size", -1);
                this.f7395l = sharedPreferences.getInt("jpeg_quality", 60);
                if (Build.VERSION.SDK_INT >= 9) {
                    this.f7390g = sharedPreferences.getInt("camera_id", 0);
                    this.f7389f = Camera.open(this.f7390g);
                    this.f7395l = sharedPreferences.getInt("jpeg_quality", 60);
                } else if (this.f7390g == 0) {
                    this.f7389f = Camera.open();
                } else {
                    this.f7387d = this.f7388e.getString(R.string.error_only_back_facing_camera_supported);
                    return;
                }
                if (this.f7389f != null) {
                    List<Camera.Size> supportedPreviewSizes = this.f7389f.getParameters().getSupportedPreviewSizes();
                    this.f7407x.clear();
                    for (int i = 0; i < supportedPreviewSizes.size(); i++) {
                        this.f7407x.add(new /*C2706h*/h(supportedPreviewSizes.get(i)));
                    }
                    try {
                        this.f7389f.setPreviewDisplay(surfaceHolder);
                    } catch (IOException e) {
                        this.f7387d = e.getMessage();
                        e.printStackTrace();
                        this.f7389f.release();
                        this.f7389f = null;
                    }
                    mo7655m();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo7644b() {
        boolean z = true;
        synchronized (HttpServer.a) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.f7409z == null) {
                    z = false;
                }
            } else if (this.f7389f == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public /*C2706h*/h mo7645c() {
        /*C2706h*/h hVar;
        synchronized (HttpServer.a) {
            hVar = this.f7392i;
        }
        return hVar;
    }

    /* renamed from: d */
    public int mo7646d() {
        int i;
        synchronized (HttpServer.a) {
            i = this.f7392i./*f7567a*/ a;
        }
        return i;
    }

    /* renamed from: e */
    public int mo7647e() {
        int i;
        synchronized (HttpServer.a) {
            i = this.f7392i./*f7568b*/ b;
        }
        return i;
    }

    /* renamed from: f */
    public int mo7648f() {
        //ToDO: initialized...
        int i = 0;
        int i2 = -1;
        synchronized (HttpServer.a) {
            if (Build.VERSION.SDK_INT >= 23) {
                i = (this.f7397n == 0 || this.f7397n == 2) ? mo7647e() : mo7646d();
            } else if (mo7653k() && mo7654l() != -1) {
                i2 = mo7654l() % 180 == 0 ? mo7646d() : mo7647e();
            }
        }
        return i;
    }

    /* renamed from: g */
    public int mo7649g() {
        //ToDo: initialized...
        int i = 0;
        int i2 = -1;
        synchronized (HttpServer.a) {
            if (Build.VERSION.SDK_INT >= 23) {
                i = (this.f7397n == 0 || this.f7397n == 2) ? mo7646d() : mo7647e();
            } else if (mo7653k() && mo7654l() != -1) {
                i2 = mo7654l() % 180 == 0 ? mo7647e() : mo7646d();
            }
        }
        return i;
    }

    /* renamed from: h */
    public void mo7650h() {
        if (this.f7394k == 0) {
            this.f7384S = 0;
            for (C2708j jVar : this.f7378M) {
                jVar.mo7827a();
            }
        }
        this.f7394k++;
    }

    /* renamed from: i */
    public void mo7651i() {
        this.f7394k--;
    }

    /* renamed from: j */
    public boolean mo7652j() {
        return this.f7401r;
    }

    /* renamed from: k */
    public boolean mo7653k() {
        return this.f7393j;
    }

    /* renamed from: l */
    public int mo7654l() {
        return this.f7396m;
    }

    /* renamed from: m */
    public void mo7655m() {
        synchronized (HttpServer.a) {
            if (this.f7389f != null) {
                this.f7389f.setPreviewCallback(this);
                this.f7389f.startPreview();
                this.f7393j = true;
            }
        }
    }

    /* renamed from: n */
    public void mo7656n() {
        synchronized (HttpServer.a) {
            if (this.f7389f != null) {
                this.f7393j = false;
                this.f7389f.stopPreview();
                this.f7389f.setPreviewCallback(null);
            }
        }
    }


    /* WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* renamed from: o */
    public boolean mo7657o() {
        int i = -1;
        boolean z = false;
        synchronized (HttpServer.a) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.f7409z == null) {
                }
                this.f7392i = m10558v();
                for (C2708j jVar : this.f7378M) {
                    jVar.mo7827a();
                }
                if (Build.VERSION.SDK_INT < 23) {
                    Camera.Parameters parameters = this.f7389f.getParameters();
                    parameters.setPreviewSize(this.f7392i./*f7567a*/ a, this.f7392i./*f7568b*/ b);
                    parameters.setJpegQuality(100);
                    this.f7389f.setParameters(parameters);
                }
                if (!(this.f7385a == this.f7392i./*f7567a*/ a && this.f7386b == this.f7392i./*f7568b*/ b)) {
                    z = true;
                }
                this.f7385a = this.f7392i != null ? -1 : this.f7392i./*f7567a*/ a;
                if (this.f7392i != null) {
                    i = this.f7392i./*f7568b*/ b;
                }
                this.f7386b = i;
            } else {
                if (this.f7389f == null || this.f7393j) {
                }
                this.f7392i = m10558v();
                /*while (r2 < r5) {
                }*/
                if (Build.VERSION.SDK_INT < 23) {
                }
                z = true;
                this.f7385a = this.f7392i != null ? -1 : this.f7392i./*f7567a*/ a;
                if (this.f7392i != null) {
                }
                this.f7386b = i;
            }
        }
        return z;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.f7394k > 0 && this.f7393j) {
            this.f7377L++;
            if (this.f7377L == Integer.MAX_VALUE) {
                this.f7377L = Integer.MIN_VALUE;
            }
            if (this.f7377L == 0) {
                this.f7377L++;
            }
            if (!this.f7378M[this.f7379N].f7572a) {
                this.f7378M[this.f7379N].f7584m = camera.getParameters().getPreviewSize().width;
                this.f7378M[this.f7379N].f7585n = camera.getParameters().getPreviewSize().height;
                this.f7378M[this.f7379N].f7572a = true;
            }
            if (this.f7378M[this.f7379N].f7575d == null || this.f7378M[this.f7379N].f7575d.length != bArr.length) {
                this.f7378M[this.f7379N].f7575d = (byte[]) bArr.clone();
            } else {
                System.arraycopy(bArr, 0, this.f7378M[this.f7379N].f7575d, 0, bArr.length);
            }
            this.f7378M[this.f7379N].f7587p = this.f7377L;
            synchronized (this.f7382Q) {
                this.f7380O = this.f7379N;
                this.f7379N++;
                if (this.f7379N >= this.f7378M.length) {
                    this.f7379N = 0;
                }
                if (this.f7379N == this.f7381P) {
                    this.f7379N++;
                    if (this.f7379N >= this.f7378M.length) {
                        this.f7379N = 0;
                    }
                }
            }
        }
    }
}
