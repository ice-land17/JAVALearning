import java.lang.management.MemoryUsage;

public class HomeWork258 {
    public static void main(String[] args) {
        //定义Music类，里面有音乐名name、
        // 音乐时长times属性，并有播放play功能和返回本身属性信息的功能方法getInfo
        Music music = new Music("笑傲江湖",60);
        music.play();
        System.out.println(music.getInfo());
    }
}

class Music {
    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("音乐" + name + "正在播放:---" + "时常为" + times + "秒");
    }

    public String getInfo() {
        return "音乐" + name + "播放时间" + times;
    }
}
