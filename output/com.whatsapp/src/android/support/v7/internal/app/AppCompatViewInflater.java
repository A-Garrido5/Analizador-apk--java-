// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.internal.widget.ViewUtils;
import android.support.annotation.NonNull;
import android.view.View;
import java.util.HashMap;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;

public class AppCompatViewInflater
{
    private static final Map sConstructorMap;
    static final Class[] sConstructorSignature;
    private static final String[] z;
    private final Object[] mConstructorArgs;
    private final Context mContext;
    
    static {
        final String[] z2 = new String[13];
        String s = "\u0007\u001fgfG";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '4';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = '\u0006';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0012\u001acb";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0005\u001dbg[\r\u0017(b]\u0000\u0014ca\u001a";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "'\u001bcv_\u0001\u0017RpL\u0010%opC";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "&\u0006ra[\n";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "!\u0017oa`\u0001\u000br";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "'\u001bcv_&\u001c~";
                    n = 5;
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "%\u0006rzw\u000b\u001evyQ\u0010\u0016RpL\u0010%opC";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "6\u0012b|[&\u0006ra[\n";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "6\u0012r|Z\u00031gg";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "7\u0003o{Z\u0001\u0001";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = ")\u0006ja]%\u0006rzw\u000b\u001evyQ\u0010\u0016RpL\u0010%opC";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "0\u0016~ab\r\u0016q";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        sConstructorSignature = new Class[] { Context.class, AttributeSet.class };
        sConstructorMap = new HashMap();
    }
    
    public AppCompatViewInflater(final Context mContext) {
        this.mConstructorArgs = new Object[2];
        this.mContext = mContext;
    }
    
    private View createView(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/app/AppCompatViewInflater.sConstructorMap:Ljava/util/Map;
        //     3: aload_1        
        //     4: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     9: checkcast       Ljava/lang/reflect/Constructor;
        //    12: astore_3       
        //    13: aload_3        
        //    14: ifnonnull       84
        //    17: aload_0        
        //    18: getfield        android/support/v7/internal/app/AppCompatViewInflater.mContext:Landroid/content/Context;
        //    21: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    24: astore          8
        //    26: aload_2        
        //    27: ifnull          119
        //    30: new             Ljava/lang/StringBuilder;
        //    33: dup            
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: aload_2        
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: aload_1        
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    48: astore          11
        //    50: aload           11
        //    52: astore          9
        //    54: aload           8
        //    56: aload           9
        //    58: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    61: ldc             Landroid/view/View;.class
        //    63: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //    66: getstatic       android/support/v7/internal/app/AppCompatViewInflater.sConstructorSignature:[Ljava/lang/Class;
        //    69: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    72: astore_3       
        //    73: getstatic       android/support/v7/internal/app/AppCompatViewInflater.sConstructorMap:Ljava/util/Map;
        //    76: aload_1        
        //    77: aload_3        
        //    78: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    83: pop            
        //    84: aload_3        
        //    85: iconst_1       
        //    86: invokevirtual   java/lang/reflect/Constructor.setAccessible:(Z)V
        //    89: aload_3        
        //    90: aload_0        
        //    91: getfield        android/support/v7/internal/app/AppCompatViewInflater.mConstructorArgs:[Ljava/lang/Object;
        //    94: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    97: checkcast       Landroid/view/View;
        //   100: astore          5
        //   102: aload           5
        //   104: areturn        
        //   105: astore          6
        //   107: aload           6
        //   109: athrow         
        //   110: astore          7
        //   112: aload           7
        //   114: athrow         
        //   115: astore          4
        //   117: aconst_null    
        //   118: areturn        
        //   119: aload_1        
        //   120: astore          9
        //   122: goto            54
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     26     105    110    Ljava/lang/Exception;
        //  30     50     110    115    Ljava/lang/Exception;
        //  54     84     115    119    Ljava/lang/Exception;
        //  84     102    115    119    Ljava/lang/Exception;
        //  107    110    110    115    Ljava/lang/Exception;
        //  112    115    115    119    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 60, Size: 60
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
    
    private View createViewFromTag(final Context context, String attributeValue, final AttributeSet set) {
        if (attributeValue.equals(AppCompatViewInflater.z[1])) {
            attributeValue = set.getAttributeValue((String)null, AppCompatViewInflater.z[0]);
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = set;
            if (-1 == attributeValue.indexOf(46)) {
                return this.createView(attributeValue, AppCompatViewInflater.z[2]);
            }
            return this.createView(attributeValue, null);
        }
        catch (Exception ex) {
            return null;
        }
        finally {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
        }
    }
    
    public final View createView(final View view, final String s, @NonNull final Context context, @NonNull final AttributeSet set, final boolean b, final boolean b2) {
        final int b3 = ToolbarActionBar.b;
        Context context2;
        if (b && view != null) {
            context2 = view.getContext();
        }
        else {
            context2 = context;
        }
        if (b2) {
            context2 = ViewUtils.themifyContext(context2, set, true, true);
        }
        int n = -1;
        Label_0393: {
            switch (s.hashCode()) {
                case 1666676343: {
                    if (!s.equals(AppCompatViewInflater.z[5])) {
                        break;
                    }
                    n = 0;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case -339785223: {
                    if (!s.equals(AppCompatViewInflater.z[10])) {
                        break;
                    }
                    n = 1;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case 1601505219: {
                    if (!s.equals(AppCompatViewInflater.z[6])) {
                        break;
                    }
                    n = 2;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case 776382189: {
                    if (!s.equals(AppCompatViewInflater.z[8])) {
                        break;
                    }
                    n = 3;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case -1455429095: {
                    if (!s.equals(AppCompatViewInflater.z[3])) {
                        break;
                    }
                    n = 4;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case 1413872058: {
                    if (!s.equals(AppCompatViewInflater.z[7])) {
                        break;
                    }
                    n = 5;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case -1346021293: {
                    if (!s.equals(AppCompatViewInflater.z[11])) {
                        break;
                    }
                    n = 6;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case -1946472170: {
                    if (!s.equals(AppCompatViewInflater.z[9])) {
                        break;
                    }
                    n = 7;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case 2001146706: {
                    if (!s.equals(AppCompatViewInflater.z[4])) {
                        break;
                    }
                    n = 8;
                    if (b3 != 0) {
                        break Label_0393;
                    }
                    break;
                }
                case -938935918: {
                    if (s.equals(AppCompatViewInflater.z[12])) {
                        n = 9;
                        break;
                    }
                    break;
                }
            }
        }
        switch (n) {
            default: {
                if (context != context2) {
                    return this.createViewFromTag(context2, s, set);
                }
                return null;
            }
            case 0: {
                return (View)new AppCompatEditText(context2, set);
            }
            case 1: {
                return (View)new AppCompatSpinner(context2, set);
            }
            case 2: {
                return (View)new AppCompatCheckBox(context2, set);
            }
            case 3: {
                return (View)new AppCompatRadioButton(context2, set);
            }
            case 4: {
                return (View)new AppCompatCheckedTextView(context2, set);
            }
            case 5: {
                return (View)new AppCompatAutoCompleteTextView(context2, set);
            }
            case 6: {
                return (View)new AppCompatMultiAutoCompleteTextView(context2, set);
            }
            case 7: {
                return (View)new AppCompatRatingBar(context2, set);
            }
            case 8: {
                return (View)new AppCompatButton(context2, set);
            }
            case 9: {
                return (View)new AppCompatTextView(context2, set);
            }
        }
    }
}
