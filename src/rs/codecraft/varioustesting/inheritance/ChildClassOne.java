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
public class ChildClassOne extends AbstractBaseClass {

    @Override
    public void someAbstractMethod() {
        System.out.println("Executing overriden abstract method \"someAbstractMethod\" from class ChildClassOne");
    }

}
