/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4jex;

import org.apache.log4j.Logger;

/**
 *
 * @author saliya
 */
public class Log4jex {

    /**
     * @param args the command line arguments
     */
    static Logger log = Logger.getLogger(Log4jex.class);

    public static void main(String[] args) {

        log.trace("This is a Trace");
        log.debug("This is a Debug");
        log.info("This is an Info");
        log.warn("This is a Warn");
        log.error("This is an Error");
        log.fatal("This is a Fatal");
        log.info("------------------------");
    }

}
