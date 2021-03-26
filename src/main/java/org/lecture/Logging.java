package org.lecture;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logging {

    public static void main(String[] args) {
        if (log.isTraceEnabled()) {
            log.trace("Program started");
        }
        log.info("User input needed");

    }

}
