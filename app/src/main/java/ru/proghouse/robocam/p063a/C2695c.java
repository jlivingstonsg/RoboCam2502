package ru.proghouse.robocam.p063a;

import java.util.HashSet;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: ru.proghouse.robocam.a.c */
public class C2695c {

    /* renamed from: a */
    private boolean f7546a = false;

    /* renamed from: b */
    private String f7547b = "";

    /* renamed from: c */
    private HashSet<Integer> f7548c = new HashSet<>();

    /* renamed from: a */
    public static void m10871a(Element element, HashSet<Integer> hashSet, String str) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Integer valueOf = Integer.valueOf(((Element) elementsByTagName.item(i)).getTextContent());
            if (valueOf.intValue() > 0 && valueOf.intValue() <= 255) {
                hashSet.add(valueOf);
            }
        }
    }

    /* renamed from: a */
    public void mo7801a(boolean z) {
        this.f7546a = z;
    }

    /* renamed from: b */
    public void mo7802b(String str) {
        this.f7547b = str;
    }

    /* renamed from: j */
    public boolean mo7803j() {
        return this.f7546a;
    }

    /* renamed from: k */
    public String mo7804k() {
        return this.f7547b;
    }

    /* renamed from: l */
    public HashSet<Integer> mo7805l() {
        return this.f7548c;
    }
}
