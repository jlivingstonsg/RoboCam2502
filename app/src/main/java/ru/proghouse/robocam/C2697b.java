package ru.proghouse.robocam;

import java.util.Comparator;

/* renamed from: ru.proghouse.robocam.b */
class C2697b implements Comparator</*C2706h*/h> {
    C2697b() {
    }

    /* renamed from: a */
    public int compare(/*C2706h*/h hVar, /*C2706h*/h hVar2) {
        return Long.signum((((long) hVar./*f7567a*/a) * ((long) hVar./*f7568b*/b)) - (((long) hVar2./*f7567a*/a) * ((long) hVar2./*f7568b*/b)));
    }
}
