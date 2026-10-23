public class EmailValidationService {

    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atSignIndex = email.indexOf('@');
        if (atSignIndex == -1) {
            return false;
        }

        String domain = email.substring(atSignIndex + 1);
        if (domain.isEmpty()) {
            return false;
        }

        int dotIndex = email.indexOf('.', atSignIndex + 1);
        if (dotIndex == -1) {
            return false;
        }

        String username = email.substring(0, atSignIndex);
        String domainName = email.substring(atSignIndex + 1, dotIndex);
        String extension = email.substring(dotIndex + 1);

        if (username.isEmpty() || domainName.isEmpty() || extension.isEmpty()) {
            return false;
        }

        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '-' && c != '_') {
                return false;
            }
        }

        if (domainName.length() < 2 || extension.length() < 2) {
            return false;
        }

        return true;
    }
}