import java.util.ArrayList;

/**
 * @Author l30049897
 * @Date 2023/9/14 15:56
 * @Version 1.0
 */
public class Table {
    private int playersNum;

    private ArrayList<String> seats;

    public Table(int playersNum) {
        this.playersNum = playersNum;

        initSeats(playersNum);
    }

    /**
     * 获取所有的座位
     *
     * @return seatsName
     */
    public String getTableSeats() {
        String seatsName = "";
        for (String seat : seats) {
            seatsName = seatsName + seat + " ";
        }
        return seatsName;
    }

    /**
     * 获取随机的一个座位
     *
     * @return randomSeat
     */
    public String getRandomSeat() {
        int randomSeatNum = (int) (Math.random() * seats.size());
        return seats.get(randomSeatNum);
    }

    /**
     * 根据人数初始化座位名称
     *
     * @param playersNum 人数
     */
    public void initSeats(int playersNum) {
        seats = new ArrayList<>();
        seats.add("SB");
        seats.add("BB");
        seats.add("UTG");
        seats.add("HJ/MP1");
        seats.add("CO");
        seats.add("Button");

        switch (playersNum) {
            case 9 : seats.add(3, "LJ/MP");
            case 8 : seats.add(3, "UTG+2");
            case 7 : seats.add(3, "UTG+1");
            default : break;
        }
    }
}
