/**
 * File generated from the NewModel::operand::LongWord uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 */
package operand;

import computer.Memory;
import operand.Word;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of LongWord.
 */
public class LongWord extends Word {
    long value;


    public LongWord(long value) {
    	super();
    	this.value = value;
    }
    
    /**
     * Description of the method add.
     * @param op1 
     * @param op2 
     */
    public void add(Word w1, Word w2) {
    	value = ((LongWord) w1).getInternal()+((LongWord) w1).getInternal();
    }
     
    /**
     * Description of the method mul.
     * @param op1 
     * @param op2 
     */
    public void mul(Operand op1, Operand op2) {
    	// Start of user code for method mul
    	// End of user code
    }

	@Override
	public Word getValue(Memory memory) {
		// TODO Auto-generated method stub
		return this;
	}
	public long getInternal(){
		return value;
	}
     
    // Start of user code (user defined methods)
    
    // End of user code

    
    
}
