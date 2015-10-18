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
import android.support.v4.app.Fragment;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import com.twitter.android.avatars.b;
import android.os.Bundle;
import android.content.res.Resources;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
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
import java.io.File;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.q;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class he extends AsyncTask
{
    private WeakReference a;
    private q b;
    
    public he(final EditProfileWithAvatarDrawerActivity editProfileWithAvatarDrawerActivity, final q b) {
        this.a = new WeakReference((T)editProfileWithAvatarDrawerActivity);
        this.b = b;
    }
    
    private EditProfileWithAvatarDrawerActivity a() {
        if (this.a != null) {
            return (EditProfileWithAvatarDrawerActivity)this.a.get();
        }
        return null;
    }
    
    protected MediaFile a(final j... array) {
        if (this.a() != null && this.b != null) {
            final j j = array[0];
            if (j != null) {
                final File c = this.b.c(j);
                if (c != null) {
                    return MediaFile.a(c, MediaType.b);
                }
            }
        }
        return null;
    }
    
    protected void a(final MediaFile c) {
        final EditProfileWithAvatarDrawerActivity a = this.a();
        if (a != null) {
            a.c = c;
            a.Z();
        }
    }
}
