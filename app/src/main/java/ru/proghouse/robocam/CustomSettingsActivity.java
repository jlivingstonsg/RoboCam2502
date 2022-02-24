package ru.proghouse.robocam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
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

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.CustomSettingsActivity */
public class CustomSettingsActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: A */
    private C2618a[] f7008A = new C2618a[4];

    /* renamed from: n */
    private int f7009n = 0;

    /* renamed from: o */
    private String f7010o;

    /* renamed from: p */
    private ImageButton f7011p = null;

    /* renamed from: q */
    private EditText f7012q = null;

    /* renamed from: r */
    private EditText f7013r = null;

    /* renamed from: s */
    private CheckBox f7014s = null;

    /* renamed from: t */
    private CheckBox f7015t = null;

    /* renamed from: u */
    private CheckBox f7016u = null;

    /* renamed from: v */
    private EditText f7017v = null;

    /* renamed from: w */
    private EditText f7018w = null;
    /* renamed from: x */
    public LinearLayout f7019x = null;

    /* renamed from: y */
    private C2704f f7020y = null;

    /* renamed from: z */
    private HashSet<Integer> f7021z = new HashSet<>();

    /* renamed from: ru.proghouse.robocam.CustomSettingsActivity$a */
    class C2618a {

        /* renamed from: a */
        int f7023a;

        /* renamed from: b */
        public CheckBox f7024b;

        /* renamed from: c */
        public ImageView f7025c;

        /* renamed from: d */
        public Spinner f7026d;

        /* renamed from: e */
        public ImageView f7027e;

        /* renamed from: f */
        public Spinner f7028f;

        /* renamed from: g */
        public ImageView f7029g;

        /* renamed from: h */
        public Spinner f7030h;

        /* renamed from: j */
        private C2618a f7032j;

        public C2618a(Activity activity, int i) {
            this.f7032j = null;
            this.f7032j = this;
            switch (i) {
                case 0:
                    m10291a(activity, i, R.id.checkBoxJoystickVisibility1, R.id.spinnerJoystickShape1, R.id.imageViewJoystickBehavior1_1, R.id.imageViewJoystickBehavior1_2, R.id.spinnerJoystickBehavior1_1, R.id.spinnerJoystickBehavior1_2, R.id.imageView1_1);
                    return;
                case 1:
                    m10291a(activity, i, R.id.checkBoxJoystickVisibility2, R.id.spinnerJoystickShape2, R.id.imageViewJoystickBehavior2_1, R.id.imageViewJoystickBehavior2_2, R.id.spinnerJoystickBehavior2_1, R.id.spinnerJoystickBehavior2_2, R.id.imageView2_1);
                    return;
                case 2:
                    m10291a(activity, i, R.id.checkBoxJoystickVisibility3, R.id.spinnerJoystickShape3, R.id.imageViewJoystickBehavior3_1, R.id.imageViewJoystickBehavior3_2, R.id.spinnerJoystickBehavior3_1, R.id.spinnerJoystickBehavior3_2, R.id.imageView3_1);
                    return;
                case 3:
                    m10291a(activity, i, R.id.checkBoxJoystickVisibility4, R.id.spinnerJoystickShape4, R.id.imageViewJoystickBehavior4_1, R.id.imageViewJoystickBehavior4_2, R.id.spinnerJoystickBehavior4_1, R.id.spinnerJoystickBehavior4_2, R.id.imageView4_1);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void m10290a() {
            int i = this.f7024b.isChecked() ? 0 : 8;
            this.f7032j.f7025c.setVisibility(i);
            this.f7032j.f7026d.setVisibility(i);
            m10293b();
        }

        /* renamed from: a */
        private void m10291a(Activity activity, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f7023a = i;
            this.f7024b = (CheckBox) activity.findViewById(i2);
            this.f7025c = (ImageView) activity.findViewById(i8);
            this.f7026d = (Spinner) activity.findViewById(i3);
            C2712m.m10938a(this.f7026d, activity, Arrays.asList(activity.getString(R.string.joystick_shape_vertical), activity.getString(R.string.joystick_shape_horizontal), activity.getString(R.string.joystick_shape_circular), activity.getString(R.string.joystick_shape_quadratic), activity.getString(R.string.joystick_shape_arrows), activity.getString(R.string.joystick_shape_vertical_arrows), activity.getString(R.string.joystick_shape_horizontal_arrows)), R.string.joystick_shape);
            this.f7027e = (ImageView) activity.findViewById(i4);
            this.f7029g = (ImageView) activity.findViewById(i5);
            this.f7028f = (Spinner) activity.findViewById(i6);
            C2712m.m10938a(this.f7028f, activity, Arrays.asList(activity.getString(R.string.joystick_behavior_return_to_zero), activity.getString(R.string.joystick_behavior_hold_position)), R.string.joystick_behavior1);
            this.f7030h = (Spinner) activity.findViewById(i7);
            C2712m.m10938a(this.f7030h, activity, Arrays.asList(activity.getString(R.string.joystick_behavior_return_to_zero), activity.getString(R.string.joystick_behavior_hold_position)), R.string.joystick_behavior2);
            this.f7024b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class ru.proghouse.robocam.CustomSettingsActivity.C2618a.C26191 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C2618a.this.m10290a();
                }
            });
            this.f7026d.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class ru.proghouse.robocam.CustomSettingsActivity.C2618a.C26202 */

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C2618a.this.m10293b();
                    C2618a.this.m10295c();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.f7026d.setSelection(2);
            m10290a();
        }

        /* renamed from: b */
        public void m10293b() {
            int i;
            int i2 = 0;
            int i3 = 8;
            switch (this.f7026d.getSelectedItemPosition()) {
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
            if (this.f7026d.getVisibility() != 0) {
                i = 8;
            } else {
                i3 = i2;
            }
            this.f7027e.setVisibility(i3);
            this.f7028f.setVisibility(i3);
            this.f7029g.setVisibility(i);
            this.f7030h.setVisibility(i);
        }

        /* renamed from: c */
        public void m10295c() {
            switch (this.f7026d.getSelectedItemPosition()) {
                case 0:
                case 5:
                    if (this.f7023a != 0) {
                        if (this.f7023a != 1) {
                            if (this.f7023a != 2) {
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 1:
                case 6:
                    if (this.f7023a != 0) {
                        if (this.f7023a != 1) {
                            if (this.f7023a != 2) {
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                    if (this.f7023a != 0) {
                        if (this.f7023a != 1) {
                            if (this.f7023a != 2) {
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private String m10280a(boolean z, boolean z2) {
        String str;
        File file = z ? new File(Environment.getExternalStorageDirectory(), ".robocam") : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        file.mkdirs();
        String str2 = "RoboCam_";
        String obj = this.f7012q.getText().toString();
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
        /*ToDo: C2714o.m10954a*/ o.a(str4, m10285k());
        return str4;
    }

    /* renamed from: a */
    private void m10281a(File file) {
        try {
            m10283a(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m10282a(String str) {
        try {
            m10283a(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str))));
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
    private void m10283a(Document document) {
        document.getDocumentElement().normalize();
        String nodeName = document.getDocumentElement().getNodeName();
        if (!nodeName.equals("Custom")) {
            try {
                throw new Exception(getString(R.string.unknown_driver_name, new Object[]{nodeName}));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f7012q.setText(document.getDocumentElement().getAttribute("Name"));
        this.f7013r.setText(document.getDocumentElement().getAttribute("Description"));
        this.f7017v.setText(document.getDocumentElement().getAttribute("Callsign"));
        this.f7018w.setText(document.getDocumentElement().getAttribute("Response"));
        this.f7014s.setChecked(C2713n.m10946a(document.getDocumentElement().getAttribute("ShowDebugInfo"), true));
        this.f7015t.setChecked(C2713n.m10946a(document.getDocumentElement().getAttribute("HideJoysticks"), true));
        NodeList elementsByTagName = document.getElementsByTagName("Joystick");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
            int a = C2713n.m10944a(element.getAttribute("Index"), -1);
            if (a >= 0 && a < 4) {
                C2618a aVar = this.f7008A[a];
                aVar.f7024b.setChecked(C2713n.m10946a(element.getAttribute("Visible"), false));
                String a2 = C2713n.m10945a(element.getAttribute("Shape"), "c");
                if (a2.equals("v")) {
                    aVar.f7026d.setSelection(0);
                } else if (a2.equals("h")) {
                    aVar.f7026d.setSelection(1);
                } else if (a2.equals("c")) {
                    aVar.f7026d.setSelection(2);
                } else if (a2.equals("q")) {
                    aVar.f7026d.setSelection(3);
                } else if (a2.equals("a")) {
                    aVar.f7026d.setSelection(4);
                } else if (a2.equals("l")) {
                    aVar.f7026d.setSelection(5);
                } else if (a2.equals("t")) {
                    aVar.f7026d.setSelection(6);
                }
                aVar.f7028f.setSelection(C2713n.m10944a(element.getAttribute("Behavior0"), 0));
                aVar.f7030h.setSelection(C2713n.m10944a(element.getAttribute("Behavior1"), 0));
            }
        }
        this.f7021z.clear();
        this.f7020y.mo7823b(this);
        NodeList elementsByTagName2 = document.getElementsByTagName("KeyGroup");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            this.f7016u.setChecked(C2713n.m10946a(element2.getAttribute("Active"), false));
            NodeList elementsByTagName3 = element2.getElementsByTagName("Key");
            for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
                Integer valueOf = Integer.valueOf(((Element) elementsByTagName3.item(i3)).getTextContent());
                if (valueOf.intValue() > 0 && valueOf.intValue() <= 255) {
                    this.f7021z.add(valueOf);
                }
            }
        }
        this.f7020y.mo7821a(this, this.f7021z);
    }

    /* renamed from: j */
    private String m10284j() {
        try {
            DOMSource dOMSource = new DOMSource(m10285k());
            StringWriter stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_while_creating_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
            return null;
        }
    }

    /* renamed from: k */
    private Document m10285k() {
        Document newDocument = null;
        try {
            newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        newDocument.appendChild(newDocument.createElement("Custom"));
        Element documentElement = newDocument.getDocumentElement();
        documentElement.setAttribute("Name", this.f7012q.getText().toString());
        documentElement.setAttribute("Description", this.f7013r.getText().toString());
        documentElement.setAttribute("Callsign", this.f7017v.getText().toString());
        documentElement.setAttribute("Response", this.f7018w.getText().toString());
        if (!this.f7014s.isChecked()) {
            documentElement.setAttribute("ShowDebugInfo", "0");
        }
        if (!this.f7015t.isChecked()) {
            documentElement.setAttribute("HideJoysticks", "0");
        }
        C2618a[] aVarArr = this.f7008A;
        int i = 0;
        for (C2618a aVar : aVarArr) {
            Element createElement = newDocument.createElement("Joystick");
            documentElement.appendChild(createElement);
            createElement.setAttribute("Index", Integer.toString(i));
            if (aVar.f7024b.isChecked()) {
                createElement.setAttribute("Visible", "1");
            }
            switch (aVar.f7026d.getSelectedItemPosition()) {
                case 0:
                    createElement.setAttribute("Shape", "v");
                    break;
                case 1:
                    createElement.setAttribute("Shape", "h");
                    break;
                case 2:
                    if (aVar.f7024b.isChecked()) {
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
            if (aVar.f7028f.getSelectedItemPosition() != 0) {
                createElement.setAttribute("Behavior0", Integer.toString(aVar.f7028f.getSelectedItemPosition()));
            }
            if (aVar.f7030h.getSelectedItemPosition() != 0) {
                createElement.setAttribute("Behavior1", Integer.toString(aVar.f7030h.getSelectedItemPosition()));
            }
            i++;
        }
        Element createElement2 = newDocument.createElement("KeyGroup");
        documentElement.appendChild(createElement2);
        if (this.f7016u.isChecked()) {
            createElement2.setAttribute("Active", "1");
        }
        if (this.f7020y.f7561a != null) {
            Iterator<Integer> it = this.f7020y.f7561a.iterator();
            while (it.hasNext()) {
                Element createElement3 = newDocument.createElement("Key");
                createElement2.appendChild(createElement3);
                createElement3.setTextContent(it.next().toString());
            }
        }
        return newDocument;
    }

    /* renamed from: l */
    private File m10286l() {
        return new File(
/*ToDo: C2714o.m10947a*/o.a(this), this.f7010o);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void
     arg types: [ru.proghouse.robocam.CustomSettingsActivity, java.lang.String, int]
     candidates:
      ru.proghouse.robocam.o.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void
      ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void */
    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.CustomSettingsActivity.a(boolean, boolean):java.lang.String
     arg types: [int, int]
     candidates:
      android.support.v4.a.n.a(android.view.View, android.view.Menu):boolean
      ru.proghouse.robocam.CustomSettingsActivity.a(boolean, boolean):java.lang.String */
    /* renamed from: m */
    private void m10287m() {
        if (
/*ToDo: C2714o.m10955a*/o.a(this, 1)) {
            try {
                /*ToDo: C2714o.m10950a*/ o.a((Activity) this, getString(R.string.settings_ware_exported_successfully, new Object[]{m10280a(false, false)}), false);
            } catch (Exception e) {
                Toast.makeText(this, getString(R.string.error_while_exporting_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
            }
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.CustomSettingsActivity.a(boolean, boolean):java.lang.String
     arg types: [int, int]
     candidates:
      android.support.v4.a.n.a(android.view.View, android.view.Menu):boolean
      ru.proghouse.robocam.CustomSettingsActivity.a(boolean, boolean):java.lang.String */
    /* renamed from: n */
    private void m10288n() {
        if (
/*ToDo: C2714o.m10955a*/o.a(this, 2)) {
            try {
                String a = m10280a(true, true);
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

    /* renamed from: o */
    private void m10289o() {
        try {
            Document k = m10285k();
            k.getDocumentElement().setAttribute("Name", /*ToDo: C2714o.m10948a*/ o.a(this, this.f7012q.getText().toString(), "Custom"));
            /*ToDo: C2714o.m10953a*/ o.a(new File(
/*ToDo: C2714o.m10947a*/o.a(this), "Custom_" + new SimpleDateFormat("yyyyMMddHHmmsszzz", Locale.ENGLISH).format(new Date()) + ".xml"), k);
//ToDo: m10913a
            ru.proghouse.robocam.k.a(new Date());
            Toast.makeText(this, getString(R.string.settings_ware_copied_successfully), 1).show();
        } catch (Exception e) {
            Toast.makeText(this, getString(R.string.error_while_copying_settings_xml, new Object[]{e.getLocalizedMessage()}), 1).show();
        }
    }

    @Override // android.support.v4.app.C0106n
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            switch (i) {
                case 1:
                    this.f7020y.mo7822a(this, intent.getIntArrayExtra("android.intent.extra.STREAM"));
                    return;
                default:
                    return;
            }
        }
    }

    public void onCancelButtonClick(View view) {
        finish();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.buttonOverflow) {
            view.showContextMenu();
        } else if (C2704f.class.isAssignableFrom(view.getClass())) {
            ((C2704f) view).mo7820a(this, 1);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == -2) {
            m10288n();
        } else if (menuItem.getItemId() == -3) {
            m10287m();
        } else if (menuItem.getItemId() == -4) {
            m10289o();
        }
        return super.onContextItemSelected(menuItem);
    }

    @Override
    // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_custom_settings);
        this.f7011p = (ImageButton) findViewById(R.id.buttonOverflow);
        this.f7011p.setOnClickListener(this);
        registerForContextMenu(this.f7011p);
        if (Build.VERSION.SDK_INT < 17) {
            this.f7009n = new CheckBox(this).getPaddingLeft();
        }
        this.f7012q = (EditText) findViewById(R.id.editTextBotName);
        this.f7013r = (EditText) findViewById(R.id.editTextDesc);
        this.f7014s = (CheckBox) findViewById(R.id.checkBoxShowDebugInfo);
        this.f7015t = (CheckBox) findViewById(R.id.checkBoxHideJoysticks);
        this.f7017v = (EditText) findViewById(R.id.editTextCallsign);
        this.f7018w = (EditText) findViewById(R.id.editTextResponse);
        this.f7016u = (CheckBox) findViewById(R.id.checkBoxActive);
        this.f7019x = (LinearLayout) findViewById(R.id.keygroupLayout);
        this.f7020y = C2704f.m10901a(this, this.f7019x, this.f7021z, R.string.keys, getString(R.string.keys));
        this.f7020y.setOnClickListener(this);
        this.f7016u.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class ru.proghouse.robocam.CustomSettingsActivity.C26171 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CustomSettingsActivity.this.f7019x.setVisibility(z ? 0 : 8);
            }
        });
        this.f7010o = getIntent().getStringExtra("SettingsFileName");
        if (this.f7010o == null || this.f7010o.equals("")) {
            String string = bundle != null ? bundle.getString("SettingsFileName") : null;
            if (string == null || string.equals("")) {
                this.f7010o = "Custom_" + new SimpleDateFormat("yyyyMMddHHmmsszzz", Locale.ENGLISH).format(new Date()) + ".xml";
            } else {
                this.f7010o = string;
            }
        }
        for (int i = 0; i < 4; i++) {
            this.f7008A[i] = new C2618a(this, i);
        }
        String string2 = bundle != null ? bundle.getString("SettingsXml") : null;
        if (string2 == null || string2.equals("")) {
            File l = m10286l();
            if (l.exists()) {
                try {
                    m10281a(l);
                } catch (Exception e) {
                    Toast.makeText(this, getString(R.string.error_while_opening_settings_file, new Object[]{this.f7010o, e.getLocalizedMessage()}), 1).show();
                }
            }
        } else {
            try {
                m10282a(string2);
            } catch (Exception e2) {
                Toast.makeText(this, getString(R.string.error_while_opening_settings, new Object[]{e2.getLocalizedMessage()}), 1).show();
            }
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, -2, 0, R.string.action_send_robot_settings);
        contextMenu.add(0, -3, 0, R.string.action_export_robot_settings_to_file);
        contextMenu.add(0, -4, 0, R.string.action_copy_robot_settings);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void
     arg types: [ru.proghouse.robocam.CustomSettingsActivity, ?, int]
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
            m10287m();
        } else if (i == 2) {
            m10289o();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f7010o = bundle.getString("SettingsFileName");
    }

    public void onSaveButtonClick(View view) {
        try {
            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(m10285k()), new StreamResult(new FileOutputStream(m10286l())));
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
        bundle.putString("SettingsFileName", this.f7010o);
        bundle.putString("SettingsXml", m10284j());
        super.onSaveInstanceState(bundle);
    }
}
