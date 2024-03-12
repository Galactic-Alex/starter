package com.alex.starter.model;

import com.alex.starter.properties.JopaProperties;

public class Jopa {
    private final int size;
    private final String jopa;

    public Jopa(String size) {
        this.size = Integer.parseInt(size);
        jopa = createJopa();
    }

    public Jopa(JopaProperties jopaProperties) {
        this.size = Integer.parseInt(jopaProperties.getSize());
        jopa = createJopa();
    }

    public void srat() {
        System.out.println(jopa);
    }

    private String createJopa() {
        StringBuilder stringBuilder = new StringBuilder("(");
        increaseCheekSize(stringBuilder);
        stringBuilder.append("|");
        increaseCheekSize(stringBuilder);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private void increaseCheekSize(StringBuilder stringBuilder) {
        for (int i = 0; i < size; i++) {
            stringBuilder.append("_");
        }
    }
}
