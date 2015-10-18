// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.android.client.ca;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.client.ap;
import com.twitter.library.media.model.EditableMedia;
import android.widget.Toast;
import android.net.Uri;
import com.twitter.android.AttachMediaListener$MediaAttachFailure;
import android.content.Intent;
import android.os.Bundle;
import android.app.Dialog;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.client.az;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.k;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.android.PhotoSelectFragment;
import com.twitter.library.media.util.a;
import com.twitter.android.AttachMediaListener;
import com.twitter.android.dialog.TakeoverDialogFragment;

public class ProfileEmptyAvatarOverlay extends TakeoverDialogFragment implements AttachMediaListener, a
{
    private PhotoSelectFragment b;
    
    static boolean a(final Context context, final Session session) {
        final k k = new k(context, session.e());
        final TwitterUser f = session.f();
        boolean b = false;
        if (f != null) {
            final boolean f2 = f.f();
            b = false;
            if (f2) {
                final boolean boolean1 = k.getBoolean("profile_overlay", false);
                b = false;
                if (!boolean1) {
                    b = true;
                }
            }
        }
        return b;
    }
    
    public static void b(final FragmentActivity fragmentActivity) {
        if (!a((Context)fragmentActivity, az.a((Context)fragmentActivity).b())) {
            return;
        }
        ((ProfileEmptyAvatarOverlay)((ProfileEmptyAvatarOverlay)TakeoverDialogFragment.a(ProfileEmptyAvatarOverlay.class)).c(2131297476).d(2131296922).e(2131296913).b(2130839144)).a(fragmentActivity);
    }
    
    private void i() {
        this.b = PhotoSelectFragment.a(this.getActivity(), this, "profile", MediaType.f, this.h());
    }
    
    @Override
    protected void a() {
        super.a();
        new k((Context)this.getActivity(), this.h().e()).a().a("profile_overlay", true).apply();
        this.a(new String[] { "profile::empty_state::impression" });
    }
    
    @Override
    protected void a(final Dialog dialog, final Bundle bundle) {
        super.a(dialog, bundle);
        this.i();
    }
    
    @Override
    public void a(final Intent intent, final int n, final Bundle bundle) {
        this.startActivityForResult(intent, n);
    }
    
    @Override
    public void a(final AttachMediaListener$MediaAttachFailure attachMediaListener$MediaAttachFailure, final Uri uri) {
        final FragmentActivity activity = this.getActivity();
        if (attachMediaListener$MediaAttachFailure != AttachMediaListener$MediaAttachFailure.c && activity != null) {
            Toast.makeText((Context)activity, 2131297472, 0).show();
        }
    }
    
    @Override
    public boolean a(final EditableMedia editableMedia) {
        return true;
    }
    
    public void b() {
        super.b();
        this.a(new String[] { "profile::empty_state::dismiss" });
    }
    
    @Override
    public void b(final EditableMedia editableMedia) {
        final ap ap = new ap(editableMedia.mediaFile, null, false);
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            ca.a((Context)activity, this.h(), ap);
        }
        this.dismiss();
    }
    
    public void c() {
        this.a(new String[] { "profile::empty_state:camera:click" });
        if (this.b != null) {
            this.b.a(false, 1);
        }
    }
    
    public void f() {
        this.a(new String[] { "profile::empty_state:photo:click" });
        if (this.b != null) {
            this.b.b();
        }
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        this.b.a(n, n2, intent, this);
    }
}
