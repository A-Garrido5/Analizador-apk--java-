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
import android.content.Context;
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
import android.app.ProgressDialog;
import com.twitter.android.widget.DraggableDrawerLayout;
import com.twitter.android.avatars.AvatarGridFragment;
import com.twitter.library.util.ReferenceMap;
import android.widget.TextView;
import android.widget.LinearLayout;
import com.twitter.android.widget.co;
import com.twitter.android.widget.bn;
import com.twitter.internal.android.service.a;
import java.util.List;
import java.util.Collection;
import com.twitter.library.api.e;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class hd extends z
{
    final /* synthetic */ EditProfileWithAvatarDrawerActivity a;
    
    hd(final EditProfileWithAvatarDrawerActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof e) {
            final List a = ((e)y).a();
            if (a != null) {
                this.a.t.addAll(a);
            }
            this.a.b(this);
            this.a.A();
            if (this.a.F || this.a.A) {
                final EditProfileWithAvatarDrawerActivity a2 = this.a;
                boolean h;
                if (this.a.A) {
                    h = !this.a.A;
                }
                else {
                    h = this.a.A;
                }
                a2.A = h;
                this.a.ad();
                this.a.F = false;
            }
        }
    }
}
