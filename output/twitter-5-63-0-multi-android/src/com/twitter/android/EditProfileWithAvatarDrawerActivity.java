// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.widget.Toast;
import android.net.Uri;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.content.Intent;
import android.widget.EditText;
import java.util.Iterator;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import com.twitter.library.api.o;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.media.util.ak;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.e;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.media.model.MediaType;
import android.support.v4.app.Fragment;
import com.twitter.library.media.model.MediaFile;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import com.twitter.android.avatars.b;
import android.os.Bundle;
import android.content.res.Resources;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.service.z;
import android.app.ProgressDialog;
import com.twitter.android.widget.DraggableDrawerLayout;
import com.twitter.android.avatars.AvatarGridFragment;
import java.util.List;
import com.twitter.library.util.ReferenceMap;
import android.widget.TextView;
import android.widget.LinearLayout;
import com.twitter.library.media.util.a;
import com.twitter.android.widget.co;
import com.twitter.android.widget.bn;

public class EditProfileWithAvatarDrawerActivity extends EditProfileActivity implements AttachMediaListener, bn, co, a
{
    private static volatile int r;
    private boolean A;
    private LinearLayout B;
    private boolean F;
    private TextView G;
    private final ReferenceMap s;
    private List t;
    private String u;
    private AvatarGridFragment v;
    private DraggableDrawerLayout w;
    private PhotoSelectFragment x;
    private ProgressDialog y;
    private z z;
    
    static {
        EditProfileWithAvatarDrawerActivity.r = 0;
    }
    
    public EditProfileWithAvatarDrawerActivity() {
        this.s = ReferenceMap.a();
        this.A = false;
    }
    
    private void A() {
        this.ac();
        this.v.c(this.ab());
        if (this.c != null) {
            this.v.b(EditableMedia.a(this.c, ""));
            return;
        }
        if (this.u != null) {
            this.b(this.u);
            return;
        }
        this.b("current_avatar");
    }
    
    private boolean X() {
        return this.u != null && !"current_avatar".equals(this.u);
    }
    
    private void Y() {
        if (this.X()) {
            new he(this, this.I()).execute((Object[])new j[] { ((hb)this.s.a(this.u)).a.a() });
            return;
        }
        if (this.c != null) {
            this.Z();
            return;
        }
        this.ad();
    }
    
