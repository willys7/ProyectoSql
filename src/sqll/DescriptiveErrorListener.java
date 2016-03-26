/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqll;


/**
 *
 * @author William
 */
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;

public  class DescriptiveErrorListener extends BaseErrorListener {
	private String error = "";

    /**
     *
     * @param recognizer
     * @param offendingSymbol
     * @param line
     * @param charPositionInLine
     * @param msg
     * @param e
     */
    @Override
	public void syntaxError(Recognizer<?, ?> recognizer,Object offendingSymbol, int line,int charPositionInLine,String msg,RecognitionException e) {
		List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
		Collections.reverse(stack);			
		System.err.println("line "+line+":"+charPositionInLine+" at "+
		offendingSymbol+": "+msg);
		//error = "line "+line+":"+charPositionInLine+" at "+	offendingSymbol+": "+msg;
		error += "line "+line+":"+charPositionInLine+" -->: "+msg+"\n";
	}
	public String getError(){
		return error;
	}
	public void setError(String error){
		this.error = error;
	}
}