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
@Service("log_jpa")
@Scope("prototype")
public class LoggerServiceJpaImpl implements LoggerService{
    
    public void log(){
        System.out.println("DATE + msg");
    }
}
