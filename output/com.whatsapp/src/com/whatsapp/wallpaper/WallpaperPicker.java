// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.widget.AdapterView;
import android.os.AsyncTask$Status;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.os.Build$VERSION;
import android.app.Dialog;
import android.content.pm.PackageManager$NameNotFoundException;
import android.widget.SpinnerAdapter;
import com.whatsapp.aqx;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.util.Log;
import android.content.res.Resources$NotFoundException;
import java.io.Serializable;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.ArrayList;
import com.whatsapp.CustomVelocityGallery;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.app.Activity;

public class WallpaperPicker extends Activity implements AdapterView$OnItemSelectedListener, View$OnClickListener
{
    private static final String[] z;
    private boolean a;
    private CustomVelocityGallery b;
    private ArrayList c;
    private ArrayList d;
    private ImageView e;
    private d f;
    private Bitmap g;
    Resources h;
    PackageManager i;
    private m j;
    
    static {
        final String[] z2 = new String[12];
        String s = "Jtd\u001b\u0016Qgy\u0017\u0017K";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'x';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Jtd\u001b\u0016Qgy\u0017\u0017K";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Wci7\u001c";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Rga\u0012\bDvh\f'Uon\u0015\u001dW";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "Fi`P\u000fMgy\r\u0019Uv#\t\u0019Ij}\u001f\b@t";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "zu`\u001f\u0014I";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "Rga\u0012\bDvh\fWWc~\u0011\rWeh!\u0016JrR\u0018\u0017Phi";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "Atl\t\u0019Gjh";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Atl\t\u0019Gjh";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Dhi\f\u0017Lb#\r\u001dQrd\u0010\u001fV(^;;pTD*!zUH*,lHJ-";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Dhi\f\u0017Lb#\r\u001dQrd\u0010\u001fV(L.(iON?,lIC!+`RY76bU";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "Fi`P\u000fMgy\r\u0019Uv#\t\u0019Ij}\u001f\b@t";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public WallpaperPicker() {
        this.d = new ArrayList(24);
        this.c = new ArrayList(24);
        this.a = false;
        this.h = null;
    }
    
    static Bitmap a(final WallpaperPicker wallpaperPicker, final Bitmap g) {
        return wallpaperPicker.g = g;
    }
    
    static d a(final WallpaperPicker wallpaperPicker, final d f) {
        return wallpaperPicker.f = f;
    }
    
    static ArrayList a(final WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.d;
    }
    
    private void a() {
        this.a(this.h, WallpaperPicker.z[11]);
    }
    
    private void a(final int n) {
        final Intent intent = new Intent();
        intent.putExtra(WallpaperPicker.z[2], (Serializable)this.c.get(n));
        intent.putExtra(WallpaperPicker.z[1], this.getIntent().getIntExtra(WallpaperPicker.z[0], 1));
        this.setResult(-1, intent);
        this.finish();
    }
    
    private void a(final Resources resources, final String s) {
        final boolean h = ImageViewTouchBase.h;
        try {
            final String[] stringArray = resources.getStringArray(2131034112);
            final int length = stringArray.length;
            int n = 0;
            while (true) {
                Label_0128: {
                    if (n >= length) {
                        break Label_0128;
                    }
                    final String s2 = stringArray[n];
                    final int identifier = resources.getIdentifier(s2, WallpaperPicker.z[8], s);
                    Label_0121: {
                        if (identifier == 0) {
                            break Label_0121;
                        }
                        final int identifier2 = resources.getIdentifier(s2 + WallpaperPicker.z[5], WallpaperPicker.z[7], s);
                        if (identifier2 == 0) {
                            break Label_0121;
                        }
                        try {
                            this.d.add(identifier2);
                            this.c.add(identifier);
                            ++n;
                            if (!h) {
                                continue;
                            }
                            if (this.c.size() == 0) {
                                this.showDialog(1);
                                return;
                            }
                            goto Label_0166;
                        }
                        catch (Resources$NotFoundException ex) {
                            throw ex;
                        }
                    }
                }
            }
        }
        catch (Resources$NotFoundException ex2) {
            Log.e(WallpaperPicker.z[6]);
            this.showDialog(1);
        }
        catch (NullPointerException ex3) {
            this.showDialog(1);
        }
    }
    
    static ImageView b(final WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.e;
    }
    
    static Bitmap c(final WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.g;
    }
    
    static ArrayList d(final WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.c;
    }
    
