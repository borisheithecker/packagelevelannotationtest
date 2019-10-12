/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static java.lang.annotation.ElementType.PACKAGE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 *
 * @author boris
 */
@Retention(RUNTIME)
//@Target(PACKAGE)
public @interface TestAnnotation {

}
