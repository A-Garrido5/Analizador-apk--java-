// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.io.Serializable;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.GalleryActivity;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.content.Context;

class aq implements n
{
    private final Context a;
    private final Tweet b;
    private final TwitterScribeAssociation c;
    private final MediaEntity d;
    
    aq(final Context a, final Tweet b, final TwitterScribeAssociation c, final MediaEntity d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a() {
        final Intent putExtra = new Intent(this.a, (Class)GalleryActivity.class).putExtra("tw", (Parcelable)this.b).putExtra("show_tw", false).putExtra("media", (Serializable)this.d).putExtra("association", (Parcelable)this.c);
        final String a = this.c.a();
        int n = 0;
        Label_0094: {
            switch (a.hashCode()) {
                case 3208415: {
                    if (a.equals("home")) {
                        n = 0;
                        break Label_0094;
                    }
                    break;
                }
                case -309425751: {
                    if (a.equals("profile")) {
                        n = 1;
                        break Label_0094;
                    }
                    break;
                }
                case -906336856: {
                    if (a.equals("search")) {
                        n = 2;
                        break Label_0094;
                    }
                    break;
                }
            }
            n = -1;
        }
        int n2 = 0;
        while (true) {
            switch (n) {
                default: {
                    n2 = -1;
                    break Label_0127;
                }
                case 0: {
                    n2 = 4;
                }
                case 1: {
                    if (n2 > 0) {
                        putExtra.putExtra("context", n2);
                    }
                    this.a.startActivity(putExtra);
                }
                case 2: {
                    if (this.c.b().equals("cluster")) {
                        n2 = 3;
                        continue;
                    }
                    n2 = 2;
                    continue;
                }
            }
            break;
        }
    }
    
    @Override
    public int b() {
        return 1;
    }
}