    private void Z() {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.U().g()).a(this.a);
        if (this.X()) {
            twitterScribeLog.b(new String[] { "edit_avatar:::avatar:next" });
            twitterScribeLog.d(this.u);
        }
        else {
            twitterScribeLog.b(new String[] { "edit_avatar:::camera:next" });
        }
        this.q = false;
        this.o.setVisibility(8);
        this.G().a(twitterScribeLog);
        this.h();
    }
    
    private void a(final Resources resources, final Bundle bundle) {
        if (com.twitter.android.avatars.b.b()) {
            this.t = new ArrayList();
            (this.B = (LinearLayout)this.findViewById(2131886703)).setClickable(true);
            this.B.setOnClickListener((View$OnClickListener)new gx(this));
            this.w.setDrawerDraggable(true);
            if (bundle != null) {
                this.u = bundle.getString("selected_id");
                this.c = (MediaFile)bundle.getParcelable("selected_uri");
                this.v = (AvatarGridFragment)this.getSupportFragmentManager().findFragmentByTag("gallery");
                if (bundle.getBoolean("progress", false)) {
                    this.y.show();
                }
                this.A = bundle.getBoolean("drawer_visible");
            }
            else {
                this.v = AvatarGridFragment.a(resources.getColor(2131689637), resources.getColor(2131689634), resources.getDimensionPixelSize(2131558587), 0);
                this.getSupportFragmentManager().beginTransaction().add(2131886572, this.v, "gallery").commit();
            }
            this.v.a(this);
            this.x = PhotoSelectFragment.a(this, this, "edit_avatar", MediaType.f, this.U());
            final TypefacesTextView typefacesTextView = (TypefacesTextView)this.findViewById(2131886249);
            typefacesTextView.setOnClickListener((View$OnClickListener)this);
            typefacesTextView.setText(2131296895);
            this.a(this.z = new hd(this));
            this.a(new com.twitter.library.api.e((Context)this, this.U()));
            this.G().a(this.U().g(), TwitterScribeLog.a(this.b(), "", "twitter_photos", "impression"));
        }
    }
    
    private void a(final hb hb) {
        this.u = hb.d;
        hb.a();
        if (this.i != null) {
            this.i.a(hb.a.a().a());
        }
    }
    
    private void aa() {
        if (this.c != null) {
            this.v.a(this.c.b());
            this.c = null;
        }
        if (this.u != null) {
            final hb hb = (hb)this.s.a(this.u);
            if (hb != null) {
                hb.b();
            }
            this.u = null;
        }
    }
    
    private View[] ab() {
        if (this.g == null) {
            return null;
        }
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        int n = 2 + this.t.size();
        final boolean f = this.g.f();
        if (!f) {
            ++n;
        }
        final View[] array = new View[n];
        final View inflate = layoutInflater.inflate(2130968782, (ViewGroup)null);
        inflate.findViewById(2131886127).setOnClickListener((View$OnClickListener)new gy(this));
        array[0] = inflate;
        final View inflate2 = layoutInflater.inflate(2130968781, (ViewGroup)null);
        inflate2.findViewById(2131886127).setOnClickListener((View$OnClickListener)new gz(this));
        array[1] = inflate2;
        final ha ha = new ha(this);
        final Resources resources = this.getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int n4;
        if (!f) {
            final float n2 = displayMetrics.widthPixels / displayMetrics.density;
            final int integer = resources.getInteger(2131623939);
            final float n3 = (n2 - (integer + 1) * resources.getDimension(2131558595)) / integer;
            final View a = hb.a(layoutInflater, (View$OnClickListener)ha, this.s, UserImageRequest.a(ak.a(this.g.userId, this.g.profileImageUrl)).a(Size.a(n3, n3)).a("user"), "current_avatar", resources, this.G, this.t);
            n4 = 3;
            array[2] = a;
        }
        else {
            n4 = 2;
        }
        if (!this.t.isEmpty()) {
            final Iterator<o> iterator = (Iterator<o>)this.t.iterator();
            int n5 = 1;
            int n6 = n4;
            while (iterator.hasNext()) {
                final o o = iterator.next();
                final View a2 = hb.a(layoutInflater, (View$OnClickListener)ha, this.s, com.twitter.library.media.manager.j.a(o.a(displayMetrics.densityDpi).toString()), o.a(), resources, this.G, this.t);
                final int n7 = n6 + 1;
                array[n6] = a2;
                if ((this.u == null && n5 != 0 && f) || o.a().equals(this.u)) {
                    this.a((hb)a2.getTag());
                }
                n6 = n7;
                n5 = 0;
            }
        }
        return array;
    }
    
    private void ac() {
        this.w.setVisibility(0);
    }
    
    private void ad() {
        boolean enabled = true;
        this.A = (!this.A && enabled);
        if (this.A) {
            this.w.a(enabled, false);
            this.B.setVisibility(0);
            this.o.setVisibility(8);
        }
        else {
            this.w.a(enabled);
            this.B.setVisibility(8);
            if (this.q) {
                this.o.setVisibility(0);
            }
            else {
                this.o.setVisibility(8);
            }
        }
        final jx a = this.M().a(2131887428);
        if (a != null) {
            a.b(!this.A && enabled);
        }
        this.h.setClickable(!this.A && enabled);
        this.i.setClickable(!this.A && enabled);
        if (!this.A) {
            this.i.a(this.g);
        }
        this.l.setEnabled(!this.A && enabled);
        this.m.setEnabled(!this.A && enabled);
        this.n.setEnabled(!this.A && enabled);
        final EditText j = this.j;
        if (this.A) {
            enabled = false;
        }
        j.setEnabled(enabled);
    }
    
    private void b(final String s) {
        final hb hb = (hb)this.s.a(s);
        if (hb != null) {
            this.a(hb);
        }
    }
    
    @Override
    public com.twitter.android.client.bn a(final Bundle bundle, final com.twitter.android.client.bn bn) {
        this.p = com.twitter.android.avatars.b.c();
        bn.c(2130968746);
        bn.a(true);
        bn.b(12);
        return bn;
    }
    
    @Override
    public void a(final float n) {
        this.v.a(n);
    }
    
    @Override
    protected void a(final Intent intent) {
        this.setResult(-1, intent);
        if (this.A) {
            this.ad();
            return;
        }
        this.finish();
    }
    
    @Override
    public void a(final Intent intent, final int n, final Bundle bundle) {
        ActivityCompat.startActivityForResult(this, intent, n, bundle);
    }
    
    @Override
    public void a(final AttachMediaListener$MediaAttachFailure attachMediaListener$MediaAttachFailure, final Uri uri) {
        this.G().a(this.U().g(), TwitterScribeLog.a(this.a, "", "avatar", "error"));
        if (this.y.isShowing()) {
            this.y.dismiss();
        }
        Toast.makeText((Context)this, (CharSequence)this.getString(2131297165), 1).show();
    }
    
    @Override
    public void a(final EditableMedia editableMedia, final View view) {
    }
    
    public void a(final boolean b) {
        this.w.setLocked(!b);
    }
    
    @Override
    public boolean a(final EditableMedia editableMedia) {
        this.y.show();
        return true;
    }
    
    @Override
    public void b(final int n) {
    }
    
    @Override
    public void b(final Bundle bundle, final com.twitter.android.client.bn bn) {
        super.b(bundle, bn);
        this.F = this.getIntent().getBooleanExtra("extra_show_avatar_picker", false);
        (this.y = new ProgressDialog((Context)this)).setProgressStyle(0);
        this.y.setMessage((CharSequence)this.getString(2131297490));
        (this.w = (DraggableDrawerLayout)this.findViewById(2131886399)).setDrawerLayoutListener(this);
        this.w.a(false);
        this.G = (TextView)this.findViewById(2131886580);
        EditProfileWithAvatarDrawerActivity.r = 0;
        this.a(this.getResources(), bundle);
    }
    
    @Override
    public void b(final EditableMedia editableMedia) {
        this.aa();
        if (this.y.isShowing()) {
            this.y.dismiss();
        }
        this.c = editableMedia.mediaFile;
        if (this.i != null) {
            this.i.a(editableMedia.c().toString());
        }
    }
    
    @Override
    public void c(final EditableMedia editableMedia) {
        this.aa();
        this.c = editableMedia.mediaFile;
        this.v.b(editableMedia);
        if (this.i != null) {
            this.i.a(editableMedia.c().toString());
        }
    }
    
    @Override
    public void onClick(final View view) {
        if (view.getId() == 2131886249) {
            this.Y();
            return;
        }
        if (view != this.i) {
            super.onClick(view);
            return;
        }
        if (com.twitter.android.avatars.b.b()) {
            this.ad();
            return;
        }
        this.n_();
    }
    
    @Override
    protected void onDestroy() {
        this.b(this.z);
        super.onDestroy();
    }
    
    @Override
    protected void onRestoreInstanceState(final Bundle bundle) {
        this.A = bundle.getBoolean("drawer_visible");
        this.F = bundle.getBoolean("state_show_avatar_picker");
    }
    
    public void onResume() {
        super.onResume();
        if (com.twitter.android.avatars.b.b()) {
            final jx a = this.M().a(2131887428);
            if (a != null) {
                a.b(!this.A);
            }
        }
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        bundle.putBoolean("drawer_visible", this.A);
        bundle.putBoolean("progress", this.y.isShowing());
        bundle.putBoolean("state_show_avatar_picker", this.F);
        if (this.y.isShowing()) {
            this.y.dismiss();
        }
        if (this.u != null) {
            bundle.putString("selected_id", this.u);
        }
        else if (this.c != null) {
            bundle.putParcelable("selected_uri", (Parcelable)this.c);
        }
        super.onSaveInstanceState(bundle);
    }
    
    @Override
    public void w() {
    }
    
    @Override
    public void x() {
    }
}
