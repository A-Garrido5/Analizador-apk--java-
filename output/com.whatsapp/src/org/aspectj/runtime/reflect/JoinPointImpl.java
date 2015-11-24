// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.lang.Signature;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.AroundClosure;
import org.aspectj.lang.ProceedingJoinPoint;

class JoinPointImpl implements ProceedingJoinPoint
{
    Object _this;
    private AroundClosure arc;
    Object[] args;
    StaticPart staticPart;
    Object target;
    
    public JoinPointImpl(final StaticPart staticPart, final Object this2, final Object target, final Object[] args) {
        this.staticPart = staticPart;
        this._this = this2;
        this.target = target;
        this.args = args;
    }
    
    @Override
    public Object[] getArgs() {
        if (this.args == null) {
            this.args = new Object[0];
        }
        final Object[] array = new Object[this.args.length];
        System.arraycopy(this.args, 0, array, 0, this.args.length);
        return array;
    }
    
    @Override
    public String getKind() {
        return this.staticPart.getKind();
    }
    
    @Override
    public Signature getSignature() {
        return this.staticPart.getSignature();
    }
    
    @Override
    public SourceLocation getSourceLocation() {
        return this.staticPart.getSourceLocation();
    }
    
    @Override
    public StaticPart getStaticPart() {
        return this.staticPart;
    }
    
    @Override
    public Object getTarget() {
        return this.target;
    }
    
    @Override
    public Object getThis() {
        return this._this;
    }
    
    @Override
    public Object proceed() throws Throwable {
        if (this.arc == null) {
            return null;
        }
        return this.arc.run(this.arc.getState());
    }
    
    @Override
    public Object proceed(final Object[] array) throws Throwable {
        int n = 1;
        if (this.arc == null) {
            return null;
        }
        final int flags = this.arc.getFlags();
        if ((0x100000 & flags) != 0x0) {}
        int n2;
        if ((0x10000 & flags) != 0x0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        int n3;
        if ((flags & 0x1000) != 0x0) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        int n4;
        if ((flags & 0x100) != 0x0) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        int n5;
        if ((flags & 0x10) != 0x0) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        int n6;
        if ((flags & 0x1) != 0x0) {
            n6 = n;
        }
        else {
            n6 = 0;
        }
        final Object[] state = this.arc.getState();
        int n7;
        if (n3 != 0) {
            n7 = n;
        }
        else {
            n7 = 0;
        }
        final int n8 = 0 + n7;
        int n9;
        if (n5 != 0 && n2 == 0) {
            n9 = n;
        }
        else {
            n9 = 0;
        }
        final int n10 = n8 + n9;
        int n11 = 0;
        if (n3 != 0) {
            n11 = 0;
            if (n4 != 0) {
                n11 = 1;
                state[0] = array[0];
            }
        }
        if (n5 != 0 && n6 != 0) {
            if (n2 != 0) {
                int n12;
                if (n4 != 0) {
                    n12 = n;
                }
                else {
                    n12 = 0;
                }
                n11 = n12 + 1;
                if (n4 == 0) {
                    n = 0;
                }
                state[0] = array[n];
            }
            else {
                int n13;
                if (n3 != 0) {
                    n13 = n;
                }
                else {
                    n13 = 0;
                }
                n11 = n13 + 1;
                int n14;
                if (n3 != 0) {
                    n14 = n;
                }
                else {
                    n14 = 0;
                }
                if (n3 == 0) {
                    n = 0;
                }
                state[n14] = array[n];
            }
        }
        for (int i = n11; i < array.length; ++i) {
            state[n10 + (i - n11)] = array[i];
        }
        return this.arc.run(state);
    }
    
    @Override
    public void set$AroundClosure(final AroundClosure arc) {
        this.arc = arc;
    }
    
    @Override
    public final String toLongString() {
        return this.staticPart.toLongString();
    }
    
    @Override
    public final String toShortString() {
        return this.staticPart.toShortString();
    }
    
    @Override
    public final String toString() {
        return this.staticPart.toString();
    }
    
    static class EnclosingStaticPartImpl extends StaticPartImpl implements EnclosingStaticPart
    {
        public EnclosingStaticPartImpl(final int n, final String s, final Signature signature, final SourceLocation sourceLocation) {
            super(n, s, signature, sourceLocation);
        }
    }
    
    static class StaticPartImpl implements StaticPart
    {
        private int id;
        String kind;
        Signature signature;
        SourceLocation sourceLocation;
        
        public StaticPartImpl(final int id, final String kind, final Signature signature, final SourceLocation sourceLocation) {
            this.kind = kind;
            this.signature = signature;
            this.sourceLocation = sourceLocation;
            this.id = id;
        }
        
        @Override
        public int getId() {
            return this.id;
        }
        
        @Override
        public String getKind() {
            return this.kind;
        }
        
        @Override
        public Signature getSignature() {
            return this.signature;
        }
        
        @Override
        public SourceLocation getSourceLocation() {
            return this.sourceLocation;
        }
        
        @Override
        public final String toLongString() {
            return this.toString(StringMaker.longStringMaker);
        }
        
        @Override
        public final String toShortString() {
            return this.toString(StringMaker.shortStringMaker);
        }
        
        @Override
        public final String toString() {
            return this.toString(StringMaker.middleStringMaker);
        }
        
        String toString(final StringMaker stringMaker) {
            final StringBuffer sb = new StringBuffer();
            sb.append(stringMaker.makeKindName(this.getKind()));
            sb.append("(");
            sb.append(((SignatureImpl)this.getSignature()).toString(stringMaker));
            sb.append(")");
            return sb.toString();
        }
    }
}
