package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1L ) ) ;
	}
	
	@Test
	public void shouldGetSevenWhenSetting7() {
		Assert.assertEquals("seven", numberWords.toWords(7L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger() {
		Assert.assertEquals("five", numberWords.toWords(5L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger_2() {
		Assert.assertEquals("ten", numberWords.toWords(10L));
		Assert.assertEquals("twenty", numberWords.toWords(20L));
		Assert.assertEquals("thirty", numberWords.toWords(30L));
		Assert.assertEquals("fourty", numberWords.toWords(40L));
		Assert.assertEquals("fifty", numberWords.toWords(50L));
		Assert.assertEquals("sixty", numberWords.toWords(60L));
		Assert.assertEquals("seventy", numberWords.toWords(70L));
		Assert.assertEquals("eighty", numberWords.toWords(80L));
		Assert.assertEquals("ninety", numberWords.toWords(90L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger_3() {
		Assert.assertEquals("eleven", numberWords.toWords(11L));
		Assert.assertEquals("twelve", numberWords.toWords(12L));
		Assert.assertEquals("thirteen", numberWords.toWords(13L));
		Assert.assertEquals("fourteen", numberWords.toWords(14L));
		Assert.assertEquals("fifteen", numberWords.toWords(15L));
		Assert.assertEquals("sixteen", numberWords.toWords(16L));
		Assert.assertEquals("seventeen", numberWords.toWords(17L));
		Assert.assertEquals("eighteen", numberWords.toWords(18L));
		Assert.assertEquals("nineteen", numberWords.toWords(19L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger_4() {
		Assert.assertEquals("twenty five", numberWords.toWords(25L));
		Assert.assertEquals("thirty one", numberWords.toWords(31L));
		Assert.assertEquals("fifty six", numberWords.toWords(56L));
		Assert.assertEquals("sixty four", numberWords.toWords(64L));
		Assert.assertEquals("sixty eight", numberWords.toWords(68L));
		Assert.assertEquals("eighty one", numberWords.toWords(81L));
		Assert.assertEquals("fifty eight", numberWords.toWords(58L));
		Assert.assertEquals("thirty eight", numberWords.toWords(38L));
		Assert.assertEquals("seventy eight", numberWords.toWords(78L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger_5() {
		Assert.assertEquals("eight hundred twenty five", numberWords.toWords(825L));
		Assert.assertEquals("two hundred thirty one", numberWords.toWords(231L));
		Assert.assertEquals("nine hundred fifty six", numberWords.toWords(956L));
		Assert.assertEquals("seven hundred sixty four", numberWords.toWords(764L));
		Assert.assertEquals("eight hundred sixty eight", numberWords.toWords(868L));
		Assert.assertEquals("seven hundred eighty one", numberWords.toWords(781L));
		Assert.assertEquals("five hundred fifty eight", numberWords.toWords(558L));
		Assert.assertEquals("nine hundred thirty eight", numberWords.toWords(938L));
		Assert.assertEquals("one hundred seventy eight", numberWords.toWords(178L));
		Assert.assertEquals("one hundred", numberWords.toWords(100L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger_6() {
		Assert.assertEquals("one thousand eight hundred twenty five", numberWords.toWords(1825L));
		Assert.assertEquals("six thousand two hundred thirty one", numberWords.toWords(6231L));
		Assert.assertEquals("thirteen thousand nine hundred fifty six", numberWords.toWords(13956L));
		Assert.assertEquals("five hundred thirty seven thousand seven hundred sixty four", numberWords.toWords(537764L));
		Assert.assertEquals("sixty four thousand eight hundred sixty eight", numberWords.toWords(64868L));
		Assert.assertEquals("eight thousand seven hundred eighty one", numberWords.toWords(8781L));
		Assert.assertEquals("seven hundred eighty nine thousand five hundred fifty eight", numberWords.toWords(789558L));
		Assert.assertEquals("fourty two thousand nine hundred thirty eight", numberWords.toWords(42938L));
		Assert.assertEquals("one thousand", numberWords.toWords(1000L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger_7() {
		Assert.assertEquals("one million", numberWords.toWords(1_000_000L));
		Assert.assertEquals("one hundred fourty three million four hundred fifty five thousand six hundred ninety two", numberWords.toWords(143_455_692L));
		Assert.assertEquals("fifty three million three hundred fourty five thousand two hundred fourty nine", numberWords.toWords(53_345_249L));
	}
	
	@Test
	public void shouldGetNumberNameWhenSettingInteger_8() {
		Assert.assertEquals("one billion", numberWords.toWords(1_000_000_000L));
		Assert.assertEquals("thirty four billion one hundred fourty three million four hundred fifty five thousand six hundred ninety two", numberWords.toWords(34_143_455_692L));
		Assert.assertEquals("nine hundred fifty four billion fifty three million three hundred fourty five thousand two hundred fourty nine", numberWords.toWords(954_053_345_249L));
	}

}
