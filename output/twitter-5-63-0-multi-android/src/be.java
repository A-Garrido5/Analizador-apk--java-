import java.lang.reflect.Method;
import java.util.List;
import java.lang.reflect.InvocationHandler;

// 
// Decompiled by Procyon v0.5.30
// 

class be implements InvocationHandler
{
    private final List a;
    private boolean b;
    private String c;
    
    public be(final List a) {
        this.a = a;
    }
    
    @Override
    public Object invoke(final Object o, final Method method, Object[] b) {
        final String name = method.getName();
        final Class<?> returnType = method.getReturnType();
        if (b == null) {
            b = bf.b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.b = true;
            return null;
        }
        if (name.equals("protocols") && b.length == 0) {
            return this.a;
        }
        if (name.equals("selectProtocol") && String.class == returnType && b.length == 1 && (b[0] == null || b[0] instanceof List)) {
            final List list = (List)b[0];
            for (int size = list.size(), i = 0; i < size; ++i) {
                if (this.a.contains(list.get(i))) {
                    return this.c = list.get(i);
                }
            }
            return this.c = this.a.get(0);
        }
        if (name.equals("protocolSelected") && b.length == 1) {
            this.c = (String)b[0];
            return null;
        }
        return method.invoke(this, b);
    }
}
