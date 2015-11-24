// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.view.MenuItem;
import android.view.KeyEvent;
import android.view.Menu;
import android.os.Environment;
import android.app.ProgressDialog;
import android.content.DialogInterface$OnClickListener;
import android.text.TextUtils;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import com.whatsapp.util.b_;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.ViewParent;
import android.os.Bundle;
import android.content.res.Configuration;
import com.whatsapp.util.Log;
import android.os.Build$VERSION;
import android.view.MenuInflater;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatCallback;
import android.app.Activity;
import android.support.v7.app.AppCompatDelegate;
import android.preference.PreferenceActivity;

public class DialogToastPreferenceActivity extends PreferenceActivity implements gu
{
    private static final String[] z;
    private int a;
    private AppCompatDelegate b;
    private String c;
    private int d;
    private a67 e;
    private boolean f;
    
    static {
        final String[] z2 = new String[16];
        String s = "\u000eW]F'OH";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0432:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'S';
                        break;
                    }
                    case 0: {
                        c2 = ' ';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '3';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000eW]V!EYGp";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "DQRy<GL\\t TLAp5EJV{0EYPa:VQGl|OVQt0KHAp S]W:2CLZc:TA\u0013{<\u0000YPa:V]";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000eW]G6SM^p";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "S]Ga:N_@:!EKFx6\u000fOAz=G\u0015@a2T]\u0013";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "M|Zt?O_gz2SL~p SYTp\u001aD";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "M|Zt?O_gz2SLg|'L]zq";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000eW]F2V]z{ TY]v6sLRa6";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "M|Zt?O_gz2SL~p SYTp";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u000eW]F'AJG";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "UV^z&NLVq";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "M|Zt?O_gz2SL~p SYTp";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "M|Zt?O_gz2SL~p SYTp\u001aD";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "M|Zt?O_gz2SLg|'L]zq";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u000eW]Q6SLAz*";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u000eW]E2UKV";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    break Label_0432;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public DialogToastPreferenceActivity() {
        this.f = true;
    }
    
    private AppCompatDelegate a() {
        if (this.b == null) {
            this.b = AppCompatDelegate.create((Activity)this, null);
        }
        return this.b;
    }
    
    public void a(final int d) {
        this.d = d;
        if (!this.isFinishing()) {
            this.showDialog(500);
        }
    }
    
    public void a(final int a, final int d) {
        this.a = a;
        this.d = d;
        if (!this.isFinishing()) {
            this.showDialog(501);
        }
    }
    
    public void a(final int a, final int d, final String[] array) {
        this.a = a;
        this.d = d;
        if (!this.isFinishing()) {
            this.showDialog(500);
        }
    }
    
    public void a(@Nullable final Toolbar supportActionBar) {
        this.a().setSupportActionBar(supportActionBar);
    }
    
    public boolean a() {
        return false;
    }
    
    public boolean a(final String s, final String s2) {
        return false;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a().addContentView(view, viewGroup$LayoutParams);
    }
    
    public boolean b() {
        return false;
    }
    
    public void c() {
        this.removeDialog(501);
    }
    
    public boolean d() {
        return false;
    }
    
    public void f(final String c) {
        this.c = c;
        if (!this.isFinishing()) {
            this.showDialog(500);
        }
    }
    
    public MenuInflater getMenuInflater() {
        return this.a().getMenuInflater();
    }
    
    public void invalidateOptionsMenu() {
        this.a().invalidateOptionsMenu();
    }
    
    public void onBackPressed() {
        if (this.f || Build$VERSION.SDK_INT < 11) {
            super.onBackPressed();
            if (!App.I) {
                return;
            }
        }
        Log.e(DialogToastPreferenceActivity.z[2]);
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a().onConfigurationChanged(configuration);
    }
    
    protected void onCreate(final Bundle bundle) {
        Log.i(this.getClass().getName() + DialogToastPreferenceActivity.z[1]);
        if (alm.c) {
            this.getWindow().getDecorView().setLayoutDirection(3);
        }
        this.getTheme().applyStyle(2131427514, true);
        this.a().installViewFactory();
        this.a().onCreate(bundle);
        super.onCreate(bundle);
        this.e = new a67();
        if (Build$VERSION.SDK_INT >= 11) {
            final View viewById = this.findViewById(16908298);
            if (viewById != null) {
                int paddingLeft = viewById.getPaddingLeft();
                int paddingLeft2 = viewById.getPaddingLeft();
                final ViewParent parent = viewById.getParent();
                if (parent instanceof View) {
                    final View view = (View)parent;
                    paddingLeft += view.getPaddingLeft();
                    paddingLeft2 += view.getPaddingRight();
                    view.setPadding(0, 0, 0, 0);
                }
                viewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
                viewById.setScrollBarStyle(33554432);
            }
        }
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        if (App.aS == 3) {
            b_.c((Activity)this);
        }
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 500: {
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                String message;
                if (TextUtils.isEmpty((CharSequence)this.c)) {
                    message = this.getString(this.d);
                }
                else {
                    message = this.c;
                }
                final AlertDialog$Builder setPositiveButton = alertDialog$Builder.setMessage(message).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new f6(this));
                if (this.a != 0) {
                    setPositiveButton.setTitle(this.a);
                }
                return setPositiveButton.create();
            }
            case 501: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                if (this.a != 0) {
                    progressDialog.setTitle(this.a);
                }
                progressDialog.setMessage((CharSequence)this.getString(this.d));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 601: {
                final AlertDialog$Builder setTitle = new AlertDialog$Builder((Context)this).setTitle(this.getString(2131231349));
                int n2;
                if (App.aw()) {
                    n2 = 2131231509;
                }
                else {
                    n2 = 2131231510;
                }
                return setTitle.setMessage(this.getString(n2)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new a4(this)).create();
            }
            case 602: {
                while (true) {
                    Label_0372: {
                        if (!App.aw()) {
                            break Label_0372;
                        }
                        int title;
                        int message2;
                        Object o;
                        if (DialogToastPreferenceActivity.z[10].equals(Environment.getExternalStorageState())) {
                            title = 2131231353;
                            message2 = 2131231352;
                            o = new ad5(this);
                        }
                        else {
                            title = 2131231351;
                            message2 = 2131231350;
                            final boolean i = App.I;
                            o = null;
                            if (i) {
                                break Label_0372;
                            }
                        }
                        final AlertDialog$Builder setPositiveButton2 = new AlertDialog$Builder((Context)this).setTitle(title).setMessage(message2).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new al8(this));
                        AlertDialog$Builder setPositiveButton3;
                        if (o != null) {
                            setPositiveButton3 = setPositiveButton2.setPositiveButton(2131230853, (DialogInterface$OnClickListener)o);
                        }
                        else {
                            setPositiveButton3 = setPositiveButton2;
                        }
                        return setPositiveButton3.create();
                    }
                    int message2 = 2131231420;
                    int title = 2131231349;
                    Object o = null;
                    continue;
                }
            }
        }
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        if (App.aS == 3) {
            b_.c((Activity)this);
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    protected void onDestroy() {
        Log.i(this.getClass().getName() + DialogToastPreferenceActivity.z[14]);
        super.onDestroy();
        this.a().onDestroy();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (App.aS == 3) {
            switch (n) {
                case 24: {
                    b_.a((Activity)this).show();
                    return true;
                }
                case 84: {
                    b_.a((Activity)this, false);
                    return true;
                }
                case 25: {
                    b_.f();
                    return true;
                }
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    protected void onPause() {
        Log.i(this.getClass().getName() + DialogToastPreferenceActivity.z[15]);
        App.c(this);
        super.onPause();
        if (this.e.hasMessages(0)) {
            this.e.removeMessages(0);
        }
        App.t();
        this.f = false;
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.a().onPostCreate(bundle);
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.a().onPostResume();
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog) {
        switch (n) {
            case 500: {
                final AlertDialog alertDialog = (AlertDialog)dialog;
                String message;
                if (TextUtils.isEmpty((CharSequence)this.c)) {
                    message = this.getString(this.d);
                }
                else {
                    message = this.c;
                }
                alertDialog.setMessage(message);
                if (App.I) {
                    break;
                }
                return;
            }
        }
        super.onPrepareDialog(n, dialog);
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.c = bundle.getString(DialogToastPreferenceActivity.z[11]);
        this.d = bundle.getInt(DialogToastPreferenceActivity.z[12], 0);
        this.a = bundle.getInt(DialogToastPreferenceActivity.z[13], 0);
    }
    
    protected void onResume() {
        Log.i(this.getClass().getName() + DialogToastPreferenceActivity.z[3]);
        App.a(this);
        super.onResume();
        this.e.sendEmptyMessageDelayed(0, 3000L);
        this.f = true;
        if (App.c((Context)this) != 3 && App.c((Context)this) != 2) {
            Log.i(DialogToastPreferenceActivity.z[4] + App.c((Context)this));
            this.startActivity(new Intent((Context)this, (Class)Main.class));
            this.finish();
        }
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        Log.i(this.getClass().getName() + DialogToastPreferenceActivity.z[7]);
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(DialogToastPreferenceActivity.z[8], (CharSequence)this.c);
        bundle.putInt(DialogToastPreferenceActivity.z[5], this.d);
        bundle.putInt(DialogToastPreferenceActivity.z[6], this.a);
    }
    
    protected void onStart() {
        Log.i(this.getClass().getName() + DialogToastPreferenceActivity.z[9]);
        super.onStart();
    }
    
    protected void onStop() {
        Log.i(this.getClass().getName() + DialogToastPreferenceActivity.z[0]);
        super.onStop();
        this.a().onStop();
    }
    
    protected void onTitleChanged(final CharSequence title, final int n) {
        super.onTitleChanged(title, n);
        this.a().setTitle(title);
    }
    
    public void setContentView(final int n) {
        final Toolbar toolbar = (Toolbar)this.getLayoutInflater().inflate(2130903226, (ViewGroup)null, false);
        toolbar.setTitle(this.getTitle());
        Label_0050: {
            if (App.W) {
                toolbar.setNavigationIcon(2130838737);
                if (!App.I) {
                    break Label_0050;
                }
            }
            toolbar.setNavigationIcon(2130837523);
        }
        final LinearLayout contentView = new LinearLayout((Context)this);
        contentView.setOrientation(1);
        contentView.addView((View)toolbar, -1, this.getResources().getDimensionPixelSize(2131361793));
        final FrameLayout frameLayout = new FrameLayout((Context)this);
        alm.a(this.getLayoutInflater(), n, (ViewGroup)frameLayout, true);
        contentView.addView((View)frameLayout, -1, -1);
        this.setContentView((View)contentView);
        this.a(toolbar);
        toolbar.setNavigationOnClickListener((View$OnClickListener)new ey(this));
    }
    
    public void setContentView(final View contentView) {
        this.a().setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a().setContentView(view, viewGroup$LayoutParams);
    }
}
