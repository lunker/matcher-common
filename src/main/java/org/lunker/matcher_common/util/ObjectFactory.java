package org.lunker.matcher_common.util;

import org.lunker.matcher_common.exception.InstanceNotFoundException;

import java.util.HashMap;

/**
 * Created by dongqlee on 2018. 3. 10..
 */
public class ObjectFactory {


    private static ObjectFactory objectFactory=null;
    private HashMap<String, Object> objectMap=null;

    private ObjectFactory() {
        objectMap=new HashMap<>();
    }

    public static ObjectFactory getInstance(){
        if (objectFactory == null){
            objectFactory=new ObjectFactory();
        }
        return objectFactory;
    }

    public Object getObject(String key) throws InstanceNotFoundException{
        Object value=null;
        value=objectMap.get(key);

        if(value==null){
            // throw exception
            throw new InstanceNotFoundException(key);
        }
        return value;
    }

    public void setObject(String key, Object value){
        objectMap.put(key, value);
    }
}
