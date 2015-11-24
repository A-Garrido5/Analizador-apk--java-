// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.images;

import java.util.Map;
import com.google.android.gms.internal.i;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import android.content.Context;
import java.util.HashSet;
import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import java.util.ArrayList;
import android.net.Uri;
import android.os.ResultReceiver;

final class ImageManager$ImageReceiver extends ResultReceiver
{
    final /* synthetic */ ImageManager a;
    private final Uri b;
    private final ArrayList c;
    
    public void onReceiveResult(final int n, final Bundle bundle) {
        this.a.e.execute(new c(this.a, this.b, (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
    }
}
