// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.ToolBar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.library.media.model.EditableVideo;
import android.content.Context;
import com.twitter.android.client.TwitterFragmentActivity;

public class VideoEditorActivity extends TwitterFragmentActivity
{
    private VideoEditorFragment a;
    
    public static Intent a(final Context context, final EditableVideo editableVideo) {
        final Intent intent = new Intent(context, (Class)VideoEditorActivity.class);
        intent.putExtra("editable_video", (Parcelable)editableVideo);
        return intent;
    }
    
    public static EditableVideo a(final Intent intent) {
        return (EditableVideo)intent.getParcelableExtra("editable_video");
    }
    
    private void h() {
        new AlertDialog$Builder((Context)this).setTitle(2131296924).setMessage(2131296284).setPositiveButton(2131296810, (DialogInterface$OnClickListener)new zc(this)).setNegativeButton(2131296445, (DialogInterface$OnClickListener)null).create().show();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968588);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.setTitle(2131296924);
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        if (bundle == null) {
            this.a = new VideoEditorFragment();
            supportFragmentManager.beginTransaction().add(2131886240, this.a).commit();
            return;
        }
        this.a = (VideoEditorFragment)supportFragmentManager.findFragmentById(2131886240);
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951660, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final Intent intent = new Intent();
        final VideoEditorFragment a = this.a;
        if (jx.a() == 2131886249) {
            intent.putExtra("editable_video", (Parcelable)a.e());
            this.setResult(-1, intent);
            this.finish();
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    protected void g_() {
        if (this.a.d()) {
            this.h();
            return;
        }
        super.g_();
    }
    
    @Override
    public void onBackPressed() {
        if (this.a.d()) {
            this.h();
            return;
        }
        super.onBackPressed();
    }
}
