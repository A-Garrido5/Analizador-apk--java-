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
import com.twitter.library.media.model.EditableImage;
import java.io.Serializable;
import android.content.Intent;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.android.client.TwitterFragmentActivity;

public class EditImageActivity extends TwitterFragmentActivity implements gi
{
    private EditImageFragment a;
    private ArrayList b;
    
    public static Intent a(final Context context, final ArrayList list, final String s) {
        return new Intent(context, (Class)EditImageActivity.class).putExtra("editable_image", (Serializable)list).putExtra("scribe_section", s);
    }
    
    public static EditableImage a(final Intent intent) {
        return (EditableImage)intent.getParcelableExtra("editable_image");
    }
    
    public static String b(final Intent intent) {
        return intent.getStringExtra("filter_effect");
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(false);
        bn.c(2130968739);
        int n;
        if (gr.a()) {
            n = 2131493020;
        }
        else {
            n = 2131493019;
        }
        this.getTheme().applyStyle(n, false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        this.b = this.getIntent().getParcelableArrayListExtra("editable_image");
        this.a = (EditImageFragment)this.getSupportFragmentManager().findFragmentByTag("image_edit");
        if (this.a == null) {
            final EditImageFragment a = new EditImageFragment();
            a.setArguments(EditImageFragment.a(this.getIntent().getStringExtra("scribe_section"), 0));
            this.getSupportFragmentManager().beginTransaction().add(2131886241, a, "image_edit").commit();
            this.a = a;
        }
        this.a.a(new fu(this));
        this.a.a(this);
    }
    
    @Override
    public void a(final EditableImage editableImage, final String s) {
        final Intent intent = new Intent();
        intent.putExtra("editable_image", (Parcelable)editableImage);
        if (s != null) {
            intent.putExtra("filter_effect", s);
        }
        this.setResult(-1, intent);
        this.finish();
    }
    
    @Override
    public void a(final EditableMedia editableMedia) {
    }
    
    @Override
    public void ao_() {
        this.setResult(0);
        this.finish();
    }
    
    @Override
    public void onBackPressed() {
        this.a.c();
    }
}
