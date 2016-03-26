/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqll;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author William
 */
public class Soporte extends SQLBaseListener {
    public void enterEveryRule(ParserRuleContext ctx){
        System.out.println(ctx.toString());
    }
}
