import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import time_utils.TimeUtils;

class TimeUtilsTest {
	@ParameterizedTest(name="[{index}] {0} is {1} seconds")
	@CsvFileSource(resources = "/time2sec.csv")
	void testTimeToSec(String time, int sec){
		assertEquals(sec, TimeUtils.timeToSec(time));
	}

	@ParameterizedTest(name="[{index}] {0} seconds is {1}")
	@CsvFileSource(resources = "/sec2time.csv")
	void testSecToTime(int sec, String time){
		assertEquals(time, TimeUtils.secToTime(sec));
	}
}
