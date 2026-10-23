public class EmailValidationService {

    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atSignIndex = email.indexOf('@');
        if (atSignIndex == -1) {
            return false;
        }

        int dotIndex = email.indexOf('.', atSignIndex);
        if (dotIndex == -1 || dotIndex < atSignIndex + 2) {
            return false;
        }

        String username = email.substring(0, atSignIndex);
        String domain = email.substring(atSignIndex + 1, dotIndex);
        String extension = email.substring(dotIndex + 1);

        if (username.isEmpty() || domain.isEmpty() || extension.isEmpty()) {
            return false;
        }

        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-' && c != '_' && c != '!') {
                return false;
            }
        }

        return true;
    }
}