/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openide.modules.OnStart;

/**
 *
 * @author boris
 */
@OnStart
public class OnStartTest implements Runnable {

    @Override
    public void run() {
        TestAnnotation annot = OnStartTest.class.getPackage().getAnnotation(TestAnnotation.class);
        
        //Fails in NetBeans 11.1 on oracle jdk11.0.4
        //Succeeds with NetBeans platform 8.2 on oracle jdk1.8.0_162
        assert annot != null;
    }

}
