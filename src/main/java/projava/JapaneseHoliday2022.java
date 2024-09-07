//package projava;
//
//import one.cafebabe.bc4j.BusinessCalendar;
//import static one.cafebabe.bc4j.BusinessCalendar.JAPAN;
//import java.time.LocalDate;
//public class JapaneseHoliday2022 {
//    public static void main(String[] args) {
//        BusinessCalendar.newBuilder().holiday(JAPAN.PUBLIC_HOLIDAYS).build()
//                .getHolidaysBetween(LocalDate.of(2022,1,1),
//                        LocalDate.of(2022,12,31))
//                .forEach(System.out::println);
//    }
//
//    /**
//     * 渡された西暦年が夏期近代オリンピック開催年であるか判定する
//     * @param year -西暦年
//     * @return　夏季オリンピック開催年であればtrue
//     * @throws IllegalArgumentException まだオリンピック開催が確定していない歳を渡した場合
//     */
//    public boolean isSummerOlympicYear(int year) throws IllegalArgumentException {
//        if(2032 < year) {
//            throw new IllegalArgumentException("2032年までをサポートしています.入力：" + year);
//        }
//        return year % 4 == 0;
//    }
//}
