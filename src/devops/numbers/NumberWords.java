package devops.numbers;

public class NumberWords {

	private final String[]  NUMBERS = {"one","two","three","four","five","six","seven","eight","nine"};
	private final String[]  TENS = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	private final String[]  TEENS = {"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private final Long[] DIVS = {1_000_000_000L, 1_000_000L, 1000L, 100L, 10L, 0L};
	
	public String toWords( Long number ) {
		if(number < 0){
		  return "Number out of range";
		}
		return getBillion(number) ;
	}
	
	private String getUnit(Long unit) {
		if(unit <= 0 ) {
			return "";
		}
		return NUMBERS[(int) (unit -1)];
	}
	
	private String getTens(Long number) {
		Long ten = number / 10;
		if(ten > 0) {
			String unitStr = getUnit(number % 10);
			
			if(unitStr.equals("") ) {
				return TENS[(int) (ten -1)];
			} else {
				if(ten == 1) {
					return TEENS[(int) ((number % 10) -1)];
				}else {
					return String.format("%s %s", TENS[(int) (ten -1)], unitStr);
				}
			}
			
		}
		return getUnit(number);
	}
	
	private String getHundreds(Long number) {
		Long hundred = number / 100;
		if(hundred > 0) {
			return String.format("%s hundred %s",NUMBERS[(int) (hundred -1)],getTens(number % 100));
		}
		return getTens(number);
	}
	
	private String getThousands(Long number) {
		Long thousand = number / 1000;
		if(thousand > 0) {
			return String.format("%s thousand %s", getHundreds(thousand),getHundreds(number % 1000)).trim();
		}
		return getHundreds(number).trim();
	}
	
	private String getMillion(Long number) {
		Long millions = number / 1_000_000;
		if(millions > 0) {
			return String.format("%s million %s", getHundreds(millions),getThousands(number % 1_000_000)).trim();
		}
		return getThousands(number).trim();
	}
	
	private String getBillion(Long number) {
		Long billions = number / 1_000_000_000;
		if(billions > 0) {
			return String.format("%s billion %s", getHundreds(billions),getMillion(number % 1_000_000_000)).trim();
		}
		return getMillion(number).trim();
	}
}
