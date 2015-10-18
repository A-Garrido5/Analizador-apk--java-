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
import com.twitter.util.concurrent.m;
import com.twitter.util.concurrent.b;
import com.twitter.util.concurrent.i;

class fu implements gh
{
    final /* synthetic */ EditImageActivity a;
    
    fu(final EditImageActivity a) {
        this.a = a;
    }
    
    @Override
    public i a(final int n) {
        return new b().a(m.a).a(new fv(this, n)).a();
    }
    
    @Override
    public boolean a(final EditableImage editableImage) {
        return true;
    }
    
    @Override
    public int getCount() {
        return this.a.b.size();
    }
    
    @Override
    public int getInitialPosition() {
        return 0;
    }
    
    @Override
    public int getSelectedCount() {
        return 0;
    }
}
