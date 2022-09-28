import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void channelSelectionTest() {
        Radio number = new Radio();

        number.setStationNumbers(3);

        int expected = 3;
        int actual = number.getStationNumbers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNext() {
        Radio number = new Radio();
        number.setStationNumbers(9);

        number.next();

        int expected = 0;
        int actual = number.getStationNumbers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasePrev() {
        Radio number = new Radio();
        number.setStationNumbers(0);

        number.prev();

        int expected = 9;
        int actual = number.getStationNumbers();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio number = new Radio();
        number.setMaxAndMinVolume(3);

        number.increaseVolume();

        int expected = 4;
        int actual = number.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }




}