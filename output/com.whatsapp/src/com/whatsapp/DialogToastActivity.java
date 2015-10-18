// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.app.ActionBar$LayoutParams;
import android.view.MenuItem;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import com.whatsapp.util.b_;
import android.os.Bundle;
import android.content.res.Configuration;
import com.whatsapp.util.Log;
import android.util.TypedValue;
import android.os.Build$VERSION;
import android.support.v4.app.DialogFragment;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.LinearLayout;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.AppCompatActivity;

public class DialogToastActivity extends AppCompatActivity implements gu
{
    public static boolean h;
    private static final String[] z;
    private ViewGroup c;
    private View d;
    private ViewGroup e;
    private boolean f;
    private a67 g;
    private boolean i;
    private boolean j;
    
    static {
        final String[] z2 = new String[8];
        String s = "5\u001d&\n\"6\u0000(\u0007>%\u00125\u0007*<\u0011)\u0012,2\u0000.\u0010$%\rh\t#3\u0015$\r=#\u00114\u0015(5[&\u000598\u0002.\u00124q\u001a(F,2\u0000.\u0010(";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = 'Q';
                        break;
                    }
                    case 1: {
                        c2 = 't';
                        break;
                    }
                    case 2: {
                        c2 = 'G';
                        break;
                    }
                    case 3: {
                        c2 = 'f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u007f\u001b)6,$\u0007\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u007f\u001b)%?4\u00153\u0003";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u007f\u001b)590\u00063";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u007f\u001b)\"(\"\u00005\t4";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u007f\u001b)59>\u0004";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u007f\u001b)4(\"\u0001*\u0003";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u007f\u001b)5,'\u0011\u000e\b>%\u0015)\u0005(\u0002\u0000&\u0012(";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public DialogToastActivity() {
        this.j = true;
        this.i = true;
    }
    
    public static void a(final Activity activity, final int n) {
        final Toolbar toolbar = (Toolbar)activity.getLayoutInflater().inflate(2130903226, (ViewGroup)null, false);
        toolbar.setTitle(activity.getTitle());
        Label_0047: {
            if (App.W) {
                toolbar.setNavigationIcon(2130838737);
                if (!App.I) {
                    break Label_0047;
                }
            }
            toolbar.setNavigationIcon(2130837523);
        }
        final LinearLayout contentView = new LinearLayout((Context)activity);
        contentView.setOrientation(1);
        contentView.addView((View)toolbar, -1, activity.getResources().getDimensionPixelSize(2131361793));
        final FrameLayout frameLayout = new FrameLayout((Context)activity);
        alm.a(activity.getLayoutInflater(), n, (ViewGroup)frameLayout, true);
        contentView.addView((View)frameLayout, -1, -1);
        activity.setContentView((View)contentView);
        toolbar.setNavigationOnClickListener((View$OnClickListener)new ax(activity));
    }
    
    private void a(final DialogFragment dialogFragment) {
        if (this.getSupportFragmentManager().findFragmentByTag(dialogFragment.getClass().getName()) == null) {
            dialogFragment.show(this.getSupportFragmentManager(), dialogFragment.getClass().getName());
        }
    }
    
    @Override
    public void a(final int n) {
        if (!this.isFinishing()) {
            DialogToastActivity$MessageDialogFragment.a(0, n).show(this.getSupportFragmentManager(), null);
        }
    }
    
    @Override
    public void a(final int n, final int n2) {
        if (!this.isFinishing()) {
            this.a(DialogToastActivity$ProgressDialogFragment.a(n, n2));
        }
    }
    
    @Override
    public void a(final int n, final int n2, final String[] array) {
        if (!this.isFinishing()) {
            DialogToastActivity$MessageDialogFragment.b(n, n2, array).show(this.getSupportFragmentManager(), null);
        }
    }
    
    public void a(final int n, final String[] array) {
        if (!this.isFinishing()) {
            DialogToastActivity$MessageDialogFragment.b(0, n, array).show(this.getSupportFragmentManager(), null);
        }
    }
    
    public void a(final boolean j) {
        this.j = j;
    }
    
    @Override
    public boolean a() {
        if (this.isFinishing()) {
            return false;
        }
        App.ac = true;
        App.aq.aZ();
        this.a(new DialogToastActivity$ClockWrongDialogFragment());
        return true;
    }
    
    @Override
    public boolean a(final String s, final String s2) {
        if (this.isFinishing()) {
            return false;
        }
        this.a(DialogToastActivity$ContactBlockedDialogFragment.b(s, s2));
        return true;
    }
    
    public void b(final int n) {
    }
    
    @Override
    public boolean b() {
        if (this.isFinishing()) {
            return false;
        }
        this.a(new DialogToastActivity$LoginFailedDialogFragment());
        return true;
    }
    
    @Override
    public void c() {
        if (!this.isFinishing()) {
            final DialogToastActivity$ProgressDialogFragment dialogToastActivity$ProgressDialogFragment = (DialogToastActivity$ProgressDialogFragment)this.getSupportFragmentManager().findFragmentByTag(DialogToastActivity$ProgressDialogFragment.class.getName());
            if (dialogToastActivity$ProgressDialogFragment != null) {
                dialogToastActivity$ProgressDialogFragment.dismissAllowingStateLoss();
            }
        }
    }
    
    public void c(final int n) {
        this.a(0, n);
    }
    
    public void d() {
        final Toolbar supportActionBar = (Toolbar)this.getLayoutInflater().inflate(2130903226, (ViewGroup)null, false);
        if (Build$VERSION.SDK_INT >= 14) {
            supportActionBar.setFitsSystemWindows(true);
        }
        if (App.W) {
            supportActionBar.setNavigationIcon(2130838737);
        }
        final TypedValue typedValue = new TypedValue();
        this.getTheme().resolveAttribute(2130772081, typedValue, true);
        final int type = typedValue.type;
        boolean b = false;
        if (type == 18) {
            final int data = typedValue.data;
            b = false;
            if (data != 0) {
                b = true;
            }
        }
        Label_0208: {
            if (b) {
                this.e = (ViewGroup)new FrameLayout((Context)this);
                this.c = (ViewGroup)new FrameLayout((Context)this);
                this.e.addView((View)this.c, -1, -1);
                this.e.addView((View)supportActionBar, -1, this.getResources().getDimensionPixelSize(2131361793));
                if (!App.I) {
                    break Label_0208;
                }
            }
            this.e = (ViewGroup)new LinearLayout((Context)this);
            this.c = this.e;
            ((LinearLayout)this.e).setOrientation(1);
            this.e.addView((View)supportActionBar, -1, this.getResources().getDimensionPixelSize(2131361793));
        }
        this.setSupportActionBar(supportActionBar);
        if (App.W) {
            this.getSupportActionBar().setHomeAsUpIndicator(this.getResources().getDrawable(2130838737));
        }
        supportActionBar.setNavigationOnClickListener((View$OnClickListener)new cm(this));
    }
    
    @Override
    public boolean d() {
        if (this.isFinishing()) {
            return false;
        }
        App.ac = true;
        App.aq.aZ();
        this.a(new DialogToastActivity$SoftwareExpiredDialogFragment());
        return true;
    }
    
    @Deprecated
    @Override
    public void f(final String s) {
        if (!this.isFinishing()) {
            DialogToastActivity$MessageDialogFragment.b(s).show(this.getSupportFragmentManager(), null);
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.i) {
            super.onBackPressed();
            if (!App.I) {
                return;
            }
        }
        Log.e(DialogToastActivity.z[0]);
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        Log.i(this.getClass().getName() + DialogToastActivity.z[2]);
        if (App.aS == 3) {
            b_.b(this);
        }
        if (alm.c) {
            this.getWindow().getDecorView().setLayoutDirection(3);
        }
        if (App.W) {
            if (!alm.c) {
                final TypedValue typedValue = new TypedValue();
                this.getTheme().resolveAttribute(2130772079, typedValue, true);
                if (typedValue.type == 18) {
                    this.f = (typedValue.data == 0);
                }
                this.getTheme().applyStyle(2131427514, true);
            }
            this.getTheme().applyStyle(2131427519, true);
        }
        super.onCreate(bundle);
        Label_0204: {
            if (App.W) {
                if (!alm.c) {
                    if (this.f) {
                        break Label_0204;
                    }
                    this.d();
                    if (!App.I) {
                        break Label_0204;
                    }
                }
                if (Build$VERSION.SDK_INT < 21 && this.getSupportActionBar() != null) {
                    this.getSupportActionBar().setHomeAsUpIndicator(this.getResources().getDrawable(2130838737));
                }
            }
        }
        this.g = new a67();
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        if (App.aS == 3) {
            b_.c(this);
        }
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        if (App.aS == 3) {
            b_.c(this);
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    protected void onDestroy() {
        Log.i(this.getClass().getName() + DialogToastActivity.z[4]);
        super.onDestroy();
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (App.aS == 3) {
            switch (n) {
                case 24: {
                    b_.a(this).show();
                    return true;
                }
                case 84: {
                    b_.a(this, false);
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
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    @Override
    protected void onPause() {
        Log.i(this.getClass().getName() + DialogToastActivity.z[1]);
        App.c((gu)this);
        super.onPause();
        if (this.g.hasMessages(0)) {
            this.g.removeMessages(0);
        }
        App.t();
        this.i = false;
    }
    
    @Override
    protected void onResume() {
        Log.i(this.getClass().getName() + DialogToastActivity.z[6]);
        App.a((gu)this);
        super.onResume();
        if (this.j) {
            this.g.sendEmptyMessageDelayed(0, 3000L);
        }
        this.i = true;
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        Log.i(this.getClass().getName() + DialogToastActivity.z[7]);
        super.onSaveInstanceState(bundle);
    }
    
    @Override
    protected void onStart() {
        Log.i(this.getClass().getName() + DialogToastActivity.z[3]);
        super.onStart();
    }
    
    @Override
    protected void onStop() {
        Log.i(this.getClass().getName() + DialogToastActivity.z[5]);
        super.onStop();
    }
    
    @Override
    public void setContentView(final int n) {
        this.setContentView(alm.a(this.getLayoutInflater(), n, null, false));
    }
    
    @Override
    public void setContentView(final View contentView) {
        if (this.e != null) {
            this.c.addView(contentView, -1, -1);
            super.setContentView((View)this.e);
            if (!App.I) {
                return;
            }
        }
        super.setContentView(contentView);
    }
    
    @Override
    public void setSupportProgressBarIndeterminateVisibility(final boolean b) {
        if (this.d == null) {
            final View inflate = this.getLayoutInflater().inflate(2130903067, (ViewGroup)null, false);
            this.d = inflate.findViewById(2131755163);
            if (this.d != null) {
                this.getSupportActionBar().setDisplayShowCustomEnabled(true);
                this.getSupportActionBar().setCustomView(inflate, new ActionBar$LayoutParams(-2, -2, 21));
            }
        }
        if (this.d != null) {
            final View d = this.d;
            int visibility = 0;
            if (!b) {
                visibility = 8;
            }
            d.setVisibility(visibility);
        }
    }
}
