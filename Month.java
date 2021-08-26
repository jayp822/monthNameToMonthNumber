package MonthAssignment;

/**
 * Month Class Chapter 9, Programming Challenge 6
 */

public class Month {
	private int monthNumber;
	final String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	// step1 a constructor that accepts the number of the month as an argument.
	public Month(int m) {
		if (m < 1 || m > 12)
			monthNumber = 1;
		else
			monthNumber = m;

		this.monthNumber = m;

	}

	// step2 a constructor that accepts the name of the month.It should set the
	// monthNumber field to the correct corresponding value.

	public Month(String name) {

		monthNumber = 1;

		for (int i = 0; i < monthName.length; i++) {
			if (name.equals(monthName[i])) {
				monthNumber = i + 1;
			}
		}

	}

	// step3: a setMonthNumber method,
	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
	}

	// step4: A getMonthNumber method
	public int getMonthNumber() {
		return monthNumber;
	}

	/**
	 * step5: toString method
	 * 
	 * @return A reference to a String representation of the object.
	 */
	public String toString() {
		return "The month number is: " + this.monthNumber;

	}

	/**
	 * step6: equals method
	 * 
	 * @param month2 Another Month object.
	 * @return true if the two Month objects contain the same month, false
	 *         otherwise.
	 */
	public boolean equals(Month m) {
		if (this.monthNumber == m.monthNumber) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * step7: greaterThan method
	 * 
	 * @param month2 Another Month object.
	 * @return true if the calling objects is greater than the argument, false
	 *         otherwise.
	 */
	public boolean greaterThan(Month m1) {
		if (this.monthNumber > m1.monthNumber) {
			return true;
		} else {
			return false;
		}

	}

}
