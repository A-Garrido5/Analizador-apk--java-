// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.print;

import android.print.PrintDocumentAdapter$WriteResultCallback;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintDocumentInfo;
import android.print.PrintDocumentInfo$Builder;
import android.os.Bundle;
import android.print.PrintDocumentAdapter$LayoutResultCallback;
import android.os.CancellationSignal;
import android.net.Uri;
import android.graphics.Bitmap;
import android.print.PrintAttributes;
import android.os.AsyncTask;
import android.print.PrintDocumentAdapter;
import android.os.CancellationSignal$OnCancelListener;

class PrintHelperKitkat$2$1$1 implements CancellationSignal$OnCancelListener
{
    final /* synthetic */ PrintHelperKitkat$2$1 this$2;
    
    PrintHelperKitkat$2$1$1(final PrintHelperKitkat$2$1 this$2) {
        this.this$2 = this$2;
    }
    
    public void onCancel() {
        this.this$2.this$1.cancelLoad();
        this.this$2.cancel(false);
    }
}
