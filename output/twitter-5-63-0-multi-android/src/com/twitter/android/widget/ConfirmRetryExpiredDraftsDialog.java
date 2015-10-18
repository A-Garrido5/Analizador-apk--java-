// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.support.v4.app.FragmentManager;
import java.util.Iterator;
import com.twitter.android.DraftsActivity;
import com.twitter.library.provider.b;
import com.twitter.library.provider.f;
import java.util.List;
import com.twitter.library.client.Session;
import android.content.Context;
import android.support.v4.app.DialogFragment;

public class ConfirmRetryExpiredDraftsDialog extends DialogFragment
{
    private Context a;
    private Session b;
    private List c;
    
    private ConfirmRetryExpiredDraftsDialog a(final Context a) {
        this.a = a;
        return this;
    }
    
    private ConfirmRetryExpiredDraftsDialog a(final Session b) {
        this.b = b;
        return this;
    }
    
    private ConfirmRetryExpiredDraftsDialog a(final List c) {
        this.c = c;
        return this;
    }
    
    private void a() {
        final f a = f.a(this.a, this.b.g());
        final Iterator<Long> iterator = (Iterator<Long>)this.c.iterator();
        while (iterator.hasNext()) {
            a.a(iterator.next(), 0, null);
        }
        this.startActivity(DraftsActivity.a(this.a, false));
    }
    
    public static void a(final FragmentManager fragmentManager, final Context context, final Session session, final List list) {
        new ConfirmRetryExpiredDraftsDialog().a(context).a(session).a(list).show(fragmentManager, "ConfirmRestartExpiredDrafts");
    }
    
    private void b() {
        final as a = as.a(this.a);
        final Iterator<Long> iterator = (Iterator<Long>)this.c.iterator();
        while (iterator.hasNext()) {
            a.a(new ej(this.a, this.b, iterator.next()), (z)null);
        }
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return (Dialog)new AlertDialog$Builder((Context)this.getActivity()).setMessage((CharSequence)this.getResources().getString(2131297998, new Object[] { this.c.size() })).setNegativeButton(2131297563, (DialogInterface$OnClickListener)new ak(this)).setPositiveButton(2131296420, (DialogInterface$OnClickListener)new aj(this)).create();
    }
}
