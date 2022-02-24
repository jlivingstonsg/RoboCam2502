package ru.proghouse.robocam;

import android.app.Activity;
import android.support.v7.widget.AppCompatButton;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

@SuppressWarnings("ALL")
/* renamed from: ru.proghouse.robocam.m */
public class C2712m {

    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static CheckBox m10930a(Activity activity, LinearLayout r5, boolean z, int i, int i2) {
        CheckBox checkBox = new CheckBox(new ContextThemeWrapper(activity, (int) R.style.SettingsCheckBox), null, R.style.SettingsCheckBox);
        checkBox.setHeight(Math.round(TypedValue.applyDimension(1, 56.0f, activity.getResources().getDisplayMetrics())));
        checkBox.setChecked(z);
        checkBox.setText(i);
        checkBox.setPadding(i2, checkBox.getPaddingTop(), checkBox.getPaddingRight(), checkBox.getPaddingBottom());
        r5.addView(checkBox);
        return checkBox;
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static EditText m10931a(Activity activity, LinearLayout r5, float f, int i, int i2) {
        if (i != 0) {
            m10936a(activity, (LinearLayout) r5, i);
        }
        if (i2 != 0) {
            m10941b(activity, r5, i2);
        }
        EditText editText = new EditText(new ContextThemeWrapper(activity, (int) R.style.SettingsEditTextFloat), null, R.style.SettingsEditTextFloat);
        editText.setText(Float.toString(f));
        r5.addView(editText);
        return editText;
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static EditText m10932a(Activity activity, LinearLayout r5, int i, int i2, int i3) {
        if (i2 != 0) {
            m10936a(activity, (LinearLayout) r5, i2);
        }
        if (i3 != 0) {
            m10941b(activity, r5, i3);
        }
        EditText editText = new EditText(new ContextThemeWrapper(activity, (int) R.style.SettingsEditTextInteger), null, R.style.SettingsEditTextInteger);
        editText.setText(Integer.toString(i));
        r5.addView(editText);
        return editText;
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static EditText m10933a(Activity activity, LinearLayout r5, String str, int i, int i2) {
        if (i != 0) {
            m10936a(activity, (LinearLayout) r5, i);
        }
        if (i2 != 0) {
            m10941b(activity, r5, i2);
        }
        EditText editText = new EditText(new ContextThemeWrapper(activity, (int) R.style.SettingsEditText), null, R.style.SettingsEditText);
        editText.setText(str);
        r5.addView(editText);
        return editText;
    }

    /* WARN: Type inference failed for: r3v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static ImageView m10934a(Activity activity, LinearLayout r3) {
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.spacer_small);
        r3.addView(imageView);
        return imageView;
    }


    /* WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    public static Spinner m10935a(Activity activity, LinearLayout r9, List<String> list, int i, int i2, LinearLayout[] r13) {
        LinearLayout linearLayout = new LinearLayout(activity);
        //ToDo: Spinner related...
        if (/*r13 != 0 && */r13.length > 0) {
            r13[0] = linearLayout;
        }
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r9.addView(linearLayout);
        Spinner spinner = new Spinner(new ContextThemeWrapper(activity, (int) R.style.SettingsSpinner), null, R.style.SettingsSpinner);
        m10938a(spinner, activity, list, i2);
        spinner.setSelection(i);
        spinner.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(spinner);
        ImageView imageView = new ImageView(activity);
        imageView.setBackgroundResource(R.drawable.abc_spinner);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        linearLayout.addView(imageView);
        return spinner;
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static TextView m10936a(Activity activity, LinearLayout r5, int i) {
        TextView textView = new TextView(new ContextThemeWrapper(activity, (int) R.style.SettingsSectionEditTextTitle), null, R.style.SettingsSectionEditTextTitle);
        textView.setText(activity.getString(i));
        r5.addView(textView);
        return textView;
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static TextView m10937a(Activity activity, LinearLayout r5, String str) {
        TextView textView = new TextView(new ContextThemeWrapper(activity, (int) R.style.SettingsSectionEditTextDescBP), null, R.style.SettingsSectionEditTextDescBP);
        textView.setText(str);
        r5.addView(textView);
        return textView;
    }

    /* renamed from: a */
    public static void m10938a(Spinner spinner, Activity activity, List<String> list, int i) {
        m10939a(spinner, activity, list, i, (int) R.layout.spinner_dropdown_item);
    }

    /* WARN: Type inference failed for: r6v0, types: [android.widget.Spinner] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static void m10939a(Spinner r6, Activity activity, List<String> list, int i, int i2) {
        C2701d dVar = new C2701d(activity, r6, R.layout.spinner_item, list, i);
        dVar.setDropDownViewResource(i2);
        r6.setAdapter(dVar);
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    public static ImageView m10940b(Activity activity, LinearLayout r5) {
        ImageView imageView = new ImageView(new ContextThemeWrapper(activity, (int) R.style.VerticalSeparator), null, R.style.VerticalSeparator);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        r5.addView(imageView);
        return imageView;
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    public static TextView m10941b(Activity activity, LinearLayout r5, int i) {
        TextView textView = new TextView(new ContextThemeWrapper(activity, (int) R.style.SettingsSectionEditTextDesc), null, R.style.SettingsSectionEditTextDesc);
        textView.setText(activity.getString(i));
        r5.addView(textView);
        return textView;
    }

    /* WARN: Type inference failed for: r5v0, types: [android.widget.LinearLayout] */
    /* WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    public static Button m10942c(Activity activity, LinearLayout r5, int i) {
        AppCompatButton hVar = new AppCompatButton(new ContextThemeWrapper(activity, (int) R.style.SettingsActionButton), null, R.style.SettingsActionButton);
        hVar.setText(activity.getString(i));
        hVar.setFocusable(false);
        r5.addView(hVar);
        return hVar;
    }
}
