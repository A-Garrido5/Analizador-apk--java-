// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class ModernAsyncTask$3 extends FutureTask
{
    private static final String[] z;
    final ModernAsyncTask this$0;
    
    static {
        final String[] z2 = new String[3];
        String s = "k4=\u0016OX5oSRI9h\u0001XNzj\u001bTF?=\u0016EO9h\u0007TD==\u0017Rc4_\u0012^A=o\u001cHD>5Z";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = '*';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "k)d\u001d^~;n\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "k4=\u0016OX5oSRI9h\u0001XNzj\u001bTF?=\u0016EO9h\u0007TD==\u0017Rc4_\u0012^A=o\u001cHD>5Z";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ModernAsyncTask$3(final ModernAsyncTask this$0, final Callable callable) {
        this.this$0 = this$0;
        super(callable);
    }
    
    @Override
    protected void done() {
        try {
            ModernAsyncTask.access$400(this.this$0, this.get());
        }
        catch (InterruptedException ex) {
            Log.w(ModernAsyncTask$3.z[1], (Throwable)ex);
        }
        catch (ExecutionException ex2) {
            throw new RuntimeException(ModernAsyncTask$3.z[2], ex2.getCause());
        }
        catch (CancellationException ex3) {
            ModernAsyncTask.access$400(this.this$0, null);
        }
        catch (Throwable t) {
            throw new RuntimeException(ModernAsyncTask$3.z[0], t);
        }
    }
}
