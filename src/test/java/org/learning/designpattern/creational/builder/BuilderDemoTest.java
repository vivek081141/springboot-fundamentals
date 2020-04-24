/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.builder;

import org.junit.Test;

public class BuilderDemoTest {

    @Test
    public void test(){
        BuilderDemo.Builder builder = new BuilderDemo.Builder();
        builder.addName("Vivek").addId("081141");
        BuilderDemo demo =  builder.build();
        System.out.println(demo.getId());
        System.out.println(demo.getName());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vivek");
        stringBuilder.toString();
    }

}