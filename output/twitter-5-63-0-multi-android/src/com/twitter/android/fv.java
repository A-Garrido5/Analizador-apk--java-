// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.model.EditableMedia;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.io.Serializable;
import android.content.Intent;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.media.model.EditableImage;
import java.util.concurrent.Callable;

class fv implements Callable
{
    final /* synthetic */ int a;
    final /* synthetic */ fu b;
    
    fv(final fu b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public EditableImage a() {
        return this.b.a.b.get(this.a);
    }
}
