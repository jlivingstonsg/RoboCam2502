package ru.proghouse.robocam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import ru.proghouse.robocam.p063a.C2677a;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.RobotSettingsListActivity */
public class RobotSettingsListActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: A */
    private LinearLayout f7296A = null;

    /* renamed from: n */
    private Button f7297n = null;

    /* renamed from: o */
    private Button f7298o = null;

    /* renamed from: p */
    private ImageButton f7299p = null;

    /* renamed from: q */
    private File f7300q;
    /* renamed from: r */
    public ListView f7301r = null;

    /* renamed from: s */
    private Spinner f7302s = null;
    /* renamed from: t */
    public List<C2663a> f7303t = null;

    /* renamed from: u */
    private SharedPreferences.Editor f7304u = null;
    /* renamed from: v */
    public Context f7305v = null;
    /* renamed from: w */
    public String f7306w = null;

    /* renamed from: x */
    private Date f7307x = null;

    /* renamed from: y */
    private LinearLayout f7308y = null;

    /* renamed from: z */
    private TextView f7309z = null;

    /* access modifiers changed from: package-private */
    /* renamed from: ru.proghouse.robocam.RobotSettingsListActivity$a */
    public class C2663a {

        /* renamed from: a */
        public String f7314a;

        /* renamed from: b */
        public String f7315b;

        /* renamed from: c */
        public String f7316c;

        /* renamed from: d */
        public File f7317d;

        /* renamed from: e */
        public String f7318e;

        public C2663a(String str, String str2, String str3, File file, String str4) {
            this.f7314a = str;
            this.f7315b = str2;
            this.f7316c = str3;
            this.f7317d = file;
            this.f7318e = str4;
        }
    }

    /* renamed from: j */
    private void m10514j() {
        this.f7303t = new ArrayList();
        File[] listFiles = this.f7300q.listFiles();
        for (File file : listFiles) {
            if (file.getName().trim().endsWith(".xml")) {
                try {
                    Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                    parse.getDocumentElement().normalize();
                    if (parse.getDocumentElement().getNodeName().equals("EV3") || parse.getDocumentElement().getNodeName().equals("Custom")) {
                        String nodeName = parse.getDocumentElement().getNodeName();
                        if ("Custom".equals(nodeName)) {
                            nodeName = getString(R.string.custom_driver_desc);
                        }
                        this.f7303t.add(new C2663a(parse.getDocumentElement().getNodeName(), parse.getDocumentElement().getAttribute("Name"), parse.getDocumentElement().getAttribute("Description"), file, nodeName));
                    } else {
                        throw new Exception(getString(R.string.unknown_driver_name, new Object[]{parse.getDocumentElement().getNodeName()}));
                    }
                } catch (Throwable th) {
                    Toast.makeText(this, getString(R.string.error_while_opening_settings_file, new Object[]{file.getName(), th.getMessage()}), 1).show();
                }
            }
        }
        Collections.sort(this.f7303t, new Comparator<C2663a>() {
            /* class ru.proghouse.robocam.RobotSettingsListActivity.C26613 */

            /* renamed from: a */
            public int compare(C2663a aVar, C2663a aVar2) {
                long lastModified = aVar2.f7317d.lastModified() - aVar.f7317d.lastModified();
                if (lastModified == 0) {
                    return 0;
                }
                return lastModified < 0 ? -1 : 1;
            }
        });
        this.f7301r.setAdapter((ListAdapter) new ArrayAdapter<C2663a>(this, R.layout.spinner_item, this.f7303t) {
            /* class ru.proghouse.robocam.RobotSettingsListActivity.C26624 */

            public View getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = RobotSettingsListActivity.this.getLayoutInflater().inflate(R.layout.spinner_item, viewGroup, false);
                }
                C2663a aVar = (C2663a) getItem(i);
                ((TextView) view.findViewById(R.id.textView1)).setText(aVar.f7315b);
                ((TextView) view.findViewById(R.id.textView2)).setText(aVar.f7318e + ": " + aVar.f7316c);
                return view;
            }
        });
    }

    /* renamed from: k */
    private void m10515k() {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        for (C2663a aVar : this.f7303t) {
            arrayList.add(aVar.f7315b);
        }
        C2712m.m10938a(this.f7302s, this, arrayList, R.string.current_robot_settings);
        this.f7306w = getSharedPreferences("RoboCamSettings", 0).getString("current_robot_settings", "");
        while (true) {
            if (i >= this.f7303t.size()) {
                i = -1;
                break;
            } else if (this.f7303t.get(i).f7317d.getName().equals(this.f7306w)) {
                break;
            } else {
                i++;
            }
        }
        if (i > 0) {
            this.f7302s.setSelection(i);
        }
    }

    /* renamed from: l */
    public SharedPreferences.Editor m10516l() {
        if (this.f7304u == null) {
            this.f7304u = getSharedPreferences("RoboCamSettings", 0).edit();
        }
        return this.f7304u;
    }

    /* renamed from: m */
    public void m10517m() {
        if (this.f7304u == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            this.f7304u.apply();
        } else {
            this.f7304u.commit();
        }
    }

    /* renamed from: n */
    private void m10518n() {
        if (
/*ToDo: C2714o.m10955a*/o.a(this, 1)) {
            startActivity(new Intent(this, ImportActivity.class));
        }
    }

    public void onCancelButtonClick(View view) {
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonOverflow /*{ENCODED_INT: 2131492970}*/:
                view.showContextMenu();
                return;
            case R.id.buttonDelete /*{ENCODED_INT: 2131493099}*/:
                view.showContextMenu();
                return;
            case R.id.buttonAdd /*{ENCODED_INT: 2131493101}*/:
                view.showContextMenu();
                return;
            default:
                return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case -3:
                startActivity(new Intent(this, CustomSettingsActivity.class));
                break;
            case -2:
                m10518n();
                break;
            case -1:
                startActivity(new Intent(this, EV3SettingsActivity.class));
                break;
            default:
                if (menuItem.getItemId() > 0 && menuItem.getItemId() <= this.f7301r.getAdapter().getCount()) {
                    C2663a aVar = (C2663a) this.f7301r.getAdapter().getItem(menuItem.getItemId() - 1);
                    String name = aVar.f7317d.getName();
                    if (this.f7306w == null || name == null || name.length() < this.f7306w.length() || !name.substring(0, this.f7306w.length()).equals(this.f7306w)) {
                        if (aVar.f7317d.delete()) {
                            m10514j();
                            m10515k();
                            Toast.makeText(this, (int) R.string.settings_were_deleted, 1).show();
                            break;
                        } else {
                            Toast.makeText(this, (int) R.string.cannot_delete_settings_file, 1).show();
                            break;
                        }
                    } else {
                        Toast.makeText(this, (int) R.string.cannot_delete_current_settings_file, 1).show();
                        break;
                    }
                } else {
                    return super.onContextItemSelected(menuItem);
                }
                //break;
        }
        return true;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_robot_settings_list);
        this.f7305v = this;
        this.f7308y = (LinearLayout) findViewById(R.id.robot_settings_list_main_layout);
        this.f7308y.setEnabled(false);
        this.f7309z = (TextView) findViewById(R.id.textViewSubsWarning);
        this.f7296A = (LinearLayout) findViewById(R.id.linearLayoutSubsWarning);
        if (bundle != null && bundle.getBoolean("WarningHided")) {
            this.f7296A.setVisibility(8);
        }
        this.f7297n = (Button) findViewById(R.id.buttonAdd);
        this.f7297n.setOnClickListener(this);
        registerForContextMenu(this.f7297n);
        this.f7298o = (Button) findViewById(R.id.buttonDelete);
        this.f7298o.setOnClickListener(this);
        registerForContextMenu(this.f7298o);
        this.f7299p = (ImageButton) findViewById(R.id.buttonOverflow);
        this.f7299p.setOnClickListener(this);
        registerForContextMenu(this.f7299p);
        this.f7300q =
