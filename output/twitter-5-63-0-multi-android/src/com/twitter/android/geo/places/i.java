// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import android.os.Parcelable;
import java.io.Serializable;
import com.twitter.library.api.bk;
import android.os.Bundle;
import java.util.HashMap;
import com.twitter.library.api.geo.TwitterPlace$PlaceInfo;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.geo.j;

class i implements n
{
    final /* synthetic */ g a;
    
    i(final g a) {
        this.a = a;
    }
    
    @Override
    public void a(final j j) {
        if (j != null && !j.a().isEmpty()) {
            this.a.i = j.a().get(0);
            this.a.a.c(this.a.i.fullName);
        }
    }
}
