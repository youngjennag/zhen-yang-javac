import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main4 {
    private String eventName;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;

    public Main4(String name, ZonedDateTime start, ZonedDateTime end) {
        this.eventName = name;
        this.startTime = start;
        this.endTime = end;
    }

    public String getEventDuration() {
        Duration duration = Duration.between(startTime, endTime);
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        return days + "日と" + hours + "時間";
    }

    public String getLocalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.format(formatter);
    }

    public String getUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.withZoneSameInstant(ZoneId.of("UTC")).format(formatter);
    }

    public static void main(String[] args) {

        ZonedDateTime start = ZonedDateTime.of(2024,7,1,10,0,0,0, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime end = ZonedDateTime.of(2024,7,15,22,0,0,0, ZoneId.of("Asia/Tokyo"));

        //インスタンス生成
        Main4 m4 = new Main4("サマーフェスティバル", start, end);

        // フォーマッター
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");

        System.out.println("イベント：" + m4.eventName);
        System.out.println("開始：" + start.format(formatter));
        System.out.println("終了：" + end.format(formatter));
        System.out.println("期間：" + m4.getEventDuration());
        System.out.println("現地時間：" + m4.getLocalTime());
        System.out.println("UTC時間：" + m4.getUtcTime());
    }
}