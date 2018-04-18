/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.codecraft.varioustesting.inheritance;

/**
 *
 * @author Djordje Cvetkovic <djolec987@gmail.com>
 */
public class _InheritanceTester {
    
    public static void printFullClassName() {
        AbstractBaseClass abc = new ChildClassOne();
        System.out.println(abc.getClass().getCanonicalName());
    }

}
