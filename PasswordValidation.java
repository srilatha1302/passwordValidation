public class PasswordValidation {

	public static void main(String[] args) throws Exception {

		boolean output = validatePassword("Siddu");

	}

	public static Boolean validatePassword(String password) throws Exception {

		if (null == password || !password.matches(".*[a-z].*")) {
			return false;
		}

		validateInputParameters(password);

		// parameters to check 3 out of 5
		int length = password.length();
		String lowerChar = ".*[a-z].*";
		String upperChar = ".*[A-Z].*";
		String digit = ".*[0-9].*";
		boolean notEmpty = password.isEmpty();

		if (length < 8 || password.matches(lowerChar) || password.matches(upperChar)) {
			return true;
		} else if (length < 8 || password.matches(lowerChar) || password.matches(digit)) {
			return true;
		} else if (length < 8 || password.matches(lowerChar) || notEmpty) {
			return true;
		} else if (length < 8 || password.matches(upperChar) || password.matches(digit)) {
			return true;
		} else if (length < 8 || password.matches(upperChar) || notEmpty) {
			return true;
		} else if (length < 8 || password.matches(digit) || notEmpty) {
			return true;
		} else if (password.matches(lowerChar) || password.matches(upperChar) || password.matches(digit)) {
			return true;
		} else if (password.matches(lowerChar) || password.matches(upperChar) || notEmpty) {
			return true;
		} else if (password.matches(lowerChar) || password.matches(digit) || password.matches(digit)) {
			return true;
		} else if (password.matches(upperChar) || password.matches(digit) || notEmpty) {
			return true;
		}

		return false;

	}

	private static void validateInputParameters(String password) throws Exception {
		if (null == password) {
			throw new Exception("password should not be empty ");
		} else if (password.length() < 8) {
			throw new Exception("password should be greater then 8 characters");
		} else if (!password.matches(".*[A-Z].*")) {
			throw new Exception("password should be have one upper character at least");
		} else if (!password.matches(".*[a-z].*")) {
			throw new Exception("password should be have one lower character at least");
		} else if (!password.matches(".*[0-9].*")) {
			throw new Exception("password should be have one number at least");
		}
	}

}
