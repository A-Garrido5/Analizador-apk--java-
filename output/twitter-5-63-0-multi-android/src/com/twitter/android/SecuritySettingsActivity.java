// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import com.twitter.util.k;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.preference.Preference;
import android.os.Handler;
import android.content.BroadcastReceiver;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import android.os.Bundle;
import com.twitter.library.api.account.LvEligibilityResponse;
import android.content.Intent;
import android.preference.CheckBoxPreference;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.android.client.c;
import android.content.DialogInterface$OnClickListener;
import com.twitter.library.service.y;
import com.twitter.library.api.account.d;
import com.twitter.library.api.account.p;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.client.Session;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class SecuritySettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener, Preference$OnPreferenceClickListener
{
    private String a;
    private sa b;
    private boolean c;
    private boolean d;
    private boolean e;
    
    private static int a(final int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return array[0];
    }
    
    private void a(final int n) {
        Toast.makeText((Context)this, (CharSequence)this.getString(n), 1).show();
    }
    
    private void a(final String s, final int n, final int[] array) {
        final int a = a(array);
        if (a == 88) {
            this.Y.a(this.m().g(), "settings:login_verification:" + s + "::rate_limit");
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.m().g()).b(new String[] { "settings:login_verification:" + s + "::failure" });
        twitterScribeLog.d(String.valueOf(n));
        twitterScribeLog.c(String.valueOf(a));
        this.Y.a(twitterScribeLog);
    }
    
    private void a(final boolean b) {
        if (b) {
            this.a(this.getString(2131297209));
        }
        this.a(new d((Context)this, this.l().b(this.a), p.e((Context)this, this.a)), 3);
    }
    
    private DialogInterface$OnClickListener b(final String s) {
        return (DialogInterface$OnClickListener)new rq(this, s);
    }
    
    private DialogInterface$OnClickListener c(final String s) {
        return (DialogInterface$OnClickListener)new rr(this, s);
    }
    
    private void c() {
        this.d = true;
        new rz(this, this.getApplicationContext(), this.a).execute((Object[])new Void[0]);
    }
    
    private String d() {
        final Context applicationContext = this.getApplicationContext();
        if (p.f(applicationContext, this.a)) {
            return p.e(applicationContext, this.a);
        }
        return null;
    }
    
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        final int a = aa.f().a;
        final int[] a2 = ae.a(aa.c);
        final int a3 = a(a2);
        Label_0064: {
            switch (n) {
                case 1: {
                    this.d = false;
                    this.b();
                    final long g = this.m().g();
                    if (a == 200) {
                        this.Y.a(g, "settings:login_verification:set_enabled_for::success");
                        this.Y.a(g, "settings:login_verification:enroll::success");
                        this.a(2131297215);
                        ((CheckBoxPreference)this.findPreference((CharSequence)"login_verification")).setChecked(true);
                        this.e = false;
                        this.startActivity(new Intent((Context)this, (Class)BackupCodeActivity.class).putExtra("bc_account_name", this.a).putExtra("show_welcome", true));
                        return;
                    }
                    if (a == 400 && a3 == 247) {
                        this.Y.a(g, "settings:login_verification:set_enabled_for::failure");
                        this.Y.a(g, "settings:login_verification:enroll::success");
                        this.a(2131297215);
                        ((CheckBoxPreference)this.findPreference((CharSequence)"login_verification")).setChecked(true);
                        this.e = false;
                        this.showDialog(12);
                        return;
                    }
                    p.b(this.getApplicationContext(), this.a);
                    this.a("enroll", a, a2);
                    this.a(2131297212);
                    return;
                }
                case 2: {
                    this.b();
                    if (aa.a()) {
                        this.Y.a(this.m().g(), "settings:login_verification:unenroll::success");
                        p.b(this.getApplicationContext(), this.a);
                        ((CheckBoxPreference)this.findPreference((CharSequence)"login_verification")).setChecked(false);
                        this.e = false;
                        return;
                    }
                    this.a("unenroll", a, a2);
                    this.a(2131297212);
                    return;
                }
                case 3: {
                    if (!this.d) {
                        this.b();
                    }
                    if (aa.a()) {
                        final LvEligibilityResponse b = com.twitter.library.api.account.d.b(aa);
                        if (b.a() && this.d) {
                            this.d = false;
                            this.b();
                        }
                        if (!this.d) {
                            ((CheckBoxPreference)this.findPreference((CharSequence)"login_verification")).setChecked(b.a());
                            this.Y.a(this.m().g(), "settings:login_verification:eligibility::success");
                        }
                        if (b.b()) {
                            this.e = true;
                            this.showDialog(11);
                            return;
                        }
                        this.e = false;
                        return;
                    }
                    else {
                        this.a("eligibility", a, a2);
                        switch (a3) {
                            default: {
                                if (!p.f(this.getApplicationContext(), this.a)) {
                                    this.showDialog(6);
                                    return;
                                }
                                break Label_0064;
                            }
                            case 232: {
                                this.showDialog(4);
                                return;
                            }
                            case 233: {
                                this.showDialog(11);
                                return;
                            }
                            case 234: {
                                this.showDialog(5);
                                return;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
    
    void a(final String s) {
        final Bundle bundle = new Bundle();
        bundle.putString("msg", s);
        this.showDialog(7, bundle);
    }
    
    void b() {
        this.removeDialog(7);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.Y = com.twitter.android.client.c.a((Context)this);
        this.setTitle(2131297773);
        this.a = this.getIntent().getStringExtra("SecuritySettingsActivity_account_name");
        if (bundle != null) {
            this.d = bundle.getBoolean("enrolling", false);
        }
        else {
            this.d = false;
        }
        this.addPreferencesFromResource(2131165209);
        final boolean f = p.f(this.getApplicationContext(), this.a);
        final Preference preference = this.findPreference((CharSequence)"login_verification");
        preference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        ((CheckBoxPreference)preference).setChecked(f);
        this.findPreference((CharSequence)"login_verification_generate_code").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"login_verification_check_requests").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.b = new sa(this);
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushService.d);
        intentFilter.addAction(PushService.e);
        this.registerReceiver((BroadcastReceiver)this.b, intentFilter, com.twitter.library.provider.ae.a, (Handler)null);
        this.c = false;
        this.e = false;
    }
    
    protected Dialog onCreateDialog(final int n) {
        int n2 = 2131296445;
        final rs rs = new rs(this, n);
        final rt rt = new rt(this, n);
        final ru onDismissListener = new ru(this);
        final rv rv = new rv(this);
        Object o = new rw(this);
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 6: {
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131297213).setMessage(2131297212).setNeutralButton(17039370, (DialogInterface$OnClickListener)o).setOnCancelListener((DialogInterface$OnCancelListener)rv).create();
            }
            case 4: {
                final AlertDialog create = new AlertDialog$Builder((Context)this).setTitle(2131297219).setMessage(2131297206).setPositiveButton(2131296304, (DialogInterface$OnClickListener)new rx(this)).setNegativeButton(n2, (DialogInterface$OnClickListener)o).setOnCancelListener((DialogInterface$OnCancelListener)rv).create();
                create.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
                return (Dialog)create;
            }
            case 5: {
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131297219).setMessage(2131297222).setPositiveButton(2131298095, (DialogInterface$OnClickListener)new ry(this)).setNegativeButton(n2, (DialogInterface$OnClickListener)o).setOnCancelListener((DialogInterface$OnCancelListener)rv).create();
            }
            case 11: {
                final DialogInterface$OnClickListener b = this.b("settings:login_verification:switch:ok:click");
                final DialogInterface$OnClickListener c = this.c("settings:login_verification:unenroll:ok:click");
                int message;
                int n3;
                if (p.g((Context)this, this.a)) {
                    message = 2131297216;
                    n3 = 2131297927;
                }
                else {
                    message = 2131297230;
                    n3 = 2131296717;
                    n2 = 2131297891;
                    o = c;
                }
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131297219).setMessage(message).setPositiveButton(n3, b).setNegativeButton(n2, (DialogInterface$OnClickListener)o).setOnCancelListener((DialogInterface$OnCancelListener)rv).create();
            }
            case 1: {
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131297211).setMessage(2131297210).setPositiveButton(17039379, this.b("settings:login_verification:enroll:ok:click")).setNegativeButton(17039369, (DialogInterface$OnClickListener)rs).setOnCancelListener((DialogInterface$OnCancelListener)rt).create();
            }
            case 2: {
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131296808).setMessage(2131296807).setPositiveButton(17039379, this.c("settings:login_verification:unenroll:ok:click")).setNegativeButton(17039369, (DialogInterface$OnClickListener)rs).setOnCancelListener((DialogInterface$OnCancelListener)rt).create();
            }
            case 3: {
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle((CharSequence)"").setMessage(2131297214).setIcon(17301543).setNeutralButton(17039370, (DialogInterface$OnClickListener)rs).setOnCancelListener((DialogInterface$OnCancelListener)rt).show();
            }
            case 12: {
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131297221).setMessage(2131297220).setNeutralButton(2131297362, (DialogInterface$OnClickListener)rs).setOnCancelListener((DialogInterface$OnCancelListener)rt).create();
            }
            case 7: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setProgressStyle(0);
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        if (this.b != null) {
            this.unregisterReceiver((BroadcastReceiver)this.b);
        }
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if (!"login_verification".equals(preference.getKey())) {
            return true;
        }
        if (!(boolean)o) {
            this.Y.a(this.m().g(), "settings:login_verification:::deselect");
            this.showDialog(2);
            return false;
        }
        this.Y.a(this.m().g(), "settings:login_verification:::select");
        if (!this.e) {
            this.showDialog(1);
            return false;
        }
        this.showDialog(11);
        return false;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        final String key = preference.getKey();
        if ("login_verification_generate_code".equals(key)) {
            this.startActivity(new Intent((Context)this, (Class)BackupCodeActivity.class).putExtra("bc_account_name", this.a));
            return true;
        }
        if ("login_verification_check_requests".equals(key)) {
            this.startActivity(new Intent((Context)this, (Class)LoginVerificationActivity.class).putExtra("lv_account_name", this.a));
            return true;
        }
        return false;
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog, final Bundle bundle) {
        switch (n) {
            default: {
                super.onPrepareDialog(n, dialog);
            }
            case 7: {
                ((ProgressDialog)dialog).setMessage((CharSequence)k.a(bundle.getString("msg")));
            }
            case 1: {
                this.Y.a(this.m().g(), "settings:login_verification:enroll::impression");
                super.onPrepareDialog(n, dialog);
            }
            case 2: {
                this.Y.a(this.m().g(), "settings:login_verification:unenroll::impression");
                super.onPrepareDialog(n, dialog);
            }
        }
    }
    
    @Override
    protected void onResume() {
        int n = 1;
        super.onResume();
        final Session m = this.m();
        if (!m.d()) {
            DispatchActivity.a((Activity)this, this.getIntent());
            return;
        }
        final c y = this.Y;
        final long g = m.g();
        final String[] array = new String[n];
        array[0] = "settings:login_verification:::impression";
        y.a(g, array);
        if (this.d) {
            n = 0;
        }
        this.a(n != 0);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("enrolling", this.d);
    }
}
