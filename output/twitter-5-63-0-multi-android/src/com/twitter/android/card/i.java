// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import android.content.ActivityNotFoundException;
import android.widget.Toast;
import android.net.Uri;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.MediaPlayerActivity;
import com.twitter.library.media.model.MediaDescriptor;
import java.util.ArrayList;
import com.twitter.library.provider.Tweet;
import android.app.Activity;

class i implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ Activity b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ Tweet g;
    final /* synthetic */ h h;
    
    i(final h h, final String a, final Activity b, final String c, final boolean d, final boolean e, final String f, final Tweet g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public void run() {
        final ArrayList<MediaDescriptor> list = new ArrayList<MediaDescriptor>();
        if (this.a != null) {
            list.add(new MediaDescriptor(this.a, true));
        }
        if (list != null && list.size() > 0) {
            final Intent intent = new Intent((Context)this.b, (Class)MediaPlayerActivity.class);
            intent.putExtra("image_url", this.c).putExtra("aud", false).putExtra("is_looping", this.d).putExtra("simple_controls", this.e).putExtra("player_url", this.f).putExtra("player_stream_urls", (Serializable)list).putExtra("tweet", (Parcelable)this.g).putExtra("video_position", 0).putExtra("video_index", 0);
            this.b.startActivity(intent);
            return;
        }
        try {
            this.b.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(this.f)));
        }
        catch (ActivityNotFoundException ex) {
            Toast.makeText((Context)this.b, 2131298033, 0).show();
        }
    }
}
