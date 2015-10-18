// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.ArrayList;
import android.net.Uri;
import android.widget.AdapterView;
import android.text.Editable;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.library.util.bq;
import android.widget.SpinnerAdapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.App;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.internal.android.widget.ToolBar;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.EditText;
import android.view.View;
import android.widget.AdapterView$OnItemSelectedListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;

public class BugReporterActivity extends TwitterFragmentActivity implements TextWatcher, AdapterView$OnItemSelectedListener
{
    private static final bg[] a;
    private View b;
    private EditText c;
    private int d;
    private ImageView e;
    
    static {
        a = new bg[] { new bg("Where did we go wrong?", "QA"), new bg("Tweet anatomy/detail", "TLNA"), new bg("Activity timeline", "TLNA"), new bg("DMs", "DM"), new bg("Profiles", "PROF").a(new String[] { "Android" }), new bg("Search/Typeahead", "TLNA"), new bg("Push Notifications", "MESSAGING").a(new String[] { "Android Push Notifications" }), new bg("Notifications timeline", "TLNA").a("Notifications Timeline", "Android"), new bg("Trends/Discover timeline", "TLNA"), new bg("Photos", "PHOTO").a(new String[] { "Photo: Android" }), new bg("Videos", "PHOTO").a(new String[] { "Video: Android" }), new bg("Composer", "COMPOSE"), new bg("Cards", "CK"), new bg("Translation/Localization", "INTLTRIAGE").b("i18n", "TTCP_0006"), new bg("Geo/Geotagging", "GPS"), new bg("NUX/Prompts/Find People", "STRT"), new bg("MagicRecs", "SD"), new bg("Lists", "TLNA"), new bg("SignUp/SignIn", "GTE"), new bg("International Products", "INTP"), new bg("VIT", "VIT"), new bg("Product Safety", "CUP"), new bg("Promoted", "REVFMTS"), new bg("Commerce", "CUES"), new bg("Audio/Video Card", "AVC").a(new String[] { "av:consumption:android" }), new bg("Home timeline", "TLNA"), new bg("Accessibility", "MAX"), new bg("Highlights", "SD").a(new String[] { "Homescreen Recommendations" }), new bg("Design Feedback", "DESIGN"), new bg("Crash/Other", "QA") };
    }
    
    public BugReporterActivity() {
        this.d = 0;
    }
    
    private void h() {
        Toast.makeText((Context)this, (CharSequence)"Your bug report has been generated. Make sure to use your @twitter.com email address when sending!", 1).show();
        final Intent intent = new Intent(this.getIntent());
        intent.setComponent((ComponentName)null);
        intent.putExtra("android.intent.extra.SUBJECT", BugReporterActivity.a[this.d].a(this.c.getText().toString().trim()));
        this.startActivityForResult(Intent.createChooser(intent, (CharSequence)null), 8000);
    }
    
    protected int a(final ToolBar toolBar) {
        toolBar.a(2131886670).c(!TextUtils.isEmpty((CharSequence)this.c.getText().toString().trim()));
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.d(false);
        bn.c(2130968618);
        bn.a(true);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.setTitle("File a bug");
        if (!App.f()) {
            ErrorReporter.a(new IllegalStateException("BugReporterActivity should not be created in release builds."));
        }
        final Spinner spinner = (Spinner)this.findViewById(2131886325);
        this.c = (EditText)this.findViewById(2131886324);
        this.b = this.findViewById(2131886326);
        this.e = (ImageView)this.findViewById(2131886327);
        this.c.addTextChangedListener((TextWatcher)this);
        final ArrayAdapter adapter = new ArrayAdapter((Context)this, 17367048, (Object[])BugReporterActivity.a);
        adapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter)adapter);
        spinner.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        jv.a(2131951656, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() != 2131886670) {
            return super.a(jx);
        }
        if (!bq.b((Context)this)) {
            new AlertDialog$Builder((Context)this).setTitle((CharSequence)"Twitter bug reporter").setMessage((CharSequence)"Setup your phone with your @twitter.com email address so we can follow up on your bug report.").setInverseBackgroundForced(true).setNegativeButton((CharSequence)"Skip", (DialogInterface$OnClickListener)new bf(this)).setPositiveButton((CharSequence)"Setup", (DialogInterface$OnClickListener)new be(this)).create().show();
            return true;
        }
        this.h();
        return true;
    }
    
    public void afterTextChanged(final Editable editable) {
        this.Q();
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    @Override
    protected void g_() {
        super.g_();
        az.b((Context)this);
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 8000) {
            this.finish();
        }
    }
    
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        az.b((Context)this);
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int d, final long n) {
        this.d = d;
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        final ArrayList parcelableArrayListExtra = this.getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra.isEmpty()) {
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            return;
        }
        this.e.setImageURI((Uri)null);
        this.e.setAdjustViewBounds(true);
        this.e.setImageURI((Uri)parcelableArrayListExtra.get(0));
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
