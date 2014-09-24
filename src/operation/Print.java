/**
 * File generated from the NewModel::operation::Print uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 */
package operation;

import operand.Address;

import computer.Memory;
import computer.ProgCounter;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Print.
 */
public class Print implements Operation {
    /**
     * Description of the property op.
     */
    private Address address;
    
    // Start of user code (user defined attributes)
    
    // End of user code
    
    /**
     * The constructor.
     */
    public Print(Address address) {
    	this.address=address;
    }
    
    /**
     * Description of the method exec.
     * @param memory 
     * @param progCounter 
     */
    public void exec(Memory memory, ProgCounter progCounter) {
    	System.out.println(address.getValue(memory).toString());
    	progCounter.increase();
    }
    
    public String toString(){
    	return "PRT " + address.toString();
    }
}
