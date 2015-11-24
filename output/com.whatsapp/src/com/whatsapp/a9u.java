// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.Cursor;
import android.database.CursorWrapper;

class a9u extends CursorWrapper
{
    private s0 a;
    
    public a9u(final Cursor cursor, final s0 a) {
        super(cursor);
        this.a = a;
    }
    
    public void deactivate() {
        super.deactivate();
    }
    
    public int getCount() {
        try {
            return super.getCount();
        }
        catch (SQLiteDatabaseCorruptException ex) {
            App.ak.i();
            throw ex;
        }
    }
    
    public boolean requery() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/a9u.a:Lcom/whatsapp/s0;
        //     4: ifnull          16
        //     7: aload_0        
        //     8: getfield        com/whatsapp/a9u.a:Lcom/whatsapp/s0;
        //    11: invokeinterface com/whatsapp/s0.b:()V
        //    16: aload_0        
        //    17: invokespecial   android/database/CursorWrapper.requery:()Z
        //    20: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    23: astore_2       
        //    24: aload_0        
        //    25: getfield        com/whatsapp/a9u.a:Lcom/whatsapp/s0;
        //    28: ifnull          40
        //    31: aload_0        
        //    32: getfield        com/whatsapp/a9u.a:Lcom/whatsapp/s0;
        //    35: invokeinterface com/whatsapp/s0.a:()V
        //    40: aload_2        
        //    41: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    44: ireturn        
        //    45: astore_1       
        //    46: aload_1        
        //    47: athrow         
        //    48: astore_3       
        //    49: aload_3        
        //    50: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      16     45     48     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        //  24     40     48     51     Landroid/database/sqlite/SQLiteDatabaseCorruptException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
}
