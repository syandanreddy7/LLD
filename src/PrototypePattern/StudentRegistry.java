package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    Map<String, Student> map = new HashMap<String, Student>();

    public void register(String key, Student st)
    {
        map.put(key,st);
    }

    public Student get(String key)
    {
        return map.get(key);
    }
}
