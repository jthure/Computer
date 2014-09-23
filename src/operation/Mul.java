/**
 * File generated from the NewModel::operation::Mul uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 */
package operation;

import computer.Memory;

import operand.Address;
import operand.Operand;
import operation.BinExpr;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Mul.
 */
public class Mul extends BinExpr {
    public Mul(Operand op1, Operand op2, Address address) {
    	super(op1,  op2,  address);
    }
    
    /**
     * Description of the method typeOp.
     */
    public void typeOp(Memory memory) {
    	address.getValue(memory).mul(op1.getValue(memory), op2.getValue(memory));
    }
     
    // Start of user code (user defined methods)
    
    // End of user code
    
    
}
