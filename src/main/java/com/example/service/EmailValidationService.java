public class EmailValidationService {

    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atSignIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.');
        if (atSignIndex == -1 || dotIndex == -1) {
            return false;
        }

        String username = email.substring(0, atSignIndex);
        String domain = email.substring(atSignIndex + 1, dotIndex);
        String extension = email.substring(dotIndex + 1);

        if (username.isEmpty() || domain.isEmpty() || extension.isEmpty()) {
            return false;
        }

        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-' && c != '_') {
                return false;
            }
        }

        return true;
    }
}