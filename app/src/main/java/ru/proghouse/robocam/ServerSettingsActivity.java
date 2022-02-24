package ru.proghouse.robocam;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Size;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.ServerSettingsActivity */
public class ServerSettingsActivity extends AppCompatActivity {

    /* renamed from: A */
    private String f7327A;

    /* renamed from: B */
    private EditText f7328B = null;

    /* renamed from: C */
    private String f7329C;
    /* renamed from: D */
    public EditText f7330D = null;

    /* renamed from: E */
    private String f7331E;
    /* renamed from: F */
    public EditText f7332F = null;

    /* renamed from: G */
    private CheckBox f7333G = null;

    /* renamed from: H */
    private CheckBox f7334H = null;

    /* renamed from: I */
    private ImageView f7335I = null;

    /* renamed from: J */
    private boolean f7336J = true;

    /* renamed from: K */
    private boolean f7337K = true;
    /* renamed from: L */
    public TextView f7338L = null;
    /* renamed from: M */
    public TextView f7339M = null;

    /* renamed from: N */
    private List<String> f7340N = new ArrayList();

    /* renamed from: O */
    private CheckBox f7341O = null;

    /* renamed from: P */
    private CheckBox f7342P = null;

    /* renamed from: Q */
    private boolean f7343Q = false;

    /* renamed from: R */
    private boolean f7344R = false;
    /* renamed from: S */
    public LinearLayout f7345S = null;
    /* renamed from: T */
    public LinearLayout f7346T = null;

    /* renamed from: n */
    CameraManager f7347n = null;

    /* renamed from: o */
    private Spinner f7348o = null;

    /* renamed from: p */
    private int f7349p = 0;

    /* renamed from: q */
    private String f7350q = null;

    /* renamed from: r */
    private Spinner f7351r = null;
    /* renamed from: s */
    public int f7352s = -1;

    /* renamed from: t */
    private int f7353t = -1;
    /* renamed from: u */
    public TextView f7354u = null;

    /* renamed from: v */
    private SeekBar f7355v = null;

    /* renamed from: w */
    private int f7356w = 60;

    /* renamed from: x */
    private SharedPreferences.Editor f7357x = null;

    /* renamed from: y */
    private String f7358y;

    /* renamed from: z */
    private EditText f7359z = null;

