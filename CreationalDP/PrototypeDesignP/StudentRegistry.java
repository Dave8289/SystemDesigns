package CreationalDP.PrototypeDesignP;

import java.util.HashMap;
import java.util.Map;

class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    public void register(String str, Student st) {
        map.put(str, st);
    }

    public Student getStudent(String str) {
        return map.get(str);
    }

}