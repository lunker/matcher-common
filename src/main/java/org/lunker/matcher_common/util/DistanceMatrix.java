package org.lunker.matcher_common.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dongqlee on 2018. 3. 10..
 */
public class DistanceMatrix<K extends Number,V extends Number> extends HashMap<K, List<V>> implements Serializable {

    public List<V> putSingleItem(K key, V valueItem){
        List<V> valueList=null;

        valueList=this.get(key);
        if(valueList!=null){
            valueList.add(valueItem);
        }
        else{
            valueList=new ArrayList<V>();
            valueList.add(valueItem);

            valueList=this.put(key, valueList);
        }

        return valueList;
    }
}