    public void onClick(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/wallpaper/WallpaperPicker.a:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            28
        //    11: aload_0        
        //    12: aload_0        
        //    13: getfield        com/whatsapp/wallpaper/WallpaperPicker.b:Lcom/whatsapp/CustomVelocityGallery;
        //    16: invokevirtual   com/whatsapp/CustomVelocityGallery.getSelectedItemPosition:()I
        //    19: invokespecial   com/whatsapp/wallpaper/WallpaperPicker.a:(I)V
        //    22: getstatic       com/whatsapp/wallpaper/ImageViewTouchBase.h:Z
        //    25: ifeq            39
        //    28: aload_0        
        //    29: invokevirtual   com/whatsapp/wallpaper/WallpaperPicker.finish:()V
        //    32: return         
        //    33: astore_2       
        //    34: aload_2        
        //    35: athrow         
        //    36: astore_3       
        //    37: aload_3        
        //    38: athrow         
        //    39: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      6      33     36     Landroid/content/res/Resources$NotFoundException;
        //  11     28     36     39     Landroid/content/res/Resources$NotFoundException;
        //  28     32     36     39     Landroid/content/res/Resources$NotFoundException;
        //  34     36     36     39     Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        this.i = this.getPackageManager();
        this.setContentView(2130903237);
        (this.b = (CustomVelocityGallery)this.findViewById(2131755720)).setVelocityTransformer(new c(this));
        this.j = new m(this, this);
        this.b.setAdapter((SpinnerAdapter)this.j);
        this.b.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        this.b.setCallbackDuringFling(false);
        this.findViewById(2131755831).setOnClickListener((View$OnClickListener)this);
        this.e = (ImageView)this.findViewById(2131755830);
        try {
            this.h = this.i.getResourcesForApplication(WallpaperPicker.z[4]);
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.e(WallpaperPicker.z[3] + ex.toString());
        }
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                while (true) {
                    while (true) {
                        try {
                            if (Build$VERSION.SDK_INT >= 14) {
                                final String s = WallpaperPicker.z[9];
                                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231249)).setPositiveButton(this.getString(2131230806), (DialogInterface$OnClickListener)new q(this, s)).setNegativeButton(this.getString(2131230874), (DialogInterface$OnClickListener)new p(this)).create();
                            }
                        }
                        catch (Resources$NotFoundException ex) {
                            throw ex;
                        }
                        final String s = WallpaperPicker.z[10];
                        continue;
                    }
                }
                break;
            }
            case 1: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231040).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new n(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new k(this)).setOnCancelListener((DialogInterface$OnCancelListener)new e(this)).create();
            }
        }
    }
    
    protected void onDestroy() {
        try {
            super.onDestroy();
            if (this.f == null) {
                return;
            }
            final WallpaperPicker wallpaperPicker = this;
            final d d = wallpaperPicker.f;
            final AsyncTask$Status asyncTask$Status = d.getStatus();
            final AsyncTask$Status asyncTask$Status2 = AsyncTask$Status.FINISHED;
            if (asyncTask$Status != asyncTask$Status2) {
                final WallpaperPicker wallpaperPicker2 = this;
                final d d2 = wallpaperPicker2.f;
                final boolean b = true;
                d2.cancel(b);
                final WallpaperPicker wallpaperPicker3 = this;
                final d d3 = null;
                wallpaperPicker3.f = d3;
            }
            return;
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        try {
            final WallpaperPicker wallpaperPicker = this;
            final d d = wallpaperPicker.f;
            final AsyncTask$Status asyncTask$Status = d.getStatus();
            final AsyncTask$Status asyncTask$Status2 = AsyncTask$Status.FINISHED;
            if (asyncTask$Status != asyncTask$Status2) {
                final WallpaperPicker wallpaperPicker2 = this;
                final d d2 = wallpaperPicker2.f;
                final boolean b = true;
                d2.cancel(b);
                final WallpaperPicker wallpaperPicker3 = this;
                final d d3 = null;
                wallpaperPicker3.f = d3;
            }
        }
        catch (Resources$NotFoundException ex2) {
            throw ex2;
        }
    }
    
    public void onItemSelected(final AdapterView p0, final View p1, final int p2, final long p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/wallpaper/WallpaperPicker.f:Lcom/whatsapp/wallpaper/d;
        //     4: astore          8
        //     6: aload           8
        //     8: ifnull          31
        //    11: aload_0        
        //    12: getfield        com/whatsapp/wallpaper/WallpaperPicker.f:Lcom/whatsapp/wallpaper/d;
        //    15: invokevirtual   com/whatsapp/wallpaper/d.getStatus:()Landroid/os/AsyncTask$Status;
        //    18: getstatic       android/os/AsyncTask$Status.FINISHED:Landroid/os/AsyncTask$Status;
        //    21: if_acmpeq       31
        //    24: aload_0        
        //    25: getfield        com/whatsapp/wallpaper/WallpaperPicker.f:Lcom/whatsapp/wallpaper/d;
        //    28: invokevirtual   com/whatsapp/wallpaper/d.a:()V
        //    31: aload_0        
        //    32: new             Lcom/whatsapp/wallpaper/d;
        //    35: dup            
        //    36: aload_0        
        //    37: invokespecial   com/whatsapp/wallpaper/d.<init>:(Lcom/whatsapp/wallpaper/WallpaperPicker;)V
        //    40: putfield        com/whatsapp/wallpaper/WallpaperPicker.f:Lcom/whatsapp/wallpaper/d;
        //    43: aload_0        
        //    44: getfield        com/whatsapp/wallpaper/WallpaperPicker.f:Lcom/whatsapp/wallpaper/d;
        //    47: astore          9
        //    49: iconst_1       
        //    50: anewarray       Ljava/lang/Integer;
        //    53: astore          10
        //    55: aload           10
        //    57: iconst_0       
        //    58: iload_3        
        //    59: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    62: aastore        
        //    63: aload           9
        //    65: aload           10
        //    67: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //    70: pop            
        //    71: return         
        //    72: astore          6
        //    74: aload           6
        //    76: athrow         
        //    77: astore          7
        //    79: aload           7
        //    81: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      6      72     77     Landroid/content/res/Resources$NotFoundException;
        //  11     31     77     82     Landroid/content/res/Resources$NotFoundException;
        //  74     77     77     82     Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
    
    protected void onResume() {
        super.onResume();
        this.a();
    }
}
