package generic_cache;

import java.util.HashMap;
import java.util.Map;

public class CacheSystem<K,V> {

    private final Map<K,V> map ;

    private static final int cacheLimit = 100;

    public CacheSystem(){
        map = new HashMap<>();
    }

    public void put(K key,V value){
        sizeLimitTrueIsRemove();
        map.put(key, value);
    }

    public void remove(K key){
        map.remove(key);
    }

    public void clear(){
        map.clear();
    }

    private void sizeLimitTrueIsRemove(){
        if (isEmpty()){
            return;
        }

        if (sizeLimitControl()){
            assert map != null;
            K next = map.keySet().iterator().next();
            map.remove(next);
        }
    }

    private boolean sizeLimitControl(){
        return map.size() + 1 == cacheLimit;
    }

    public int  size(){
        return map.size();
    }

    public V get(K key){
        if (!containsKey(key)){
            System.out.println(key + "Bu key'de bir değer bulunamadı. ");
            return null;
        }
        return map.get(key);
    }
    public boolean isEmpty(){
        return map.isEmpty();
    }

    public boolean containsKey(K key){
        return map.containsKey(key);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (isEmpty()){
            sb.append("Liste boş gösterilecek bir şey yok ");
        }
        for (Map.Entry<K,V> entry : map.entrySet()){
            sb.append(entry.getKey().toString()).append(" : ").append(entry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }










}
