package ru.proghouse.robocam;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import ru.proghouse.robocam.p063a.C2677a;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.ImportActivity */
public class ImportActivity extends AppCompatActivity {
    /* renamed from: n */
    public ListView f7180n = null;
    /* renamed from: o */
    public List<File> f7181o = new ArrayList();
    /* renamed from: p */
    public String f7182p = null;

    /* renamed from: q */
    private TextView f7183q = null;

    /* renamed from: r */
    private Activity f7184r = null;

    /* renamed from: s */
    private SharedPreferences.Editor f7185s = null;
    /* renamed from: t */
    public int f7186t = -1;

    /* renamed from: a */
    public List<File> m10394a(String str) {
        File[] fileArr;
        if (str == null || str.equals("")) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if ((!externalStorageDirectory.exists() || !externalStorageDirectory.isDirectory()) && System.getenv("EXTERNAL_STORAGE") != null) {
                externalStorageDirectory = new File(System.getenv("EXTERNAL_STORAGE"));
            }
            File file = System.getenv("SECONDARY_STORAGE") != null ? new File(System.getenv("SECONDARY_STORAGE")) : null;
            fileArr = (externalStorageDirectory == null || !externalStorageDirectory.exists() || !externalStorageDirectory.isDirectory() || file == null || !file.exists() || !file.isDirectory()) ? (externalStorageDirectory == null || !externalStorageDirectory.exists() || !externalStorageDirectory.isDirectory()) ? (file == null || !file.exists() || !file.isDirectory()) ? null : new File[]{file} : new File[]{externalStorageDirectory} : new File[]{externalStorageDirectory, file};
        } else {
            fileArr = new File(str).listFiles();
        }
        if (fileArr == null) {
            fileArr = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArr) {
            if (file2.isDirectory() || file2.getName().trim().toLowerCase().endsWith(".xml")) {
                arrayList.add(file2);
            }
        }
        Collections.sort(arrayList, new Comparator<File>() {
            /* class ru.proghouse.robocam.ImportActivity.C26383 */

            /* renamed from: a */
            public int compare(File file, File file2) {
                if (file.isDirectory() && file2.isFile()) {
                    return -1;
                }
                if (!file.isFile() || !file2.isDirectory()) {
                    return file.getPath().compareTo(file2.getPath());
                }
                return 1;
            }
        });
        return arrayList;
    }

    /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void
     arg types: [ru.proghouse.robocam.ImportActivity, java.lang.String, int]
     candidates:
      ru.proghouse.robocam.o.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      ru.proghouse.robocam.o.a(android.app.Activity, int, boolean):void
      ru.proghouse.robocam.o.a(android.app.Activity, java.lang.String, boolean):void */
    /* renamed from: a */
    public void m10395a(File file) {
        try {
            m10403k().putString("current_path", this.f7182p);
            m10404l();
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            parse.getDocumentElement().normalize();
            String nodeName = parse.getDocumentElement().getNodeName();
            C2677a a = C2677a.m10586a(this, nodeName);
            a.mo7670a(this, file, parse);
            parse.getDocumentElement().setAttribute("Name", /*ToDo: C2714o.m10948a*/ o.a(this, a.mo7684h(), a.mo7681f()));
            /*ToDo: C2714o.m10953a*/ o.a(new File(
/*ToDo: C2714o.m10947a*/o.a(this), nodeName + "_" + new SimpleDateFormat("yyyyMMddHHmmsszzz", Locale.ENGLISH).format(new Date()) + ".xml"), parse);
//ToDo: m10913a
ru.proghouse.robocam.k.a(new Date());
            Toast.makeText(this, getString(R.string.settings_ware_imported_successfully), 1).show();
            finish();
        } catch (Throwable th) {
            /*ToDo: C2714o.m10950a*/ o.a((Activity) this, getString(R.string.error_while_opening_settings_file, new Object[]{file.getName(), th.getMessage()}), true);
        }
    }

    /* renamed from: j */
    public void m10402j() {
        if (this.f7182p == null || this.f7182p.equals("")) {
            this.f7183q.setText("/storage");
        } else {
            this.f7183q.setText(this.f7182p);
        }
    }

    /* renamed from: k */
    private SharedPreferences.Editor m10403k() {
        if (this.f7185s == null) {
            this.f7185s = getSharedPreferences("RoboCamSettings", 0).edit();
        }
        return this.f7185s;
    }

    /* renamed from: l */
    private void m10404l() {
        if (this.f7185s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            this.f7185s.apply();
        } else {
            this.f7185s.commit();
        }
    }

    public void onBackButtonClick(View view) {
        onBackPressed();
    }

    /* WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* WARNING: Removed duplicated region for block: B:29:0x00c1 A[EDGE_INSN: B:29:0x00c1->B:24:0x00c1 ?: BREAK  , SYNTHETIC] */
    @Override // android.support.v4.app.C0106n
    public void onBackPressed() {
        int i;
        if (this.f7182p == null || this.f7182p.equals("")) {
            m10403k().putString("current_path", this.f7182p);
            m10404l();
            finish();
            return;
        }
        String str = this.f7182p;
        if (!this.f7182p.toLowerCase().equals(System.getenv("EXTERNAL_STORAGE") != null ? System.getenv("EXTERNAL_STORAGE").toLowerCase() : null)) {
            if (!this.f7182p.toLowerCase().equals(System.getenv("SECONDARY_STORAGE") != null ? System.getenv("SECONDARY_STORAGE").toLowerCase() : null) && !this.f7182p.toLowerCase().equals(Environment.getExternalStorageDirectory().getPath().toLowerCase())) {
                this.f7182p = new File(this.f7182p).getParent();
                this.f7181o.clear();
                this.f7181o.addAll(m10394a(this.f7182p));
                ((ArrayAdapter) this.f7180n.getAdapter()).notifyDataSetChanged();
                i = 0;
                while (true) {
                    if (i >= this.f7181o.size()) {
                        break;
                    } else if (this.f7181o.get(i).toString().equals(str)) {
                        this.f7186t = i;
                        this.f7180n.post(new Runnable() {
                            /* class ru.proghouse.robocam.ImportActivity.C26394 */

                            public void run() {
                                if (ImportActivity.this.f7186t > 0) {
                                    ImportActivity.this.f7180n.setSelection(ImportActivity.this.f7186t);
                                }
                                int unused = ImportActivity.this.f7186t = -1;
                            }
                        });
                        this.f7180n.setSelection(i);
                        break;
                    } else {
                        i++;
                    }
                }
                m10402j();
            }
        }
        this.f7182p = null;
        this.f7181o.clear();
        this.f7181o.addAll(m10394a(this.f7182p));
        ((ArrayAdapter) this.f7180n.getAdapter()).notifyDataSetChanged();
        i = 0;
       // while (true) {
        while (i >= this.f7181o.size()) {
            /*if (i >= this.f7181o.size()) {
            }*/
            //ToDo: Maybe  i++ shoulbe here Import related...
            //i++;
        }
        i++;
        m10402j();
    }

    public void onCancelButtonClick(View view) {
        m10403k().putString("current_path", this.f7182p);
        m10404l();
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_import);
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("RoboCamSettings", 0);
            if (bundle != null) {
                this.f7182p = bundle.getString("current_path");
            } else {
                this.f7182p = sharedPreferences.getString("current_path", null);
                if (this.f7182p != null) {
                    File file = new File(this.f7182p);
                    if (!file.exists() || !file.isDirectory()) {
                        this.f7182p = null;
                    }
                }
            }
            this.f7184r = this;
            this.f7183q = (TextView) findViewById(R.id.fileTextView);
            m10402j();
            this.f7180n = (ListView) findViewById(R.id.fileListView);
            this.f7181o.addAll(m10394a(this.f7182p));
            ArrayAdapter<File> r0 = new ArrayAdapter<File>(this, R.layout.spinner_item, this.f7181o) {
                /* class ru.proghouse.robocam.ImportActivity.C26361 */

                /* WARNING: Removed duplicated region for block: B:24:0x00bd  */
                public View getView(int i, View view, ViewGroup viewGroup) {
                    String name;
                    String str = null;
                    if (view == null) {
                        view = ImportActivity.this.getLayoutInflater().inflate(R.layout.spinner_item, viewGroup, false);
                    }
                    File file = (File) getItem(i);
                    if (file.isDirectory()) {
                        if (!file.getPath().toLowerCase().equals(System.getenv("EXTERNAL_STORAGE") != null ? System.getenv("EXTERNAL_STORAGE").toLowerCase() : null)) {
                            String lowerCase = file.getPath().toLowerCase();
                            if (System.getenv("SECONDARY_STORAGE") != null) {
                                str = System.getenv("SECONDARY_STORAGE").toLowerCase();
                            }
                            if (!lowerCase.equals(str)) {
                            }
                        }
                        name = file.getPath();
                        ((TextView) view.findViewById(R.id.textView1)).setText(name);
                        ((TextView) view.findViewById(R.id.textView2)).setVisibility(8);
                        ((ImageView) view.findViewById(R.id.imageView)).setVisibility(0);
                        if (!file.isDirectory()) {
                            ((ImageView) view.findViewById(R.id.imageView)).setImageResource(R.drawable.folder);
                        } else {
                            ((ImageView) view.findViewById(R.id.imageView)).setImageResource(R.drawable.document);
                        }
                        return view;
                    }
                    name = file.getName();
                    ((TextView) view.findViewById(R.id.textView1)).setText(name);
                    ((TextView) view.findViewById(R.id.textView2)).setVisibility(8);
                    ((ImageView) view.findViewById(R.id.imageView)).setVisibility(0);
                    if (!file.isDirectory()) {
                    }
                    return view;
                }
            };
            this.f7180n.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                /* class ru.proghouse.robocam.ImportActivity.C26372 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    ArrayAdapter arrayAdapter = (ArrayAdapter) ImportActivity.this.f7180n.getAdapter();
                    File file = (File) arrayAdapter.getItem(i);
                    if (file.isDirectory()) {
                        String unused = ImportActivity.this.f7182p = file.getPath();
                        ImportActivity.this.f7181o.clear();
                        ImportActivity.this.f7181o.addAll(ImportActivity.this.m10394a(ImportActivity.this.f7182p));
                        arrayAdapter.notifyDataSetChanged();
                        ImportActivity.this.f7180n.setSelectionAfterHeaderView();
                        ImportActivity.this.m10402j();
                        return;
                    }
                    ImportActivity.this.m10395a(file);
                }
            });
            this.f7180n.setAdapter((ListAdapter) r0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f7182p = bundle.getString("current_path");
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("current_path", this.f7182p);
        super.onSaveInstanceState(bundle);
    }
}
