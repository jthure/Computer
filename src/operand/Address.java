/**
 * File generated from the NewModel::operand::Address uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 */
package operand;

import computer.Memory;


public class Address implements Operand {

    private int address;

    public Address(int address) {
    	this.address = address;
    }
    
    @Override
    public Word getValue(Memory memory) {
    	return memory.getWord(address);
    }
     
    public String toString(){
    	return "[" + address + "]";
    }
    
    
}
