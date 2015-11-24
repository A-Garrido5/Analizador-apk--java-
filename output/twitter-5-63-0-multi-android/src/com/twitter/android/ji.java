// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.provider.bf;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.avatars.b;
import android.view.View;
import android.view.View$OnClickListener;

class ji implements View$OnClickListener
{
    final /* synthetic */ long a;
    final /* synthetic */ ImageActivity b;
    
    ji(final ImageActivity b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String value = String.valueOf(this.a);
        Intent intent;
        if (com.twitter.android.avatars.b.b()) {
            intent = new Intent((Context)this.b, (Class)EditProfileWithAvatarDrawerActivity.class);
            if (1 == this.b.h) {
                intent.putExtra("extra_show_avatar_picker", false);
            }
            else {
                intent.putExtra("extra_show_avatar_picker", true);
            }
        }
        else {
            intent = new Intent((Context)this.b, (Class)EditProfileActivity.class);
        }
        this.b.startActivity(intent.setData(bf.b.buildUpon().appendEncodedPath(value).appendQueryParameter("ownerId", value).build()));
        this.b.finish();
    }
}
