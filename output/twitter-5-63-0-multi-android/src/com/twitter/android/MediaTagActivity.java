// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.library.api.MediaTag;
import java.util.LinkedHashSet;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import com.twitter.util.collection.CollectionUtils;
import android.content.Context;
import com.twitter.library.client.k;
import java.util.List;
import android.support.v4.app.Fragment;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.library.media.model.EditableImage;
import com.twitter.android.client.TwitterFragmentActivity;

public class MediaTagActivity extends TwitterFragmentActivity
{
    private MediaTagFragment a;
    
    private void a(final EditableImage editableImage) {
        this.a = new MediaTagFragment();
        final Bundle arguments = new Bundle();
        arguments.putParcelable("editable_image", (Parcelable)editableImage);
        this.a.setArguments(arguments);
        this.getSupportFragmentManager().beginTransaction().add(2131886935, this.a, "user_select").commit();
    }
    
    private void a(final List list) {
        new k((Context)this, this.U().e(), "media_tags").a().a("recent_tags", CollectionUtils.b(list)).apply();
    }
    
    private List h() {
        return (List)new k((Context)this, this.U().e(), "media_tags").a("recent_tags");
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968875);
        bn.a(false);
        return bn;
    }
    
    public boolean a(final jv jv, final ToolBar toolBar) {
        jv.a(2131951640, toolBar);
        return super.a(jv, toolBar);
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887449 || a == 2131886126) {
            if (a == 2131887449) {
                final ArrayList b = this.a.b();
                this.setResult(-1, new Intent().putExtra("photo_tags", (Serializable)b));
                if (b.size() > 0) {
                    final LinkedHashSet<Long> set = new LinkedHashSet<Long>();
                    final Iterator<MediaTag> iterator = b.iterator();
                    while (iterator.hasNext()) {
                        set.add(iterator.next().userId);
                    }
                    final List h = this.h();
                    if (h != null) {
                        set.addAll((Collection<?>)h);
                    }
                    final int min = Math.min(set.size(), 20);
                    final ArrayList list = new ArrayList<Long>(min);
                    final Iterator<Object> iterator2 = set.iterator();
                    while (iterator2.hasNext()) {
                        list.add((long)iterator2.next());
                        if (list.size() >= min) {
                            break;
                        }
                    }
                    this.a(list);
                }
                final int size = b.size();
                String s;
                if (size == 0) {
                    s = this.getResources().getString(2131297260);
                }
                else {
                    s = this.getResources().getQuantityString(2131427337, size, new Object[] { size });
                }
                Toast.makeText(this.getApplicationContext(), (CharSequence)s, 0).show();
                this.a.e();
            }
            else {
                this.setResult(0);
            }
            this.finish();
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.a = (MediaTagFragment)this.getSupportFragmentManager().findFragmentByTag("user_select");
        if (this.a == null) {
            this.a((EditableImage)intent.getParcelableExtra("editable_image"));
        }
        this.a.a(this.h());
    }
}
