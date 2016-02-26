/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service("log_console")
//@Scope("prototype")
public class LoggerServicee implements LoggerService{
    
    public void log(){
        System.out.println("je sais pas ce que je dois afficher");
    }
}
