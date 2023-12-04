package homework06;

/**
 * 创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
 */
public class VehiclesFactory {
    private static Horse horse = new Horse();

    private VehiclesFactory(){}
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}
