package org.lunker.matcher_common.exception;

/**
 * Created by dongqlee on 2018. 3. 10..
 */
public class InstanceNotFoundException extends Exception {

    public InstanceNotFoundException(String instance) {
        super(String.format("Instance %s is not found", instance));
    }
}
