package ru.proghouse.robocam;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

/* renamed from: ru.proghouse.robocam.d */
public class C2701d extends ArrayAdapter {

    /* renamed from: a */
    private Activity f7552a;

    /* renamed from: b */
    private Spinner f7553b;

    /* renamed from: c */
    private int f7554c;

    /* renamed from: d */
    private int f7555d;

    /* renamed from: e */
    private List<String> f7556e;

    /* renamed from: f */
    private int f7557f;

    public C2701d(Activity activity, Spinner spinner, int i, List<String> list, int i2) {
        super(activity, i, list);
        this.f7552a = activity;
        this.f7553b = spinner;
        this.f7554c = i;
        this.f7556e = list;
        this.f7557f = i2;
    }

    /* renamed from: a */
    public Activity mo7811a() {
        return this.f7552a;
    }

    /* renamed from: a */
    public void mo7812a(int i) {
        this.f7557f = i;
    }

    /* renamed from: b */
    public List<String> mo7813b() {
        return this.f7556e;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7552a.getLayoutInflater().inflate(this.f7555d, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(16908308);
        if (textView != null) {
            textView.setText(this.f7556e.get(i));
        } else {
            TextView textView2 = (TextView) view.findViewById(R.id.textView1);
            TextView textView3 = (TextView) view.findViewById(R.id.textView2);
            if (textView3 == null) {
                textView2.setText(this.f7556e.get(i));
                if (this.f7553b == null || this.f7553b.getSelectedItemPosition() != i) {
                    textView2.setBackgroundColor(-1);
                } else {
                    textView2.setBackgroundColor(-3355444);
                }
            } else {
                textView2.setText(this.f7557f);
                textView3.setText(this.f7556e.get(i));
            }
        }
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7552a.getLayoutInflater().inflate(this.f7554c, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(16908308);
        if (textView != null) {
            textView.setText(this.f7556e.get(i));
        } else {
            TextView textView2 = (TextView) view.findViewById(R.id.textView1);
            TextView textView3 = (TextView) view.findViewById(R.id.textView2);
            if (textView3 == null) {
                textView2.setText(this.f7556e.get(i));
            } else {
                textView2.setText(this.f7557f);
                textView3.setText(this.f7556e.get(i));
            }
        }
        return view;
    }

    public void setDropDownViewResource(int i) {
        this.f7555d = i;
        super.setDropDownViewResource(i);
    }
}
