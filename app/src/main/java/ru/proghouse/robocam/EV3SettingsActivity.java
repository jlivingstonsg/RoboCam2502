package ru.proghouse.robocam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import ru.proghouse.robocam.p063a.p065b.C2687c;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.EV3SettingsActivity */
public class EV3SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: A */
    private Button f7035A = null;

    /* renamed from: B */
    private Button f7036B = null;

    /* renamed from: C */
    private Button f7037C = null;
    /* renamed from: D */
    public int[] f7038D = {0, 1, 3, 2};

    /* renamed from: n */
    private String f7039n;

    /* renamed from: o */
    private C2622b[] f7040o = new C2622b[4];

    /* renamed from: p */
    private List<C2626c> f7041p = new ArrayList();
    /* renamed from: q */
    public int f7042q = 0;

    /* renamed from: r */
    private EditText f7043r = null;

    /* renamed from: s */
    private EditText f7044s = null;

    /* renamed from: t */
    private CheckBox f7045t = null;

    /* renamed from: u */
    private CheckBox f7046u = null;

    /* renamed from: v */
    private ImageButton f7047v = null;

    /* renamed from: w */
    private CheckBox f7048w = null;

    /* renamed from: x */
    private EditText f7049x = null;

    /* renamed from: y */
    private Button f7050y = null;

    /* renamed from: z */
    private Button f7051z = null;

    /* renamed from: ru.proghouse.robocam.EV3SettingsActivity$a */
    class C2621a {

        /* renamed from: a */
        C2626c f7052a = null;

        /* renamed from: b */
        boolean f7053b = false;

        C2621a(C2626c cVar, boolean z) {
            this.f7052a = cVar;
            this.f7053b = z;
        }
    }

    /* renamed from: ru.proghouse.robocam.EV3SettingsActivity$b */
    class C2622b {

        /* renamed from: a */
        int f7055a;

        /* renamed from: b */
        public CheckBox f7056b;

        /* renamed from: c */
        public ImageView f7057c;

        /* renamed from: d */
        public Spinner f7058d;

        /* renamed from: e */
        public ImageView f7059e;

        /* renamed from: f */
        public Spinner f7060f;

        /* renamed from: g */
        public ImageView f7061g;

        /* renamed from: h */
        public Spinner f7062h;

        /* renamed from: i */
        public ImageView f7063i;

        /* renamed from: j */
        public Spinner f7064j;

        /* renamed from: k */
        public TextView f7065k;

        /* renamed from: l */
        public LinearLayout f7066l;

        /* renamed from: m */
        public LinearLayout f7067m;

        /* renamed from: n */
        public List<C2629d> f7068n;

        /* renamed from: p */
        private C2622b f7070p;

        public C2622b(Activity activity, int i) {
            this.f7070p = null;
            this.f7068n = new ArrayList();
            this.f7070p = this;
            switch (i) {
                case 0:
                    m10314a(activity, i, R.id.checkBoxJoystickVisibility1, R.id.spinnerJoystickShape1, R.id.spinnerJoystickType1, R.id.imageViewJoystickBehavior1_1, R.id.imageViewJoystickBehavior1_2, R.id.spinnerJoystickBehavior1_1, R.id.spinnerJoystickBehavior1_2, R.id.textViewJoystick1Ports, R.id.linearLayoutJoystick1Ports, R.id.imageView1_1, R.id.imageView1_2, R.id.linearLayoutJoystick1PortButtons);
                    return;
                case 1:
                    m10314a(activity, i, R.id.checkBoxJoystickVisibility2, R.id.spinnerJoystickShape2, R.id.spinnerJoystickType2, R.id.imageViewJoystickBehavior2_1, R.id.imageViewJoystickBehavior2_2, R.id.spinnerJoystickBehavior2_1, R.id.spinnerJoystickBehavior2_2, R.id.textViewJoystick2Ports, R.id.linearLayoutJoystick2Ports, R.id.imageView2_1, R.id.imageView2_2, R.id.linearLayoutJoystick2PortButtons);
                    return;
                case 2:
                    m10314a(activity, i, R.id.checkBoxJoystickVisibility3, R.id.spinnerJoystickShape3, R.id.spinnerJoystickType3, R.id.imageViewJoystickBehavior3_1, R.id.imageViewJoystickBehavior3_2, R.id.spinnerJoystickBehavior3_1, R.id.spinnerJoystickBehavior3_2, R.id.textViewJoystick3Ports, R.id.linearLayoutJoystick3Ports, R.id.imageView3_1, R.id.imageView3_2, R.id.linearLayoutJoystick3PortButtons);
                    return;
                case 3:
                    m10314a(activity, i, R.id.checkBoxJoystickVisibility4, R.id.spinnerJoystickShape4, R.id.spinnerJoystickType4, R.id.imageViewJoystickBehavior4_1, R.id.imageViewJoystickBehavior4_2, R.id.spinnerJoystickBehavior4_1, R.id.spinnerJoystickBehavior4_2, R.id.textViewJoystick4Ports, R.id.linearLayoutJoystick4Ports, R.id.imageView4_1, R.id.imageView4_2, R.id.linearLayoutJoystick4PortButtons);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void m10313a() {
            int i = this.f7056b.isChecked() ? 0 : 8;
            this.f7070p.f7057c.setVisibility(i);
            this.f7070p.f7059e.setVisibility(i);
            this.f7070p.f7058d.setVisibility(i);
            this.f7070p.f7060f.setVisibility(i);
            this.f7070p.f7065k.setVisibility(i);
            this.f7070p.f7066l.setVisibility(i);
            this.f7070p.f7067m.setVisibility(i);
            m10318c();
        }

        /* renamed from: a */
        private void m10314a(Activity activity, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
            this.f7055a = i;
            this.f7056b = (CheckBox) activity.findViewById(i2);
            this.f7057c = (ImageView) activity.findViewById(i11);
            this.f7059e = (ImageView) activity.findViewById(i12);
            this.f7058d = (Spinner) activity.findViewById(i3);
            C2712m.m10938a(this.f7058d, activity, Arrays.asList(activity.getString(R.string.joystick_shape_vertical), activity.getString(R.string.joystick_shape_horizontal), activity.getString(R.string.joystick_shape_circular), activity.getString(R.string.joystick_shape_quadratic), activity.getString(R.string.joystick_shape_arrows), activity.getString(R.string.joystick_shape_vertical_arrows), activity.getString(R.string.joystick_shape_horizontal_arrows)), R.string.joystick_shape);
            this.f7060f = (Spinner) activity.findViewById(i4);
            Spinner spinner = this.f7060f;
            String[] strArr = new String[4];
            strArr[0] = activity.getString(R.string.joystick_type_independent_motors);
            strArr[1] = activity.getString(R.string.joystick_type_steering);
            strArr[2] = activity.getString(R.string.joystick_type_steering_progressive);
            strArr[3] = activity.getString(R.string.joystick_type_mailbox) + " (" + (i == 0 ? "x, y" : i == 1 ? "w, z" : i == 2 ? "a, b" : "c, d") + ")";
            C2712m.m10938a(spinner, activity, Arrays.asList(strArr), R.string.joystick_type);
            this.f7061g = (ImageView) activity.findViewById(i5);
            this.f7063i = (ImageView) activity.findViewById(i6);
            this.f7062h = (Spinner) activity.findViewById(i7);
            C2712m.m10938a(this.f7062h, activity, Arrays.asList(activity.getString(R.string.joystick_behavior_return_to_zero), activity.getString(R.string.joystick_behavior_hold_position)), R.string.joystick_behavior1);
            this.f7064j = (Spinner) activity.findViewById(i8);
            C2712m.m10938a(this.f7064j, activity, Arrays.asList(activity.getString(R.string.joystick_behavior_return_to_zero), activity.getString(R.string.joystick_behavior_hold_position)), R.string.joystick_behavior2);
            this.f7065k = (TextView) activity.findViewById(i9);
            this.f7066l = (LinearLayout) activity.findViewById(i10);
            this.f7067m = (LinearLayout) activity.findViewById(i13);
            this.f7056b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class ru.proghouse.robocam.EV3SettingsActivity.C2622b.C26231 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C2622b.this.m10313a();
                }
            });
            this.f7058d.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class ru.proghouse.robocam.EV3SettingsActivity.C2622b.C26242 */

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C2622b.this.m10318c();
                    C2622b.this.m10320d();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.f7058d.setSelection(2);
            this.f7060f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class ru.proghouse.robocam.EV3SettingsActivity.C2622b.C26253 */

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C2622b.this.m10316b();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            m10313a();
        }

        /* renamed from: b */
        public void m10316b() {
            int i = EV3SettingsActivity.this.f7038D[this.f7060f.getSelectedItemPosition()] == 2 ? 8 : 0;
            this.f7065k.setVisibility(i);
            this.f7066l.setVisibility(i);
            this.f7067m.setVisibility(i);
            for (C2629d dVar : this.f7068n) {
                dVar.m10329a((EV3SettingsActivity.this.f7038D[this.f7060f.getSelectedItemPosition()] == 1 || EV3SettingsActivity.this.f7038D[this.f7060f.getSelectedItemPosition()] == 3) ? false : true);
                dVar.mo7538a(EV3SettingsActivity.this.f7038D[this.f7060f.getSelectedItemPosition()]);
            }
        }

        /* renamed from: c */
        public void m10318c() {
            int i;
            int i2 = 0;
            int i3 = 8;
            switch (this.f7058d.getSelectedItemPosition()) {
                case 0:
                    i = 0;
                    i2 = 8;
                    break;
                case 1:
                    i = 8;
                    break;
                case 2:
                case 3:
                default:
                    i = 0;
                    break;
                case 4:
                case 5:
                case 6:
                    i2 = 8;
                    i = 8;
                    break;
            }
            if (this.f7058d.getVisibility() != 0) {
                i = 8;
            } else {
                i3 = i2;
            }
            this.f7061g.setVisibility(i3);
            this.f7062h.setVisibility(i3);
            this.f7063i.setVisibility(i);
            this.f7064j.setVisibility(i);
        }

        /* renamed from: d */
        public void m10320d() {
            String str;
            switch (this.f7058d.getSelectedItemPosition()) {
                case 0:
                case 5:
                    str = this.f7055a == 0 ? "y" : this.f7055a == 1 ? "z" : this.f7055a == 2 ? "b" : "d";
                    break;
                case 1:
                case 6:
                    str = this.f7055a == 0 ? "x" : this.f7055a == 1 ? "w" : this.f7055a == 2 ? "a" : "c";
                    break;
                case 2:
                case 3:
                case 4:
                    str = this.f7055a == 0 ? "x, y" : this.f7055a == 1 ? "w, z" : this.f7055a == 2 ? "a, b" : "c, d";
                    break;
                default:
                    str = "";
                    break;
            }
            int selectedItemPosition = this.f7060f.getSelectedItemPosition();
            C2701d dVar = (C2701d) this.f7060f.getAdapter();
            dVar.mo7813b().set(3, dVar.mo7811a().getString(R.string.joystick_type_mailbox) + " (" + str + ")");
            this.f7060f.setAdapter((SpinnerAdapter) dVar);
            this.f7060f.setSelection(selectedItemPosition);
        }
    }

    /* renamed from: ru.proghouse.robocam.EV3SettingsActivity$c */
    class C2626c {

        /* renamed from: A */
        Button f7074A;

        /* renamed from: B */
        Button f7075B;

        /* renamed from: C */
        public List<C2629d> f7076C = new ArrayList();

        /* renamed from: E */
        private Activity f7078E = null;

        /* renamed from: a */
        int f7079a;

        /* renamed from: b */
        LinearLayout f7080b;

        /* renamed from: c */
        LinearLayout f7081c;

        /* renamed from: d */
        LinearLayout f7082d;

        /* renamed from: e */
        LinearLayout f7083e;

        /* renamed from: f */
        TextView f7084f;

        /* renamed from: g */
        TextView f7085g;

        /* renamed from: h */
        CheckBox f7086h;

        /* renamed from: i */
        LinearLayout f7087i;

        /* renamed from: j */
        Spinner f7088j;

        /* renamed from: k */
        Spinner f7089k;

        /* renamed from: l */
        Spinner f7090l;

        /* renamed from: m */
        LinearLayout f7091m;

        /* renamed from: n */
        LinearLayout f7092n;

        /* renamed from: o */
        EditText f7093o;

        /* renamed from: p */
        EditText f7094p;

        /* renamed from: q */
        EditText f7095q;

        /* renamed from: r */
        EditText f7096r;

        /* renamed from: s */
        EditText f7097s;

        /* renamed from: t */
        EditText f7098t;

        /* renamed from: u */
        EditText f7099u;

        /* renamed from: v */
        C2704f f7100v;

        /* renamed from: w */
        C2704f f7101w;

        /* renamed from: x */
        C2704f f7102x;

        /* renamed from: y */
        C2704f f7103y;

        /* renamed from: z */
        C2704f f7104z;

        /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, boolean, int, int):android.widget.CheckBox
         arg types: [ru.proghouse.robocam.EV3SettingsActivity, android.widget.LinearLayout, boolean, ?, int]
         candidates:
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, float, int, int):android.widget.EditText
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, int, int, int):android.widget.EditText
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, java.lang.String, int, int):android.widget.EditText
          ru.proghouse.robocam.m.a(android.widget.Spinner, android.app.Activity, java.util.List<java.lang.String>, int, int):void
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, boolean, int, int):android.widget.CheckBox */
        /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, int, int, int):android.widget.EditText
         arg types: [ru.proghouse.robocam.EV3SettingsActivity, android.widget.LinearLayout, int, ?, ?]
         candidates:
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, boolean, int, int):android.widget.CheckBox
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, float, int, int):android.widget.EditText
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, java.lang.String, int, int):android.widget.EditText
          ru.proghouse.robocam.m.a(android.widget.Spinner, android.app.Activity, java.util.List<java.lang.String>, int, int):void
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, int, int, int):android.widget.EditText */
        /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, int, int, int):android.widget.EditText
         arg types: [ru.proghouse.robocam.EV3SettingsActivity, android.widget.LinearLayout, int, ?, int]
         candidates:
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, boolean, int, int):android.widget.CheckBox
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, float, int, int):android.widget.EditText
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, java.lang.String, int, int):android.widget.EditText
          ru.proghouse.robocam.m.a(android.widget.Spinner, android.app.Activity, java.util.List<java.lang.String>, int, int):void
          ru.proghouse.robocam.m.a(android.app.Activity, android.widget.LinearLayout, int, int, int):android.widget.EditText */
        C2626c(EV3SettingsActivity eV3SettingsActivity, LinearLayout linearLayout, int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, HashSet<Integer> hashSet, HashSet<Integer> hashSet2, HashSet<Integer> hashSet3, HashSet<Integer> hashSet4, HashSet<Integer> hashSet5, String str, int i9, int i10) {
            this.f7078E = eV3SettingsActivity;
            this.f7079a = i;
            this.f7083e = linearLayout;
            this.f7080b = new LinearLayout(eV3SettingsActivity);
            this.f7080b.setOrientation(1);
            linearLayout.addView(this.f7080b);
            this.f7084f = new TextView(new ContextThemeWrapper(eV3SettingsActivity, (int) R.style.SettingsSectionTitle));
            this.f7084f.setText(EV3SettingsActivity.this.getString(R.string.keygroup_n, new Object[]{Integer.toString(i + 1)}));
            this.f7080b.addView(this.f7084f);
            this.f7086h = C2712m.m10930a((Activity) eV3SettingsActivity, this.f7080b, z, (int) R.string.keygroup_active, EV3SettingsActivity.this.f7042q);
            this.f7087i = new LinearLayout(eV3SettingsActivity);
            if (!z) {
                this.f7087i.setVisibility(8);
            }
            this.f7087i.setOrientation(1);
            this.f7080b.addView(this.f7087i);
            C2712m.m10934a(eV3SettingsActivity, this.f7087i);
            this.f7088j = C2712m.m10935a(eV3SettingsActivity, this.f7087i, Arrays.asList(eV3SettingsActivity.getString(R.string.joystick_type_independent_motors), eV3SettingsActivity.getString(R.string.keygroup_type_steering), eV3SettingsActivity.getString(R.string.joystick_type_mailbox)), i2 > 2 ? 2 : i2, R.string.joystick_type, null);
            this.f7091m = new LinearLayout(eV3SettingsActivity);
            this.f7091m.setVisibility(i2 != 2 ? 0 : 8);
            this.f7091m.setOrientation(1);
            this.f7087i.addView(this.f7091m);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7089k = C2712m.m10935a(eV3SettingsActivity, this.f7091m, Arrays.asList(eV3SettingsActivity.getString(R.string.joystick_behavior_return_to_zero), eV3SettingsActivity.getString(R.string.joystick_behavior_hold_position)), i9, R.string.keygroup_behavior1, null);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7090l = C2712m.m10935a(eV3SettingsActivity, this.f7091m, Arrays.asList(eV3SettingsActivity.getString(R.string.joystick_behavior_return_to_zero), eV3SettingsActivity.getString(R.string.joystick_behavior_hold_position)), i10, R.string.keygroup_behavior2, null);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7093o = C2712m.m10932a((Activity) eV3SettingsActivity, this.f7091m, i3, (int) R.string.inc_x, (int) R.string.inc_x_desc);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7094p = C2712m.m10932a((Activity) eV3SettingsActivity, this.f7091m, i4, (int) R.string.inc_y, (int) R.string.inc_y_desc);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7095q = C2712m.m10932a((Activity) eV3SettingsActivity, this.f7091m, i5, (int) R.string.dec_x, (int) R.string.dec_x_desc);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7096r = C2712m.m10932a((Activity) eV3SettingsActivity, this.f7091m, i6, (int) R.string.dec_y, (int) R.string.dec_y_desc);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7097s = C2712m.m10932a((Activity) eV3SettingsActivity, this.f7091m, i7, (int) R.string.step_x_pause, 0);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7098t = C2712m.m10932a((Activity) eV3SettingsActivity, this.f7091m, i8, (int) R.string.step_y_pause, 0);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7100v = C2704f.m10901a(eV3SettingsActivity, this.f7091m, hashSet, R.string.up_keys, mo7530a());
            this.f7100v.setOnClickListener(eV3SettingsActivity);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7101w = C2704f.m10901a(eV3SettingsActivity, this.f7091m, hashSet2, R.string.left_keys, mo7530a());
            this.f7101w.setOnClickListener(eV3SettingsActivity);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7102x = C2704f.m10901a(eV3SettingsActivity, this.f7091m, hashSet3, R.string.down_keys, mo7530a());
            this.f7102x.setOnClickListener(eV3SettingsActivity);
            C2712m.m10934a(eV3SettingsActivity, this.f7091m);
            this.f7103y = C2704f.m10901a(eV3SettingsActivity, this.f7091m, hashSet4, R.string.right_keys, mo7530a());
            this.f7103y.setOnClickListener(eV3SettingsActivity);
            this.f7085g = new TextView(new ContextThemeWrapper(eV3SettingsActivity, (int) R.style.SettingsSectionTitle));
            this.f7085g.setText(EV3SettingsActivity.this.getString(R.string.keygroup_ports, new Object[]{Integer.valueOf(i + 1)}));
            this.f7091m.addView(this.f7085g);
            this.f7081c = new LinearLayout(eV3SettingsActivity);
            this.f7081c.setOrientation(0);
            this.f7081c.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.f7081c.setBaselineAligned(false);
            this.f7081c.setGravity(5);
            this.f7091m.addView(this.f7081c);
            this.f7075B = C2712m.m10942c(eV3SettingsActivity, this.f7081c, R.string.delete);
            this.f7075B.setTag(new C2621a(this, false));
            this.f7075B.setOnClickListener(eV3SettingsActivity);
            EV3SettingsActivity.this.registerForContextMenu(this.f7075B);
            C2712m.m10940b(eV3SettingsActivity, this.f7081c);
            this.f7074A = C2712m.m10942c(eV3SettingsActivity, this.f7081c, R.string.add);
            this.f7074A.setTag(new C2621a(this, true));
            this.f7074A.setOnClickListener(eV3SettingsActivity);
            this.f7082d = new LinearLayout(eV3SettingsActivity);
            this.f7082d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.f7082d.setOrientation(1);
            this.f7091m.addView(this.f7082d);
            this.f7092n = new LinearLayout(eV3SettingsActivity);
            this.f7092n.setVisibility(i2 == 2 ? 0 : 8);
            this.f7092n.setOrientation(1);
            this.f7087i.addView(this.f7092n);
            C2712m.m10934a(eV3SettingsActivity, this.f7092n);
            this.f7099u = C2712m.m10933a(eV3SettingsActivity, this.f7092n, str, (int) R.string.mailbox, 0);
            C2712m.m10934a(eV3SettingsActivity, this.f7092n);
            this.f7104z = C2704f.m10901a(eV3SettingsActivity, this.f7092n, hashSet5, R.string.keys, mo7530a());
            this.f7104z.setOnClickListener(eV3SettingsActivity);
            this.f7086h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class ru.proghouse.robocam.EV3SettingsActivity.C2626c.C26271 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C2626c.this.f7087i.setVisibility(z ? 0 : 8);
                }
            });
            this.f7088j.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class ru.proghouse.robocam.EV3SettingsActivity.C2626c.C26282 */

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    int i2 = 0;
                    C2626c.this.f7091m.setVisibility(i != 2 ? 0 : 8);
                    LinearLayout linearLayout = C2626c.this.f7092n;
                    if (i != 2) {
                        i2 = 8;
                    }
                    linearLayout.setVisibility(i2);
                    for (C2629d dVar : C2626c.this.f7076C) {
                        dVar.mo7538a(C2626c.this.f7088j.getSelectedItemPosition());
                    }
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
        }

        /* renamed from: a */
        public String mo7530a() {
            return this.f7084f.getText().toString();
        }

        /* renamed from: a */
        public C2704f mo7531a(String str) {
            if (this.f7100v.getTitle().equals(str)) {
                return this.f7100v;
            }
            if (this.f7101w.getTitle().equals(str)) {
                return this.f7101w;
            }
            if (this.f7102x.getTitle().equals(str)) {
                return this.f7102x;
            }
            if (this.f7103y.getTitle().equals(str)) {
                return this.f7103y;
            }
            if (this.f7104z.getTitle().equals(str)) {
                return this.f7104z;
            }
            return null;
        }

        /* renamed from: a */
        public void mo7532a(int i) {
            this.f7079a = i;
            this.f7084f.setText(EV3SettingsActivity.this.getString(R.string.keygroup_n, new Object[]{Integer.toString(i + 1)}));
            this.f7085g.setText(EV3SettingsActivity.this.getString(R.string.keygroup_ports, new Object[]{Integer.valueOf(i + 1)}));
            for (int i2 = 0; i2 < this.f7076C.size(); i2++) {
                this.f7076C.get(i2).m10331b(i);
            }
        }

        /* renamed from: b */
        public void mo7533b() {
            this.f7083e.removeView(this.f7080b);
        }
    }

    /* renamed from: ru.proghouse.robocam.EV3SettingsActivity$d */
    class C2629d {

        /* renamed from: a */
        int f7109a;

        /* renamed from: b */
        boolean f7110b;

        /* renamed from: c */
        LinearLayout f7111c;

        /* renamed from: d */
        LinearLayout f7112d;

        /* renamed from: e */
        TextView f7113e;

        /* renamed from: f */
        Spinner f7114f;

        /* renamed from: g */
        Spinner f7115g;

        /* renamed from: h */
        Spinner f7116h;

        /* renamed from: i */
        Spinner f7117i;

        /* renamed from: j */
        CheckBox f7118j;

        /* renamed from: k */
        EditText f7119k;

        /* renamed from: l */
        TextView f7120l;

        /* renamed from: m */
        EditText f7121m;

        /* renamed from: n */
        CheckBox f7122n;

        /* renamed from: o */
        ImageView f7123o;

        /* renamed from: p */
        ImageView f7124p;

        /* renamed from: q */
        LinearLayout f7125q;

        public C2629d(Activity activity, LinearLayout linearLayout, int i, int i2, int i3, String str, int i4, int i5, boolean z, float f, int i6, int i7, boolean z2) {
            this.f7110b = z2;
            this.f7109a = i;
            this.f7111c = linearLayout;
            this.f7112d = new LinearLayout(activity);
            this.f7112d.setOrientation(1);
            linearLayout.addView(this.f7112d);
            this.f7113e = new TextView(new ContextThemeWrapper(activity, (int) R.style.SettingsSectionTitle));
            if (z2) {
                this.f7113e.setText(EV3SettingsActivity.this.getString(R.string.joystick_n_port_n, new Object[]{Integer.valueOf(i + 1), str}));
            } else {
                this.f7113e.setText(EV3SettingsActivity.this.getString(R.string.keygroup_n_port_n, new Object[]{Integer.valueOf(i + 1), str}));
            }
            this.f7112d.addView(this.f7113e);
            LinearLayout linearLayout2 = this.f7112d;
            String[] strArr = new String[2];
            strArr[0] = activity.getString(i7 == 0 ? R.string.joystick_group_horizontal : R.string.joystick_group_left);
            strArr[1] = activity.getString(i7 == 0 ? R.string.joystick_group_vertical : R.string.joystick_group_right);
            this.f7114f = C2712m.m10935a(activity, linearLayout2, Arrays.asList(strArr), i2, i7 == 0 ? R.string.joystick_group_axis : R.string.joystick_group_motor, null);
            C2712m.m10934a(activity, this.f7112d);
            this.f7115g = C2712m.m10935a(activity, this.f7112d, Arrays.asList("1", "2", "3", "4"), i3, R.string.joystick_layer, null);
            C2712m.m10934a(activity, this.f7112d);
            this.f7116h = C2712m.m10935a(activity, this.f7112d, Arrays.asList("A", "B", "C", "D"), str.equals("A") ? 0 : str.equals("B") ? 1 : str.equals("C") ? 2 : 3, R.string.joystick_port_number, null);
            this.f7116h.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class ru.proghouse.robocam.EV3SettingsActivity.C2629d.C26301 */

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C2629d.this.m10331b(-1);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            C2712m.m10934a(activity, this.f7112d);
            LinearLayout[] linearLayoutArr = new LinearLayout[1];
            this.f7117i = C2712m.m10935a(activity, this.f7112d, Arrays.asList(activity.getString(R.string.joystick_type_power), activity.getString(R.string.joystick_type_angle)), i4, R.string.joystick_type_cv, linearLayoutArr);
            this.f7125q = linearLayoutArr[0];
            this.f7124p = C2712m.m10934a(activity, this.f7112d);
            m10329a((i7 == 1 || i7 == 3) ? false : true);
            this.f7120l = C2712m.m10936a(activity, this.f7112d, (int) R.string.joystick_power);
            this.f7121m = C2712m.m10932a(activity, this.f7112d, i5, 0, 0);
            this.f7123o = C2712m.m10934a(activity, this.f7112d);
            this.f7118j = C2712m.m10930a(activity, this.f7112d, z, (int) R.string.joystick_invert, EV3SettingsActivity.this.f7042q);
            C2712m.m10934a(activity, this.f7112d);
            this.f7122n = C2712m.m10930a(activity, this.f7112d, i6 == 1, (int) R.string.joystick_brake, EV3SettingsActivity.this.f7042q);
            C2712m.m10934a(activity, this.f7112d);
            this.f7119k = C2712m.m10931a(activity, this.f7112d, f, (int) R.string.joystick_coefficient, 0);
            this.f7117i.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class ru.proghouse.robocam.EV3SettingsActivity.C2629d.C26312 */

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C2629d.this.m10330b();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            m10330b();
        }

        /* renamed from: a */
        public void m10329a(boolean z) {
            int i = z ? 0 : 8;
            this.f7125q.setVisibility(i);
            this.f7124p.setVisibility(i);
        }

        /* renamed from: b */
        public void m10330b() {
            int i = this.f7117i.getSelectedItemPosition() == 1 ? 0 : 8;
            this.f7121m.setVisibility(i);
            this.f7120l.setVisibility(i);
            this.f7123o.setVisibility(i);
        }

        /* renamed from: b */
        public void m10331b(int i) {
            if (i >= 0) {
                this.f7109a = i;
            }
            if (this.f7110b) {
                this.f7113e.setText(EV3SettingsActivity.this.getString(R.string.joystick_n_port_n, new Object[]{Integer.valueOf(this.f7109a + 1), new String[]{"A", "B", "C", "D"}[this.f7116h.getSelectedItemPosition()]}));
                return;
            }
            this.f7113e.setText(EV3SettingsActivity.this.getString(R.string.keygroup_n_port_n, new Object[]{Integer.valueOf(this.f7109a + 1), new String[]{"A", "B", "C", "D"}[this.f7116h.getSelectedItemPosition()]}));
        }

        /* renamed from: a */
        public void mo7537a() {
            this.f7111c.removeView(this.f7112d);
        }

        /* renamed from: a */
        public void mo7538a(int i) {
            int selectedItemPosition = this.f7114f.getSelectedItemPosition();
            C2701d dVar = (C2701d) this.f7114f.getAdapter();
            dVar.mo7812a(i == 0 ? this.f7110b ? R.string.joystick_group_axis : R.string.keyboard_group_axis : R.string.joystick_group_motor);
            dVar.mo7813b().set(0, dVar.mo7811a().getString(i == 0 ? this.f7110b ? R.string.joystick_group_horizontal : R.string.keygroup_horizontal : R.string.joystick_group_left));
            dVar.mo7813b().set(1, dVar.mo7811a().getString(i == 0 ? this.f7110b ? R.string.joystick_group_vertical : R.string.keygroup_vertical : R.string.joystick_group_right));
            this.f7114f.setAdapter((SpinnerAdapter) dVar);
            this.f7114f.setSelection(selectedItemPosition);
        }
    }

    /* renamed from: a */
    private String m10297a(boolean z, boolean z2) {
        String str;
        File file = z ? new File(Environment.getExternalStorageDirectory(), ".robocam") : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        file.mkdirs();
        String str2 = "RoboCam_";
        String obj = this.f7043r.getText().toString();
        if (obj != null && !obj.isEmpty()) {
            str2 = str2 + obj.replace("\\", "_").replace("/", "_").replace(":", "_").replace(" ", "_") + "_";
        }
        String str3 = str2 + new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date());
        if (z2 || !new File(file.getPath() + "/" + str3 + ".xml").exists()) {
            str = str3;
        } else {
            int i = 2;
            while (new File(file.getPath() + "/" + str3 + "_" + Integer.toString(i) + ".xml").exists()) {
                i++;
            }
            str = str3 + "_" + Integer.toString(i);
        }
        String str4 = file.getPath() + "/" + str + ".xml";
        /*ToDo: C2714o.m10954a*/ o.a(str4, m10311n());
        return str4;
    }

    /* renamed from: a */
    private HashSet<Integer> m10298a(Element element, String str) {
        HashSet<Integer> hashSet = new HashSet<>();
        NodeList elementsByTagName = element.getElementsByTagName(str);
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Integer valueOf = Integer.valueOf(((Element) elementsByTagName.item(i)).getTextContent());
            if (valueOf.intValue() > 0 && valueOf.intValue() <= 255) {
                hashSet.add(valueOf);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private void m10299a(File file) {
        try {
            m10301a(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m10300a(String str) {
        try {
            m10301a(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str))));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      ru.proghouse.robocam.n.a(java.lang.String, float):float
      ru.proghouse.robocam.n.a(java.lang.String, int):int
      ru.proghouse.robocam.n.a(java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean */
    /* renamed from: a */
    private void m10301a(Document document) {
        document.getDocumentElement().normalize();
        String nodeName = document.getDocumentElement().getNodeName();
        if (!nodeName.equals("EV3")) {
            try {
                throw new Exception(getString(R.string.unknown_driver_name, new Object[]{nodeName}));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f7043r.setText(document.getDocumentElement().getAttribute("Name"));
        this.f7044s.setText(document.getDocumentElement().getAttribute("Description"));
        this.f7045t.setChecked(C2713n.m10946a(document.getDocumentElement().getAttribute("ShowDebugInfo"), true));
        this.f7046u.setChecked(C2713n.m10946a(document.getDocumentElement().getAttribute("HideJoysticks"), true));
        this.f7048w.setChecked(C2713n.m10946a(document.getDocumentElement().getAttribute("StartUserProgram"), false));
        this.f7049x.setText(document.getDocumentElement().getAttribute("UserProgram"));
        NodeList elementsByTagName = document.getElementsByTagName("Joystick");
        for (int i = 0; i < this.f7040o.length; i++) {
            for (int i2 = 0; i2 < this.f7040o[i].f7068n.size(); i2++) {
                this.f7040o[i].f7068n.get(i2).mo7537a();
            }
            this.f7040o[i].f7068n.clear();
        }
        for (int i3 = 0; i3 < elementsByTagName.getLength(); i3++) {
            Element element = (Element) elementsByTagName.item(i3);
            int a = C2713n.m10944a(element.getAttribute("Index"), -1);
            if (a >= 0 && a < 4) {
                C2622b bVar = this.f7040o[a];
                bVar.f7056b.setChecked(C2713n.m10946a(element.getAttribute("Visible"), false));
                String a2 = C2713n.m10945a(element.getAttribute("Shape"), "c");
                if (a2.equals("v")) {
                    bVar.f7058d.setSelection(0);
                } else if (a2.equals("h")) {
                    bVar.f7058d.setSelection(1);
                } else if (a2.equals("c")) {
                    bVar.f7058d.setSelection(2);
                } else if (a2.equals("q")) {
                    bVar.f7058d.setSelection(3);
                } else if (a2.equals("a")) {
                    bVar.f7058d.setSelection(4);
                } else if (a2.equals("l")) {
                    bVar.f7058d.setSelection(5);
                } else if (a2.equals("t")) {
                    bVar.f7058d.setSelection(6);
                }
                bVar.f7060f.setSelection(this.f7038D[C2713n.m10944a(element.getAttribute("Type"), 0)]);
                bVar.f7062h.setSelection(C2713n.m10944a(element.getAttribute("Behavior0"), 0));
                bVar.f7064j.setSelection(C2713n.m10944a(element.getAttribute("Behavior1"), 0));
                m10304a(element, bVar.f7068n, bVar.f7060f, bVar.f7066l, a, true);
            }
        }
        NodeList elementsByTagName2 = document.getElementsByTagName("KeyGroup");
        for (int i4 = 0; i4 < elementsByTagName2.getLength(); i4++) {
            Element element2 = (Element) elementsByTagName2.item(i4);
            this.f7041p.add(new C2626c(this, (LinearLayout) findViewById(R.id.linearLayoutKeyGroups), this.f7041p.size(), C2713n.m10946a(element2.getAttribute("Active"), false), C2713n.m10944a(element2.getAttribute("Type"), 0), C2713n.m10944a(element2.getAttribute("IncX"), 0), C2713n.m10944a(element2.getAttribute("IncY"), 0), C2713n.m10944a(element2.getAttribute("DecX"), 0), C2713n.m10944a(element2.getAttribute("DecY"), 0), C2713n.m10944a(element2.getAttribute("StepXPause"), 100), C2713n.m10944a(element2.getAttribute("StepYPause"), 100), m10298a(element2, "UpKey"), m10298a(element2, "LeftKey"), m10298a(element2, "DownKey"), m10298a(element2, "RightKey"), m10298a(element2, "Key"), C2713n.m10945a(element2.getAttribute("Mailbox"), ""), C2713n.m10944a(element2.getAttribute("Behavior0"), 0), C2713n.m10944a(element2.getAttribute("Behavior1"), 0)));
            C2626c cVar = this.f7041p.get(this.f7041p.size() - 1);
            m10304a(element2, cVar.f7076C, cVar.f7088j, cVar.f7082d, this.f7041p.size() - 1, false);
        }
    }

    /* renamed from: a */
    private void m10302a(Document document, Element element, List<C2629d> list) {
        for (C2629d dVar : list) {
            Element createElement = document.createElement("OutputPort");
            element.appendChild(createElement);
            createElement.setAttribute("Group", Integer.toString(dVar.f7114f.getSelectedItemPosition()));
            createElement.setAttribute("Layer", Integer.toString(dVar.f7115g.getSelectedItemPosition()));
            createElement.setAttribute("Number", new String[]{"A", "B", "C", "D"}[dVar.f7116h.getSelectedItemPosition()]);
            if (dVar.f7117i.getSelectedItemPosition() != C2687c.f7456a) {
                createElement.setAttribute("JoystickType", Integer.toString(dVar.f7117i.getSelectedItemPosition()));
            }
            if (!dVar.f7121m.getText().toString().equals("0")) {
                createElement.setAttribute("Power", dVar.f7121m.getText().toString());
            }
            if (dVar.f7118j.isChecked()) {
                createElement.setAttribute("Invert", "1");
            }
            if (!dVar.f7119k.getText().toString().equals("1.0")) {
                createElement.setAttribute("Coefficient", dVar.f7119k.getText().toString());
            }
            if (!dVar.f7122n.isChecked()) {
                createElement.setAttribute("Brake", "0");
            }
        }
    }

    /* renamed from: a */
    private void m10303a(Document document, Element element, C2704f fVar, String str) {
        if (fVar.f7561a != null) {
            Iterator<Integer> it = fVar.f7561a.iterator();
            while (it.hasNext()) {
                Element createElement = document.createElement(str);
                element.appendChild(createElement);
                createElement.setTextContent(it.next().toString());
            }
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      ru.proghouse.robocam.n.a(java.lang.String, float):float
      ru.proghouse.robocam.n.a(java.lang.String, int):int
      ru.proghouse.robocam.n.a(java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.n.a(java.lang.String, float):float
     arg types: [java.lang.String, int]
     candidates:
      ru.proghouse.robocam.n.a(java.lang.String, int):int
      ru.proghouse.robocam.n.a(java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.n.a(java.lang.String, boolean):boolean
      ru.proghouse.robocam.n.a(java.lang.String, float):float */
    /* renamed from: a */
    private void m10304a(Element element, List<C2629d> list, Spinner spinner, LinearLayout linearLayout, int i, boolean z) {
        NodeList elementsByTagName = element.getElementsByTagName("OutputPort");
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName.item(i2);
            int a = C2713n.m10944a(element2.getAttribute("Group"), -1);
            int a2 = C2713n.m10944a(element2.getAttribute("Layer"), -1);
            String a3 = C2713n.m10945a(element2.getAttribute("Number"), "");
            char c = 65535;
            if (a3.equals("A")) {
                c = 1;
            } else if (a3.equals("B")) {
                c = 2;
            } else if (a3.equals("C")) {
                c = 4;
            } else if (a3.equals("D")) {
                c = 8;
            }
            if (a >= 0 && a <= 1 && a2 >= 0 && a2 < 4 && c >= 0) {
                try {
                    list.add(new C2629d(this, linearLayout, i, a, a2, a3, C2713n.m10944a(element2.getAttribute("JoystickType"), C2687c.f7456a), C2713n.m10944a(element2.getAttribute("Power"), 0), C2713n.m10946a(element2.getAttribute("Invert"), false), C2713n.m10943a(element2.getAttribute("Coefficient"), 1.0f), C2713n.m10944a(element2.getAttribute("Brake"), 1), this.f7038D[spinner.getSelectedItemPosition()], z));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: j */
    private File m10307j() {
        return new File(
/*ToDo: C2714o.m10947a*/o.a(this), this.f7039n);
    }

    /* renamed from: k */
    private void m10308k() {
        try {
            Document n = m10311n();
            n.getDocumentElement().setAttribute("Name", /*ToDo: C2714o.m10948a*/ o.a(this, this.f7043r.getText().toString(), "EV3"));
            /*ToDo: C2714o.m10953a*/ o.a(new File(
/*ToDo: C2714o.m10947a*/o.a(this), "EV3_" + new SimpleDateFormat("yyyyMMddHHmmsszzz", Locale.ENGLISH).format(new Date()) + ".xml"), n);
//ToDo: m10913a
ru.proghouse.robocam.k.a(new Date());
            Toast.makeText(this, getString(R.string.settings_ware_copied_successfully), 1).show();
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_while_copying_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void
     arg types: [ru.proghouse.robocam.EV3SettingsActivity, java.lang.String, int]
     candidates:
      ru.proghouse.robocam.o.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void
      ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.EV3SettingsActivity.a(boolean, boolean):java.lang.String
     arg types: [int, int]
     candidates:
      ru.proghouse.robocam.EV3SettingsActivity.a(org.w3c.dom.Element, java.lang.String):java.util.HashSet<java.lang.Integer>
      android.support.v4.a.n.a(android.view.View, android.view.Menu):boolean
      ru.proghouse.robocam.EV3SettingsActivity.a(boolean, boolean):java.lang.String */
    /* renamed from: l */
    private void m10309l() {
        if (
/*ToDo: C2714o.m10955a*/o.a(this, 1)) {
            try {
                /*ToDo: C2714o.m10950a*/ o.a((Activity) this, getString(R.string.settings_ware_exported_successfully, new Object[]{m10297a(false, false)}), false);
            } catch (Exception e) {
                Toast.makeText(this, getString(R.string.error_while_exporting_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
            }
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.EV3SettingsActivity.a(boolean, boolean):java.lang.String
     arg types: [int, int]
     candidates:
      ru.proghouse.robocam.EV3SettingsActivity.a(org.w3c.dom.Element, java.lang.String):java.util.HashSet<java.lang.Integer>
      android.support.v4.a.n.a(android.view.View, android.view.Menu):boolean
      ru.proghouse.robocam.EV3SettingsActivity.a(boolean, boolean):java.lang.String */
    /* renamed from: m */
    private void m10310m() {
        if (
/*ToDo: C2714o.m10955a*/o.a(this, 2)) {
            try {
                String a = m10297a(true, true);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/xml");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(a)));
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(this, getString(R.string.error_while_exporting_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
            }
        }
    }

    /* renamed from: n */
    private Document m10311n() {
        Document newDocument = null;
        try {
            newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        newDocument.appendChild(newDocument.createElement("EV3"));
        Element documentElement = newDocument.getDocumentElement();
        documentElement.setAttribute("Name", this.f7043r.getText().toString());
        documentElement.setAttribute("Description", this.f7044s.getText().toString());
        if (!this.f7045t.isChecked()) {
            documentElement.setAttribute("ShowDebugInfo", "0");
        }
        if (!this.f7046u.isChecked()) {
            documentElement.setAttribute("HideJoysticks", "0");
        }
        if (this.f7048w.isChecked()) {
            documentElement.setAttribute("StartUserProgram", "1");
        }
        if (this.f7049x.getText().toString() != null && !this.f7049x.getText().toString().equals("")) {
            documentElement.setAttribute("UserProgram", this.f7049x.getText().toString());
        }
        C2622b[] bVarArr = this.f7040o;
        int i = 0;
        for (C2622b bVar : bVarArr) {
            Element createElement = newDocument.createElement("Joystick");
            documentElement.appendChild(createElement);
            createElement.setAttribute("Index", Integer.toString(i));
            if (bVar.f7056b.isChecked()) {
                createElement.setAttribute("Visible", "1");
            }
            switch (bVar.f7058d.getSelectedItemPosition()) {
                case 0:
                    createElement.setAttribute("Shape", "v");
                    break;
                case 1:
                    createElement.setAttribute("Shape", "h");
                    break;
                case 2:
                    if (bVar.f7056b.isChecked()) {
                        createElement.setAttribute("Shape", "c");
                        break;
                    }
                    break;
                case 3:
                    createElement.setAttribute("Shape", "q");
                    break;
                case 4:
                    createElement.setAttribute("Shape", "a");
                    break;
                case 5:
                    createElement.setAttribute("Shape", "l");
                    break;
                case 6:
                    createElement.setAttribute("Shape", "t");
                    break;
            }
            if (this.f7038D[bVar.f7060f.getSelectedItemPosition()] != 0 || bVar.f7056b.isChecked()) {
                createElement.setAttribute("Type", Integer.toString(this.f7038D[bVar.f7060f.getSelectedItemPosition()]));
            }
            if (bVar.f7062h.getSelectedItemPosition() != 0) {
                createElement.setAttribute("Behavior0", Integer.toString(bVar.f7062h.getSelectedItemPosition()));
            }
            if (bVar.f7064j.getSelectedItemPosition() != 0) {
                createElement.setAttribute("Behavior1", Integer.toString(bVar.f7064j.getSelectedItemPosition()));
            }
            m10302a(newDocument, createElement, bVar.f7068n);
            i++;
        }
        for (C2626c cVar : this.f7041p) {
            Element createElement2 = newDocument.createElement("KeyGroup");
            documentElement.appendChild(createElement2);
            if (cVar.f7088j.getSelectedItemPosition() != 0) {
                createElement2.setAttribute("Type", Integer.toString(cVar.f7088j.getSelectedItemPosition()));
            }
            if (cVar.f7086h.isChecked()) {
                createElement2.setAttribute("Active", "1");
            }
            if (!"".equals(cVar.f7099u.getText().toString())) {
                createElement2.setAttribute("Mailbox", cVar.f7099u.getText().toString());
            }
            if (cVar.f7089k.getSelectedItemPosition() != 0) {
                createElement2.setAttribute("Behavior0", Integer.toString(cVar.f7089k.getSelectedItemPosition()));
            }
            if (cVar.f7090l.getSelectedItemPosition() != 0) {
                createElement2.setAttribute("Behavior1", Integer.toString(cVar.f7090l.getSelectedItemPosition()));
            }
            if (!"0".equals(cVar.f7093o.getText().toString()) && !"".equals(cVar.f7093o.getText().toString())) {
                createElement2.setAttribute("IncX", cVar.f7093o.getText().toString());
            }
            if (!"0".equals(cVar.f7094p.getText().toString()) && !"".equals(cVar.f7094p.getText().toString())) {
                createElement2.setAttribute("IncY", cVar.f7094p.getText().toString());
            }
            if (!"0".equals(cVar.f7095q.getText().toString()) && !"".equals(cVar.f7095q.getText().toString())) {
                createElement2.setAttribute("DecX", cVar.f7095q.getText().toString());
            }
            if (!"0".equals(cVar.f7096r.getText().toString()) && !"".equals(cVar.f7096r.getText().toString())) {
                createElement2.setAttribute("DecY", cVar.f7096r.getText().toString());
            }
            if (!"100".equals(cVar.f7097s.getText().toString()) && !"".equals(cVar.f7097s.getText().toString())) {
                createElement2.setAttribute("StepXPause", cVar.f7097s.getText().toString());
            }
            if (!"100".equals(cVar.f7098t.getText().toString()) && !"".equals(cVar.f7098t.getText().toString())) {
                createElement2.setAttribute("StepYPause", cVar.f7098t.getText().toString());
            }
            m10303a(newDocument, createElement2, cVar.f7100v, "UpKey");
            m10303a(newDocument, createElement2, cVar.f7101w, "LeftKey");
            m10303a(newDocument, createElement2, cVar.f7102x, "DownKey");
            m10303a(newDocument, createElement2, cVar.f7103y, "RightKey");
            m10303a(newDocument, createElement2, cVar.f7104z, "Key");
            m10302a(newDocument, createElement2, cVar.f7076C);
        }
        return newDocument;
    }

    /* renamed from: o */
    private String m10312o() {
        try {
            DOMSource dOMSource = new DOMSource(m10311n());
            StringWriter stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_while_creating_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
            return null;
        }
    }

    @Override // android.support.v4.app.C0106n
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            switch (i) {
                case 1:
                    String stringExtra = intent.getStringExtra("android.intent.extra.remote_intent_token");
                    String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                    for (C2626c cVar : this.f7041p) {
                        if (cVar.mo7530a().equals(stringExtra)) {
                            C2704f a = cVar.mo7531a(stringExtra2);
                            if (a != null) {
                                a.mo7822a(this, intent.getIntArrayExtra("android.intent.extra.STREAM"));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void onAddKeyGroupButtonClick(View view) {
        try {
            this.f7041p.add(new C2626c(this, (LinearLayout) findViewById(R.id.linearLayoutKeyGroups), this.f7041p.size(), true, 0, 0, 0, 0, 0, 100, 100, null, null, null, null, null, "", 0, 0));
            Toast.makeText(this, getString(R.string.keygroup_has_been_added), 1).show();
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_while_creating_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
        }
    }

    public void onAddPortButtonClick(View view) {
        int i = -1;
        if (view.getId() == R.id.buttonAddPortJoystick1) {
            i = 0;
        } else if (view.getId() == R.id.buttonAddPortJoystick2) {
            i = 1;
        } else if (view.getId() == R.id.buttonAddPortJoystick3) {
            i = 2;
        } else if (view.getId() == R.id.buttonAddPortJoystick4) {
            i = 3;
        }
        if (i >= 0) {
            try {
                this.f7040o[i].f7068n.add(new C2629d(this, this.f7040o[i].f7066l, i, 0, 0, "A", C2687c.f7456a, 0, false, 1.0f, 1, this.f7038D[this.f7040o[i].f7060f.getSelectedItemPosition()], true));
                Toast.makeText(this, getString(R.string.port_has_been_added), 1).show();
            } catch (Exception e) {
                Toast.makeText(this, getString(R.string.error_while_creating_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
            }
        }
    }

    public void onCancelButtonClick(View view) {
        finish();
    }

    public void onClick(View view) {
        char c = 65535;
        if (view.getId() == R.id.buttonDeletePortJoystick1) {
            c = 0;
        } else if (view.getId() == R.id.buttonDeletePortJoystick2) {
            c = 1;
        } else if (view.getId() == R.id.buttonDeletePortJoystick3) {
            c = 2;
        } else if (view.getId() == R.id.buttonDeletePortJoystick4) {
            c = 3;
        }
        if (c >= 0 && this.f7040o[c].f7068n.size() > 0) {
            view.showContextMenu();
        } else if (view.getId() == R.id.buttonOverflow) {
            view.showContextMenu();
        } else if (C2704f.class.isAssignableFrom(view.getClass())) {
            ((C2704f) view).mo7820a(this, 1);
        } else if (view.getTag() != null && C2621a.class.isAssignableFrom(view.getTag().getClass())) {
            try {
                C2621a aVar = (C2621a) view.getTag();
                if (aVar.f7053b) {
                    aVar.f7052a.f7076C.add(new C2629d(this, aVar.f7052a.f7082d, aVar.f7052a.f7079a, 0, 0, "A", C2687c.f7456a, 0, false, 1.0f, 1, this.f7038D[aVar.f7052a.f7088j.getSelectedItemPosition()], false));
                    Toast.makeText(this, getString(R.string.port_has_been_added), 1).show();
                    return;
                }
                view.showContextMenu();
            } catch (Exception e) {
                Toast.makeText(this, getString(R.string.error_while_creating_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
            }
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() > 1000000 && menuItem.getItemId() / 1000000 <= 4) {
            int itemId = (menuItem.getItemId() / 1000000) - 1;
            int itemId2 = (menuItem.getItemId() - ((itemId + 1) * 1000000)) - 1;
            this.f7040o[itemId].f7068n.get(itemId2).mo7537a();
            this.f7040o[itemId].f7068n.remove(itemId2);
            Toast.makeText(this, (int) R.string.port_was_deleted, 1).show();
            return true;
        } else if (menuItem.getItemId() > 10000000) {
            int itemId3 = (menuItem.getItemId() / 10000000) - 1;
            int itemId4 = (menuItem.getItemId() - ((itemId3 + 1) * 10000000)) - 1;
            this.f7041p.get(itemId3).f7076C.get(itemId4).mo7537a();
            this.f7041p.get(itemId3).f7076C.remove(itemId4);
            Toast.makeText(this, (int) R.string.port_was_deleted, 1).show();
            return true;
        } else if (menuItem.getItemId() < -10) {
            int itemId5 = (menuItem.getItemId() * -1) - 11;
            this.f7041p.get(itemId5).mo7533b();
            this.f7041p.remove(itemId5);
            for (int i = 0; i < this.f7041p.size(); i++) {
                this.f7041p.get(i).mo7532a(i);
            }
            Toast.makeText(this, (int) R.string.keygroup_was_deleted, 1).show();
            return true;
        } else {
            if (menuItem.getItemId() == -2) {
                m10310m();
            } else if (menuItem.getItemId() == -3) {
                m10309l();
            } else if (menuItem.getItemId() == -4) {
                m10308k();
            }
            return super.onContextItemSelected(menuItem);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ev3_settings);
        this.f7047v = (ImageButton) findViewById(R.id.buttonOverflow);
        this.f7047v.setOnClickListener(this);
        registerForContextMenu(this.f7047v);
        this.f7037C = (Button) findViewById(R.id.buttonDeleteKeyGroup);
        registerForContextMenu(this.f7037C);
        if (Build.VERSION.SDK_INT < 17) {
            this.f7042q = new CheckBox(this).getPaddingLeft();
        }
        this.f7043r = (EditText) findViewById(R.id.editTextBotName);
        this.f7044s = (EditText) findViewById(R.id.editTextDesc);
        this.f7045t = (CheckBox) findViewById(R.id.checkBoxShowDebugInfo);
        this.f7046u = (CheckBox) findViewById(R.id.checkBoxHideJoysticks);
        this.f7048w = (CheckBox) findViewById(R.id.checkBoxStartUserProgram);
        this.f7049x = (EditText) findViewById(R.id.editTextUserProgram);
        this.f7039n = getIntent().getStringExtra("SettingsFileName");
        if (this.f7039n == null || this.f7039n.equals("")) {
            String string = bundle != null ? bundle.getString("SettingsFileName") : null;
            if (string == null || string.equals("")) {
                this.f7039n = "EV3_" + new SimpleDateFormat("yyyyMMddHHmmsszzz", Locale.ENGLISH).format(new Date()) + ".xml";
            } else {
                this.f7039n = string;
            }
        }
        for (int i = 0; i < 4; i++) {
            this.f7040o[i] = new C2622b(this, i);
        }
        String string2 = bundle != null ? bundle.getString("SettingsXml") : null;
        if (string2 == null || string2.equals("")) {
            File j = m10307j();
            if (j.exists()) {
                try {
                    m10299a(j);
                } catch (Exception e) {
                    Toast.makeText(this, getString(R.string.error_while_opening_settings_file, new Object[]{this.f7039n, e.getLocalizedMessage()}), 1).show();
                }
            }
        } else {
            try {
                m10300a(string2);
            } catch (Exception e2) {
                Toast.makeText(this, getString(R.string.error_while_opening_settings, new Object[]{e2.getLocalizedMessage()}), 1).show();
            }
        }
        this.f7050y = (Button) findViewById(R.id.buttonDeletePortJoystick1);
        this.f7050y.setOnClickListener(this);
        registerForContextMenu(this.f7050y);
        this.f7051z = (Button) findViewById(R.id.buttonDeletePortJoystick2);
        this.f7051z.setOnClickListener(this);
        registerForContextMenu(this.f7051z);
        this.f7035A = (Button) findViewById(R.id.buttonDeletePortJoystick3);
        this.f7035A.setOnClickListener(this);
        registerForContextMenu(this.f7035A);
        this.f7036B = (Button) findViewById(R.id.buttonDeletePortJoystick4);
        this.f7036B.setOnClickListener(this);
        registerForContextMenu(this.f7036B);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        int i = view.getId() == R.id.buttonDeletePortJoystick1 ? 0 : view.getId() == R.id.buttonDeletePortJoystick2 ? 1 : view.getId() == R.id.buttonDeletePortJoystick3 ? 2 : view.getId() == R.id.buttonDeletePortJoystick4 ? 3 : -1;
        if (i >= 0) {
            for (int i2 = 0; i2 < this.f7040o[i].f7068n.size(); i2++) {
                contextMenu.add(0, ((i + 1) * 1000000) + i2 + 1, i2 + 1, this.f7040o[i].f7068n.get(i2).f7113e.getText());
            }
        } else if (view.getTag() != null && C2621a.class.isAssignableFrom(view.getTag().getClass())) {
            C2621a aVar = (C2621a) view.getTag();
            for (int i3 = 0; i3 < aVar.f7052a.f7076C.size(); i3++) {
                contextMenu.add(0, ((aVar.f7052a.f7079a + 1) * 10000000) + i3 + 1, i3 + 1, aVar.f7052a.f7076C.get(i3).f7113e.getText());
            }
        } else if (view.getId() == R.id.buttonDeleteKeyGroup) {
            for (int i4 = 0; i4 < this.f7041p.size(); i4++) {
                contextMenu.add(0, (i4 + 11) * -1, i4 + 1, this.f7041p.get(i4).f7084f.getText());
            }
        } else {
            contextMenu.add(0, -2, 0, R.string.action_send_robot_settings);
            contextMenu.add(0, -3, 0, R.string.action_export_robot_settings_to_file);
            contextMenu.add(0, -4, 0, R.string.action_copy_robot_settings);
        }
    }

    public void onDeleteKeyGroupClick(View view) {
        view.showContextMenu();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onDestroy() {
        super.onDestroy();
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void
     arg types: [ru.proghouse.robocam.EV3SettingsActivity, ?, int]
     candidates:
      ru.proghouse.robocam.o.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void
      ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void */
    @Override // android.support.v4.app.C0106n, android.support.v4.app.ActivityCompat.C0020a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1 && i != 2) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr.length != 1 || iArr[0] != 0) {

//ToDo: C2714o.m10949a
o.a((Activity) this, (int) R.string.request_write_external_storage_permission, false);
        } else if (i == 1) {
            m10309l();
        } else if (i == 2) {
            m10308k();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f7039n = bundle.getString("SettingsFileName");
    }

    public void onSaveButtonClick(View view) {
        try {
            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(m10311n()), new StreamResult(new FileOutputStream(m10307j())));
//ToDo: m10913a
ru.proghouse.robocam.k.a(new Date());
            Toast.makeText(this, (int) R.string.settings_were_saved, 0).show();
            finish();
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_while_creating_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("SettingsFileName", this.f7039n);
        bundle.putString("SettingsXml", m10312o());
        super.onSaveInstanceState(bundle);
    }
}
