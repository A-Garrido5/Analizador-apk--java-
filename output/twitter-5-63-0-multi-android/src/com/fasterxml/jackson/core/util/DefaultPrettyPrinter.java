// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Serializable;
import com.fasterxml.jackson.core.c;

public class DefaultPrettyPrinter implements c, Serializable
{
    public static final SerializedString a;
    private static final long serialVersionUID = 1L;
    protected com.fasterxml.jackson.core.util.c _arrayIndenter;
    protected com.fasterxml.jackson.core.util.c _objectIndenter;
    protected final d _rootSeparator;
    protected boolean _spacesInObjectEntries;
    protected transient int b;
    
    static {
        a = new SerializedString(" ");
    }
    
    @Override
    public void a(final JsonGenerator jsonGenerator) {
        if (this._rootSeparator != null) {
            jsonGenerator.b(this._rootSeparator);
        }
    }
    
    @Override
    public void a(final JsonGenerator jsonGenerator, final int n) {
        if (!this._objectIndenter.a()) {
            --this.b;
        }
        if (n > 0) {
            this._objectIndenter.a(jsonGenerator, this.b);
        }
        else {
            jsonGenerator.a(' ');
        }
        jsonGenerator.a('}');
    }
    
    @Override
    public void b(final JsonGenerator jsonGenerator) {
        jsonGenerator.a('{');
        if (!this._objectIndenter.a()) {
            ++this.b;
        }
    }
    
    @Override
    public void b(final JsonGenerator jsonGenerator, final int n) {
        if (!this._arrayIndenter.a()) {
            --this.b;
        }
        if (n > 0) {
            this._arrayIndenter.a(jsonGenerator, this.b);
        }
        else {
            jsonGenerator.a(' ');
        }
        jsonGenerator.a(']');
    }
    
    @Override
    public void c(final JsonGenerator jsonGenerator) {
        jsonGenerator.a(',');
        this._objectIndenter.a(jsonGenerator, this.b);
    }
    
    @Override
    public void d(final JsonGenerator jsonGenerator) {
        if (this._spacesInObjectEntries) {
            jsonGenerator.c(" : ");
            return;
        }
        jsonGenerator.a(':');
    }
    
    @Override
    public void e(final JsonGenerator jsonGenerator) {
        if (!this._arrayIndenter.a()) {
            ++this.b;
        }
        jsonGenerator.a('[');
    }
    
    @Override
    public void f(final JsonGenerator jsonGenerator) {
        jsonGenerator.a(',');
        this._arrayIndenter.a(jsonGenerator, this.b);
    }
    
    @Override
    public void g(final JsonGenerator jsonGenerator) {
        this._arrayIndenter.a(jsonGenerator, this.b);
    }
    
    @Override
    public void h(final JsonGenerator jsonGenerator) {
        this._objectIndenter.a(jsonGenerator, this.b);
    }
}