/*ToDo: C2714o.m10947a*/o.a(this);
        this.f7301r = (ListView) findViewById(R.id.settingsListView);
        m10514j();
        this.f7307x = new Date();
//ToDo: m10913a
ru.proghouse.robocam.k.a(this.f7307x);
        this.f7301r.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class ru.proghouse.robocam.RobotSettingsListActivity.C26591 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C2663a aVar = (C2663a) RobotSettingsListActivity.this.f7301r.getAdapter().getItem(i);
                Intent intent = new Intent(RobotSettingsListActivity.this.f7305v, aVar.f7314a.equals("EV3") ? EV3SettingsActivity.class : CustomSettingsActivity.class);
                intent.putExtra("SettingsFileName", aVar.f7317d.getName());
                RobotSettingsListActivity.this.startActivity(intent);
            }
        });
        this.f7302s = (Spinner) findViewById(R.id.spinnerCurrentRobotSettings);
        m10515k();
        this.f7302s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* class ru.proghouse.robocam.RobotSettingsListActivity.C26602 */

            /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
             method: ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void
             arg types: [android.content.Context, int]
             candidates:
              ru.proghouse.robocam.a.a.a(android.content.Context, java.lang.String):ru.proghouse.robocam.a.a
              ru.proghouse.robocam.a.a.a(java.lang.String, java.lang.Class<? extends ru.proghouse.robocam.a.a>):void
              ru.proghouse.robocam.a.a.a(int, java.lang.Object[]):void
              ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                String name = ((C2663a) RobotSettingsListActivity.this.f7303t.get(i)).f7317d.getName();
                if (!RobotSettingsListActivity.this.f7306w.equals(name)) {
                    RobotSettingsListActivity.this.m10516l().putString("current_robot_settings", name);
                    RobotSettingsListActivity.this.m10517m();
                    C2677a.m10587a(RobotSettingsListActivity.this.f7305v, true);
                    Toast.makeText(RobotSettingsListActivity.this.f7305v, (int) R.string.current_robot_settings_have_changed, 1).show();
                    String unused = RobotSettingsListActivity.this.f7306w = name;
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (view.getId() == R.id.buttonAdd) {
            contextMenu.add(0, -1, 0, R.string.action_add_ev3_settings);
            contextMenu.add(0, -3, 0, R.string.action_add_custom_settings);
        } else if (view.getId() == R.id.buttonDelete) {
            for (int i = 0; i < this.f7301r.getAdapter().getCount(); i++) {
                contextMenu.add(0, i + 1, i + 1, ((C2663a) this.f7301r.getAdapter().getItem(i)).f7315b);
            }
        } else if (view.getId() == R.id.buttonOverflow) {
            contextMenu.add(0, -2, 0, R.string.action_import_robot_settings_from_file);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onDestroy() {
        super.onDestroy();
    }

    public void onHideSubsButtonClick(View view) {
        this.f7296A.setVisibility(8);
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void
     arg types: [ru.proghouse.robocam.RobotSettingsListActivity, ?, int]
     candidates:
      ru.proghouse.robocam.o.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void
      ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void */
    @Override // android.support.v4.app.C0106n, android.support.v4.app.ActivityCompat.C0020a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr.length != 1 || iArr[0] != 0) {

//ToDo: C2714o.m10949a
o.a((Activity) this, (int) R.string.request_write_external_storage_permission, false);
        } else if (i == 1) {
            m10518n();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("WarningHided")) {
            this.f7296A.setVisibility(8);
        }
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      ru.proghouse.robocam.a.a.a(android.content.Context, java.lang.String):ru.proghouse.robocam.a.a
      ru.proghouse.robocam.a.a.a(java.lang.String, java.lang.Class<? extends ru.proghouse.robocam.a.a>):void
      ru.proghouse.robocam.a.a.a(int, java.lang.Object[]):void
      ru.proghouse.robocam.a.a.a(android.content.Context, boolean):void */
    @Override // android.support.v4.app.C0106n
    public void onResume() {
        super.onResume();
        //ToDo: m10917b
        if (!this.f7307x.equals(ru.proghouse.robocam.k.b())) {
            this.f7307x = ru.proghouse.robocam.k.b();
            m10514j();
            m10515k();
            C2677a.m10587a(this.f7305v, true);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("WarningHided", this.f7296A.getVisibility() == 8);
        super.onSaveInstanceState(bundle);
    }
}
