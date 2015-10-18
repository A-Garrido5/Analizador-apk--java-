// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.ProgressDialog;
import android.app.Dialog;
import android.view.View;
import android.content.DialogInterface;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.media.util.ImageOrientation;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.graphics.RectF;
import com.twitter.library.media.widget.CroppableImageView;
import java.io.File;
import android.net.Uri;
import android.content.DialogInterface$OnCancelListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class CropActivity extends TwitterFragmentActivity implements DialogInterface$OnCancelListener, co
{
    protected Uri a;
    protected File b;
    protected CropManager c;
    protected CroppableImageView d;
    protected boolean e;
    
    protected RectF B_() {
        return this.d.getNormalizedImageSelection();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(false);
        return bn;
    }
    
    protected void a(final Uri uri, final RectF rectF, final int n) {
        final Intent intent = new Intent();
        intent.putExtra("uri", (Parcelable)uri);
        intent.putExtra("cropped_rect", (Parcelable)ImageOrientation.a(n).a(rectF, 0.5f, 0.5f));
        intent.putExtra("rotation", n);
        this.a(true, intent);
    }
    
    public void a(final Uri uri, final File b, final RectF rectF, final int n) {
        if (uri.equals((Object)this.a)) {
            this.b = b;
        }
        if (!this.c.c() && this.b != null) {
            this.a(Uri.fromFile(this.b), rectF, n);
        }
    }
    
    public void a(final boolean b) {
        if (b) {
            this.d.setVisibility(0);
            this.d.setImageBitmap(this.c.d());
        }
        else {
            Toast.makeText((Context)this, 2131297165, 1).show();
            this.setResult(0);
            this.finish();
        }
        this.removeDialog(1);
    }
    
    protected void a(final boolean b, final Intent intent) {
        this.removeDialog(0);
        if (b) {
            this.setResult(-1, intent);
        }
        else {
            Toast.makeText((Context)this, 2131296743, 1).show();
            this.setResult(0);
        }
        this.finish();
    }
    
    public void a_(final Uri uri) {
        this.a(false, new Intent());
    }
    
    protected void b() {
        this.showDialog(1);
        this.c.a((Context)this, this.a);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.a = (Uri)this.getIntent().getParcelableExtra("uri");
        this.e = this.getIntent().getBooleanExtra("create_image", true);
        (this.d = (CroppableImageView)this.findViewById(2131886127)).setVisibility(4);
        (this.c = CropManager.a(this.getSupportFragmentManager())).a(this);
        if (!this.c.c() && !this.c.b()) {
            if (this.c.a()) {
                this.d.setVisibility(0);
                this.d.setImageBitmap(this.c.d());
                return;
            }
            this.b();
        }
    }
    
    protected void d() {
        if (this.e) {
            this.showDialog(0);
            this.c.a((Context)this, this.a, this.B_(), this.d.getImageRotation());
            return;
        }
        this.a(this.a, this.B_(), this.d.getImageRotation());
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.setResult(0);
        this.finish();
    }
    
    public void onClickHandler(final View view) {
        final int id = view.getId();
        if (id == 2131886624) {
            this.d();
        }
        else if (id == 2131886293) {
            this.setResult(0);
            this.finish();
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        final ProgressDialog progressDialog = new ProgressDialog((Context)this);
        progressDialog.setProgressStyle(0);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener((DialogInterface$OnCancelListener)this);
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 0: {
                progressDialog.setMessage((CharSequence)this.getString(2131296742));
                return (Dialog)progressDialog;
            }
            case 1: {
                progressDialog.setMessage((CharSequence)this.getString(2131297169));
                return (Dialog)progressDialog;
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        this.c.b(this);
        super.onDestroy();
    }
    
    @Override
    public boolean onSearchRequested() {
        return false;
    }
}
