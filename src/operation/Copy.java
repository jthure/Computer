/**
 * File generated from the NewModel::operation::Copy uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 */
package operation;

import operand.Operand;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Copy.
 */
public class Copy implements Operation {
    /**
     * Description of the property op1.
     */
    private Operand op1 = null;
    
    // Start of user code (user defined attributes)
    
    // End of user code
    
    /**
     * The constructor.
     */
    public Copy() {
    	// Start of user code constructor
    	super();
    	// End of user code
    }
    
    /**
     * Description of the method exec.
     * @param memory 
     * @param progCounter 
     */
    public void exec(Memory memory, ProgCounter progCounter) {
    	// Start of user code for method exec
    	// End of user code
    }
     
    // Start of user code (user defined methods)
    
    // End of user code
    
    /**
     * Returns op1.
     * @return op1 
     */
    public Operand getOp1() {
    	return this.op1;
    }
    
    /**
     * Sets a value to attribute op1. 
     * @param newOp1 
     */
    public void setOp1(Operand newOp1) {
        this.op1 = newOp1;
    }
    
    
}
