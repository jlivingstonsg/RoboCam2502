package ru.proghouse.robocam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.HashSet;
import ru.proghouse.robocam.p063a.p065b.C2693f;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.SelectKeyActivity */
public class SelectKeyActivity extends AppCompatActivity {

    /* renamed from: n */
    HashSet<Integer> f7320n = new HashSet<>();

    /* renamed from: o */
    ListView f7321o;

    /* renamed from: p */
    TextView f7322p;

    /* renamed from: q */
    Activity f7323q;

    /* renamed from: r */
    String f7324r;

    /* renamed from: c */
    private int m10520c(int i) {
        if (i >= 29 && i <= 54) {
            return (i - 29) + 65;
        }
        if (i >= 7 && i <= 16) {
            return (i - 7) + 48;
        }
        if (i == 112) {
            return 46;
        }
        if (i == 67) {
            return 8;
        }
        if (i == 124) {
            return 45;
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
        return 0;
    }

    /* renamed from: j */
    public void mo7613j() {
        if (this.f7320n.size() == 0) {
            this.f7322p.setText(R.string.nothing_selected);
            return;
        }
        this.f7322p.setText(getString(R.string.selected, new Object[]{C2693f.m10819a(this.f7323q, this.f7320n)}));
    }

    public void onCancelButtonClick(View view) {
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_select_key);
        this.f7323q = this;
        this.f7324r = getIntent().getStringExtra("android.intent.extra.remote_intent_token");
        setTitle(getIntent().getStringExtra("android.intent.extra.TEXT"));
        if (bundle != null) {
            C2693f.m10821a(bundle.getIntArray("SettingsKeys"), this.f7320n);
        } else {
            C2693f.m10821a(getIntent().getIntArrayExtra("android.intent.extra.STREAM"), this.f7320n);
        }
        this.f7322p = (TextView) findViewById(R.id.titleTextView);
        ArrayAdapter<C2705g> r1 = new ArrayAdapter<C2705g>(this, R.layout.checked_listview_item, C2693f.m10820a()) {
            /* class ru.proghouse.robocam.SelectKeyActivity.C26641 */

            public View getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = SelectKeyActivity.this.getLayoutInflater().inflate(R.layout.checked_listview_item, viewGroup, false);
                }
                C2705g gVar = (C2705g) getItem(i);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkBox1);
                checkBox.setText(gVar.mo7826b());
                checkBox.setTag(new Integer(gVar.mo7825a()));
                checkBox.setChecked(SelectKeyActivity.this.f7320n.contains(Integer.valueOf(gVar.mo7825a())));
                checkBox.setOnClickListener(new View.OnClickListener() {
                    /* class ru.proghouse.robocam.SelectKeyActivity.C26641.C26651 */

                    public void onClick(View view) {
                        CheckBox checkBox = (CheckBox) view;
                        Integer num = (Integer) checkBox.getTag();
                        if (checkBox.isChecked()) {
                            SelectKeyActivity.this.f7320n.add(num);
                        } else {
                            SelectKeyActivity.this.f7320n.remove(num);
                        }
                        SelectKeyActivity.this.mo7613j();
                    }
                });
                return view;
            }
        };
        this.f7321o = (ListView) findViewById(R.id.keyListView);
        this.f7321o.setAdapter((ListAdapter) r1);
        mo7613j();
    }

    public void onDoneButtonClick(View view) {
        Intent intent = new Intent(this, SelectKeyActivity.class);
        intent.putExtra("android.intent.extra.remote_intent_token", this.f7324r);
        intent.putExtra("android.intent.extra.TEXT", getTitle().toString());
        intent.putExtra("android.intent.extra.STREAM", C2693f.m10822a(this.f7320n));
        setResult(-1, intent);
        finish();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int c = m10520c(i);
        if (!C2693f.m10824b(c)) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f7320n.contains(Integer.valueOf(c))) {
            this.f7320n.remove(Integer.valueOf(c));
        } else {
            this.f7320n.add(Integer.valueOf(c));
        }
        ((ArrayAdapter) this.f7321o.getAdapter()).notifyDataSetChanged();
        mo7613j();
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C2693f.m10821a(bundle.getIntArray("SettingsKeys"), this.f7320n);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putIntArray("SettingsKeys", C2693f.m10822a(this.f7320n));
        super.onSaveInstanceState(bundle);
    }
}
