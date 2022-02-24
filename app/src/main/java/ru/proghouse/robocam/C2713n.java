package ru.proghouse.robocam;

/* renamed from: ru.proghouse.robocam.n */
public class C2713n {
    /* renamed from: a */
    public static float m10943a(String str, float f) {
        if (str == null || str.length() == 0) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            return f;
        }
    }

    /* renamed from: a */
    public static int m10944a(String str, int i) {
        if (str == null || str.length() == 0) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m10945a(String str, String str2) {
        return (str == null || str.length() == 0) ? str2 : str;
    }

    /* renamed from: a */
    public static boolean m10946a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return z;
        }
        if (str.trim().equals("true") || str.equals("1")) {
            return true;
        }
        if (str.trim().equals("false") || str.equals("0")) {
            return false;
        }
        return z;
    }
}
