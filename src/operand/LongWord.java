/**
 * File generated from the NewModel::operand::LongWord uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 */
package operand;

import computer.Memory;
import operand.Word;

public class LongWord implements Word {
    private long value;


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
    	value = ((LongWord) w1).value +((LongWord) w1).value;
    }
     
    /**
     * Description of the method mul.
     * @param op1 
     * @param op2 
     */
    public void mul(Word w1, Word w2) {
    	value = ((LongWord) w1).value *((LongWord) w1).value;
    }

	@Override
	public Word getValue(Memory memory) {
		return this;
	}
     
    
    
}
