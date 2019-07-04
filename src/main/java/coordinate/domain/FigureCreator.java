package coordinate.domain;

import java.util.List;

@FunctionalInterface
public interface FigureCreator {
    AbstractFigure create(List<Point> points);
}
