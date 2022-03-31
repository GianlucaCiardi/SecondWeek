package com.corso.java.utils.Utils;

import java.util.Map;


public class MapUtilities extends Singleton{


    /**
     * <p>Constructor is declared private since all methods are static.</p>
     */
    private MapUtilities()
    {
        super();
    }

    /**
     * Retrieves a value from a map by key
     *
     * @param map Map to retrieve item from
     * @param key the key whose associated value is to be returned
     * @param def value to return if item was not found.
     * @return Returns a string value that was found at the location key.
     * If the item is null then the def value is sent back.
     * If the item is not the expected type, an exception is thrown.
     */
    public static <T> T get(Map<?, T> map, Object key, T def)
    {
        T val = map.get(key);
        return val == null ? def : val;
    }

    /**
     * Retrieves a value from a map by key, if value is not found by the given key throws a 'Throwable.'
     * This version allows the value associated to the key to be null, and it still works.  In other words,
     * if the passed in key is within the map, this method will return whatever is associated to the key, including
     * null.
     * @param map Map to retrieve item from
     * @param key the key whose associated value is to be returned
     * @param throwable
     * @param <T> Throwable passed in to be thrown *if* the passed in key is not within the passed in map.
     * @return the value associated to the passed in key from the passed in map, otherwise throw the passed in exception.
     */
    public static <T extends Throwable> Object getOrThrow(Map<?, ?> map, Object key, T throwable) throws T
    {
        if (map == null)
        {
            throw new NullPointerException("Map parameter cannot be null");
        }

        if (throwable == null)
        {
            throw new NullPointerException("Throwable object cannot be null");
        }

        if (map.containsKey(key))
        {
            return map.get(key);
        }
        throw throwable;
    }

    /**
     * Returns null safe isEmpty check for Map
     *
     * @param map Map to check, can be null
     * @return Returns true if map is empty or null
     */
    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }
}