    /* renamed from: b */
    public void m10526b(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<String> a = mo7620a(arrayList);
        C2712m.m10938a(this.f7351r, this, a, R.string.previewSize);
        if (z && this.f7352s < 0) {
            //ToDo: cast...
            /*C2706h*/ h hVar = (/*C2706h*/ h) arrayList.get(0);
            /*C2706h*/ h hVar2 = (/*C2706h*/ h) arrayList.get(arrayList.size() - 1);
            int round = Math.round(((float) a.size()) / 3.0f);
            if (hVar./*f7567a*/a > hVar2./*f7567a*/a || hVar./*f7568b*/b > hVar2./*f7568b*/b) {
                this.f7352s = a.size() - round;
            } else {
                this.f7352s = round - 1;
            }
        }
        if (this.f7352s < 0) {
            this.f7352s = 0;
        }
        if (this.f7352s >= a.size()) {
            this.f7352s = a.size() - 1;
        }
        this.f7351r.setSelection(this.f7352s, true);
        this.f7351r.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* class ru.proghouse.robocam.ServerSettingsActivity.C26705 */

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                int unused = ServerSettingsActivity.this.f7352s = i;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    /* renamed from: k */
    private SharedPreferences.Editor m10532k() {
        if (this.f7357x == null) {
            this.f7357x = getSharedPreferences("RoboCamSettings", 0).edit();
        }
        return this.f7357x;
    }

    /* renamed from: l */
    private void m10533l() {
        if (this.f7357x == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            this.f7357x.apply();
        } else {
            this.f7357x.commit();
        }
    }

    /* renamed from: a */
    public List<String> mo7620a(List</*C2706h*/ h> list) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f7347n.getCameraCharacteristics(this.f7350q).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                HashSet hashSet = new HashSet();
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                for (Size size : outputSizes) {
                    hashSet.add(Float.valueOf(((float) size.getHeight()) / ((float) size.getWidth())));
                }
                Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(35);
                for (Size size2 : outputSizes2) {
                    if (hashSet.contains(Float.valueOf(((float) size2.getHeight()) / ((float) size2.getWidth())))) {
                        list.add(new /*C2706h*/ h(size2));
                    }
                }
                Collections.sort(list, new C2697b());
                for (/*C2706h*/h hVar : list) {
                    arrayList.add("" + hVar./*f7567a*/a + "x" + hVar./*f7568b*/b);
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getLocalizedMessage(), 1).show();
            }
        } else {
            Camera open = Build.VERSION.SDK_INT >= 9 ? Camera.open(this.f7349p) : Camera.open();
            try {
                for (Camera.Size size3 : open.getParameters().getSupportedPreviewSizes()) {
                    if (list != null) {
                        list.add(new /*C2706h*/ h(size3));
                    }
                    arrayList.add("" + size3.width + "x" + size3.height);
                }
            } finally {
                open.release();
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public List<String> mo7621j() {
        ArrayList arrayList = new ArrayList();
        this.f7340N.clear();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                this.f7347n = (CameraManager) getSystemService("camera");
                String[] cameraIdList = this.f7347n.getCameraIdList();
                for (String str : cameraIdList) {
                    this.f7340N.add(str);
                    switch (((Integer) this.f7347n.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue()) {
                        case 0:
                            arrayList.add(getString(R.string.camera_facing_front));
                            break;
                        case 1:
                            arrayList.add(getString(R.string.camera_facing_back));
                            break;
                        default:
                            arrayList.add(getString(R.string.camera_facing_external));
                            break;
                    }
                }
            } catch (Exception e) {
                Toast.makeText(this, e.getLocalizedMessage(), 1).show();
            }
        } else if (Build.VERSION.SDK_INT >= 9) {
            int numberOfCameras = Camera.getNumberOfCameras();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    arrayList.add(getString(R.string.camera_facing_front));
                } else if (cameraInfo.facing == 0) {
                    arrayList.add(getString(R.string.camera_facing_back));
                } else {
                    arrayList.add(getString(R.string.camera_facing_external));
                }
            }
        } else {
            arrayList.add(getString(R.string.camera_facing_back));
        }
        return arrayList;
    }

    public void onCancelButtonClick(View view) {
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_server_settings);
        SharedPreferences sharedPreferences = getSharedPreferences("RoboCamSettings", 0);
        this.f7341O = (CheckBox) findViewById(R.id.checkBoxUseLocalControls);
        this.f7343Q = sharedPreferences.getBoolean("use_local_controls", false);
        this.f7341O.setChecked(this.f7343Q);
        this.f7345S = (LinearLayout) findViewById(R.id.linearLayoutServer);
        this.f7345S.setVisibility(this.f7343Q ? 8 : 0);
        this.f7346T = (LinearLayout) findViewById(R.id.linearLayoutLocal);
        this.f7346T.setVisibility(this.f7343Q ? 0 : 8);
        this.f7341O.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class ru.proghouse.robocam.ServerSettingsActivity.C26661 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = 0;
                ServerSettingsActivity.this.f7345S.setVisibility(z ? 8 : 0);
                LinearLayout b = ServerSettingsActivity.this.f7346T;
                if (!z) {
                    i = 8;
                }
                b.setVisibility(i);
            }
        });
        this.f7342P = (CheckBox) findViewById(R.id.checkBoxMaximizeJoysticks);
        this.f7344R = sharedPreferences.getBoolean("maximize_joysticks", false);
        this.f7342P.setChecked(this.f7344R);
        List<String> j = mo7621j();
        this.f7348o = (Spinner) findViewById(R.id.spinnerCamera);
        C2712m.m10938a(this.f7348o, this, j, R.string.camera);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f7350q = sharedPreferences.getString("camera2_id", null);
            if (this.f7350q == null || !this.f7340N.contains(this.f7350q)) {
                this.f7350q = this.f7340N.get(0);
            }
            this.f7348o.setSelection(this.f7340N.indexOf(this.f7350q), true);
        } else {
            this.f7349p = sharedPreferences.getInt("camera_id", 0);
            if (this.f7349p < 0 || this.f7349p >= j.size()) {
                this.f7349p = 0;
            }
            this.f7348o.setSelection(this.f7349p, true);
        }
        this.f7348o.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /* class ru.proghouse.robocam.ServerSettingsActivity.C26672 */

            /* DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
             method: ru.proghouse.robocam.ServerSettingsActivity.a(ru.proghouse.robocam.ServerSettingsActivity, boolean):void
             arg types: [ru.proghouse.robocam.ServerSettingsActivity, int]
             candidates:
              ru.proghouse.robocam.ServerSettingsActivity.a(ru.proghouse.robocam.ServerSettingsActivity, int):int
              android.support.v4.a.n.a(android.view.View, android.view.Menu):boolean
              ru.proghouse.robocam.ServerSettingsActivity.a(ru.proghouse.robocam.ServerSettingsActivity, boolean):void */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                ServerSettingsActivity.this.m10526b(false);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        if (bundle != null) {
            this.f7352s = bundle.getInt("preview_size", -1);
        }
        if (bundle == null || this.f7352s < 0) {
            this.f7352s = sharedPreferences.getInt("preview_size", -1);
        }
        this.f7353t = sharedPreferences.getInt("preview_size", -1);
        this.f7351r = (Spinner) findViewById(R.id.spinnerPreviewSize);
        m10526b(true);
        this.f7354u = (TextView) findViewById(R.id.textViewJpegQuality2);
        this.f7355v = (SeekBar) findViewById(R.id.seekBarJpegQuality);
        this.f7356w = sharedPreferences.getInt("jpeg_quality", 60);
        this.f7355v.incrementProgressBy(5);
        this.f7355v.setProgress(this.f7356w);
        this.f7354u.setText("" + this.f7356w + "%");
        this.f7355v.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class ru.proghouse.robocam.ServerSettingsActivity.C26683 */

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                ServerSettingsActivity.this.f7354u.setText("" + ((i / 5) * 5) + "%");
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        this.f7334H = (CheckBox) findViewById(R.id.checkBoxUseRenderScript);
        this.f7335I = (ImageView) findViewById(R.id.imageViewUseRenderScript);
        Class<?> cls = null;
        try {
            cls = Class.forName("ru.proghouse.robocam.C2707i");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT < 23 || cls == null) {
            this.f7334H.setVisibility(8);
            this.f7335I.setVisibility(8);
        } else {
            this.f7336J = sharedPreferences.getBoolean("use_render_script", true);
            this.f7334H.setChecked(this.f7336J);
        }
        this.f7358y = sharedPreferences.getString("driver_name", "admin");
        this.f7359z = (EditText) findViewById(R.id.editTextDriverName);
        this.f7359z.setText(this.f7358y);
        this.f7327A = sharedPreferences.getString("driver_pswd", "123");
        this.f7328B = (EditText) findViewById(R.id.editTextDriverPassword);
        this.f7328B.setText(this.f7327A);
        this.f7329C = sharedPreferences.getString("spectator_name", "guest");
        this.f7338L = (TextView) findViewById(R.id.textViewSpectatorName);
        this.f7330D = (EditText) findViewById(R.id.editTextSpectatorName);
        this.f7330D.setText(this.f7329C);
        this.f7331E = sharedPreferences.getString("spectator_pswd", "123");
        this.f7339M = (TextView) findViewById(R.id.textViewSpectatorPassword);
        this.f7332F = (EditText) findViewById(R.id.editTextSpectatorPassword);
        this.f7332F.setText(this.f7331E);
        this.f7337K = sharedPreferences.getBoolean("allow_spectators", true);
        this.f7333G = (CheckBox) findViewById(R.id.checkBoxAllowSpectators);
        this.f7333G.setChecked(this.f7337K);
        this.f7333G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class ru.proghouse.robocam.ServerSettingsActivity.C26694 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ServerSettingsActivity.this.f7330D.setEnabled(z);
                ServerSettingsActivity.this.f7332F.setEnabled(z);
                ServerSettingsActivity.this.f7339M.setEnabled(z);
                ServerSettingsActivity.this.f7338L.setEnabled(z);
            }
        });
        this.f7330D.setEnabled(this.f7337K);
        this.f7332F.setEnabled(this.f7337K);
        this.f7339M.setEnabled(this.f7337K);
        this.f7338L.setEnabled(this.f7337K);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f7352s = bundle.getInt("preview_size", -1);
    }

    public void onSaveButtonClick(View view) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f7358y != this.f7359z.getText().toString()) {
            m10532k().putString("driver_name", this.f7359z.getText().toString());
            z = true;
        } else {
            z = false;
        }
        if (this.f7327A != this.f7328B.getText().toString()) {
            m10532k().putString("driver_pswd", this.f7328B.getText().toString());
            z = true;
        }
        if (this.f7329C != this.f7330D.getText().toString()) {
            m10532k().putString("spectator_name", this.f7330D.getText().toString());
            z = true;
        }
        if (this.f7331E != this.f7332F.getText().toString()) {
            m10532k().putString("spectator_pswd", this.f7332F.getText().toString());
            z2 = true;
        } else {
            z2 = z;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (!this.f7340N.get(this.f7348o.getSelectedItemPosition()).equals(this.f7350q)) {
                m10532k().putString("camera2_id", this.f7340N.get(this.f7348o.getSelectedItemPosition()));
                z2 = true;
            }
        } else if (this.f7349p != this.f7348o.getSelectedItemPosition()) {
            m10532k().putInt("camera_id", this.f7348o.getSelectedItemPosition());
            z2 = true;
        }
        if (this.f7353t != this.f7351r.getSelectedItemPosition()) {
            m10532k().putInt("preview_size", this.f7351r.getSelectedItemPosition());
            z2 = true;
        }
        int progress = (this.f7355v.getProgress() / 5) * 5;
        if (progress == 0) {
            progress = 5;
        }
        if (progress != this.f7356w) {
            m10532k().putInt("jpeg_quality", progress);
            z2 = true;
        }
        if (this.f7337K != this.f7333G.isChecked()) {
            m10532k().putBoolean("allow_spectators", this.f7333G.isChecked());
            z2 = true;
        }
        if (this.f7336J != this.f7334H.isChecked()) {
            m10532k().putBoolean("use_render_script", this.f7334H.isChecked());
            z2 = true;
        }
        if (this.f7343Q != this.f7341O.isChecked()) {
            m10532k().putBoolean("use_local_controls", this.f7341O.isChecked());
            z2 = true;
        }
        if (this.f7344R != this.f7342P.isChecked()) {
            m10532k().putBoolean("maximize_joysticks", this.f7342P.isChecked());
        } else {
            z3 = z2;
        }
        if (z3) {
            m10533l();
        }
        Toast.makeText(this, (int) R.string.settings_were_saved, 0).show();
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0106n
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("preview_size", this.f7352s);
        super.onSaveInstanceState(bundle);
    }
}
