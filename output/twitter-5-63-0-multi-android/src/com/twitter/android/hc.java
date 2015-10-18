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
import com.twitter.internal.android.widget.TypefacesTextView;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.media.model.MediaType;
import android.support.v4.app.Fragment;
import com.twitter.library.media.model.MediaFile;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import com.twitter.android.avatars.b;
import android.os.Bundle;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.service.z;
import android.app.ProgressDialog;
import com.twitter.android.widget.DraggableDrawerLayout;
import com.twitter.android.avatars.AvatarGridFragment;
import com.twitter.library.util.ReferenceMap;
import android.widget.LinearLayout;
import com.twitter.library.media.util.a;
import com.twitter.android.widget.co;
import com.twitter.android.widget.bn;
import com.twitter.library.media.widget.MediaImageView;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import android.content.res.Resources;
import android.widget.TextView;
import java.util.List;
import com.twitter.library.media.widget.e;

class hc implements e
{
    final /* synthetic */ List a;
    final /* synthetic */ TextView b;
    final /* synthetic */ Resources c;
    final /* synthetic */ hb d;
    
    hc(final hb d, final List a, final TextView b, final Resources c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap bitmap) {
        synchronized (this.a) {
            EditProfileWithAvatarDrawerActivity.y();
            if (EditProfileWithAvatarDrawerActivity.r == this.a.size()) {
                this.b.setText((CharSequence)this.c.getString(2131297029));
            }
        }
    }
}
