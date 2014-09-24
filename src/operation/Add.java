/**
 * File generated from the NewModel::operation::Add uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 */
package operation;

import computer.Memory;
import operand.Address;
import operand.Operand;
import operand.Word;
import operation.BinExpr;

/**
 * Description of Add.
 */
public class Add extends BinExpr {

    public Add(Operand op1, Operand op2, Address address) {
    	super(op1,  op2,  address);
    }
    

	@Override
	public void typeOp(Memory memory) {
		address.getValue(memory).add(op1.getValue(memory), op2.getValue(memory));
		
	}
	
	public String prefix(){
		return "ADD ";
	}
    
    
}
