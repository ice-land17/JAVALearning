package homework06;

/**
 * 有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
 * 实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具遇到大河时用Boat作为交通工具
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        //先得到船
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();

        }
        vehicles.work();
    }

    public void common() {
        //得到马匹
        //判断一下，当前的 vehicles 属性是否已经存在了
        if (!(vehicles instanceof Horse)) {
            //这里使用的是多态
            vehicles = VehiclesFactory.getHorse();

        }
        //这里体现使用接口调用
        vehicles.work();
    }
}
