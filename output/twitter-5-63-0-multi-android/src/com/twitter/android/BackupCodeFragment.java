// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListAdapter;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import com.twitter.library.client.Session;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import com.twitter.android.widget.ct;
import com.twitter.library.api.account.p;
import android.content.DialogInterface;
import android.widget.Toast;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;
import android.graphics.Bitmap;
import com.twitter.library.media.util.m;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import android.content.Context;
import com.twitter.library.util.bq;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import com.twitter.android.client.TwitterListFragment;

public class BackupCodeFragment extends TwitterListFragment implements b, e
{
    private String a;
    private am b;
    private an c;
    private String d;
    
    public BackupCodeFragment() {
        this.d = "";
    }
    
    private void e(final String d) {
        this.b.clear();
        this.b.add((Object)d);
        this.d = d;
    }
    
    private static String f(final String s) {
        if (s == null || s.length() != 12) {
            return s;
        }
        return new StringBuilder(14).append(s.substring(0, 4)).append(" ").append(s.substring(4, 8)).append(" ").append(s.substring(8)).toString();
    }
    
    private void r() {
        bq.b((Context)this.getActivity(), (String)this.Y().getItemAtPosition(1));
        this.a(2131296728);
    }
    
    private void s() {
        this.aw().a(this.aF().g(), "backup_code::take_screenshot::impression");
        final PromptDialogFragment promptDialogFragment = (PromptDialogFragment)PromptDialogFragment.b(1).c(2131297217).d(2131297234).h(2131298158).j(2131297303).a((b)this);
        promptDialogFragment.setTargetFragment(this, 0);
        promptDialogFragment.a(this.getFragmentManager());
    }
    
    private void t() {
        final ListView y = this.Y();
        ((View)y).setDrawingCacheEnabled(true);
        final Bitmap a = com.twitter.library.media.util.m.a(((View)y).getDrawingCache());
        ((View)y).setDrawingCacheEnabled(false);
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            new ap(this, (Context)activity, this.getString(2131297602)).execute((Object[])new Bitmap[] { a });
            return;
        }
        this.e();
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968608, viewGroup);
    }
    
    void a(final int n) {
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            Toast.makeText((Context)activity, (CharSequence)this.getString(n), 1).show();
        }
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n) {
        this.aw().a(this.aF().g(), "backup_code::take_screenshot:cancel:click");
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 1) {
            if (n2 != -1) {
                this.aw().a(this.aF().g(), "backup_code::take_screenshot:cancel:click");
                return;
            }
            this.aw().a(this.aF().g(), "backup_code::take_screenshot:ok:click");
            this.t();
        }
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        final ListView y = this.Y();
        final FragmentActivity activity = this.getActivity();
        if (n == -1 + y.getAdapter().getCount() && activity != null) {
            com.twitter.library.api.account.p.d((Context)activity, this.a);
            new ao(this, ((Context)activity).getApplicationContext(), this.a, true).execute((Object[])new Void[0]);
        }
        else if (((ct)y.getAdapter()).b(n)) {
            this.r();
        }
    }
    
    void a(final File file) {
        if (file != null) {
            this.aw().a(this.aF().g(), "backup_code::take_screenshot::success");
            this.a(2131297615);
            return;
        }
        this.e();
    }
    
    void a(final String s, final boolean b) {
        final FragmentActivity activity = this.getActivity();
        if (TextUtils.isEmpty((CharSequence)s)) {
            this.a(2131297223);
            if (activity != null) {
                activity.finish();
            }
        }
        else {
            this.e(s);
            if (b) {
                this.s();
            }
        }
    }
    
    void e() {
        this.aw().a(this.aF().g(), "backup_code::take_screenshot::failure");
        PromptDialogFragment.b(2).c(2131298021).d(2131298022).h(2131297362).a(this.getFragmentManager());
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setRetainInstance(true);
        this.a = this.getArguments().getString("bc_account_name");
        final Session af = this.aF();
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            this.a = af.e();
        }
        if (bundle == null) {
            this.aw().a(af.g(), "backup_code::::impression");
        }
        if (bundle == null && this.getArguments().getBoolean("show_welcome", false)) {
            this.s();
        }
    }
    
    @Override
    public void onResume() {
        super.onResume();
        final FragmentActivity activity = this.getActivity();
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(this.d));
        if (this.b == null || this.c == null) {
            this.b = new am((Context)activity, 2130968609, 2131886304, list);
            this.c = new an((Context)activity, this.b);
        }
        this.Y().setAdapter((ListAdapter)this.c);
        if (TextUtils.isEmpty((CharSequence)this.d)) {
            new ao(this, activity.getApplicationContext(), this.a, false).execute((Object[])new Void[0]);
        }
    }
}
