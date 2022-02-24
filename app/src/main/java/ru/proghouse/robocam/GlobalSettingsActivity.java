package ru.proghouse.robocam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/* renamed from: ru.proghouse.robocam.GlobalSettingsActivity */
public class GlobalSettingsActivity extends AppCompatActivity {

    /* renamed from: n */
    private Button f7131n = null;

    /* renamed from: o */
    private Button f7132o = null;

    public void onCameraButtonClick(View view) {
        startActivity(new Intent(this, ServerSettingsActivity.class));
    }

    public void onCancelButtonClick(View view) {
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.C0099i, android.support.v4.app.C0106n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_global_settings);
        this.f7131n = (Button) findViewById(R.id.buttonServer);
        this.f7131n.setTransformationMethod(null);
        this.f7132o = (Button) findViewById(R.id.buttonRobot);
        this.f7132o.setTransformationMethod(null);
    }

    public void onRobotButtonClick(View view) {
        startActivity(new Intent(this, RobotSettingsListActivity.class));
    }
}
