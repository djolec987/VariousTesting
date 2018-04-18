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
public abstract class AbstractBaseClass {

    private int propertyOne;
    
    public void setPropertyOne(int po) {
        this.propertyOne = po;
    }
    
    public int getPropertyOne() {
        return this.propertyOne;
    }
    
    public abstract void someAbstractMethod();
    
}
