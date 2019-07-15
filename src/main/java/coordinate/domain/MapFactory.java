package coordinate.domain;

import java.util.HashMap;

public class MapFactory {
    public static HashMap<Integer, FigureCreator> map;

    static {
        new MapFactory();
    }

     private MapFactory() {
        map = new HashMap<>();
        map.put(2, Line::new);
        map.put(3, Triangle::new);
        map.put(4, Rectangle::new);
    }
}
