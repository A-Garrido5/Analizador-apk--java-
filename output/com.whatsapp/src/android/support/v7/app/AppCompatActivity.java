// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v7.view.ActionMode$Callback;
import android.support.v7.widget.Toolbar;
import android.support.v7.view.ActionMode;
import android.view.MenuItem;
import android.support.v4.app.TaskStackBuilder;
import android.os.Bundle;
import android.content.res.Configuration;
import android.support.v4.app.NavUtils;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.view.MenuInflater;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.support.v4.app.TaskStackBuilder$SupportParentable;
import android.support.v4.app.FragmentActivity;

public class AppCompatActivity extends FragmentActivity implements AppCompatCallback, TaskStackBuilder$SupportParentable, ActionBarDrawerToggle$DelegateProvider
{
    public static boolean b;
    private AppCompatDelegate mDelegate;
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.getDelegate().addContentView(view, viewGroup$LayoutParams);
    }
    
    public AppCompatDelegate getDelegate() {
        try {
            if (this.mDelegate == null) {
                this.mDelegate = AppCompatDelegate.create(this, this);
            }
            return this.mDelegate;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public MenuInflater getMenuInflater() {
        return this.getDelegate().getMenuInflater();
    }
    
    @Nullable
    public ActionBar getSupportActionBar() {
        return this.getDelegate().getSupportActionBar();
    }
    
    @Nullable
    @Override
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }
    
    public void invalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.getDelegate().onConfigurationChanged(configuration);
    }
    
    public void onContentChanged() {
        this.onSupportContentChanged();
    }
    
    @Override
    protected void onCreate(@Nullable final Bundle bundle) {
        this.getDelegate().installViewFactory();
        super.onCreate(bundle);
        this.getDelegate().onCreate(bundle);
    }
    
    public void onCreateSupportNavigateUpTaskStack(final TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.addParentStack(this);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.getDelegate().onDestroy();
    }
    
    @Override
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        try {
            if (super.onMenuItemSelected(n, menuItem)) {
                return true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final ActionBar supportActionBar = this.getSupportActionBar();
        try {
            if (menuItem.getItemId() != 16908332 || supportActionBar == null) {
                return false;
            }
            final int n2 = 4;
            final ActionBar actionBar = supportActionBar;
            final int n3 = actionBar.getDisplayOptions();
            final int n4 = n2 & n3;
            if (n4 != 0) {
                final AppCompatActivity appCompatActivity = this;
                final boolean onSupportNavigateUp = appCompatActivity.onSupportNavigateUp();
                return onSupportNavigateUp;
            }
            return false;
        }
        catch (IllegalStateException ex2) {
            try {
                throw ex2;
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
        try {
            final int n2 = 4;
            final ActionBar actionBar = supportActionBar;
            final int n3 = actionBar.getDisplayOptions();
            final int n4 = n2 & n3;
            if (n4 != 0) {
                final AppCompatActivity appCompatActivity = this;
                final boolean onSupportNavigateUp2;
                final boolean onSupportNavigateUp = onSupportNavigateUp2 = appCompatActivity.onSupportNavigateUp();
                return onSupportNavigateUp2;
            }
        }
        catch (IllegalStateException ex4) {
            throw ex4;
        }
        return false;
    }
    
    protected void onPostCreate(@Nullable final Bundle bundle) {
        super.onPostCreate(bundle);
        this.getDelegate().onPostCreate(bundle);
    }
    
    @Override
    protected void onPostResume() {
        super.onPostResume();
        this.getDelegate().onPostResume();
    }
    
    public void onPrepareSupportNavigateUpTaskStack(final TaskStackBuilder taskStackBuilder) {
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        this.getDelegate().onStop();
    }
    
    @Override
    public void onSupportActionModeFinished(final ActionMode actionMode) {
    }
    
    @Override
    public void onSupportActionModeStarted(final ActionMode actionMode) {
    }
    
    @Deprecated
    public void onSupportContentChanged() {
    }
    
    public boolean onSupportNavigateUp() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/support/v7/app/AppCompatActivity.getSupportParentActivityIntent:()Landroid/content/Intent;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          76
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokevirtual   android/support/v7/app/AppCompatActivity.supportShouldUpRecreateTask:(Landroid/content/Intent;)Z
        //    14: istore_3       
        //    15: iload_3        
        //    16: ifeq            52
        //    19: aload_0        
        //    20: invokestatic    android/support/v4/app/TaskStackBuilder.create:(Landroid/content/Context;)Landroid/support/v4/app/TaskStackBuilder;
        //    23: astore          5
        //    25: aload_0        
        //    26: aload           5
        //    28: invokevirtual   android/support/v7/app/AppCompatActivity.onCreateSupportNavigateUpTaskStack:(Landroid/support/v4/app/TaskStackBuilder;)V
        //    31: aload_0        
        //    32: aload           5
        //    34: invokevirtual   android/support/v7/app/AppCompatActivity.onPrepareSupportNavigateUpTaskStack:(Landroid/support/v4/app/TaskStackBuilder;)V
        //    37: aload           5
        //    39: invokevirtual   android/support/v4/app/TaskStackBuilder.startActivities:()V
        //    42: aload_0        
        //    43: invokestatic    android/support/v4/app/ActivityCompat.finishAffinity:(Landroid/app/Activity;)V
        //    46: getstatic       android/support/v7/app/ActionBar.a:Z
        //    49: ifeq            57
        //    52: aload_0        
        //    53: aload_1        
        //    54: invokevirtual   android/support/v7/app/AppCompatActivity.supportNavigateUpTo:(Landroid/content/Intent;)V
        //    57: iconst_1       
        //    58: ireturn        
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: astore          6
        //    64: aload_0        
        //    65: invokevirtual   android/support/v7/app/AppCompatActivity.finish:()V
        //    68: goto            46
        //    71: astore          4
        //    73: aload           4
        //    75: athrow         
        //    76: iconst_0       
        //    77: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  9      15     59     62     Ljava/lang/IllegalStateException;
        //  42     46     62     71     Ljava/lang/IllegalStateException;
        //  46     52     71     76     Ljava/lang/IllegalStateException;
        //  52     57     71     76     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 43, Size: 43
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    protected void onTitleChanged(final CharSequence title, final int n) {
        super.onTitleChanged(title, n);
        this.getDelegate().setTitle(title);
    }
    
    public void setContentView(final int contentView) {
        this.getDelegate().setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        this.getDelegate().setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.getDelegate().setContentView(view, viewGroup$LayoutParams);
    }
    
    public void setSupportActionBar(@Nullable final Toolbar supportActionBar) {
        this.getDelegate().setSupportActionBar(supportActionBar);
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(final boolean b) {
    }
    
    public ActionMode startSupportActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.getDelegate().startSupportActionMode(actionMode$Callback);
    }
    
    @Override
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }
    
    public void supportNavigateUpTo(final Intent intent) {
        NavUtils.navigateUpTo(this, intent);
    }
    
    public boolean supportRequestWindowFeature(final int n) {
        return this.getDelegate().requestWindowFeature(n);
    }
    
    public boolean supportShouldUpRecreateTask(final Intent intent) {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }
}
