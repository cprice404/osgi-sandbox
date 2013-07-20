package com.puppetlabs.sandbox.osgi.annotation;

import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.PropertyOption;
import org.apache.felix.scr.annotations.PropertyUnbounded;

import java.lang.annotation.Annotation;

public class PropertyLiteral implements Annotation, Property {

    private String name;
    private String[] value;

    public PropertyLiteral(String name, String[] value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String label() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public String description() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public String[] value() {
        return value;
    }

    @Override
    public Class<?>[] classValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public long[] longValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public double[] doubleValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public float[] floatValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public int[] intValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public byte[] byteValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public char[] charValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public boolean[] boolValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public short[] shortValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public String[] passwordValue() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public int cardinality() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public PropertyUnbounded unbounded() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public boolean propertyPrivate() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public PropertyOption[] options() {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return Property.class;
    }
}
