// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.internal.cd;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.p;
import com.google.android.gms.internal.jg;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.f;

final class i implements f
{
    @Override
    public int a() {
        return Integer.MAX_VALUE;
    }
    
    public cd a(final Context context, final Looper looper, final jg jg, final c c, final p p6, final q q) {
        return new cd(context, looper, context.getPackageName(), p6, q, "locationServices", jg.a());
    }
}
