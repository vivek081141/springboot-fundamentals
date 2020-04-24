/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.adapter;

import org.junit.Test;

/**
 * This is also called wrapper pattern
 * In adapter, we are not trying to change the behaviour
 * we may want to use decorator pattern if we want to change the behaviour too
 */
public class AdapterTest {

    @Test
    public void test(){
        IAdapter adapter = new Adapter(new Adaptee());
        adapter.newRequest();
    }
}