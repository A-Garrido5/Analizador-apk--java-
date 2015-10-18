// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode$Callback;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.app.Dialog;
import android.content.Context;
import android.os.Build$VERSION;
import android.app.Activity;

public abstract class AppCompatDelegate
{
    public static AppCompatDelegate create(final Activity activity, final AppCompatCallback appCompatCallback) {
        if (Build$VERSION.SDK_INT >= 11) {
            return new AppCompatDelegateImplV11((Context)activity, activity.getWindow(), appCompatCallback);
        }
        return new AppCompatDelegateImplV7((Context)activity, activity.getWindow(), appCompatCallback);
    }
    
    public static AppCompatDelegate create(final Dialog dialog, final AppCompatCallback appCompatCallback) {
        if (Build$VERSION.SDK_INT >= 11) {
            return new AppCompatDelegateImplV11(dialog.getContext(), dialog.getWindow(), appCompatCallback);
        }
        return new AppCompatDelegateImplV7(dialog.getContext(), dialog.getWindow(), appCompatCallback);
    }
    
    public abstract void addContentView(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract MenuInflater getMenuInflater();
    
    public abstract ActionBar getSupportActionBar();
    
    public abstract void installViewFactory();
    
    public abstract void invalidateOptionsMenu();
    
    public abstract void onConfigurationChanged(final Configuration p0);
    
    public abstract void onCreate(final Bundle p0);
    
    public abstract void onDestroy();
    
    public abstract void onPostCreate(final Bundle p0);
    
    public abstract void onPostResume();
    
    public abstract void onStop();
    
    public abstract boolean requestWindowFeature(final int p0);
    
    public abstract void setContentView(final int p0);
    
    public abstract void setContentView(final View p0);
    
    public abstract void setContentView(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void setSupportActionBar(final Toolbar p0);
    
    public abstract void setTitle(final CharSequence p0);
    
    public abstract ActionMode startSupportActionMode(final ActionMode$Callback p0);
}
