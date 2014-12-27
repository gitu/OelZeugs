package org.schrag.oelzeugs;

import java.util.Collection;

public class LambdaPrint {
    public void printAll(Collection<String> list) {
        list.forEach(System.out::println);
        list.forEach((e)->System.out.println(e.toString()));
    }
}
