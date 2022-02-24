package ru.proghouse.robocam.p063a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.a.d */
public class C2696d {
    /* renamed from: a */
    public static int m10877a(InputStream inputStream) {
        byte[] bArr = new byte[1];
        try {
            inputStream.read(bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bArr[0] < 0 ? bArr[0] + 256 : bArr[0];
    }

    /* renamed from: a */
    public static int m10878a(byte[] bArr, int i) {
        byte b = bArr[i];
        return b < 0 ? b + 256 : b;
    }

    /* renamed from: a */
    public static String m10879a(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (true) {
            if (i3 >= Math.min(bArr.length, i3 + i2)) {
                break;
            } else if (bArr[i3] == 0) {
                i2 = i3 - i;
                break;
            } else {
                i3++;
            }
        }
        try {
            return new String(bArr, i, i2, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //ToDo: returns null...
        return null;
    }

    /* renamed from: a */
    public static String m10880a(byte[] bArr, int i, int i2, String str) {
        int i3 = i;
        while (true) {
            if (i3 >= Math.min(bArr.length, i3 + i2)) {
                break;
            } else if (bArr[i3] == 0) {
                i2 = i3 - i;
                break;
            } else {
                i3++;
            }
        }
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //ToDo: return str...
        return str;
    }

    /* renamed from: a */
    public static void m10881a(OutputStream outputStream, byte b) {
        try {
            outputStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10882a(OutputStream outputStream, float f) {
        m10893c(outputStream, Float.floatToIntBits(f));
    }

    /* renamed from: a */
    public static void m10883a(OutputStream outputStream, int i) {
        if (i > 127) {
            i -= 256;
        }
        try {
            outputStream.write(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10884a(OutputStream outputStream, long j) {
        m10883a(outputStream, (int) (j & 255));
        m10883a(outputStream, (int) ((j >> 8) & 255));
        m10883a(outputStream, (int) ((j >> 16) & 255));
        m10883a(outputStream, (int) ((j >> 24) & 255));
    }

    /* renamed from: a */
    public static void m10885a(OutputStream outputStream, String str) {
        try {
            outputStream.write(str.getBytes("US-ASCII"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10886a(OutputStream outputStream, String str, String str2) {
        try {
            outputStream.write(str.getBytes(str2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10887a(OutputStream outputStream, short s) {
        byte[] bArr = new byte[2];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        wrap.putShort(s);
        try {
            outputStream.write(bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static int m10888b(InputStream inputStream) {
        return m10877a(inputStream) | (m10877a(inputStream) << 8);
    }

    /* renamed from: b */
    public static void m10889b(OutputStream outputStream, int i) {
        m10883a(outputStream, i & 255);
        m10883a(outputStream, (i >> 8) & 255);
    }

    /* renamed from: b */
    public static void m10890b(OutputStream outputStream, String str) {
        m10885a(outputStream, str);
        try {
            outputStream.write(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m10891b(OutputStream outputStream, String str, String str2) {
        m10886a(outputStream, str, str2);
        try {
            outputStream.write(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m10892b(byte[] bArr, int i, int i2) {
        if (i2 > 127) {
            i2 -= 256;
        }
        bArr[i] = (byte) i2;
    }

    /* renamed from: c */
    public static void m10893c(OutputStream outputStream, int i) {
        m10883a(outputStream, i & 255);
        m10883a(outputStream, (i >> 8) & 255);
        m10883a(outputStream, (i >> 16) & 255);
        m10883a(outputStream, (i >> 24) & 255);
    }

    /* renamed from: c */
    public static void m10894c(byte[] bArr, int i, int i2) {
        m10892b(bArr, i, i2 & 255);
        m10892b(bArr, i + 1, (i2 >> 8) & 255);
    }

    /* renamed from: d */
    public static void m10895d(byte[] bArr, int i, int i2) {
        m10892b(bArr, i, i2 & 255);
        m10892b(bArr, i + 1, (i2 >> 8) & 255);
        m10892b(bArr, i + 2, (i2 >> 16) & 255);
        m10892b(bArr, i + 3, (i2 >> 24) & 255);
    }
}
